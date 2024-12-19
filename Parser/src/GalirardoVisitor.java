// Generated from Galirardo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GalirardoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GalirardoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GalirardoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GalirardoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GalirardoParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(GalirardoParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GalirardoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(GalirardoParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GalirardoParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GalirardoParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GalirardoParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GalirardoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(GalirardoParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#forLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStatement(GalirardoParser.ForLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(GalirardoParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GalirardoParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GalirardoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GalirardoParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(GalirardoParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GalirardoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(GalirardoParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(GalirardoParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(GalirardoParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(GalirardoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GalirardoParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GalirardoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#outStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStatement(GalirardoParser.OutStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#responseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponseStatement(GalirardoParser.ResponseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GalirardoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GalirardoParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(GalirardoParser.FunctionNameContext ctx);
}