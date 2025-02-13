import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestLexer {
    public static void main(String[] args) throws Exception {
        // Exemplo de código a ser testado.
        String codigoExemplo = """
            int Fatorial(int n) {
                boolean abc = false;
                int resultado = 1;
                loop (n > 1) {
                    resultado = resultado * n;
                    n = n - 1;
                }
                response resultado;
            }

            int Fibonacci(int n) {
                if | n <= 1 | {
                    response n;
                } else {
                    response Fibonacci(n - 1) + Fibonacci(n - 2);
                }
            }

            int SomaFibonacci(int n) {
                int soma = 0;
                forloop (int i = 0; i <= n; i = i + 1) {
                    soma = soma + Fibonacci(i);
                }
                response soma;
            }
        """;

        testLexer(codigoExemplo);
        testParser(codigoExemplo);
        testSemanticAnalysis(codigoExemplo);
    }

    private static void testLexer(String codigo) {
        CharStream input = CharStreams.fromString(codigo);
        GalirardoLexer lexer = new GalirardoLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();

        System.out.println("Tokens gerados:");
        for (org.antlr.v4.runtime.Token token : tokenStream.getTokens()) {
            System.out.printf("Token tipo: %s, Valor: '%s'%n",
                    GalirardoLexer.VOCABULARY.getDisplayName(token.getType()),
                    token.getText());
        }
    }

    private static void testParser(String codigo) {
        CharStream input = CharStreams.fromString(codigo);
        GalirardoLexer lexer = new GalirardoLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GalirardoParser parser = new GalirardoParser(tokenStream);

        ParseTree tree = parser.program();

        System.out.println("\nÁrvore sintática:");
        System.out.println(tree.toStringTree(parser));
    }

    private static void testSemanticAnalysis(String codigo) {
        CharStream input = CharStreams.fromString(codigo);
        GalirardoLexer lexer = new GalirardoLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GalirardoParser parser = new GalirardoParser(tokenStream);

        ParseTree tree = parser.program();
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();

        try {
            semanticAnalyzer.visit(tree);
            System.out.println("\nAnálise semântica concluída sem erros.");
        } catch (RuntimeException e) {
            System.out.println("\nErro na análise semântica: " + e.getMessage());
        }
    }
}
