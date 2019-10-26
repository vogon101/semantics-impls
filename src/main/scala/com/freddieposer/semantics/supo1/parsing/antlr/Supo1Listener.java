// Generated from C:/Users/fredd/Google Drive/10. Cambridge/1. Work/2. Supervisions/24. Semantics/semantics-impls/src/main/scala/com/freddieposer/semantics/supo1/parsing\Supo1.g4 by ANTLR 4.7.2
package com.freddieposer.semantics.supo1.parsing.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Supo1Parser}.
 */
public interface Supo1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Supo1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Supo1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Supo1Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Supo1Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_expr}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expr(Supo1Parser.Statement_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_expr}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expr(Supo1Parser.Statement_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_assignment}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_assignment(Supo1Parser.Statement_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_assignment}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_assignment(Supo1Parser.Statement_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_if}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_if(Supo1Parser.Statement_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_if}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_if(Supo1Parser.Statement_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_cb}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_cb(Supo1Parser.Statement_cbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_cb}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_cb(Supo1Parser.Statement_cbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_return}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_return(Supo1Parser.Statement_returnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_return}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_return(Supo1Parser.Statement_returnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_equality}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_equality(Supo1Parser.Expr_equalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_equality}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_equality(Supo1Parser.Expr_equalityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_addition}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_addition(Supo1Parser.Expr_additionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_addition}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_addition(Supo1Parser.Expr_additionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_function_call}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_function_call(Supo1Parser.Expr_function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_function_call}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_function_call(Supo1Parser.Expr_function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bracket}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bracket(Supo1Parser.Expr_bracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bracket}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bracket(Supo1Parser.Expr_bracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_id_deref}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_id_deref(Supo1Parser.Expr_id_derefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_id_deref}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_id_deref(Supo1Parser.Expr_id_derefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_ptr_deref}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_ptr_deref(Supo1Parser.Expr_ptr_derefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_ptr_deref}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_ptr_deref(Supo1Parser.Expr_ptr_derefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_integer}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_integer(Supo1Parser.Expr_integerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_integer}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_integer(Supo1Parser.Expr_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(Supo1Parser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(Supo1Parser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Supo1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Supo1Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#ptr_assign}.
	 * @param ctx the parse tree
	 */
	void enterPtr_assign(Supo1Parser.Ptr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#ptr_assign}.
	 * @param ctx the parse tree
	 */
	void exitPtr_assign(Supo1Parser.Ptr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#local_assign}.
	 * @param ctx the parse tree
	 */
	void enterLocal_assign(Supo1Parser.Local_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#local_assign}.
	 * @param ctx the parse tree
	 */
	void exitLocal_assign(Supo1Parser.Local_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Supo1Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Supo1Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(Supo1Parser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(Supo1Parser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(Supo1Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(Supo1Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Supo1Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(Supo1Parser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Supo1Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(Supo1Parser.Id_listContext ctx);
}