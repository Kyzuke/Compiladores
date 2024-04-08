import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class EvalListener extends Java8BaseListener {
    private Map<String, Integer> variables = new HashMap<>();
    private Map<ParseTree, Integer> values = new HashMap<>();
    private ParseTree lastExpression;

    // método chamado quando a regra de atribuição é encontrada
    @Override
    public void exitAssignment(Java8Parser.AssignmentContext ctx) { // ctx é o contexto da regra de atribuição
        String id = ctx.variable().getText();
        int value = getValue(ctx.expression());
        variables.put(id, value);
        lastExpression = ctx.expression(); // guarda a última expressão avaliada
    }

    // método chamado quando a regra de expressão é encontrada
    @Override
    public void exitExpression(Java8Parser.ExpressionContext ctx) {
        // avalia a expressão
        int left = getValue(ctx.term(0));
        // itera sobre os termos da expressão
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
        values.put(ctx, left); // guarda o valor da expressão no HashMap
    }

    // método chamado quando a regra de termo é encontrada
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
        values.put(ctx, value); // guarda o valor do termo no HashMap
    }

    // método chamado quando a regra de fator é encontrada
    @Override
    public void exitFactor(Java8Parser.FactorContext ctx) {
        int value;
        // verifica se o fator é uma expressão, um número ou uma variável
        if (ctx.expression() != null) {
            value = getValue(ctx.expression());
        } else if (ctx.NUMBER() != null) {
            value = Integer.parseInt(ctx.NUMBER().getText());
        } else {
            String varName = ctx.variable().getText();
            // verifica se a variável foi definida
            if (variables.containsKey(varName)) {
                value = variables.get(varName);
            } else {
                System.out.println("Erro: Variável " + varName + " não foi definida."); // imprime um erro se a
                                                                                        // variável não foi definida
                System.exit(1);
                return;
            }
        }
        values.put(ctx, value); // guarda o valor do fator no HashMap
    }

    // método para obter o valor de uma expressão
    public int getValue(ParseTree node) {
        // verifica se o valor da expressão foi guardado no HashMap
        if (values.containsKey(node)) {
            return values.get(node);
        } else {
            throw new IllegalArgumentException("A seguinte expressão não foi encontrada: " + node.getText());
        }
    }

    // método para obter a última expressão avaliada
    public ParseTree getLastExpression() {
        return lastExpression;
    }
}