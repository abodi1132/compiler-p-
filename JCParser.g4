parser grammar JCParser;
options {tokenVocab = JCLexer; }

document
    : element* EOF
    ;

element
    : htmlelements    # ElementHtml
    | cssblock        # ElementCss
    | jinjaexpression # ElementJinjaExpr
    | jinjastatement  # ElementJinjaStmt
    | jinjacomment    # ElementJinjaComment
    | HTML_COMMENT    # ElementHtmlComment
    | DOCTYPE         # ElementDoctype
    | HTML_TEXT+      # ElementText
    ;

htmlelements
    : TAG_START TAG_N attributes* RT1 element* SLT CLOSE_TAG_N CLOSE_RT  # HtmlPaired
    | TAG_START TAG_N attributes* SRT1                                    # HtmlSelfClosing
    ;

attributes
    : ATTR_N1 ASSIGN1 ATTR_V1  # AttrWithValue
    | ATTR_N1                  # AttrFlag
    ;

cssblock
    : STYLE_OP csscontent STYLE_CL
    ;

csscontent
    : (cssrules | csscomment)*
    ;

cssrules
    : selector L_BRACE1 (cssdeclaration | csscomment)* R_BRACE3
    ;

selector
    : CSS_UNIVERSAL  # SelectorUniversal
    | CSS_CLASS      # SelectorClass
    | CSS_ID         # SelectorId
    | TAG_NAME       # SelectorTag
    ;

cssdeclaration
    : cssrule SEMICOLON1
    ;

cssrule
    : FONT_FAMILY       COLON1 ARIAL      # RuleFontFamily
    | BACKGROUND_COLOR  COLON1 HEX_COLOR  # RuleBackgroundColor
    | MARGIN            COLON1 PX_VALUE   # RuleMargin
    | COLOR             COLON1 HEX_COLOR  # RuleColor
    | DISPLAY           COLON1 FLEX       # RuleDisplay
    | FLEX_WRAP         COLON1 WRAP       # RuleFlexWrap
    | GAP               COLON1 PX_VALUE   # RuleGap
    | BORDER            COLON1 NONE       # RuleBorder
    | BORDER_RADIUS     COLON1 PX_VALUE   # RuleBorderRadius
    | PADDING           COLON1 PX_VALUE   # RulePadding
    | WIDTH             COLON1 PX_VALUE   # RuleWidth
    | HEIGHT            COLON1 PX_VALUE   # RuleHeight
    | OBJECT_FIT        COLON1 COVER      # RuleObjectFit
    | FONT_WEIGHT       COLON1 BOLD       # RuleFontWeight
    | MARGIN_TOP        COLON1 PX_VALUE   # RuleMarginTop
    | MARGIN_BOTTOM     COLON1 PX_VALUE   # RuleMarginBottom
    | MARGIN_LEFT       COLON1 PX_VALUE   # RuleMarginLeft
    | CURSOR            COLON1 POINTER    # RuleCursor
    | FLEX_DIRECTION    COLON1 COLUMN     # RuleFlexDirection
    ;

csscomment
    : CSS_COMMENT
    ;

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
    : left=expression OR right=expression                                     # ExprOr
    | left=expression AND right=expression                                    # ExprAnd
    | NOT expression                                                          # ExprNot
    | left=expression op=(EQ | NE | LT | RT | LE_E | GE_E) right=expression  # ExprComparison
    | left=expression op=(PLUS | MINUS) right=expression                      # ExprAddSub
    | left=expression op=(MULTI | DIVIDE | PERCENT) right=expression          # ExprMulDiv
    | unaryOp=(PLUS | MINUS) expression                                       # ExprUnary
    | expression DOT ID                                                       # ExprAttribute
    | expression LBRACK expression RBRACK                                     # ExprSubscript
    | expression LPAREN arguments? RPAREN                                     # ExprCall
    | LPAREN expression RPAREN                                                # ExprGrouped
    | primary                                                                 # ExprPrimary
    ;

primary
    : ID      # PrimaryId
    | STRING  # PrimaryString
    | NUMBER  # PrimaryNumber
    | TRUE    # PrimaryTrue
    | FALSE   # PrimaryFalse
    | NIL     # PrimaryNil
    ;

arguments
    : expression (COMMA expression)*
    ;

statement
    : ifstatement       # StmtIf
    | forstatement      # StmtFor
    | blockstatement    # StmtBlock
    | macrostatement    # StmtMacro
    | setstatement      # StmtSet
    | extendsstatement  # StmtExtends
    | includestatement  # StmtInclude
    ;

ifstatement
    : J_IF condition=expression RBRC_PERCENT
        thenElements+=element*
      (LBRC_PERCENT J_ELIF elifConditions+=expression RBRC_PERCENT elifElements+=element*)*
      (LBRC_PERCENT J_ELSE RBRC_PERCENT elseElements+=element*)?
      LBRC_PERCENT J_ENDIF
    ;

forstatement
    : J_FOR ID J_IN expression RBRC_PERCENT
        element*
      LBRC_PERCENT J_ENDFOR
    ;

blockstatement
    : J_BLOCK ID RBRC_PERCENT
        element*
      LBRC_PERCENT J_ENDBLOCK
    ;

macrostatement
    : J_MACRO ID LPAREN parameters? RPAREN RBRC_PERCENT
        element*
      LBRC_PERCENT J_ENDMACRO
    ;

parameter
    : ID (ASSIGN expression)?
    ;

parameters
    : parameter (COMMA parameter)*
    ;

setstatement
    : J_SET ID ASSIGN expression
    ;

extendsstatement
    : J_EXTENDS expression
    ;

includestatement
    : J_INCLUDE expression
    ;
