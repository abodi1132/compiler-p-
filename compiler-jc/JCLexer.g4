lexer grammar JCLexer;

DOUBLE_LBRC: '{{'-> pushMode(JINJA_MODE);
LBRC_PERCENT: '{%' -> pushMode(JINJA_MODE);
LBRC_HASH: '{#' -> pushMode(JINJA_C_MODE);

STYLE_OP: '<style>' -> pushMode(CSS_MODE);

SLT: '</' -> pushMode(CLOSE_TAG_MODE);

TAG_START: '<' -> pushMode(OPEN_TAG_MODE);

HTML_COMMENT    : '<!--' .*? '-->' ;
DOCTYPE         : '<!DOCTYPE' .*? '>' ;
HTML_TEXT: (~[<{])+;

WS: [ \t\r\n]+ -> skip;

VOID_TAG
    : 'img'
    | 'input'
    | 'br'
    | 'meta'
    | 'link'
    ;


mode OPEN_TAG_MODE;
    TAG_N: [a-zA-Z][a-zA-Z0-9]* -> pushMode(ATTR_MODE);
    WS1: [ \t\r\n]+ -> skip;

mode ATTR_MODE;
     ATTR_N1: [a-zA-Z_][a-zA-Z0-9_\-]*;
     ASSIGN1: '=';
     ATTR_V1: '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
     ATTR_WS: [ \t\r\n]+ -> skip;
     RT1: '>' -> popMode, popMode;
     SRT1: '/>' -> popMode, popMode;


mode CLOSE_TAG_MODE;
    CLOSE_TAG_N: [a-zA-Z][a-zA-Z0-9]*;
    CLOSE_RT: '>' -> popMode;
    CLOSE_WS: [ \t\r\n]+ -> skip;


mode CSS_MODE;
    STYLE_CL: '</style>' -> popMode;
    L_BRACE1: '{' -> pushMode(BLK_MODE);
    R_BRACE1: '}';
    COMMA1: ',';
    CSS_UNIVERSAL: '*';
    CSS_CLASS: '.' [a-zA-Z_\-][a-zA-Z0-9_\-]*;
    CSS_ID: '#' [a-zA-Z_\-][a-zA-Z0-9_\-]*;
    CSS_PSEUDO: ':' ':'? [a-zA-Z_\-][a-zA-Z0-9_\-]*;
    TAG_NAME: [a-zA-Z][a-zA-Z0-9_\-]*;
    CSS_COMMENT: '/*' .*? '*/' -> skip;
    WS2: [ \t\r\n]+ -> skip;


mode BLK_MODE;
     R_BRACE3: '}'-> popMode;
     CSS_PROP: [a-zA-Z_\-][a-zA-Z0-9_\-]* -> pushMode(VAL_MODE);
     CSS_COMMENT2: '/*' .*? '*/' -> skip;
     WS_BLOCK: [ \t\r\n]+ -> skip;

mode VAL_MODE;
     SEMICOLON1: ';' -> popMode;
     COLON1: ':';
     CSS_VAL: (~[;:{}\r\n\t])+;
     R_BRACE2: '}'-> popMode,popMode;
     WS3: [ \t\r\n]+ -> skip;

mode JINJA_MODE;
     DOUBLE_RBRC: '}}'  -> popMode;
     RBRC_PERCENT: '%}'  -> popMode;
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
     STRING: '"' (~["\\] | '\\' .)* '"'
           | '\'' (~['\\] | '\\' .)* '\'';
     NUMBER: [0-9]+ ('.' [0-9]+)?;
     TRUE: 'true' | 'True';
     FALSE: 'false' | 'False';
     NIL: 'none' | 'None' | 'null';
     ID: [a-zA-Z_][a-zA-Z0-9_]*;
     AND: 'and';
     OR: 'or';
     NOT: 'not';
     LE_E: '<=';
     GE_E: '>=';
     EQ: '==';
     NE: '!=';
     LT: '<';
     RT: '>';
     ASSIGN: '=';
     PLUS: '+';
     MINUS: '-';
     MULTI: '*';
     DIVIDE: '/';
     PIPE: '|';
     PERCENT: '%';
     DOT : '.';
     LPAREN: '(';
     RPAREN: ')';
     LBRACK: '[';
     RBRACK: ']';
     COMMA: ',';
     WS_JINJA: [ \t\r\n]+ -> skip;



mode JINJA_C_MODE;
     RBRC_HASH: '#}' -> popMode;
     COMMENT_TEXT: . -> skip;