package com.freddieposer.semantics.supo1.iterpreter

import scala.collection.immutable.HashMap

case class ProgramState(
                       locals: LocalsState,
                       stackPointer: Int,
                       stack: Map[Int, LanguageValue],
                       program: Map[String, FunctionDetails]
                       ) {

  def withSP (sp: Int): ProgramState = this.copy(stackPointer = sp)
  def withParent(): ProgramState = this.copy(locals = locals.parent)
  def pushLocals(): ProgramState = this.copy(locals = LocalsState(new HashMap[String, Int](), locals))
  def withLocals(ls: LocalsState): ProgramState = this.copy(locals = ls)

  def assignStack(addr: Int, value: LanguageValue) = this.copy(stack = stack + (addr -> value))

  override def toString: String =
    s"""
      |SP: $stackPointer
      |stack: $stack
      |locals: $locals
      |program: ${program.map{case (k,v) => s"\t\t[$k -> $v]"}.mkString("\n")}
      |""".stripMargin

}


case class LocalsState(mapping: Map[String, Int], parent: LocalsState) {

  def apply(name: String):Int = mapping(name)
  def assign(name: String, value: Int):LocalsState = this.copy(mapping = mapping + (name -> value))

}


case class FunctionDetails(name: String, args: List[String], body: Statement) {
}