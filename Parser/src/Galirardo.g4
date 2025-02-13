grammar Galirardo;

program
    : statement+ ;

// Regras do Parser
statement
    : variableDeclaration
    | assignment
    | inputStatement
    | functionDeclaration
    | loopStatement
    | forLoopStatement
    | ifStatement
    | expression SEMI
    | responseStatement
    | outStatement
    ;

variableDeclaration
    : (dataType | 'const' dataType) variable ('=' expression)? SEMI
    #NvariableDeclaration;

dataType
    : INT_KW
    | FLOAT_KW
    | BOOLEAN_KW
    | STRING_KW
    ;

assignment
    : variable '=' expression SEMI
    #Nassignment;

inputStatement
    : IN variable SEMI
    #NinputStatement;

functionDeclaration
    : dataType functionName '(' parameters? ')' block
    #NfunctionDeclaration;

parameters
    : parameter (',' parameter)*
    ;

parameter
    : dataType variable
    #Nparameter;

block
    : '{' statement* '}'
    #Nblock;

loopStatement
    : LOOP '(' expression ')' block
    #NloopStatement;

// Ajuste no forLoopStatement
forLoopStatement
    : FORLOOP '(' forControl ')' block
    #NforLoopStatement;

forControl
    : forInit? SEMI expression? SEMI expression?
    ;

forInit
    : (dataType variable ('=' expression)?)
    | expression
    ;

ifStatement
    : IF BAR condition BAR block (ELSE block)?
    #NifStatement;

condition
    : expression (EQ | NEQ | LT | GT | LTE | GTE) expression
    | booleanExpression
    ;

booleanExpression
    : expression (AND | OR) expression
    | TRUE
    | FALSE
    ;

// Agora expression inclui assignmentExpression
expression
    : assignmentExpression
    ;

assignmentExpression
    : variable '=' assignmentExpression
    | relationalExpression
    ;

relationalExpression
    : additiveExpression ( (LT | GT | LTE | GTE | EQ | NEQ) additiveExpression )?
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : factor (('*' | '/' | '%') factor)*
    ;

factor
    : '(' expression ')'
    | NUMBER
    | FLOAT
    | STRING
    | variable
    | functionCall
    ;

functionCall
    : functionName '(' (expression (',' expression)*)? ')'
    #NfunctionCall;

outStatement
    : OUT '(' expression ')' SEMI
    ;

responseStatement
    : RESPONSE expression SEMI
    ;

variable
    : ID
    #Nvariable;

functionName
    : ID
    ;

// ------------------ Regras Léxicas ------------------

IF: 'if';
ELSE: 'else';
LOOP: 'loop';
FORLOOP: 'forloop';
RESPONSE: 'response';
OUT: 'out';
IN: 'in';

INT_KW: 'int';
FLOAT_KW: 'float';
BOOLEAN_KW: 'boolean';
STRING_KW: 'string';

TRUE: 'true';
FALSE: 'false';

EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';

AND: '&&';
OR: '||';

ID: [a-zA-Z]+;

STRING: '"' (~["])* '"';
NUMBER: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT+;

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';
COMMA: ',';
BAR: '|';
ASSIGN: '=';

fragment DIGIT: [0-9];

WS: [ \t\r\n]+ -> skip;
