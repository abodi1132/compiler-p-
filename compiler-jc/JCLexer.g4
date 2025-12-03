lexer grammar JCLexer;

STYLE_CL: '</style>';
STYLE_OP: '<style>';
SLT: '</';
SRT: '/>';

DOUBLE_LBRC: '{{';
DOUBLE_RBRC: '}}';
LBRC_PERCENT: '{%';
RBRC_PERCENT: '%}';
LBRC_HASH: '{#';
RBRC_HASH: '#}';

OP_L: '<';
OP_R: '>';
LE_E: '<=';
GE_E: '>=';

LT: '<' -> pushMode(TAG_MODE);
RT: '>';

CSS_CLASS: '.' [a-zA-Z_\-][a-zA-Z0-9_\-]*;
CSS_ID: '#' [a-zA-Z_\-][a-zA-Z0-9_\-]*;


L_BRACE: '{';
R_BRACE: '}';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';

CSS_PROP: [a-zA-Z\-]+;
CSS_VAL: ~[;{}]+;

TAG_N: [a-zA-Z][a-zA-Z0-9]*;
CSS_UNIVERSAL: '*';

ATTR_N:[a-zA-Z_\-][a-zA-Z0-9_\-]*;
ATTR_V:'"' ~["]*'"' | '\'' ~[']* '\'' ;

J_FOR: 'for';
J_IN: 'in';
J_IF: 'if';
J_ELSE: 'else';
J_ELIF: 'elif';
J_ENDIF: 'endif';
J_ENDFOR: 'endfor';
J_BLOCK: 'block';
J_ENDBLOCK: 'endblock';
J_EXTENDS: 'extends';
J_INCLUDE: 'include';
J_SET: 'set';
J_MACRO: 'macro';
J_ENDMACRO: 'endmacro';

LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';

ASSIGN: '=';
EQ: '==';
NE: '!=';


PLUS: '+';
MINUS: '-';
MULTI: '*';
DIVIDE: '/';
PERCENT: '%';

AND: 'and';
OR: 'or';
NOT: 'not';

STRING: '"' (~["\\] | '\\' .)* '"'
      | '\'' (~['\\] | '\\' .)* '\'';
NUMBER: [0-9]+ ('.' [0-9]+)?;
TRUE: 'true' | 'True';
FALSE: 'false' | 'False';
NIL: 'none' | 'None' | 'null';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

HTML_TEXT: ~[<{]+;

WS: [ \t\r\n]+ -> skip;

mode TAG_MODE;
    TAG_N1: [a-zA-Z][a-zA-Z0-9]*;
    RT1: '>' -> popMode;
    SRT1: '/>' -> popMode;
    ATTR_N1: [a-zA-Z_][a-zA-Z0-9_\-]*;
    ASSIGN1: '=';
    ATTR_V1: '"' ~["]* '"' | '\'' ~[']* '\'';








