import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // Exemplo de código a ser testado.
        String codigoExemplo = """
            int x = 5;
            int x = 10;
            y = x + 1;
            if | x < 10 | {
                float z = "hello";
            }
            loop (x) {
                int a = 1;
            }
            a = 2;
        """;

        testLexer(codigoExemplo);
        testParser(codigoExemplo);
        testSemanticAnalysis(codigoExemplo);
    }

    private static void testLexer(String codigo) {
        // Cria o fluxo de entrada a partir do código de exemplo.
        CharStream input = CharStreams.fromString(codigo);

        // Inicializa o lexer com o fluxo de entrada.
        GalirardoLexer lexer = new GalirardoLexer(input);

        // Cria um fluxo de tokens a partir do lexer.
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // Preenche o fluxo de tokens.
        tokenStream.fill();

        System.out.println("Tokens gerados:");
        for (Token token : tokenStream.getTokens()) {
            System.out.printf("Token tipo: %s, Valor: '%s'%n",
                    GalirardoLexer.VOCABULARY.getDisplayName(token.getType()),
                    token.getText());
        }
    }

    private static void testParser(String codigo) {
        // Cria o fluxo de entrada a partir do código de exemplo.
        CharStream input = CharStreams.fromString(codigo);

        // Inicializa o lexer com o fluxo de entrada.
        GalirardoLexer lexer = new GalirardoLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // Inicializa o parser com o fluxo de tokens.
        GalirardoParser parser = new GalirardoParser(tokenStream);

        // Inicia o processo de parsing a partir da regra inicial 'program'.
        ParseTree tree = parser.program();

        // Imprime a árvore sintática.
        System.out.println("\nÁrvore sintática:");
        System.out.println(tree.toStringTree(parser));
    }

    private static void testSemanticAnalysis(String codigo) {
        // Cria o fluxo de entrada a partir do código de exemplo.
        CharStream input = CharStreams.fromString(codigo);

        // Inicializa o lexer e o parser com o fluxo de entrada.
        GalirardoLexer lexer = new GalirardoLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GalirardoParser parser = new GalirardoParser(tokenStream);

        // Inicia o processo de parsing a partir da regra inicial 'program'.
        ParseTree tree = parser.program();

        // Cria o listener semântico e realiza o walk na árvore.
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        ParseTreeWalker.DEFAULT.walk(semanticAnalyzer, tree);

        // Imprime os erros semânticos encontrados (se houver).
        System.out.println("\nAnálise Semântica:");
        if (semanticAnalyzer.getErrors().isEmpty()) {
            System.out.println("Nenhum erro semântico encontrado.");
        } else {
            System.out.println("Erros semânticos encontrados:");
            for (String error : semanticAnalyzer.getErrors()) {
                System.out.println(error);
            }
        }
    }
}
