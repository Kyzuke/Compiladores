// Generated from Galirardo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GalirardoParser}.
 */
public interface GalirardoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GalirardoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GalirardoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GalirardoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GalirardoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NvariableDeclaration}
	 * labeled alternative in {@link GalirardoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNvariableDeclaration(GalirardoParser.NvariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NvariableDeclaration}
	 * labeled alternative in {@link GalirardoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNvariableDeclaration(GalirardoParser.NvariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(GalirardoParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(GalirardoParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nassignment}
	 * labeled alternative in {@link GalirardoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNassignment(GalirardoParser.NassignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nassignment}
	 * labeled alternative in {@link GalirardoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNassignment(GalirardoParser.NassignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NinputStatement}
	 * labeled alternative in {@link GalirardoParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterNinputStatement(GalirardoParser.NinputStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NinputStatement}
	 * labeled alternative in {@link GalirardoParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitNinputStatement(GalirardoParser.NinputStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NfunctionDeclaration}
	 * labeled alternative in {@link GalirardoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNfunctionDeclaration(GalirardoParser.NfunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NfunctionDeclaration}
	 * labeled alternative in {@link GalirardoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNfunctionDeclaration(GalirardoParser.NfunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GalirardoParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GalirardoParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nparameter}
	 * labeled alternative in {@link GalirardoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterNparameter(GalirardoParser.NparameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nparameter}
	 * labeled alternative in {@link GalirardoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitNparameter(GalirardoParser.NparameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nblock}
	 * labeled alternative in {@link GalirardoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterNblock(GalirardoParser.NblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nblock}
	 * labeled alternative in {@link GalirardoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitNblock(GalirardoParser.NblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NloopStatement}
	 * labeled alternative in {@link GalirardoParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterNloopStatement(GalirardoParser.NloopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NloopStatement}
	 * labeled alternative in {@link GalirardoParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitNloopStatement(GalirardoParser.NloopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NforLoopStatement}
	 * labeled alternative in {@link GalirardoParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterNforLoopStatement(GalirardoParser.NforLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NforLoopStatement}
	 * labeled alternative in {@link GalirardoParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitNforLoopStatement(GalirardoParser.NforLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(GalirardoParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(GalirardoParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GalirardoParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GalirardoParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NifStatement}
	 * labeled alternative in {@link GalirardoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterNifStatement(GalirardoParser.NifStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NifStatement}
	 * labeled alternative in {@link GalirardoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitNifStatement(GalirardoParser.NifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GalirardoParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GalirardoParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(GalirardoParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(GalirardoParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GalirardoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GalirardoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(GalirardoParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(GalirardoParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(GalirardoParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(GalirardoParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(GalirardoParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(GalirardoParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(GalirardoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(GalirardoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GalirardoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GalirardoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NfunctionCall}
	 * labeled alternative in {@link GalirardoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterNfunctionCall(GalirardoParser.NfunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NfunctionCall}
	 * labeled alternative in {@link GalirardoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitNfunctionCall(GalirardoParser.NfunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#outStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutStatement(GalirardoParser.OutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#outStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutStatement(GalirardoParser.OutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#responseStatement}.
	 * @param ctx the parse tree
	 */
	void enterResponseStatement(GalirardoParser.ResponseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#responseStatement}.
	 * @param ctx the parse tree
	 */
	void exitResponseStatement(GalirardoParser.ResponseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nvariable}
	 * labeled alternative in {@link GalirardoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterNvariable(GalirardoParser.NvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nvariable}
	 * labeled alternative in {@link GalirardoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitNvariable(GalirardoParser.NvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(GalirardoParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(GalirardoParser.FunctionNameContext ctx);
}