// Generated from Perl6.g4 by ANTLR 4.4

	package com.itay.perl6.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Perl6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Perl6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Perl6Parser#addingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull Perl6Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createVar}
	 * labeled alternative in {@link Perl6Parser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateVar(@NotNull Perl6Parser.CreateVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link Perl6Parser#addingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull Perl6Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link Perl6Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull Perl6Parser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link Perl6Parser#temp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(@NotNull Perl6Parser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code say}
	 * labeled alternative in {@link Perl6Parser#temp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSay(@NotNull Perl6Parser.SayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull Perl6Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link Perl6Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull Perl6Parser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadVar}
	 * labeled alternative in {@link Perl6Parser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadVar(@NotNull Perl6Parser.LoadVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(@NotNull Perl6Parser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link Perl6Parser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull Perl6Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link Perl6Parser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(@NotNull Perl6Parser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link Perl6Parser#temp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(@NotNull Perl6Parser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(@NotNull Perl6Parser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull Perl6Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull Perl6Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull Perl6Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link Perl6Parser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(@NotNull Perl6Parser.NumberLiteralContext ctx);
}