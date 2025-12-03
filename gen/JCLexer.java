// Generated from C:/compiler/compiler-p-/compiler-jc/JCLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STYLE_CL=1, STYLE_OP=2, SLT=3, SRT=4, LT=5, RT=6, CSS_CLASS=7, CSS_ID=8, 
		CSS_LBRACE=9, CSS_RBRACE=10, CSS_COLON=11, CSS_SEMICOLON=12, CSS_COMMA=13, 
		CSS_PROP=14, CSS_VAL=15, CSS_TAG=16, CSS_UNIVERSAL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STYLE_CL", "STYLE_OP", "SLT", "SRT", "LT", "RT", "CSS_CLASS", "CSS_ID", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMICOLON", "CSS_COMMA", 
			"CSS_PROP", "CSS_VAL", "CSS_TAG", "CSS_UNIVERSAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'</style>'", "'<style>'", "'</'", "'/>'", "'<'", "'>'", null, 
			null, "'{'", "'}'", "':'", "';'", "','", null, null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STYLE_CL", "STYLE_OP", "SLT", "SRT", "LT", "RT", "CSS_CLASS", 
			"CSS_ID", "CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMICOLON", "CSS_COMMA", 
			"CSS_PROP", "CSS_VAL", "CSS_TAG", "CSS_UNIVERSAL", "WS"
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


	public JCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JCLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007L\b\u0007\n\u0007\f\u0007O\t\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0004\r\\\b\r\u000b\r\f\r]\u0001\u000e\u0004\u000ea\b\u000e\u000b\u000e"+
		"\f\u000eb\u0001\u000f\u0001\u000f\u0005\u000fg\b\u000f\n\u000f\f\u000f"+
		"j\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011o\b\u0011\u000b"+
		"\u0011\f\u0011p\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0007\u0004\u0000--AZ__az\u0005"+
		"\u0000--09AZ__az\u0003\u0000--AZaz\u0003\u0000;;{{}}\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0003\u0000\t\n\r\r  y\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000"+
		"\u00056\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t<\u0001"+
		"\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000"+
		"\u0000\u000fH\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013"+
		"R\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017V\u0001"+
		"\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000"+
		"\u0000\u001d`\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!"+
		"k\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%&\u0005<\u0000\u0000"+
		"&\'\u0005/\u0000\u0000\'(\u0005s\u0000\u0000()\u0005t\u0000\u0000)*\u0005"+
		"y\u0000\u0000*+\u0005l\u0000\u0000+,\u0005e\u0000\u0000,-\u0005>\u0000"+
		"\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005<\u0000\u0000/0\u0005s\u0000"+
		"\u000001\u0005t\u0000\u000012\u0005y\u0000\u000023\u0005l\u0000\u0000"+
		"34\u0005e\u0000\u000045\u0005>\u0000\u00005\u0004\u0001\u0000\u0000\u0000"+
		"67\u0005<\u0000\u000078\u0005/\u0000\u00008\u0006\u0001\u0000\u0000\u0000"+
		"9:\u0005/\u0000\u0000:;\u0005>\u0000\u0000;\b\u0001\u0000\u0000\u0000"+
		"<=\u0005<\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005>\u0000\u0000"+
		"?\f\u0001\u0000\u0000\u0000@A\u0005.\u0000\u0000AE\u0007\u0000\u0000\u0000"+
		"BD\u0007\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u000e\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005#\u0000\u0000IM\u0007"+
		"\u0000\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\u0010\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005"+
		"{\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005}\u0000\u0000S\u0014"+
		"\u0001\u0000\u0000\u0000TU\u0005:\u0000\u0000U\u0016\u0001\u0000\u0000"+
		"\u0000VW\u0005;\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XY\u0005,\u0000"+
		"\u0000Y\u001a\u0001\u0000\u0000\u0000Z\\\u0007\u0002\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\u001c\u0001\u0000\u0000\u0000_a\b\u0003\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\u001e\u0001\u0000\u0000\u0000"+
		"dh\u0007\u0004\u0000\u0000eg\u0007\u0005\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000i \u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005"+
		"*\u0000\u0000l\"\u0001\u0000\u0000\u0000mo\u0007\u0006\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0011\u0000"+
		"\u0000s$\u0001\u0000\u0000\u0000\u0007\u0000EM]bhp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}