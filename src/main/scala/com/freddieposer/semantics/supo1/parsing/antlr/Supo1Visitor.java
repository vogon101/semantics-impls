// Generated from C:/Users/fredd/Google Drive/10. Cambridge/1. Work/2. Supervisions/24. Semantics/semantics-impls/src/main/scala/com/freddieposer/semantics/supo1/parsing\Supo1.g4 by ANTLR 4.7.2
package com.freddieposer.semantics.supo1.parsing.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Supo1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Supo1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Supo1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Supo1Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_expr}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expr(Supo1Parser.Statement_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_assignment}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_assignment(Supo1Parser.Statement_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_if}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_if(Supo1Parser.Statement_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_cb}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_cb(Supo1Parser.Statement_cbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_return}
	 * labeled alternative in {@link Supo1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_return(Supo1Parser.Statement_returnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_equality}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_equality(Supo1Parser.Expr_equalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_addition}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_addition(Supo1Parser.Expr_additionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_function_call}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_function_call(Supo1Parser.Expr_function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_bracket}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bracket(Supo1Parser.Expr_bracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_id_deref}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_id_deref(Supo1Parser.Expr_id_derefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_ptr_deref}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_ptr_deref(Supo1Parser.Expr_ptr_derefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_integer}
	 * labeled alternative in {@link Supo1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_integer(Supo1Parser.Expr_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(Supo1Parser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Supo1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#ptr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtr_assign(Supo1Parser.Ptr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#local_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_assign(Supo1Parser.Local_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Supo1Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(Supo1Parser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Supo1Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Supo1Parser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(Supo1Parser.Id_listContext ctx);
}