import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Por favor, digite sua sequencia de atribuições para gerar a árvore: (ao terminar, aperte ENTER e logo em seguida, CNTRL + Z ou D)");
        CharStream input = CharStreams.fromStream(System.in);
        Java8Lexer lexer = new Java8Lexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CustomErrorListener());
        // cria um buffer de tokens retirados do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // cria um parser que se alimenta do buffer de tokens
        Java8Parser parser = new Java8Parser(tokens);
        // adiciona o listener de erro personalizado ao parser
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());
        // começa a análise na regra do programa
        ParseTree tree = parser.program();
        // cria um walker de árvore de análise genérico que pode acionar callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // cria uma nova instância do EvalListener
        EvalListener listener = new EvalListener();
        // percorre a árvore criada durante a análise, aciona callbacks
        walker.walk(listener, tree);
        // imprime a árvore de análise
        System.out.println("Sua ávore de parsing gerada: ");
        System.out.println(tree.toStringTree(parser));
        // imprime o valor da expressão
        if (listener.getLastExpression() != null) {
            System.out.println("Valor final: " + listener.getValue(listener.getLastExpression()));
        }
    }

}