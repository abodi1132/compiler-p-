parser grammar JCParser;
options {tokenVocab = JCLexer; }

document
    : element*EOF
    ;

element
    : htmlelements
    | cssblock
    | jinjaexpression
    | jinjastatement
    | jinjacomment
    | HTML_COMMENT
    | DOCTYPE
    | HTML_TEXT+
    ;




htmlelements
    : TAG_START TAG_N  attributes* RT1  element* SLT CLOSE_TAG_N CLOSE_RT

    | TAG_START TAG_N attributes* SRT1

    ;

attributes
         : ATTR_N1 ASSIGN1 ATTR_V1
         | ATTR_N1
         ;

cssblock
    : STYLE_OP csscontent STYLE_CL
    ;
csscontent: (cssrules|csscomment|WS2)+;

cssrules
    : selector L_BRACE1 (cssdeclaration | csscomment | WS2)* R_BRACE3
    ;
selector
    : CSS_UNIVERSAL
    | CSS_CLASS
    | CSS_ID
    | TAG_NAME
    ;

cssdeclaration
    : rule SEMICOLON1
    ;

rule
  : FONT_FAMILY COLON1 ARIAL
  | BACKGROUND_COLOR COLON1 HEX_COLOR
  | MARGIN COLON1 PX_VALUE
  | COLOR COLON1 HEX_COLOR
  | DISPLAY COLON1 FLEX
  | FLEX_WRAP COLON1 WRAP
  | GAP COLON1 PX_VALUE
  | BORDER COLON1 NONE
  | BORDER_RADIUS COLON1 PX_VALUE
  | PADDING COLON1 PX_VALUE
  | WIDTH COLON1 PX_VALUE
  | HEIGHT COLON1 PX_VALUE
  | OBJECT_FIT COLON1 COVER
  | FONT_WEIGHT COLON1 BOLD
  | MARGIN_TOP COLON1 PX_VALUE
  | MARGIN_BOTTOM COLON1 PX_VALUE
  | MARGIN_LEFT COLON1 PX_VALUE
  | CURSOR COLON1 POINTER
  | FLEX_DIRECTION COLON1 COLUMN
  ;

csscomment: CSS_COMMENT;

jinjaexpression
    : DOUBLE_LBRC expression DOUBLE_RBRC
    ;
jinjastatement
    : LBRC_PERCENT statement RBRC_PERCENT
    ;
jinjacomment
    : LBRC_HASH COMMENT_TEXT* RBRC_HASH
    ;


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

extendsstatement
    : J_EXTENDS expression
    ;
includestatement
    : J_INCLUDE expression
    ;