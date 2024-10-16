import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class ExemploLexer {
    public static void main(String[] args) {
        String filename = "Compiladores\\Trabalho\\Trabalho\\codigo.txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            GalirardoLexer lexer = new GalirardoLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("Lexema: " + token.getText());
                System.out.println("Classe: " + lexer.getVocabulary().getSymbolicName(token.getType()));
                System.out.println("Linha: " + token.getLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
