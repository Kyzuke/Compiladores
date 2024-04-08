// Generated from Java8.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8Parser}.
 */
public interface Java8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Java8Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Java8Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java8Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java8Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Java8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Java8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Java8Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Java8Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Java8Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Java8Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Java8Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Java8Parser.VariableContext ctx);
}