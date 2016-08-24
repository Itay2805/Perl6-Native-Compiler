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
	 * Visit a parse tree produced by the {@code createVar}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateVar(@NotNull Perl6Parser.CreateVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadVar}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadVar(@NotNull Perl6Parser.LoadVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(@NotNull Perl6Parser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(@NotNull Perl6Parser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull Perl6Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(@NotNull Perl6Parser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code say}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSay(@NotNull Perl6Parser.SayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull Perl6Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Perl6Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull Perl6Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link Perl6Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(@NotNull Perl6Parser.NumberLiteralContext ctx);
}