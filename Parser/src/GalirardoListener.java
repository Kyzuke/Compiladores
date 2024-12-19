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
	 * Enter a parse tree produced by {@link GalirardoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GalirardoParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GalirardoParser.VariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link GalirardoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GalirardoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GalirardoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(GalirardoParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(GalirardoParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GalirardoParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GalirardoParser.FunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link GalirardoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GalirardoParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GalirardoParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GalirardoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GalirardoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(GalirardoParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(GalirardoParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GalirardoParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStatement(GalirardoParser.ForLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStatement(GalirardoParser.ForLoopStatementContext ctx);
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
	 * Enter a parse tree produced by {@link GalirardoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GalirardoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GalirardoParser.IfStatementContext ctx);
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
	 * Enter a parse tree produced by {@link GalirardoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GalirardoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GalirardoParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link GalirardoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GalirardoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GalirardoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GalirardoParser.VariableContext ctx);
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