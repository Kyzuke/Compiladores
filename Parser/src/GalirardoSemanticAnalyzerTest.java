import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class GalirardoSemanticAnalyzerTest {
    public static void main(String[] args) throws Exception {
        // Exemplo de código fonte em Galirardo
        String sourceCode = 
            "int a = 5;\n" +
            "float b = 3.14;\n" +
            "a = 10;\n" +
            "a = b;\n" +         // Atribuição incompatível: atribuir float a int
            "in c;\n" +          // Uso de variável não declarada
            "int a = 20;\n";     // Declaração duplicada da variável 'a' no escopo global

        // Cria o fluxo de caracteres de entrada
        CharStream input = CharStreams.fromString(sourceCode);

        // Instancia o lexer e o parser (arquivos gerados pelo ANTLR)
        GalirardoLexer lexer = new GalirardoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GalirardoParser parser = new GalirardoParser(tokens);

        // Constrói a árvore de análise a partir da regra 'program'
        ParseTree tree = parser.program();

        // Cria o listener semântico e percorre a árvore
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        ParseTreeWalker.DEFAULT.walk(semanticAnalyzer, tree);

        // Imprime os erros semânticos encontrados (se houver)
        if (semanticAnalyzer.getErrors().isEmpty()) {
            System.out.println("Análise semântica realizada com sucesso. Nenhum erro encontrado.");
        } else {
            System.out.println("Erros semânticos encontrados:");
            for (String error : semanticAnalyzer.getErrors()) {
                System.out.println(error);
            }
        }
    }
}
