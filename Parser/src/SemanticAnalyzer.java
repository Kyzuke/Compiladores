import java.util.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class SemanticAnalyzer extends GalirardoBaseVisitor<Void> {
    
    private final Deque<Map<String, String>> symbolTable = new ArrayDeque<>();
    
    public SemanticAnalyzer() {
        symbolTable.push(new HashMap<>()); // Escopo global
    }
    
    @Override
    public Void visitVariableDeclaration(GalirardoParser.VariableDeclarationContext ctx) {
        String varName = ctx.variable().getText();
        String varType = ctx.dataType().getText();

        Map<String, String> currentScope = symbolTable.peek();
        if (currentScope.containsKey(varName)) {
            throw new RuntimeException("Erro semântico: Variável '" + varName + "' já declarada neste escopo.");
        }
        
        currentScope.put(varName, varType);
        return null;
    }
    
    @Override
    public Void visitAssignment(GalirardoParser.AssignmentContext ctx) {
        String varName = ctx.variable().getText();
        
        String expectedType = findVariableType(varName);
        if (expectedType == null) {
            throw new RuntimeException("Erro semântico: Variável '" + varName + "' não declarada.");
        }
        
        String exprType = evaluateExpressionType(ctx.expression());
        if (!expectedType.equals(exprType)) {
            throw new RuntimeException("Erro de tipo: Atribuição incompatível. Esperado " + expectedType + " mas encontrado " + exprType);
        }
        return null;
    }
    
    @Override
    public Void visitBlock(GalirardoParser.BlockContext ctx) {
        symbolTable.push(new HashMap<>(symbolTable.peek())); // Novo escopo herdando o atual
        visitChildren(ctx);
        symbolTable.pop(); // Sai do escopo
        return null;
    }
    
    private String findVariableType(String varName) {
        for (Map<String, String> scope : symbolTable) {
            if (scope.containsKey(varName)) {
                return scope.get(varName);
            }
        }
        return null;
    }
    
    private String evaluateExpressionType(ParseTree ctx) {
        if (ctx instanceof GalirardoParser.FactorContext) {
            GalirardoParser.FactorContext factor = (GalirardoParser.FactorContext) ctx;
            String text = factor.getText();
    
            if (text.matches("\\d+")) return "int";  // Número inteiro
            if (text.matches("\\d+\\.\\d+")) return "float";  // Número decimal
            if (text.startsWith("\"") && text.endsWith("\"")) return "string";  // String
            if (text.equals("true") || text.equals("false")) return "boolean";  // Booleano
            if (factor.variable() != null) return findVariableType(factor.variable().getText()); // Variável
        }
    
        if (ctx.getChildCount() == 3) { // Expressões como "a + b" ou "x < y"
            String leftType = evaluateExpressionType(ctx.getChild(0));
            String operator = ctx.getChild(1).getText();
            String rightType = evaluateExpressionType(ctx.getChild(2));
    
            if (operator.matches("[+\\-*/%]")) {
                if (leftType.equals("int") && rightType.equals("int")) return "int";
                if ((leftType.equals("int") || leftType.equals("float")) &&
                    (rightType.equals("int") || rightType.equals("float"))) return "float";
            }
    
            if (operator.matches("[<>=!]")) {
                return "boolean";
            }
        }
    
        if (ctx instanceof GalirardoParser.AssignmentExpressionContext) {
            String varType = findVariableType(ctx.getChild(0).getText());
            String exprType = evaluateExpressionType(ctx.getChild(2));
    
            if (varType != null && !varType.equals(exprType)) {
                throw new RuntimeException("Erro de tipo: Atribuição incompatível. Esperado " + varType + " mas encontrado " + exprType);
            }
        }
    
        throw new RuntimeException("Erro: Tipo de expressão desconhecido.");
    }
    
    
}
