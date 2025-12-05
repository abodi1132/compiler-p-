parser grammar JCParser;
options {tokenVocab = JCLexer; }

document: element*EOF;

element
    : htmlelements
    | cssblock
    | jinjaexpression
    | jinjacomment
    | ifstatement
    | forstatement
    | blockstatement
    | macrostatement
    | setstatement
    | extendsstatement
    | includestatement
    | HTML_TEXT+
    ;




htmlelements
    : TAG_START TAG_N  attributes* RT1 element* SLT CLOSE_TAG_N CLOSE_RT
    | TAG_START TAG_N attributes* SRT1
    | TAG_START TAG_N attributes* RT1
    ;

attributes
         : ATTR_N1 ASSIGN1 ATTR_V1
         | ATTR_N1
         ;

cssblock: STYLE_OP csscontent STYLE_CL;
csscontent: (cssrules|csscomment|WS2)+;
cssrules: selector L_BRACE1 (cssdeclaration | csscomment | WS2)* R_BRACE3;
selector
        : CSS_UNIVERSAL
        | CSS_CLASS
        | CSS_ID
        |TAG_NAME
        ;


cssdeclaration: CSS_PROP COLON1 CSS_VAL SEMICOLON1;


csscomment: CSS_COMMENT;

jinjaexpression: DOUBLE_LBRC expression DOUBLE_RBRC;
jinjastatement: LBRC_PERCENT statement RBRC_PERCENT;
jinjacomment: LBRC_HASH COMMENT_TEXT* RBRC_HASH;

expression
    : expression OR expression
    | expression AND expression
    | NOT expression
    | expression op=(EQ | NE | LT | RT | LE_E | GE_E) expression
    | expression op=(PLUS | MINUS) expression
    | expression op=(MULTI | DIVIDE | PERCENT) expression
    | unaryOp=(PLUS | MINUS) expression
    | primary
    | expression DOT ID
    | expression LBRACK expression RBRACK
    | primary LPAREN arguments? RPAREN
    | LPAREN expression RPAREN
    ;

primary
      : ID
      | STRING
      | NUMBER
      | TRUE
      | FALSE
      | NIL
      ;


arguments: expression (COMMA expression)*;

statement
        : ifstatement
        | forstatement
        | blockstatement
        | macrostatement
        | setstatement
        | extendsstatement
        | includestatement
        ;


ifstatement
          : J_IF expression RBRC_PERCENT element* (LBRC_PERCENT J_ELIF expression RBRC_PERCENT element*)*  (LBRC_PERCENT J_ELSE RBRC_PERCENT element*)? LBRC_PERCENT J_ENDIF
          ;

forstatement
           : J_FOR ID J_IN expression RBRC_PERCENT element* LBRC_PERCENT J_ENDFOR
           ;
blockstatement
             : J_BLOCK ID RBRC_PERCENT element* LBRC_PERCENT J_ENDBLOCK
             ;
macrostatement
             : J_MACRO ID LPAREN parameters? RPAREN RBRC_PERCENT element* LBRC_PERCENT J_ENDMACRO
             ;

parameter: ID (ASSIGN expression)?;

parameters: parameter (COMMA parameter)*;

setstatement
           : J_SET ID ASSIGN expression
           ;

extendsstatement: J_EXTENDS expression;
includestatement: J_INCLUDE expression;