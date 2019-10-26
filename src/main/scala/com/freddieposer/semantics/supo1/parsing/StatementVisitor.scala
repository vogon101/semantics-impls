package com.freddieposer.semantics.supo1.parsing

import com.freddieposer.semantics.supo1.iterpreter.{AST, Addition, CodeBlock, Equality, Expr, FunctionCall, FunctionDef, Identifier, IfStatement, IntegerConstant, LocalAssignment, PtrAssignment, PtrDeref, ReturnStatement, Statement}
import com.freddieposer.semantics.supo1.parsing.antlr.Supo1Parser.{ExprContext, StatementContext}
import com.freddieposer.semantics.supo1.parsing.antlr.{Supo1BaseVisitor, Supo1Parser}

import scala.jdk.CollectionConverters._

class StatementVisitor extends Supo1BaseVisitor[Statement] {


  def visitExpr(e: ExprContext): Expr = visit(e).asInstanceOf[Expr]
  def visitStatement(e: StatementContext) = visit(e).asInstanceOf[Statement]

  override def visitStatement_expr(ctx: Supo1Parser.Statement_exprContext): Expr = visit(ctx.expr()).asInstanceOf[Expr]

  override def visitStatement_assignment(ctx: Supo1Parser.Statement_assignmentContext): Statement =  visitAssignment(ctx.assignment())

  override def visitStatement_if(ctx: Supo1Parser.Statement_ifContext): IfStatement = visitIf_statement(ctx.if_statement())

  override def visitStatement_cb(ctx: Supo1Parser.Statement_cbContext): CodeBlock = visitCodeblock(ctx.codeblock())

  override def visitStatement_return(ctx: Supo1Parser.Statement_returnContext): ReturnStatement = ReturnStatement(visitExpr(ctx.expr()))

  override def visitExpr_equality(ctx: Supo1Parser.Expr_equalityContext): Equality = Equality(visitExpr(ctx.expr(0)), visitExpr(ctx.expr(1)))

  override def visitExpr_addition(ctx: Supo1Parser.Expr_additionContext): Addition = Addition(visitExpr(ctx.expr(0)), visitExpr(ctx.expr(1)))

  override def visitExpr_function_call(ctx: Supo1Parser.Expr_function_callContext): FunctionCall =
    FunctionCall(
      ctx.id().getText,
      ctx.expr_list().expr().asScala.toList.map(visitExpr)
    )

  override def visitExpr_bracket(ctx: Supo1Parser.Expr_bracketContext): Expr = visitExpr(ctx.expr())

  override def visitExpr_id_deref(ctx: Supo1Parser.Expr_id_derefContext): Identifier = Identifier(ctx.getText)

  override def visitExpr_ptr_deref(ctx: Supo1Parser.Expr_ptr_derefContext): PtrDeref = PtrDeref(visitExpr(ctx.expr()))

  override def visitExpr_integer(ctx: Supo1Parser.Expr_integerContext): IntegerConstant = IntegerConstant(ctx.getText.toInt)

  //override def visitExpr_list(ctx: Supo1Parser.Expr_listContext) : AST = super.visitExpr_list(ctx)

  override def visitAssignment(ctx: Supo1Parser.AssignmentContext): Statement = if (ctx.local_assign() != null) visitLocal_assign(ctx.local_assign()) else visitPtr_assign(ctx.ptr_assign())

  override def visitPtr_assign(ctx: Supo1Parser.Ptr_assignContext): PtrAssignment = PtrAssignment(visitExpr(ctx.expr(0)), visitExpr(ctx.expr(1)))

  override def visitLocal_assign(ctx: Supo1Parser.Local_assignContext): LocalAssignment = LocalAssignment(ctx.id().getText, visitExpr(ctx.expr()))

  override def visitIf_statement(ctx: Supo1Parser.If_statementContext): IfStatement =
    IfStatement(
      visitExpr(ctx.expr),
      visitStatement(ctx statement 0),
      visitStatement(ctx statement 1)
    )

  override def visitCodeblock(ctx: Supo1Parser.CodeblockContext): CodeBlock = CodeBlock(ctx.statement().asScala.toList.map(visitStatement))

}
