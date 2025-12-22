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
		HTML_TEXT=7, WS=8, TAG_N=9, WS1=10, ATTR_N1=11, ASSIGN1=12, ATTR_V1=13, 
		ATTR_WS=14, RT1=15, SRT1=16, CLOSE_TAG_N=17, CLOSE_RT=18, CLOSE_WS=19, 
		STYLE_CL=20, L_BRACE1=21, R_BRACE1=22, COMMA1=23, CSS_UNIVERSAL=24, CSS_CLASS=25, 
		CSS_ID=26, TAG_NAME=27, CSS_COMMENT=28, WS2=29, R_BRACE3=30, CSS_PROP=31, 
		CSS_COMMENT2=32, WS_BLOCK=33, SEMICOLON1=34, COLON1=35, CSS_VAL=36, R_BRACE2=37, 
		WS3=38, DOUBLE_RBRC=39, RBRC_PERCENT=40, J_FOR=41, J_IN=42, J_IF=43, J_ELSE=44, 
		J_ELIF=45, J_ENDIF=46, J_ENDFOR=47, J_BLOCK=48, J_ENDBLOCK=49, J_EXTENDS=50, 
		J_INCLUDE=51, J_SET=52, J_MACRO=53, J_ENDMACRO=54, STRING=55, NUMBER=56, 
		TRUE=57, FALSE=58, NIL=59, ID=60, AND=61, OR=62, NOT=63, LE_E=64, GE_E=65, 
		EQ=66, NE=67, LT=68, RT=69, ASSIGN=70, PLUS=71, MINUS=72, MULTI=73, DIVIDE=74, 
		PERCENT=75, DOT=76, LPAREN=77, RPAREN=78, LBRACK=79, RBRACK=80, COMMA=81, 
		WS_JINJA=82, RBRC_HASH=83, COMMENT_TEXT=84;
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
			null, null, null, null, null, null, null, "'/>'", null, null, null, "'</style>'", 
			"'{'", null, null, null, null, null, null, null, null, null, null, null, 
			null, "';'", "':'", null, null, null, "'}}'", "'%}'", "'for'", "'in'", 
			"'if'", "'else'", "'elif'", "'endif'", "'endfor'", "'block'", "'endblock'", 
			"'extends'", "'include'", "'set'", "'macro'", "'endmacro'", null, null, 
			null, null, null, null, "'and'", "'or'", "'not'", "'<='", "'>='", "'=='", 
			"'!='", null, null, null, "'+'", "'-'", null, "'/'", "'%'", "'.'", "'('", 
			"')'", "'['", "']'", null, null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOUBLE_LBRC", "LBRC_PERCENT", "LBRC_HASH", "STYLE_OP", "SLT", 
			"TAG_START", "HTML_TEXT", "WS", "TAG_N", "WS1", "ATTR_N1", "ASSIGN1", 
			"ATTR_V1", "ATTR_WS", "RT1", "SRT1", "CLOSE_TAG_N", "CLOSE_RT", "CLOSE_WS", 
			"STYLE_CL", "L_BRACE1", "R_BRACE1", "COMMA1", "CSS_UNIVERSAL", "CSS_CLASS", 
			"CSS_ID", "TAG_NAME", "CSS_COMMENT", "WS2", "R_BRACE3", "CSS_PROP", "CSS_COMMENT2", 
			"WS_BLOCK", "SEMICOLON1", "COLON1", "CSS_VAL", "R_BRACE2", "WS3", "DOUBLE_RBRC", 
			"RBRC_PERCENT", "J_FOR", "J_IN", "J_IF", "J_ELSE", "J_ELIF", "J_ENDIF", 
			"J_ENDFOR", "J_BLOCK", "J_ENDBLOCK", "J_EXTENDS", "J_INCLUDE", "J_SET", 
			"J_MACRO", "J_ENDMACRO", "STRING", "NUMBER", "TRUE", "FALSE", "NIL", 
			"ID", "AND", "OR", "NOT", "LE_E", "GE_E", "EQ", "NE", "LT", "RT", "ASSIGN", 
			"PLUS", "MINUS", "MULTI", "DIVIDE", "PERCENT", "DOT", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "COMMA", "WS_JINJA", "RBRC_HASH", "COMMENT_TEXT"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
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
		public JinjacommentContext jinjacomment() {
			return getRuleContext(JinjacommentContext.class,0);
		}
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
			setState(76);
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
			case LBRC_HASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				jinjacomment();
				}
				break;
			case J_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				ifstatement();
				}
				break;
			case J_FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				forstatement();
				}
				break;
			case J_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				blockstatement();
				}
				break;
			case J_MACRO:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				macrostatement();
				}
				break;
			case J_SET:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				setstatement();
				}
				break;
			case J_EXTENDS:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				extendsstatement();
				}
				break;
			case J_INCLUDE:
				enterOuterAlt(_localctx, 11);
				{
				setState(70);
				includestatement();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 12);
				{
				setState(72); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(71);
						match(HTML_TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74); 
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(TAG_START);
				setState(79);
				match(TAG_N);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_N1) {
					{
					{
					setState(80);
					attributes();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(RT1);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
					{
					{
					setState(87);
					element();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(SLT);
				setState(94);
				match(CLOSE_TAG_N);
				setState(95);
				match(CLOSE_RT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(TAG_START);
				setState(97);
				match(TAG_N);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_N1) {
					{
					{
					setState(98);
					attributes();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(SRT1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(TAG_START);
				setState(106);
				match(TAG_N);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_N1) {
					{
					{
					setState(107);
					attributes();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(RT1);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ATTR_N1);
				setState(117);
				match(ASSIGN1);
				setState(118);
				match(ATTR_V1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
			setState(122);
			match(STYLE_OP);
			setState(123);
			csscontent();
			setState(124);
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
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_UNIVERSAL:
				case CSS_CLASS:
				case CSS_ID:
				case TAG_NAME:
					{
					setState(126);
					cssrules();
					}
					break;
				case CSS_COMMENT:
					{
					setState(127);
					csscomment();
					}
					break;
				case WS2:
					{
					setState(128);
					match(WS2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0) );
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
			setState(133);
			selector();
			setState(134);
			match(L_BRACE1);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2952790016L) != 0)) {
				{
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_PROP:
					{
					setState(135);
					cssdeclaration();
					}
					break;
				case CSS_COMMENT:
					{
					setState(136);
					csscomment();
					}
					break;
				case WS2:
					{
					setState(137);
					match(WS2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
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
			setState(147);
			match(CSS_PROP);
			setState(148);
			match(COLON1);
			setState(149);
			match(CSS_VAL);
			setState(150);
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
			setState(152);
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
			setState(154);
			match(DOUBLE_LBRC);
			setState(155);
			expression(0);
			setState(156);
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
			setState(158);
			match(LBRC_PERCENT);
			setState(159);
			statement();
			setState(160);
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
			setState(162);
			match(LBRC_HASH);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(163);
				match(COMMENT_TEXT);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(172);
				match(NOT);
				setState(173);
				expression(10);
				}
				break;
			case 2:
				{
				setState(174);
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
				setState(175);
				expression(6);
				}
				break;
			case 3:
				{
				setState(176);
				primary();
				}
				break;
			case 4:
				{
				setState(177);
				primary();
				setState(178);
				match(LPAREN);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 4391231L) != 0)) {
					{
					setState(179);
					arguments();
					}
				}

				setState(182);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(184);
				match(LPAREN);
				setState(185);
				expression(0);
				setState(186);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(191);
						match(OR);
						setState(192);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(194);
						match(AND);
						setState(195);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 63L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
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
						setState(201);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						match(DOT);
						setState(207);
						match(ID);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						match(LBRACK);
						setState(210);
						expression(0);
						setState(211);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269814212194729984L) != 0)) ) {
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
			setState(220);
			expression(0);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				expression(0);
				}
				}
				setState(227);
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				ifstatement();
				}
				break;
			case J_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				forstatement();
				}
				break;
			case J_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				blockstatement();
				}
				break;
			case J_MACRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				macrostatement();
				}
				break;
			case J_SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				setstatement();
				}
				break;
			case J_EXTENDS:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				extendsstatement();
				}
				break;
			case J_INCLUDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(J_IF);
			setState(238);
			expression(0);
			setState(239);
			match(RBRC_PERCENT);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
				{
				{
				setState(240);
				element();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					match(LBRC_PERCENT);
					setState(247);
					match(J_ELIF);
					setState(248);
					expression(0);
					setState(249);
					match(RBRC_PERCENT);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
						{
						{
						setState(250);
						element();
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(261);
				match(LBRC_PERCENT);
				setState(262);
				match(J_ELSE);
				setState(263);
				match(RBRC_PERCENT);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
					{
					{
					setState(264);
					element();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(272);
			match(LBRC_PERCENT);
			setState(273);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(J_FOR);
			setState(276);
			match(ID);
			setState(277);
			match(J_IN);
			setState(278);
			expression(0);
			setState(279);
			match(RBRC_PERCENT);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
				{
				{
				setState(280);
				element();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(LBRC_PERCENT);
			setState(287);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(J_BLOCK);
			setState(290);
			match(ID);
			setState(291);
			match(RBRC_PERCENT);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
				{
				{
				setState(292);
				element();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(LBRC_PERCENT);
			setState(299);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(J_MACRO);
			setState(302);
			match(ID);
			setState(303);
			match(LPAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(304);
				parameters();
				}
			}

			setState(307);
			match(RPAREN);
			setState(308);
			match(RBRC_PERCENT);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180968695627994L) != 0)) {
				{
				{
				setState(309);
				element();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(LBRC_PERCENT);
			setState(316);
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
			setState(318);
			match(ID);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(319);
				match(ASSIGN);
				setState(320);
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
			setState(323);
			parameter();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				match(COMMA);
				setState(325);
				parameter();
				}
				}
				setState(330);
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
			setState(331);
			match(J_SET);
			setState(332);
			match(ID);
			setState(333);
			match(ASSIGN);
			setState(334);
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
			setState(336);
			match(J_EXTENDS);
			setState(337);
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
			setState(339);
			match(J_INCLUDE);
			setState(340);
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
		"\u0004\u0001T\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001I\b\u0001\u000b\u0001"+
		"\f\u0001J\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002d\b\u0002\n\u0002"+
		"\f\u0002g\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002m\b\u0002\n\u0002\f\u0002p\t\u0002\u0001\u0002\u0003\u0002s\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003y\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u0082\b\u0005\u000b\u0005\f\u0005\u0083\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008b"+
		"\b\u0006\n\u0006\f\u0006\u008e\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\f\u00a5\b\f\n\f\f\f\u00a8\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b5\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bd"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d6\b\r\n\r\f\r\u00d9"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00e0\b\u000f\n\u000f\f\u000f\u00e3\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00ec\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00f2\b\u0011\n\u0011\f\u0011\u00f5\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fc\b\u0011\n\u0011\f\u0011"+
		"\u00ff\t\u0011\u0005\u0011\u0101\b\u0011\n\u0011\f\u0011\u0104\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u010a\b\u0011"+
		"\n\u0011\f\u0011\u010d\t\u0011\u0003\u0011\u010f\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u011a\b\u0012\n\u0012\f\u0012\u011d\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0126\b\u0013\n\u0013\f\u0013\u0129\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0132\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0137\b\u0014\n\u0014\f\u0014\u013a\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0142\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0147\b\u0016\n\u0016"+
		"\f\u0016\u014a\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0000\u0001\u001a\u001a\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02\u0000\u0005\u0001\u0000\u0018\u001b\u0001\u0000GH\u0001\u0000@E\u0001"+
		"\u0000IK\u0001\u00007<\u0175\u00007\u0001\u0000\u0000\u0000\u0002L\u0001"+
		"\u0000\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000"+
		"\u0000\bz\u0001\u0000\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u0085"+
		"\u0001\u0000\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0093"+
		"\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u009a"+
		"\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000\u0000\u0018\u00a2"+
		"\u0001\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00da"+
		"\u0001\u0000\u0000\u0000\u001e\u00dc\u0001\u0000\u0000\u0000 \u00eb\u0001"+
		"\u0000\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u0113\u0001\u0000"+
		"\u0000\u0000&\u0121\u0001\u0000\u0000\u0000(\u012d\u0001\u0000\u0000\u0000"+
		"*\u013e\u0001\u0000\u0000\u0000,\u0143\u0001\u0000\u0000\u0000.\u014b"+
		"\u0001\u0000\u0000\u00000\u0150\u0001\u0000\u0000\u00002\u0153\u0001\u0000"+
		"\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000"+
		"\u0001;\u0001\u0001\u0000\u0000\u0000<M\u0003\u0004\u0002\u0000=M\u0003"+
		"\b\u0004\u0000>M\u0003\u0014\n\u0000?M\u0003\u0018\f\u0000@M\u0003\"\u0011"+
		"\u0000AM\u0003$\u0012\u0000BM\u0003&\u0013\u0000CM\u0003(\u0014\u0000"+
		"DM\u0003.\u0017\u0000EM\u00030\u0018\u0000FM\u00032\u0019\u0000GI\u0005"+
		"\u0007\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000"+
		"\u0000L<\u0001\u0000\u0000\u0000L=\u0001\u0000\u0000\u0000L>\u0001\u0000"+
		"\u0000\u0000L?\u0001\u0000\u0000\u0000L@\u0001\u0000\u0000\u0000LA\u0001"+
		"\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000LC\u0001\u0000\u0000\u0000"+
		"LD\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NO\u0005"+
		"\u0006\u0000\u0000OS\u0005\t\u0000\u0000PR\u0003\u0006\u0003\u0000QP\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VZ\u0005\u000f\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]^\u0005\u0005\u0000\u0000^_\u0005\u0011\u0000\u0000_s\u0005\u0012\u0000"+
		"\u0000`a\u0005\u0006\u0000\u0000ae\u0005\t\u0000\u0000bd\u0003\u0006\u0003"+
		"\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000hs\u0005\u0010\u0000\u0000ij\u0005\u0006\u0000\u0000"+
		"jn\u0005\t\u0000\u0000km\u0003\u0006\u0003\u0000lk\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0005\u000f"+
		"\u0000\u0000rN\u0001\u0000\u0000\u0000r`\u0001\u0000\u0000\u0000ri\u0001"+
		"\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0005\u000b\u0000"+
		"\u0000uv\u0005\f\u0000\u0000vy\u0005\r\u0000\u0000wy\u0005\u000b\u0000"+
		"\u0000xt\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0007\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0004\u0000\u0000{|\u0003\n\u0005\u0000|}\u0005"+
		"\u0014\u0000\u0000}\t\u0001\u0000\u0000\u0000~\u0082\u0003\f\u0006\u0000"+
		"\u007f\u0082\u0003\u0012\t\u0000\u0080\u0082\u0005\u001d\u0000\u0000\u0081"+
		"~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u000b"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u000e\u0007\u0000\u0086\u008c"+
		"\u0005\u0015\u0000\u0000\u0087\u008b\u0003\u0010\b\u0000\u0088\u008b\u0003"+
		"\u0012\t\u0000\u0089\u008b\u0005\u001d\u0000\u0000\u008a\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001e"+
		"\u0000\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0000\u0000"+
		"\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u001f\u0000"+
		"\u0000\u0094\u0095\u0005#\u0000\u0000\u0095\u0096\u0005$\u0000\u0000\u0096"+
		"\u0097\u0005\"\u0000\u0000\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\u001c\u0000\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\u0001\u0000\u0000\u009b\u009c\u0003\u001a\r\u0000\u009c\u009d\u0005"+
		"\'\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0002"+
		"\u0000\u0000\u009f\u00a0\u0003 \u0010\u0000\u00a0\u00a1\u0005(\u0000\u0000"+
		"\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005\u0003\u0000\u0000"+
		"\u00a3\u00a5\u0005T\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005S\u0000\u0000\u00aa\u0019"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006\r\uffff\uffff\u0000\u00ac\u00ad"+
		"\u0005?\u0000\u0000\u00ad\u00bd\u0003\u001a\r\n\u00ae\u00af\u0007\u0001"+
		"\u0000\u0000\u00af\u00bd\u0003\u001a\r\u0006\u00b0\u00bd\u0003\u001c\u000e"+
		"\u0000\u00b1\u00b2\u0003\u001c\u000e\u0000\u00b2\u00b4\u0005M\u0000\u0000"+
		"\u00b3\u00b5\u0003\u001e\u000f\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005N\u0000\u0000\u00b7\u00bd\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005M\u0000\u0000\u00b9\u00ba\u0003\u001a\r\u0000\u00ba\u00bb"+
		"\u0005N\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ab\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ae\u0001\u0000\u0000\u0000\u00bc\u00b0\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b1\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bd\u00d7\u0001\u0000\u0000\u0000\u00be\u00bf\n\f"+
		"\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c0\u00d6\u0003\u001a\r"+
		"\r\u00c1\u00c2\n\u000b\u0000\u0000\u00c2\u00c3\u0005=\u0000\u0000\u00c3"+
		"\u00d6\u0003\u001a\r\f\u00c4\u00c5\n\t\u0000\u0000\u00c5\u00c6\u0007\u0002"+
		"\u0000\u0000\u00c6\u00d6\u0003\u001a\r\n\u00c7\u00c8\n\b\u0000\u0000\u00c8"+
		"\u00c9\u0007\u0001\u0000\u0000\u00c9\u00d6\u0003\u001a\r\t\u00ca\u00cb"+
		"\n\u0007\u0000\u0000\u00cb\u00cc\u0007\u0003\u0000\u0000\u00cc\u00d6\u0003"+
		"\u001a\r\b\u00cd\u00ce\n\u0004\u0000\u0000\u00ce\u00cf\u0005L\u0000\u0000"+
		"\u00cf\u00d6\u0005<\u0000\u0000\u00d0\u00d1\n\u0003\u0000\u0000\u00d1"+
		"\u00d2\u0005O\u0000\u0000\u00d2\u00d3\u0003\u001a\r\u0000\u00d3\u00d4"+
		"\u0005P\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00be\u0001"+
		"\u0000\u0000\u0000\u00d5\u00c1\u0001\u0000\u0000\u0000\u00d5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00d5\u00c7\u0001\u0000\u0000\u0000\u00d5\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u001b\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0007"+
		"\u0004\u0000\u0000\u00db\u001d\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003"+
		"\u001a\r\u0000\u00dd\u00de\u0005Q\u0000\u0000\u00de\u00e0\u0003\u001a"+
		"\r\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u001f\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00ec\u0003\"\u0011\u0000\u00e5\u00ec\u0003$\u0012\u0000"+
		"\u00e6\u00ec\u0003&\u0013\u0000\u00e7\u00ec\u0003(\u0014\u0000\u00e8\u00ec"+
		"\u0003.\u0017\u0000\u00e9\u00ec\u00030\u0018\u0000\u00ea\u00ec\u00032"+
		"\u0019\u0000\u00eb\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec!\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee\u00ef\u0003\u001a\r\u0000"+
		"\u00ef\u00f3\u0005(\u0000\u0000\u00f0\u00f2\u0003\u0002\u0001\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u0102\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0002\u0000\u0000\u00f7\u00f8\u0005-\u0000\u0000\u00f8\u00f9"+
		"\u0003\u001a\r\u0000\u00f9\u00fd\u0005(\u0000\u0000\u00fa\u00fc\u0003"+
		"\u0002\u0001\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u00f6\u0001\u0000\u0000\u0000\u0101\u0104\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u010e\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u0002\u0000\u0000\u0106\u0107\u0005"+
		",\u0000\u0000\u0107\u010b\u0005(\u0000\u0000\u0108\u010a\u0003\u0002\u0001"+
		"\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010e\u0105\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0002\u0000"+
		"\u0000\u0111\u0112\u0005.\u0000\u0000\u0112#\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005)\u0000\u0000\u0114\u0115\u0005<\u0000\u0000\u0115\u0116\u0005"+
		"*\u0000\u0000\u0116\u0117\u0003\u001a\r\u0000\u0117\u011b\u0005(\u0000"+
		"\u0000\u0118\u011a\u0003\u0002\u0001\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0002\u0000"+
		"\u0000\u011f\u0120\u0005/\u0000\u0000\u0120%\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u00050\u0000\u0000\u0122\u0123\u0005<\u0000\u0000\u0123\u0127\u0005"+
		"(\u0000\u0000\u0124\u0126\u0003\u0002\u0001\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0002"+
		"\u0000\u0000\u012b\u012c\u00051\u0000\u0000\u012c\'\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u00055\u0000\u0000\u012e\u012f\u0005<\u0000\u0000\u012f"+
		"\u0131\u0005M\u0000\u0000\u0130\u0132\u0003,\u0016\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005N\u0000\u0000\u0134\u0138\u0005(\u0000"+
		"\u0000\u0135\u0137\u0003\u0002\u0001\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0002\u0000"+
		"\u0000\u013c\u013d\u00056\u0000\u0000\u013d)\u0001\u0000\u0000\u0000\u013e"+
		"\u0141\u0005<\u0000\u0000\u013f\u0140\u0005F\u0000\u0000\u0140\u0142\u0003"+
		"\u001a\r\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142+\u0001\u0000\u0000\u0000\u0143\u0148\u0003*\u0015\u0000"+
		"\u0144\u0145\u0005Q\u0000\u0000\u0145\u0147\u0003*\u0015\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149-\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"4\u0000\u0000\u014c\u014d\u0005<\u0000\u0000\u014d\u014e\u0005F\u0000"+
		"\u0000\u014e\u014f\u0003\u001a\r\u0000\u014f/\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u00052\u0000\u0000\u0151\u0152\u0003\u001a\r\u0000\u0152"+
		"1\u0001\u0000\u0000\u0000\u0153\u0154\u00053\u0000\u0000\u0154\u0155\u0003"+
		"\u001a\r\u0000\u01553\u0001\u0000\u0000\u0000\u001f7JLSZenrx\u0081\u0083"+
		"\u008a\u008c\u00a6\u00b4\u00bc\u00d5\u00d7\u00e1\u00eb\u00f3\u00fd\u0102"+
		"\u010b\u010e\u011b\u0127\u0131\u0138\u0141\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}