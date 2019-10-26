package com.freddieposer.semantics.supo1.iterpreter

object Log {
  def apply(x: Any): Unit = println(x)
}

class AST() {}

class Program (val function_defs: List[FunctionDef]) extends AST

case class FunctionDef (name: String, args: List[String], body: Statement)

// Statements
abstract class Statement extends AST {

  def reduceWith (state : ProgramState) : (ProgramState, LanguageValue)

}

case class LocalAssignment(name: String, e: Expr) extends Statement {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    val (state2, value) = e.reduceWith(state)
    val state3 = state2.withSP(state2.stackPointer + 1).assignStack(state2.stackPointer, value)
    (state3.withLocals(state3.locals.assign(name, state2.stackPointer)), value)
  }
}
case class PtrAssignment(lhs: Expr, rhs: Expr) extends Statement {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    val (state2, loc) = lhs.reduceWith(state)
    val (state3, value) = rhs.reduceWith(state2)

    loc match {
      case PointerValue(addr) => (state3.assignStack(addr, value), value)
      case _ => throw new Error("Pointer assignment to non pointer")
    }

  }
}

case class IfStatement(cond: Expr, branchTrue: Statement, branchFalse: Statement) extends Statement {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    val (s1, condv) = cond reduceWith state
    if (condv equals IntegerValue(0))
      branchFalse.reduceWith(s1)
    else branchTrue.reduceWith(s1)
  }
}

case class CodeBlock(statements: List[Statement]) extends Statement {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {

    statements.foldLeft((state, NULLValue : LanguageValue))((acc, e) => e.reduceWith(acc._1))
  }

  override def toString: String = statements.mkString(";\t")

}

case class ReturnStatement (expr: Expr) extends Statement {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {

    Log(state)

    val (new_state, value) = expr.reduceWith(state)

    (new_state.withSP(new_state.locals("_return")).withParent(), value)

  }
}

// Expressions
abstract class Expr extends Statement

case class Identifier (text: String) extends Expr {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    Log(s"Dereferencing $text")
    val addr = state.locals(text)
    (state, state.stack(addr))
  }
}

case class FunctionCall (name: String, args: List[Expr]) extends Expr {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    Log(s"Calling function $name")

    if (name == "allocate") {
      val (state1, value) = args(0).reduceWith(state)
      val sp = new PointerValue(state1.stackPointer)
      return (state.withSP(sp.v + value.asInstanceOf[IntegerValue].v), sp)
    }

    val func = state.program(name)

    val (state1, values) = args.foldLeft((state, List() : List[LanguageValue])) {
      case ((s, vs), e) =>
        val (s1, v) = e.reduceWith(s)
        (s1, (vs ::: List(v)))
    }

    var state2 = state1.pushLocals()

    var sp = state2.stackPointer

    for ((aName, aValue) <- (func.args.zip(values))) {
      state2 = state2.withLocals(state2.locals.assign(aName, sp))
      state2 = state2.assignStack(sp, aValue)
      sp += 1
    }

    Log(func.body)
    func.body.reduceWith(state2.withLocals(state2.locals.assign("_return", state1.stackPointer)))

  }
}

case class PtrDeref (expr: Expr) extends Expr {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    val (state2, value) = expr.reduceWith(state)
    value match {
      case PointerValue(addr) => (state2, state2.stack(addr))
      case _ => throw new Error("Cannot de-reference a non-pointer")
    }
  }
}

case class Equality (lhs: Expr, rhs: Expr) extends Expr {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    val (s1, vlhs) = lhs reduceWith state
    val (s2, vrhs) = rhs reduceWith s1
    (s2, if (vlhs.equals(vrhs)) IntegerValue (1) else IntegerValue(0))
  }
}

case class Addition (lhs: Expr, rhs: Expr) extends Expr {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = {
    val (s1, v1) = lhs reduceWith state
    val (s2, v2) = rhs reduceWith s1
    (s2, v1 + v2)
  }
}

case class IntegerConstant (value: Int) extends Expr {
  override def reduceWith(state: ProgramState): (ProgramState, LanguageValue) = (state, IntegerValue(value))
}