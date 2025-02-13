import java.util.*;
import org.antlr.v4.runtime.tree.ParseTree;

// Nosso analisador semântico estende o GalirardoBaseListener gerado pelo ANTLR
public class SemanticAnalyzer extends GalirardoBaseListener {

    // Pilha de escopos: cada escopo é um mapa (variável -> tipo)
    private Stack<Map<String, String>> scopes = new Stack<>();
    // Lista para armazenar os erros semânticos encontrados
    private List<String> errors = new ArrayList<>();

    public SemanticAnalyzer() {
        // Cria o escopo global
        scopes.push(new HashMap<>());
    }

    // Ao entrar em um bloco (definido na regra "block" com rótulo #Nblock), cria-se um novo escopo.
    @Override
    public void enterNblock(GalirardoParser.NblockContext ctx) {
        scopes.push(new HashMap<>());
    }

    // Ao sair do bloco, remove-se o escopo corrente.
    @Override
    public void exitNblock(GalirardoParser.NblockContext ctx) {
        scopes.pop();
    }

    // Verifica a declaração de variáveis (regra: variableDeclaration com label #NvariableDeclaration)
    @Override
    public void enterNvariableDeclaration(GalirardoParser.NvariableDeclarationContext ctx) {
        String varName = ctx.variable().getText();
        Map<String, String> currentScope = scopes.peek();

        if (currentScope.containsKey(varName)) {
            errors.add("Erro: Declaração duplicada da variável '" + varName + "'.");
        } else {
            // Obtém o tipo da variável.
            // A produção é: (dataType | 'const' dataType) variable ('=' expression)? SEMI
            // Se o primeiro token for "const", então o tipo está em ctx.dataType()
            String type;
            if (ctx.getChild(0).getText().equals("const")) {
                type = ctx.dataType().getText();
            } else {
                type = ctx.dataType().getText();
            }
            currentScope.put(varName, type);

            // Se houver inicialização, avalia a expressão e verifica a compatibilidade de tipos.
            if (ctx.expression() != null) {
                String exprType = evaluateExpression(ctx.expression());
                if (!isCompatible(type, exprType)) {
                    errors.add("Erro: Atribuição incompatível na declaração da variável '" 
                        + varName + "'. Esperado " + type + ", mas encontrado " + exprType + ".");
                }
            }
        }
    }

    // Verifica as atribuições (regra: assignment com label #Nassignment)
    @Override
    public void enterNassignment(GalirardoParser.NassignmentContext ctx) {
        String varName = ctx.variable().getText();
        String varType = lookupVariable(varName);
        if (varType == null) {
            errors.add("Erro: Variável '" + varName + "' não declarada.");
        } else {
            String exprType = evaluateExpression(ctx.expression());
            if (!isCompatible(varType, exprType)) {
                errors.add("Erro: Atribuição incompatível para a variável '" + varName 
                    + "'. Esperado " + varType + ", mas encontrado " + exprType + ".");
            }
        }
    }

    // Verifica o comando de entrada (regra: inputStatement com label #NinputStatement)
    @Override
    public void enterNinputStatement(GalirardoParser.NinputStatementContext ctx) {
        String varName = ctx.variable().getText();
        String varType = lookupVariable(varName);
        if (varType == null) {
            errors.add("Erro: Variável '" + varName + "' não declarada no comando de entrada.");
        }
    }

    // ====================================================
    // Métodos para avaliação de tipos das expressões
    // ====================================================

    // A produção "expression" é definida como: expression : assignmentExpression
    private String evaluateExpression(GalirardoParser.ExpressionContext ctx) {
        return evaluateAssignmentExpression(ctx.assignmentExpression());
    }

    // assignmentExpression: variable '=' assignmentExpression | relationalExpression
    private String evaluateAssignmentExpression(GalirardoParser.AssignmentExpressionContext ctx) {
        if (ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("=")) {
            // Expressão do tipo: a = expr
            String varName = ctx.variable().getText();
            String varType = lookupVariable(varName);
            if (varType == null) {
                errors.add("Erro: Variável '" + varName + "' não declarada na expressão de atribuição.");
                varType = "error";
            }
            String exprType = evaluateAssignmentExpression(ctx.assignmentExpression());
            if (!isCompatible(varType, exprType)) {
                errors.add("Erro: Atribuição incompatível na expressão. Variável '" + varName 
                    + "' é do tipo " + varType + " e recebeu " + exprType + ".");
            }
            return varType;
        } else {
            return evaluateRelationalExpression(ctx.relationalExpression());
        }
    }

    // relationalExpression: additiveExpression ((LT | GT | LTE | GTE | EQ | NEQ) additiveExpression)?
    private String evaluateRelationalExpression(GalirardoParser.RelationalExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return evaluateAdditiveExpression(ctx.additiveExpression(0));
        } else if (ctx.getChildCount() == 3) {
            String leftType = evaluateAdditiveExpression(ctx.additiveExpression(0));
            String rightType = evaluateAdditiveExpression(ctx.additiveExpression(1));
            // Operadores relacionais retornam boolean se os operandos forem compatíveis
            if (isCompatible(leftType, rightType)) {
                return "boolean";
            } else {
                errors.add("Erro: Expressão relacional com tipos incompatíveis: " 
                    + leftType + " e " + rightType + ".");
                return "error";
            }
        }
        return "error";
    }

    // additiveExpression: multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    private String evaluateAdditiveExpression(GalirardoParser.AdditiveExpressionContext ctx) {
        String type = evaluateMultiplicativeExpression(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            String nextType = evaluateMultiplicativeExpression(ctx.multiplicativeExpression(i));
            // O operador fica na posição ímpar (entre os operandos)
            String op = ctx.getChild(2 * i - 1).getText();
            if (op.equals("+")) {
                // Se qualquer operando for string, assume concatenação.
                if (type.equals("string") || nextType.equals("string")) {
                    type = "string";
                } else if (isNumeric(type) && isNumeric(nextType)) {
                    type = (type.equals("float") || nextType.equals("float")) ? "float" : "int";
                } else {
                    errors.add("Erro: Operador '+' aplicado a tipos incompatíveis: " 
                        + type + " e " + nextType + ".");
                    type = "error";
                }
            } else if (op.equals("-")) {
                if (isNumeric(type) && isNumeric(nextType)) {
                    type = (type.equals("float") || nextType.equals("float")) ? "float" : "int";
                } else {
                    errors.add("Erro: Operador '-' aplicado a tipos incompatíveis: " 
                        + type + " e " + nextType + ".");
                    type = "error";
                }
            }
        }
        return type;
    }

    // multiplicativeExpression: factor (('*' | '/' | '%') factor)*
    private String evaluateMultiplicativeExpression(GalirardoParser.MultiplicativeExpressionContext ctx) {
        String type = evaluateFactor(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String nextType = evaluateFactor(ctx.factor(i));
            String op = ctx.getChild(2 * i - 1).getText();
            if (isNumeric(type) && isNumeric(nextType)) {
                type = (type.equals("float") || nextType.equals("float")) ? "float" : "int";
            } else {
                errors.add("Erro: Operador '" + op + "' aplicado a tipos incompatíveis: " 
                    + type + " e " + nextType + ".");
                type = "error";
            }
        }
        return type;
    }

    // factor: '(' expression ')' | NUMBER | FLOAT | STRING | variable | functionCall
    private String evaluateFactor(GalirardoParser.FactorContext ctx) {
        if (ctx.NUMBER() != null) {
            return "int";
        } else if (ctx.FLOAT() != null) {
            return "float";
        } else if (ctx.STRING() != null) {
            return "string";
        } else if (ctx.variable() != null) {
            String varName = ctx.variable().getText();
            String varType = lookupVariable(varName);
            if (varType == null) {
                errors.add("Erro: Variável '" + varName + "' não declarada.");
                return "error";
            }
            return varType;
        } else if (ctx.functionCall() != null) {
            // Para simplificar, consideramos que a função retorna int (placeholder).
            return "int";
        } else if (ctx.expression() != null) {
            return evaluateExpression(ctx.expression());
        }
        return "error";
    }

    // ====================================================
    // Métodos auxiliares para gerenciamento de escopos e tipos
    // ====================================================

    // Procura uma variável nos escopos (do mais interno para o global)
    private String lookupVariable(String varName) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, String> scope = scopes.get(i);
            if (scope.containsKey(varName)) {
                return scope.get(varName);
            }
        }
        return null;
    }

    // Verifica se os tipos são compatíveis (permite promoção de int para float)
    private boolean isCompatible(String expected, String actual) {
        if (expected.equals(actual)) return true;
        if (expected.equals("float") && actual.equals("int")) return true;
        return false;
    }

    // Retorna se o tipo é numérico (int ou float)
    private boolean isNumeric(String type) {
        return type.equals("int") || type.equals("float");
    }

    // Método para obter a lista de erros encontrados
    public List<String> getErrors() {
        return errors;
    }
}
