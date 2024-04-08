import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class EvalListener extends Java8BaseListener {
    private Map<String, Integer> variables = new HashMap<>();
    private Map<ParseTree, Integer> values = new HashMap<>();
    private ParseTree lastExpression;

    @Override
    public void exitAssignment(Java8Parser.AssignmentContext ctx) { 
        String id = ctx.variable().getText();
        int value = getValue(ctx.expression());
        variables.put(id, value);
        lastExpression = ctx.expression(); 
    }

    
    @Override
    public void exitExpression(Java8Parser.ExpressionContext ctx) {
        int left = getValue(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            int right = getValue(ctx.term(i));
            String op = ctx.getChild(i * 2 - 1).getText();
            switch (op) {
                case "+":
                    left += right;
                    break;
                case "-":
                    left -= right;
                    break;
                case "/":
                    left /= right;
                    break;
                case "*":
                    left *= right;
                    break;
            }
        }
        values.put(ctx, left); 
    }

    @Override
    public void exitTerm(Java8Parser.TermContext ctx) {
        int value = getValue(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            if (ctx.getChild(2 * i - 1).getText().equals("*")) {
                value *= getValue(ctx.factor(i));
            } else {
                value /= getValue(ctx.factor(i));
            }
        }
        values.put(ctx, value); 
    }

    @Override
    public void exitFactor(Java8Parser.FactorContext ctx) {
        int value;
        if (ctx.expression() != null) {
            value = getValue(ctx.expression());
        } else if (ctx.NUMBER() != null) {
            value = Integer.parseInt(ctx.NUMBER().getText());
        } else {
            String varName = ctx.variable().getText();
            if (variables.containsKey(varName)) {
                value = variables.get(varName);
            } else {
                System.out.println("Erro: Variável " + varName + " não foi definida."); 
                System.exit(1);
                return;
            }
        }
        values.put(ctx, value);
    }

    public int getValue(ParseTree node) {
        if (values.containsKey(node)) {
            return values.get(node);
        } else {
            throw new IllegalArgumentException("A seguinte expressão não foi encontrada: " + node.getText());
        }
    }

    public ParseTree getLastExpression() {
        return lastExpression;
    }
}
