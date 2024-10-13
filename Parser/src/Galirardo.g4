grammar Galirardo;

program: statement+;  // O programa é uma sequência de declarações.

statement: variableDeclaration
         | assignment
         | inputStatement
         | functionDeclaration
         | loopStatement
         | forLoopStatement
         | ifStatement
         | expression
         | responseStatement
         | outStatement;

variableDeclaration: (dataType | 'const' dataType) variable ('=' expression)? ';';  // Declaração de variáveis, incluindo constantes.

dataType: 'int' | 'float' | 'boolean' | 'string';  // Tipos de dados suportados.

assignment: variable '=' expression ';';  // Atribuição padrão.

inputStatement: 'in' variable ';';  // Entrada de dados (similar ao 'cin' no C++).

functionDeclaration: dataType functionName '(' parameters? ')' block;  // Declaração de função com tipos de retorno.

parameters: parameter (',' parameter)*;

parameter: dataType variable;  // Tipo e nome do parâmetro.

block: '{' statement* '}';  // Bloco de código entre chaves.

loopStatement: 'loop' '(' expression ')' block;  // Declaração de loop (while).

forLoopStatement: 'forloop' '(' assignment ';' expression ';' assignment ')' block;  // Declaração de for loop.

ifStatement: 'if' '|' condition '|' block ('else' block)?;  // Estrutura condicional com else opcional.

condition: expression ('==' | '!=' | '<' | '>' | '<=' | '>=') expression
         | booleanExpression;  // Condições aritméticas e booleanas.

booleanExpression: expression ('&&' | '||') expression  // Expressões booleanas (AND, OR).
                 | 'true'
                 | 'false';

expression: term (('+' | '-' | '*' | '/' | '%') term)*;  // Expressões aritméticas e mod.

term: factor;

factor: '(' expression ')' 
      | NUMBER 
      | FLOAT
      | STRING 
      | variable;

outStatement: 'out' '(' expression ')' ';';  // Declaração de saída para 'out', agora aceitando expressões.

responseStatement: 'response' expression ';';  // Declaração de resposta (aceita números e variáveis).

variable: LETTER+;  // Nome de variável.

functionName: LETTER+;  // Nome de função.

STRING: '"' (~["])* '"';  // Cadeia de caracteres (string).

NUMBER: DIGIT+;  // Números inteiros.

FLOAT: DIGIT+ '.' DIGIT+;  // Números de ponto flutuante.

LETTER: [a-zA-Z];  // Letras para nomes de variáveis e funções.

DIGIT: [0-9];  // Dígitos para números.

WS: [ \t\r\n]+ -> skip;  // Ignora espaços em branco.
