## README

Este é um projeto Java que utiliza a biblioteca ANTLR (ANother Tool for Language Recognition) para análise léxica, sintática e semântica de uma sequência de atribuições na linguagem Java.

# Requisitos

* Java 8 
* ANTLR 4

# Execução

Para executar o projeto, siga as instruções abaixo:

* Clone o repositório:

git clone https://github.com/Bernardo-Bertante/AtividadeParser.git

* Compile o projeto:

cd AtividadeParser
javac -cp antlr-4.9.2-complete.jar Main.java CustomErrorListener.java EvalListener.java

* Execute o programa:

java -cp .:antlr-4.9.2-complete.jar Main

* Siga as instruções na saída do terminal para digitar sua sequência de atribuições.

# Descrição

O programa solicita que o usuário forneça uma sequência de atribuições, que serão analisadas e processadas. A análise é realizada em três etapas: léxica, sintática e semântica. O resultado da análise é uma árvore de análise que representa a estrutura da sequência fornecida.

# Estrutura do Projeto

* Main.java: O ponto de entrada do programa que contém o método main.
* CustomErrorListener.java: Um ouvinte de erros personalizado que trata erros durante a análise léxica e sintática.
* EvalListener.java: Um ouvinte de árvore de análise que executa a avaliação semântica das expressões.
* Java8Lexer.java e Java8Parser.java: Arquivos gerados pelo ANTLR a partir da gramática da linguagem.
* antlr-4.9.2-complete.jar: O arquivo JAR contendo a biblioteca ANTLR.

# Exemplos

1. Atribuição simples: a = 10;

2. Atribuição com expressões aritméticas: b = (5 * 3) + (8 / 2);

3. Atribuições encadeadas:

    x = 10;
    y = 5;
    z = x + y;
