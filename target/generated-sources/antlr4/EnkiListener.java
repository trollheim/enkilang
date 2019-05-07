// Generated from Enki.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnkiParser}.
 */
public interface EnkiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnkiParser#f_types_in}.
	 * @param ctx the parse tree
	 */
	void enterF_types_in(@NotNull EnkiParser.F_types_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#f_types_in}.
	 * @param ctx the parse tree
	 */
	void exitF_types_in(@NotNull EnkiParser.F_types_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#typearguments}.
	 * @param ctx the parse tree
	 */
	void enterTypearguments(@NotNull EnkiParser.TypeargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#typearguments}.
	 * @param ctx the parse tree
	 */
	void exitTypearguments(@NotNull EnkiParser.TypeargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#f_types_out}.
	 * @param ctx the parse tree
	 */
	void enterF_types_out(@NotNull EnkiParser.F_types_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#f_types_out}.
	 * @param ctx the parse tree
	 */
	void exitF_types_out(@NotNull EnkiParser.F_types_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull EnkiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull EnkiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull EnkiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull EnkiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(@NotNull EnkiParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(@NotNull EnkiParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#my_rule}.
	 * @param ctx the parse tree
	 */
	void enterMy_rule(@NotNull EnkiParser.My_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#my_rule}.
	 * @param ctx the parse tree
	 */
	void exitMy_rule(@NotNull EnkiParser.My_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#typeargument}.
	 * @param ctx the parse tree
	 */
	void enterTypeargument(@NotNull EnkiParser.TypeargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#typeargument}.
	 * @param ctx the parse tree
	 */
	void exitTypeargument(@NotNull EnkiParser.TypeargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(@NotNull EnkiParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(@NotNull EnkiParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkiParser#type_function}.
	 * @param ctx the parse tree
	 */
	void enterType_function(@NotNull EnkiParser.Type_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkiParser#type_function}.
	 * @param ctx the parse tree
	 */
	void exitType_function(@NotNull EnkiParser.Type_functionContext ctx);
}