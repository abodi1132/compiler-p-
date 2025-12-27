parser grammar JCParser;
options {tokenVocab = JCLexer; }

document: element* EOF;

element
    : voidElement
    | htmlelements
    | cssblock
    | jinjaexpression
    | jinjastatement
    | jinjacomment
    | HTML_COMMENT
    | DOCTYPE
    | HTML_TEXT
    ;


htmlelements
    : TAG_START TAG_N attributes* RT1 element* SLT CLOSE_TAG_N CLOSE_RT
    | TAG_START TAG_N attributes* SRT1
    ;

attributes
    : ATTR_N1 ASSIGN1 ATTR_V1
    | ATTR_N1
    ;

 voidElement
 : TAG_START VOID_TAG attributes* RT1
 | TAG_START VOID_TAG attributes* SRT1
 ;


cssblock: STYLE_OP csscontent STYLE_CL;
csscontent: (cssrules | csscomment | WS2)+;
cssrules: selector L_BRACE1 (cssdeclaration | csscomment | WS2)* R_BRACE3;

selector
    : (CSS_UNIVERSAL
      | CSS_CLASS
      | CSS_ID
      | TAG_NAME
      | CSS_PSEUDO
      | COMMA1
      | WS2
      )+
    ;


cssdeclaration: CSS_PROP COLON1 CSS_VAL SEMICOLON1;

csscomment: CSS_COMMENT;

jinjaexpression: DOUBLE_LBRC expression DOUBLE_RBRC;
jinjastatement: LBRC_PERCENT statement RBRC_PERCENT;
jinjacomment: LBRC_HASH COMMENT_TEXT* RBRC_HASH;

expression
    : expression PIPE ID (LPAREN arguments? RPAREN)?  #FilterExpr
    | expression OR expression                         #OrExpr
    | expression AND expression                        #AndExpr
    | NOT expression                                   #NotExpr
    | expression op=(EQ | NE | LT | RT | LE_E | GE_E) expression  #ComparisonExpr
    | expression op=(PLUS | MINUS) expression          #AddSubExpr
    | expression op=(MULTI | DIVIDE | PERCENT) expression  #MulDivExpr
    | unaryOp=(PLUS | MINUS) expression                #UnaryExpr
    | expression DOT ID                                #MemberAccessExpr
    | expression LBRACK expression RBRACK              #IndexExpr
    | primary LPAREN arguments? RPAREN                 #CallExpr
    | LPAREN expression RPAREN                         #ParenExpr
    | primary                                          #PrimaryExpr
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
    : J_IF expression RBRC_PERCENT element*
      (LBRC_PERCENT J_ELIF expression RBRC_PERCENT element*)*
      (LBRC_PERCENT J_ELSE RBRC_PERCENT element*)?
      LBRC_PERCENT J_ENDIF
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