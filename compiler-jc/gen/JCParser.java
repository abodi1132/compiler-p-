// Generated from C:/Users/karam 2/Documents/compiler-p-/compiler-jc/JCParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOUBLE_LBRC=1, LBRC_PERCENT=2, LBRC_HASH=3, STYLE_OP=4, SLT=5, TAG_START=6, 
		HTML_COMMENT=7, DOCTYPE=8, HTML_TEXT=9, WS=10, TAG_N=11, WS1=12, ATTR_N1=13, 
		ASSIGN1=14, ATTR_V1=15, ATTR_WS=16, RT1=17, SRT1=18, CLOSE_TAG_N=19, CLOSE_RT=20, 
		CLOSE_WS=21, STYLE_CL=22, L_BRACE1=23, R_BRACE1=24, COMMA1=25, CSS_UNIVERSAL=26, 
		CSS_CLASS=27, CSS_ID=28, TAG_NAME=29, CSS_COMMENT=30, WS2=31, R_BRACE3=32, 
		CSS_PROP=33, CSS_COMMENT2=34, WS_BLOCK=35, SEMICOLON1=36, COLON1=37, CSS_VAL=38, 
		R_BRACE2=39, WS3=40, DOUBLE_RBRC=41, RBRC_PERCENT=42, J_FOR=43, J_IN=44, 
		J_IF=45, J_ELSE=46, J_ELIF=47, J_ENDIF=48, J_ENDFOR=49, J_BLOCK=50, J_ENDBLOCK=51, 
		J_EXTENDS=52, J_INCLUDE=53, J_SET=54, J_MACRO=55, J_ENDMACRO=56, STRING=57, 
		NUMBER=58, TRUE=59, FALSE=60, NIL=61, ID=62, AND=63, OR=64, NOT=65, LE_E=66, 
		GE_E=67, EQ=68, NE=69, LT=70, RT=71, ASSIGN=72, PLUS=73, MINUS=74, MULTI=75, 
		DIVIDE=76, PERCENT=77, DOT=78, LPAREN=79, RPAREN=80, LBRACK=81, RBRACK=82, 
		COMMA=83, WS_JINJA=84, RBRC_HASH=85, COMMENT_TEXT=86;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_htmlelements = 2, RULE_attributes = 3, 
		RULE_cssblock = 4, RULE_csscontent = 5, RULE_cssrules = 6, RULE_selector = 7, 
		RULE_cssdeclaration = 8, RULE_csscomment = 9, RULE_jinjaexpression = 10, 
		RULE_jinjastatement = 11, RULE_jinjacomment = 12, RULE_expression = 13, 
		RULE_primary = 14, RULE_arguments = 15, RULE_statement = 16, RULE_ifstatement = 17, 
		RULE_forstatement = 18, RULE_blockstatement = 19, RULE_macrostatement = 20, 
		RULE_parameter = 21, RULE_parameters = 22, RULE_setstatement = 23, RULE_extendsstatement = 24, 
		RULE_includestatement = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "htmlelements", "attributes", "cssblock", "csscontent", 
			"cssrules", "selector", "cssdeclaration", "csscomment", "jinjaexpression", 
			"jinjastatement", "jinjacomment", "expression", "primary", "arguments", 
			"statement", "ifstatement", "forstatement", "blockstatement", "macrostatement", 
			"parameter", "parameters", "setstatement", "extendsstatement", "includestatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", "'{#'", "'<style>'", "'</'", null, null, null, 
			null, null, null, null, null, null, null, null, null, "'/>'", null, null, 
			null, "'</style>'", "'{'", null, null, null, null, null, null, null, 
			null, null, null, null, null, "';'", "':'", null, null, null, "'}}'", 
			"'%}'", "'for'", "'in'", "'if'", "'else'", "'elif'", "'endif'", "'endfor'", 
			"'block'", "'endblock'", "'extends'", "'include'", "'set'", "'macro'", 
			"'endmacro'", null, null, null, null, null, null, "'and'", "'or'", "'not'", 
			"'<='", "'>='", "'=='", "'!='", null, null, null, "'+'", "'-'", null, 
			"'/'", "'%'", "'.'", "'('", "')'", "'['", "']'", null, null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOUBLE_LBRC", "LBRC_PERCENT", "LBRC_HASH", "STYLE_OP", "SLT", 
			"TAG_START", "HTML_COMMENT", "DOCTYPE", "HTML_TEXT", "WS", "TAG_N", "WS1", 
			"ATTR_N1", "ASSIGN1", "ATTR_V1", "ATTR_WS", "RT1", "SRT1", "CLOSE_TAG_N", 
			"CLOSE_RT", "CLOSE_WS", "STYLE_CL", "L_BRACE1", "R_BRACE1", "COMMA1", 
			"CSS_UNIVERSAL", "CSS_CLASS", "CSS_ID", "TAG_NAME", "CSS_COMMENT", "WS2", 
			"R_BRACE3", "CSS_PROP", "CSS_COMMENT2", "WS_BLOCK", "SEMICOLON1", "COLON1", 
			"CSS_VAL", "R_BRACE2", "WS3", "DOUBLE_RBRC", "RBRC_PERCENT", "J_FOR", 
			"J_IN", "J_IF", "J_ELSE", "J_ELIF", "J_ENDIF", "J_ENDFOR", "J_BLOCK", 
			"J_ENDBLOCK", "J_EXTENDS", "J_INCLUDE", "J_SET", "J_MACRO", "J_ENDMACRO", 
			"STRING", "NUMBER", "TRUE", "FALSE", "NIL", "ID", "AND", "OR", "NOT", 
			"LE_E", "GE_E", "EQ", "NE", "LT", "RT", "ASSIGN", "PLUS", "MINUS", "MULTI", 
			"DIVIDE", "PERCENT", "DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", 
			"WS_JINJA", "RBRC_HASH", "COMMENT_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JCParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 990L) != 0)) {
				{
				{
				setState(52);
				element();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public HtmlelementsContext htmlelements() {
			return getRuleContext(HtmlelementsContext.class,0);
		}
		public CssblockContext cssblock() {
			return getRuleContext(CssblockContext.class,0);
		}
		public JinjaexpressionContext jinjaexpression() {
			return getRuleContext(JinjaexpressionContext.class,0);
		}
		public JinjastatementContext jinjastatement() {
			return getRuleContext(JinjastatementContext.class,0);
		}
		public JinjacommentContext jinjacomment() {
			return getRuleContext(JinjacommentContext.class,0);
		}
		public TerminalNode HTML_COMMENT() { return getToken(JCParser.HTML_COMMENT, 0); }
		public TerminalNode DOCTYPE() { return getToken(JCParser.DOCTYPE, 0); }
		public List<TerminalNode> HTML_TEXT() { return getTokens(JCParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(JCParser.HTML_TEXT, i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			int _alt;
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				htmlelements();
				}
				break;
			case STYLE_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				cssblock();
				}
				break;
			case DOUBLE_LBRC:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				jinjaexpression();
				}
				break;
			case LBRC_PERCENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				jinjastatement();
				}
				break;
			case LBRC_HASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				jinjacomment();
				}
				break;
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(HTML_COMMENT);
				}
				break;
			case DOCTYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				match(DOCTYPE);
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						match(HTML_TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlelementsContext extends ParserRuleContext {
		public TerminalNode TAG_START() { return getToken(JCParser.TAG_START, 0); }
		public TerminalNode TAG_N() { return getToken(JCParser.TAG_N, 0); }
		public TerminalNode RT1() { return getToken(JCParser.RT1, 0); }
		public TerminalNode SLT() { return getToken(JCParser.SLT, 0); }
		public TerminalNode CLOSE_TAG_N() { return getToken(JCParser.CLOSE_TAG_N, 0); }
		public TerminalNode CLOSE_RT() { return getToken(JCParser.CLOSE_RT, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode SRT1() { return getToken(JCParser.SRT1, 0); }
		public HtmlelementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlelements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterHtmlelements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitHtmlelements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitHtmlelements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlelementsContext htmlelements() throws RecognitionException {
		HtmlelementsContext _localctx = new HtmlelementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlelements);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(TAG_START);
				setState(75);
				match(TAG_N);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_N1) {
					{
					{
					setState(76);
					attributes();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(RT1);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 990L) != 0)) {
					{
					{
					setState(83);
					element();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(SLT);
				setState(90);
				match(CLOSE_TAG_N);
				setState(91);
				match(CLOSE_RT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(TAG_START);
				setState(93);
				match(TAG_N);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_N1) {
					{
					{
					setState(94);
					attributes();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(SRT1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode ATTR_N1() { return getToken(JCParser.ATTR_N1, 0); }
		public TerminalNode ASSIGN1() { return getToken(JCParser.ASSIGN1, 0); }
		public TerminalNode ATTR_V1() { return getToken(JCParser.ATTR_V1, 0); }
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributes);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ATTR_N1);
				setState(104);
				match(ASSIGN1);
				setState(105);
				match(ATTR_V1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ATTR_N1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssblockContext extends ParserRuleContext {
		public TerminalNode STYLE_OP() { return getToken(JCParser.STYLE_OP, 0); }
		public CsscontentContext csscontent() {
			return getRuleContext(CsscontentContext.class,0);
		}
		public TerminalNode STYLE_CL() { return getToken(JCParser.STYLE_CL, 0); }
		public CssblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterCssblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitCssblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitCssblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssblockContext cssblock() throws RecognitionException {
		CssblockContext _localctx = new CssblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cssblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(STYLE_OP);
			setState(110);
			csscontent();
			setState(111);
			match(STYLE_CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CsscontentContext extends ParserRuleContext {
		public List<CssrulesContext> cssrules() {
			return getRuleContexts(CssrulesContext.class);
		}
		public CssrulesContext cssrules(int i) {
			return getRuleContext(CssrulesContext.class,i);
		}
		public List<CsscommentContext> csscomment() {
			return getRuleContexts(CsscommentContext.class);
		}
		public CsscommentContext csscomment(int i) {
			return getRuleContext(CsscommentContext.class,i);
		}
		public List<TerminalNode> WS2() { return getTokens(JCParser.WS2); }
		public TerminalNode WS2(int i) {
			return getToken(JCParser.WS2, i);
		}
		public CsscontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csscontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterCsscontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitCsscontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitCsscontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsscontentContext csscontent() throws RecognitionException {
		CsscontentContext _localctx = new CsscontentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_csscontent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_UNIVERSAL:
				case CSS_CLASS:
				case CSS_ID:
				case TAG_NAME:
					{
					setState(113);
					cssrules();
					}
					break;
				case CSS_COMMENT:
					{
					setState(114);
					csscomment();
					}
					break;
				case WS2:
					{
					setState(115);
					match(WS2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssrulesContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode L_BRACE1() { return getToken(JCParser.L_BRACE1, 0); }
		public TerminalNode R_BRACE3() { return getToken(JCParser.R_BRACE3, 0); }
		public List<CssdeclarationContext> cssdeclaration() {
			return getRuleContexts(CssdeclarationContext.class);
		}
		public CssdeclarationContext cssdeclaration(int i) {
			return getRuleContext(CssdeclarationContext.class,i);
		}
		public List<CsscommentContext> csscomment() {
			return getRuleContexts(CsscommentContext.class);
		}
		public CsscommentContext csscomment(int i) {
			return getRuleContext(CsscommentContext.class,i);
		}
		public List<TerminalNode> WS2() { return getTokens(JCParser.WS2); }
		public TerminalNode WS2(int i) {
			return getToken(JCParser.WS2, i);
		}
		public CssrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssrules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterCssrules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitCssrules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitCssrules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssrulesContext cssrules() throws RecognitionException {
		CssrulesContext _localctx = new CssrulesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cssrules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			selector();
			setState(121);
			match(L_BRACE1);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11811160064L) != 0)) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_PROP:
					{
					setState(122);
					cssdeclaration();
					}
					break;
				case CSS_COMMENT:
					{
					setState(123);
					csscomment();
					}
					break;
				case WS2:
					{
					setState(124);
					match(WS2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(R_BRACE3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode CSS_UNIVERSAL() { return getToken(JCParser.CSS_UNIVERSAL, 0); }
		public TerminalNode CSS_CLASS() { return getToken(JCParser.CSS_CLASS, 0); }
		public TerminalNode CSS_ID() { return getToken(JCParser.CSS_ID, 0); }
		public TerminalNode TAG_NAME() { return getToken(JCParser.TAG_NAME, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssdeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_PROP() { return getToken(JCParser.CSS_PROP, 0); }
		public TerminalNode COLON1() { return getToken(JCParser.COLON1, 0); }
		public TerminalNode CSS_VAL() { return getToken(JCParser.CSS_VAL, 0); }
		public TerminalNode SEMICOLON1() { return getToken(JCParser.SEMICOLON1, 0); }
		public CssdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterCssdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitCssdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitCssdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssdeclarationContext cssdeclaration() throws RecognitionException {
		CssdeclarationContext _localctx = new CssdeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cssdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CSS_PROP);
			setState(135);
			match(COLON1);
			setState(136);
			match(CSS_VAL);
			setState(137);
			match(SEMICOLON1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CsscommentContext extends ParserRuleContext {
		public TerminalNode CSS_COMMENT() { return getToken(JCParser.CSS_COMMENT, 0); }
		public CsscommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csscomment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterCsscomment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitCsscomment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitCsscomment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsscommentContext csscomment() throws RecognitionException {
		CsscommentContext _localctx = new CsscommentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_csscomment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CSS_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaexpressionContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LBRC() { return getToken(JCParser.DOUBLE_LBRC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_RBRC() { return getToken(JCParser.DOUBLE_RBRC, 0); }
		public JinjaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterJinjaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitJinjaexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitJinjaexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaexpressionContext jinjaexpression() throws RecognitionException {
		JinjaexpressionContext _localctx = new JinjaexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(DOUBLE_LBRC);
			setState(142);
			expression(0);
			setState(143);
			match(DOUBLE_RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjastatementContext extends ParserRuleContext {
		public TerminalNode LBRC_PERCENT() { return getToken(JCParser.LBRC_PERCENT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRC_PERCENT() { return getToken(JCParser.RBRC_PERCENT, 0); }
		public JinjastatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjastatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterJinjastatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitJinjastatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitJinjastatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjastatementContext jinjastatement() throws RecognitionException {
		JinjastatementContext _localctx = new JinjastatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjastatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRC_PERCENT);
			setState(146);
			statement();
			setState(147);
			match(RBRC_PERCENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjacommentContext extends ParserRuleContext {
		public TerminalNode LBRC_HASH() { return getToken(JCParser.LBRC_HASH, 0); }
		public TerminalNode RBRC_HASH() { return getToken(JCParser.RBRC_HASH, 0); }
		public List<TerminalNode> COMMENT_TEXT() { return getTokens(JCParser.COMMENT_TEXT); }
		public TerminalNode COMMENT_TEXT(int i) {
			return getToken(JCParser.COMMENT_TEXT, i);
		}
		public JinjacommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjacomment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterJinjacomment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitJinjacomment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitJinjacomment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjacommentContext jinjacomment() throws RecognitionException {
		JinjacommentContext _localctx = new JinjacommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjacomment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LBRC_HASH);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(150);
				match(COMMENT_TEXT);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(RBRC_HASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token unaryOp;
		public Token op;
		public TerminalNode NOT() { return getToken(JCParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JCParser.MINUS, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JCParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode OR() { return getToken(JCParser.OR, 0); }
		public TerminalNode AND() { return getToken(JCParser.AND, 0); }
		public TerminalNode EQ() { return getToken(JCParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JCParser.NE, 0); }
		public TerminalNode LT() { return getToken(JCParser.LT, 0); }
		public TerminalNode RT() { return getToken(JCParser.RT, 0); }
		public TerminalNode LE_E() { return getToken(JCParser.LE_E, 0); }
		public TerminalNode GE_E() { return getToken(JCParser.GE_E, 0); }
		public TerminalNode MULTI() { return getToken(JCParser.MULTI, 0); }
		public TerminalNode DIVIDE() { return getToken(JCParser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(JCParser.PERCENT, 0); }
		public TerminalNode DOT() { return getToken(JCParser.DOT, 0); }
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(JCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JCParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(159);
				match(NOT);
				setState(160);
				expression(10);
				}
				break;
			case 2:
				{
				setState(161);
				((ExpressionContext)_localctx).unaryOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).unaryOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				expression(6);
				}
				break;
			case 3:
				{
				setState(163);
				primary();
				}
				break;
			case 4:
				{
				setState(164);
				primary();
				setState(165);
				match(LPAREN);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 4391231L) != 0)) {
					{
					setState(166);
					arguments();
					}
				}

				setState(169);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(171);
				match(LPAREN);
				setState(172);
				expression(0);
				setState(173);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(178);
						match(OR);
						setState(179);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(181);
						match(AND);
						setState(182);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 63L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 7L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193);
						match(DOT);
						setState(194);
						match(ID);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196);
						match(LBRACK);
						setState(197);
						expression(0);
						setState(198);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode STRING() { return getToken(JCParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JCParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(JCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JCParser.FALSE, 0); }
		public TerminalNode NIL() { return getToken(JCParser.NIL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079256848778919936L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JCParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			expression(0);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				expression(0);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public MacrostatementContext macrostatement() {
			return getRuleContext(MacrostatementContext.class,0);
		}
		public SetstatementContext setstatement() {
			return getRuleContext(SetstatementContext.class,0);
		}
		public ExtendsstatementContext extendsstatement() {
			return getRuleContext(ExtendsstatementContext.class,0);
		}
		public IncludestatementContext includestatement() {
			return getRuleContext(IncludestatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				ifstatement();
				}
				break;
			case J_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				forstatement();
				}
				break;
			case J_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				blockstatement();
				}
				break;
			case J_MACRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				macrostatement();
				}
				break;
			case J_SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				setstatement();
				}
				break;
			case J_EXTENDS:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				extendsstatement();
				}
				break;
			case J_INCLUDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				includestatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode J_IF() { return getToken(JCParser.J_IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRC_PERCENT() { return getTokens(JCParser.RBRC_PERCENT); }
		public TerminalNode RBRC_PERCENT(int i) {
			return getToken(JCParser.RBRC_PERCENT, i);
		}
		public List<TerminalNode> LBRC_PERCENT() { return getTokens(JCParser.LBRC_PERCENT); }
		public TerminalNode LBRC_PERCENT(int i) {
			return getToken(JCParser.LBRC_PERCENT, i);
		}
		public TerminalNode J_ENDIF() { return getToken(JCParser.J_ENDIF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> J_ELIF() { return getTokens(JCParser.J_ELIF); }
		public TerminalNode J_ELIF(int i) {
			return getToken(JCParser.J_ELIF, i);
		}
		public TerminalNode J_ELSE() { return getToken(JCParser.J_ELSE, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(J_IF);
			setState(225);
			expression(0);
			setState(226);
			match(RBRC_PERCENT);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					element();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(LBRC_PERCENT);
					setState(234);
					match(J_ELIF);
					setState(235);
					expression(0);
					setState(236);
					match(RBRC_PERCENT);
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(237);
							element();
							}
							} 
						}
						setState(242);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(248);
				match(LBRC_PERCENT);
				setState(249);
				match(J_ELSE);
				setState(250);
				match(RBRC_PERCENT);
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(251);
						element();
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			}
			setState(259);
			match(LBRC_PERCENT);
			setState(260);
			match(J_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForstatementContext extends ParserRuleContext {
		public TerminalNode J_FOR() { return getToken(JCParser.J_FOR, 0); }
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode J_IN() { return getToken(JCParser.J_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRC_PERCENT() { return getToken(JCParser.RBRC_PERCENT, 0); }
		public TerminalNode LBRC_PERCENT() { return getToken(JCParser.LBRC_PERCENT, 0); }
		public TerminalNode J_ENDFOR() { return getToken(JCParser.J_ENDFOR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(J_FOR);
			setState(263);
			match(ID);
			setState(264);
			match(J_IN);
			setState(265);
			expression(0);
			setState(266);
			match(RBRC_PERCENT);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					element();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(273);
			match(LBRC_PERCENT);
			setState(274);
			match(J_ENDFOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockstatementContext extends ParserRuleContext {
		public TerminalNode J_BLOCK() { return getToken(JCParser.J_BLOCK, 0); }
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode RBRC_PERCENT() { return getToken(JCParser.RBRC_PERCENT, 0); }
		public TerminalNode LBRC_PERCENT() { return getToken(JCParser.LBRC_PERCENT, 0); }
		public TerminalNode J_ENDBLOCK() { return getToken(JCParser.J_ENDBLOCK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BlockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterBlockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitBlockstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitBlockstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockstatementContext blockstatement() throws RecognitionException {
		BlockstatementContext _localctx = new BlockstatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(J_BLOCK);
			setState(277);
			match(ID);
			setState(278);
			match(RBRC_PERCENT);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					element();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(285);
			match(LBRC_PERCENT);
			setState(286);
			match(J_ENDBLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacrostatementContext extends ParserRuleContext {
		public TerminalNode J_MACRO() { return getToken(JCParser.J_MACRO, 0); }
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(JCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JCParser.RPAREN, 0); }
		public TerminalNode RBRC_PERCENT() { return getToken(JCParser.RBRC_PERCENT, 0); }
		public TerminalNode LBRC_PERCENT() { return getToken(JCParser.LBRC_PERCENT, 0); }
		public TerminalNode J_ENDMACRO() { return getToken(JCParser.J_ENDMACRO, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public MacrostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macrostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterMacrostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitMacrostatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitMacrostatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacrostatementContext macrostatement() throws RecognitionException {
		MacrostatementContext _localctx = new MacrostatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_macrostatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(J_MACRO);
			setState(289);
			match(ID);
			setState(290);
			match(LPAREN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(291);
				parameters();
				}
			}

			setState(294);
			match(RPAREN);
			setState(295);
			match(RBRC_PERCENT);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					element();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(302);
			match(LBRC_PERCENT);
			setState(303);
			match(J_ENDMACRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(JCParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ID);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(306);
				match(ASSIGN);
				setState(307);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JCParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			parameter();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311);
				match(COMMA);
				setState(312);
				parameter();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetstatementContext extends ParserRuleContext {
		public TerminalNode J_SET() { return getToken(JCParser.J_SET, 0); }
		public TerminalNode ID() { return getToken(JCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(JCParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterSetstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitSetstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitSetstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetstatementContext setstatement() throws RecognitionException {
		SetstatementContext _localctx = new SetstatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(J_SET);
			setState(319);
			match(ID);
			setState(320);
			match(ASSIGN);
			setState(321);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsstatementContext extends ParserRuleContext {
		public TerminalNode J_EXTENDS() { return getToken(JCParser.J_EXTENDS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExtendsstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterExtendsstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitExtendsstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitExtendsstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsstatementContext extendsstatement() throws RecognitionException {
		ExtendsstatementContext _localctx = new ExtendsstatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_extendsstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(J_EXTENDS);
			setState(324);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludestatementContext extends ParserRuleContext {
		public TerminalNode J_INCLUDE() { return getToken(JCParser.J_INCLUDE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncludestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).enterIncludestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JCParserListener ) ((JCParserListener)listener).exitIncludestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCParserVisitor ) return ((JCParserVisitor<? extends T>)visitor).visitIncludestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludestatementContext includestatement() throws RecognitionException {
		IncludestatementContext _localctx = new IncludestatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_includestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(J_INCLUDE);
			setState(327);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"E\b\u0001\u000b\u0001\f\u0001F\u0003\u0001I\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002\u0001\u0002\u0003\u0002f\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003l\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005u\b\u0005\u000b\u0005\f\u0005v\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006~\b\u0006\n\u0006"+
		"\f\u0006\u0081\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0005\f\u0098\b\f\n\f\f\f\u009b\t\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a8\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b0"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c9\b\r\n\r\f\r\u00cc"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00d3\b\u000f\n\u000f\f\u000f\u00d6\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00df\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00e5\b\u0011\n\u0011\f\u0011\u00e8\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ef\b\u0011\n\u0011\f\u0011"+
		"\u00f2\t\u0011\u0005\u0011\u00f4\b\u0011\n\u0011\f\u0011\u00f7\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fd\b\u0011"+
		"\n\u0011\f\u0011\u0100\t\u0011\u0003\u0011\u0102\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u010d\b\u0012\n\u0012\f\u0012\u0110\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0119\b\u0013\n\u0013\f\u0013\u011c\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0125\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u012a\b\u0014\n\u0014\f\u0014\u012d\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0135\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u013a\b\u0016\n\u0016"+
		"\f\u0016\u013d\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0000\u0001\u001a\u001a\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02\u0000\u0005\u0001\u0000\u001a\u001d\u0001\u0000IJ\u0001\u0000BG\u0001"+
		"\u0000KM\u0001\u00009>\u0162\u00007\u0001\u0000\u0000\u0000\u0002H\u0001"+
		"\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006k\u0001\u0000\u0000"+
		"\u0000\bm\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\fx\u0001"+
		"\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u0086\u0001"+
		"\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u008d\u0001"+
		"\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0095\u0001"+
		"\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00cd\u0001"+
		"\u0000\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00de\u0001\u0000"+
		"\u0000\u0000\"\u00e0\u0001\u0000\u0000\u0000$\u0106\u0001\u0000\u0000"+
		"\u0000&\u0114\u0001\u0000\u0000\u0000(\u0120\u0001\u0000\u0000\u0000*"+
		"\u0131\u0001\u0000\u0000\u0000,\u0136\u0001\u0000\u0000\u0000.\u013e\u0001"+
		"\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u0146\u0001\u0000\u0000"+
		"\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001"+
		";\u0001\u0001\u0000\u0000\u0000<I\u0003\u0004\u0002\u0000=I\u0003\b\u0004"+
		"\u0000>I\u0003\u0014\n\u0000?I\u0003\u0016\u000b\u0000@I\u0003\u0018\f"+
		"\u0000AI\u0005\u0007\u0000\u0000BI\u0005\b\u0000\u0000CE\u0005\t\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000H<\u0001"+
		"\u0000\u0000\u0000H=\u0001\u0000\u0000\u0000H>\u0001\u0000\u0000\u0000"+
		"H?\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000"+
		"\u0000HB\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000I\u0003\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KO\u0005\u000b\u0000\u0000"+
		"LN\u0003\u0006\u0003\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000RV\u0005\u0011\u0000\u0000SU\u0003"+
		"\u0002\u0001\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0005\u0013"+
		"\u0000\u0000[f\u0005\u0014\u0000\u0000\\]\u0005\u0006\u0000\u0000]a\u0005"+
		"\u000b\u0000\u0000^`\u0003\u0006\u0003\u0000_^\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0005\u0012"+
		"\u0000\u0000eJ\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000\u0000f\u0005"+
		"\u0001\u0000\u0000\u0000gh\u0005\r\u0000\u0000hi\u0005\u000e\u0000\u0000"+
		"il\u0005\u000f\u0000\u0000jl\u0005\r\u0000\u0000kg\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000l\u0007\u0001\u0000\u0000\u0000mn\u0005\u0004"+
		"\u0000\u0000no\u0003\n\u0005\u0000op\u0005\u0016\u0000\u0000p\t\u0001"+
		"\u0000\u0000\u0000qu\u0003\f\u0006\u0000ru\u0003\u0012\t\u0000su\u0005"+
		"\u001f\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000xy\u0003"+
		"\u000e\u0007\u0000y\u007f\u0005\u0017\u0000\u0000z~\u0003\u0010\b\u0000"+
		"{~\u0003\u0012\t\u0000|~\u0005\u001f\u0000\u0000}z\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005 \u0000\u0000\u0083\r\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005!\u0000\u0000\u0087\u0088\u0005%\u0000\u0000\u0088\u0089"+
		"\u0005&\u0000\u0000\u0089\u008a\u0005$\u0000\u0000\u008a\u0011\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u001e\u0000\u0000\u008c\u0013\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\u0001\u0000\u0000\u008e\u008f\u0003\u001a"+
		"\r\u0000\u008f\u0090\u0005)\u0000\u0000\u0090\u0015\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0093\u0003 \u0010\u0000"+
		"\u0093\u0094\u0005*\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095"+
		"\u0099\u0005\u0003\u0000\u0000\u0096\u0098\u0005V\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005U\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009f\u0006"+
		"\r\uffff\uffff\u0000\u009f\u00a0\u0005A\u0000\u0000\u00a0\u00b0\u0003"+
		"\u001a\r\n\u00a1\u00a2\u0007\u0001\u0000\u0000\u00a2\u00b0\u0003\u001a"+
		"\r\u0006\u00a3\u00b0\u0003\u001c\u000e\u0000\u00a4\u00a5\u0003\u001c\u000e"+
		"\u0000\u00a5\u00a7\u0005O\u0000\u0000\u00a6\u00a8\u0003\u001e\u000f\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005P\u0000\u0000\u00aa"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005O\u0000\u0000\u00ac\u00ad"+
		"\u0003\u001a\r\u0000\u00ad\u00ae\u0005P\u0000\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u009e\u0001\u0000\u0000\u0000\u00af\u00a1\u0001"+
		"\u0000\u0000\u0000\u00af\u00a3\u0001\u0000\u0000\u0000\u00af\u00a4\u0001"+
		"\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ca\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\n\f\u0000\u0000\u00b2\u00b3\u0005@\u0000"+
		"\u0000\u00b3\u00c9\u0003\u001a\r\r\u00b4\u00b5\n\u000b\u0000\u0000\u00b5"+
		"\u00b6\u0005?\u0000\u0000\u00b6\u00c9\u0003\u001a\r\f\u00b7\u00b8\n\t"+
		"\u0000\u0000\u00b8\u00b9\u0007\u0002\u0000\u0000\u00b9\u00c9\u0003\u001a"+
		"\r\n\u00ba\u00bb\n\b\u0000\u0000\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc"+
		"\u00c9\u0003\u001a\r\t\u00bd\u00be\n\u0007\u0000\u0000\u00be\u00bf\u0007"+
		"\u0003\u0000\u0000\u00bf\u00c9\u0003\u001a\r\b\u00c0\u00c1\n\u0004\u0000"+
		"\u0000\u00c1\u00c2\u0005N\u0000\u0000\u00c2\u00c9\u0005>\u0000\u0000\u00c3"+
		"\u00c4\n\u0003\u0000\u0000\u00c4\u00c5\u0005Q\u0000\u0000\u00c5\u00c6"+
		"\u0003\u001a\r\u0000\u00c6\u00c7\u0005R\u0000\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8\u00b1\u0001\u0000\u0000\u0000\u00c8\u00b4\u0001"+
		"\u0000\u0000\u0000\u00c8\u00b7\u0001\u0000\u0000\u0000\u00c8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u001b\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0007\u0004\u0000\u0000\u00ce\u001d\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d4\u0003\u001a\r\u0000\u00d0\u00d1\u0005S"+
		"\u0000\u0000\u00d1\u00d3\u0003\u001a\r\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u001f\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00df\u0003\"\u0011\u0000"+
		"\u00d8\u00df\u0003$\u0012\u0000\u00d9\u00df\u0003&\u0013\u0000\u00da\u00df"+
		"\u0003(\u0014\u0000\u00db\u00df\u0003.\u0017\u0000\u00dc\u00df\u00030"+
		"\u0018\u0000\u00dd\u00df\u00032\u0019\u0000\u00de\u00d7\u0001\u0000\u0000"+
		"\u0000\u00de\u00d8\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000\u0000"+
		"\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df!\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005-\u0000\u0000\u00e1"+
		"\u00e2\u0003\u001a\r\u0000\u00e2\u00e6\u0005*\u0000\u0000\u00e3\u00e5"+
		"\u0003\u0002\u0001\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00f5\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0002\u0000\u0000\u00ea\u00eb"+
		"\u0005/\u0000\u0000\u00eb\u00ec\u0003\u001a\r\u0000\u00ec\u00f0\u0005"+
		"*\u0000\u0000\u00ed\u00ef\u0003\u0002\u0001\u0000\u00ee\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u0101\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0002"+
		"\u0000\u0000\u00f9\u00fa\u0005.\u0000\u0000\u00fa\u00fe\u0005*\u0000\u0000"+
		"\u00fb\u00fd\u0003\u0002\u0001\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u00f8\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0005\u0002\u0000\u0000\u0104\u0105\u00050\u0000\u0000\u0105"+
		"#\u0001\u0000\u0000\u0000\u0106\u0107\u0005+\u0000\u0000\u0107\u0108\u0005"+
		">\u0000\u0000\u0108\u0109\u0005,\u0000\u0000\u0109\u010a\u0003\u001a\r"+
		"\u0000\u010a\u010e\u0005*\u0000\u0000\u010b\u010d\u0003\u0002\u0001\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0002\u0000\u0000\u0112\u0113\u00051\u0000\u0000\u0113"+
		"%\u0001\u0000\u0000\u0000\u0114\u0115\u00052\u0000\u0000\u0115\u0116\u0005"+
		">\u0000\u0000\u0116\u011a\u0005*\u0000\u0000\u0117\u0119\u0003\u0002\u0001"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\u0002\u0000\u0000\u011e\u011f\u00053\u0000\u0000"+
		"\u011f\'\u0001\u0000\u0000\u0000\u0120\u0121\u00057\u0000\u0000\u0121"+
		"\u0122\u0005>\u0000\u0000\u0122\u0124\u0005O\u0000\u0000\u0123\u0125\u0003"+
		",\u0016\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0005P\u0000"+
		"\u0000\u0127\u012b\u0005*\u0000\u0000\u0128\u012a\u0003\u0002\u0001\u0000"+
		"\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\u0002\u0000\u0000\u012f\u0130\u00058\u0000\u0000\u0130"+
		")\u0001\u0000\u0000\u0000\u0131\u0134\u0005>\u0000\u0000\u0132\u0133\u0005"+
		"H\u0000\u0000\u0133\u0135\u0003\u001a\r\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135+\u0001\u0000\u0000"+
		"\u0000\u0136\u013b\u0003*\u0015\u0000\u0137\u0138\u0005S\u0000\u0000\u0138"+
		"\u013a\u0003*\u0015\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c-\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u00056\u0000\u0000\u013f\u0140\u0005>\u0000"+
		"\u0000\u0140\u0141\u0005H\u0000\u0000\u0141\u0142\u0003\u001a\r\u0000"+
		"\u0142/\u0001\u0000\u0000\u0000\u0143\u0144\u00054\u0000\u0000\u0144\u0145"+
		"\u0003\u001a\r\u0000\u01451\u0001\u0000\u0000\u0000\u0146\u0147\u0005"+
		"5\u0000\u0000\u0147\u0148\u0003\u001a\r\u0000\u01483\u0001\u0000\u0000"+
		"\u0000\u001e7FHOVaektv}\u007f\u0099\u00a7\u00af\u00c8\u00ca\u00d4\u00de"+
		"\u00e6\u00f0\u00f5\u00fe\u0101\u010e\u011a\u0124\u012b\u0134\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}