package com.freddieposer.semantics.supo1.parsing

import com.freddieposer.semantics.supo1.iterpreter.{FunctionDef, Program}
import com.freddieposer.semantics.supo1.parsing.antlr.{Supo1BaseVisitor, Supo1Parser}

import scala.jdk.CollectionConverters._

class ProgramVisitor extends Supo1BaseVisitor[Program]{

  lazy val statementVisitor = new StatementVisitor()

  override def visitProgram(ctx: Supo1Parser.ProgramContext): Program = {
    println(ctx.function().size())
    new Program(ctx.function().asScala.toList.iterator.map(visitFunction2).toList)
  }

  def visitFunction2(ctx: Supo1Parser.FunctionContext): FunctionDef = {
    FunctionDef(
      ctx.id.getText,
      ctx.id_list().id().asScala.toList.map(_.getText),
      statementVisitor.visit(ctx.statement())
    )
  }


}
