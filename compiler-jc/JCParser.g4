parser grammar JCParser;
options {tokenVocab = JCLexer; }

document
    : element*EOF         #DocumentRoot
    ;

element
    : htmlelements        #HtmlElementNode
    | cssblock            #CssBlockNode
    | jinjaexpression     #JinjaExpressionNode
    | jinjastatement      #JinjaStatementNode
    | jinjacomment        #JinjaCommentNode
    | HTML_COMMENT        #HtmlCommentNode
    | DOCTYPE             #DoctypeNode
    | HTML_TEXT+          #HtmlTextNode
    ;




htmlelements
    : TAG_START TAG_N  attributes* RT1  element* SLT CLOSE_TAG_N CLOSE_RT
                          #HtmlOpenCloseTag
    | TAG_START TAG_N attributes* SRT1
                          #HtmlSelfClosingTag
    ;

attributes
         : ATTR_N1 ASSIGN1 ATTR_V1        #HtmlAttributeAssign
         | ATTR_N1                        #HtmlAttributeBoolean
         ;

cssblock
    : STYLE_OP csscontent STYLE_CL        #CssStyleBlock
    ;
csscontent: (cssrules|csscomment|WS2)+;
cssrules
    : selector L_BRACE1 (cssdeclaration | csscomment | WS2)* R_BRACE3   #CssRule
    ;
selector
    : CSS_UNIVERSAL                     #CssUniversalSelector
    | CSS_CLASS                         #CssClassSelector
    | CSS_ID                            #CssIdSelector
    | TAG_NAME                          #CssTagSelector
    ;



cssdeclaration
    : CSS_PROP COLON1 CSS_VAL SEMICOLON1    #CssDeclaration
    ;


csscomment: CSS_COMMENT;

jinjaexpression
    : DOUBLE_LBRC expression DOUBLE_RBRC         #JinjaExpression
    ;
jinjastatement
    : LBRC_PERCENT statement RBRC_PERCENT        #JinjaStatement
    ;
jinjacomment
    : LBRC_HASH COMMENT_TEXT* RBRC_HASH          #JinjaComment
    ;


expression
    : expression OR expression          #OrExpr
    | expression AND expression         #AndExpr
    | NOT expression                    #NotExpr
    | expression op=(EQ | NE | LT | RT | LE_E | GE_E) expression        #CompareExpr
    | expression op=(PLUS | MINUS) expression       #AddSubExpr
    | expression op=(MULTI | DIVIDE | PERCENT) expression           #MulDivExpr
    | unaryOp=(PLUS | MINUS) expression     #UnaryExpr
    | primary           #PrimaryExpr
    | expression DOT ID     #AttributeAccess
    | expression LBRACK expression RBRACK        #IndexAccess
    | primary LPAREN arguments? RPAREN           #FunctionCall
    | LPAREN expression RPAREN                   #ParenExpr
    ;

primary
    : ID                                #IdPrimary
    | STRING                            #StringPrimary
    | NUMBER                            #NumberPrimary
    | TRUE                              #TruePrimary
    | FALSE                             #FalsePrimary
    | NIL                               #NilPrimary
    ;



arguments: expression (COMMA expression)*;

statement
    : ifstatement                       #IfStatementNode
    | forstatement                      #ForStatementNode
    | blockstatement                    #BlockStatementNode
    | macrostatement                    #MacroStatementNode
    | setstatement                      #SetStatementNode
    | extendsstatement                  #ExtendsStatementNode
    | includestatement                  #IncludeStatementNode
    ;


ifstatement
          : J_IF expression RBRC_PERCENT element* (LBRC_PERCENT J_ELIF expression RBRC_PERCENT element*)*  (LBRC_PERCENT J_ELSE RBRC_PERCENT element*)? LBRC_PERCENT J_ENDIF
                        #IfStatement
          ;

forstatement
           : J_FOR ID J_IN expression RBRC_PERCENT element* LBRC_PERCENT J_ENDFOR
                        #ForStatement
           ;
blockstatement
             : J_BLOCK ID RBRC_PERCENT element* LBRC_PERCENT J_ENDBLOCK
                        #BlockStatement
             ;
macrostatement
             : J_MACRO ID LPAREN parameters? RPAREN RBRC_PERCENT element* LBRC_PERCENT J_ENDMACRO
                        #MacroStatement
             ;

parameter: ID (ASSIGN expression)?;

parameters: parameter (COMMA parameter)*;

setstatement
           : J_SET ID ASSIGN expression         #SetStatement
           ;

extendsstatement
    : J_EXTENDS expression          #ExtendsStatement
    ;
includestatement
    : J_INCLUDE expression          #IncludeStatement
    ;