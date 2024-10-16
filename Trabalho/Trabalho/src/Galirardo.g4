grammar Galirardo;

ATR: 'ATRIBUICOES';
COD: 'CODIGO';

TIPO: 'inteiro' | 'booleano' | 'caractere' | 'string';
INPUT: 'in';
OUTPUT: 'out';
IF: 'caso';
ELSE: 'outro';
WHILE: 'repita';
DO: 'executa';
RETURN: 'devolve';
OR: 'ou';
AND: 'e';

OP_ARIT: '+' | '-' | '*' | '/';
OP_COND: '>' | '<' | '==' | '!=';
OP_ATR: ':=';

COL: ';';
DP: ':';
BARRA_VERT: '|';
VIRGULA: ',';
PARENT_ESQ: '(';
PARENT_DIR: ')';

IDENT: LETRA(DIGIT | LETRA)*;
NUM: DIGIT+('.'DIGIT+)?;
fragment LETRA: [a-zA-Z];
fragment DIGIT: [0-9];

// Ignorar WhiteSpace
WS: [ \r\t\n]* ->skip;
ERRO: . ;
