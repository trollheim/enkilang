// Generated from org\trollheim\lang\Enki.g4 by ANTLR 4.7.2
package org.trollheim.lang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnkiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnkiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnkiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EnkiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(EnkiParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#typearguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypearguments(EnkiParser.TypeargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#typeargument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeargument(EnkiParser.TypeargumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(EnkiParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EnkiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#type_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function(EnkiParser.Type_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#f_types_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_types_out(EnkiParser.F_types_outContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#f_types_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_types_in(EnkiParser.F_types_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkiParser#my_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMy_rule(EnkiParser.My_ruleContext ctx);
}