// Generated from ./Galirardo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GalirardoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATR=1, COD=2, TIPO=3, INPUT=4, OUTPUT=5, IF=6, ELSE=7, WHILE=8, DO=9, 
		RETURN=10, OR=11, AND=12, VAZIO=13, OP_ARIT=14, OP_COND=15, OP_ATR=16, 
		COL=17, DP=18, BARRA_VERT=19, VIRGULA=20, PARENT_ESQ=21, PARENT_DIR=22, 
		CHAVE_DIR=23, CHAVE_ESq=24, IDENT=25, NUM=26, WS=27, ERRO=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATR", "COD", "TIPO", "INPUT", "OUTPUT", "IF", "ELSE", "WHILE", "DO", 
			"RETURN", "OR", "AND", "VAZIO", "OP_ARIT", "OP_COND", "OP_ATR", "COL", 
			"DP", "BARRA_VERT", "VIRGULA", "PARENT_ESQ", "PARENT_DIR", "CHAVE_DIR", 
			"CHAVE_ESq", "IDENT", "NUM", "LETRA", "DIGIT", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ATRIBUICOES'", "'CODIGO'", null, "'in'", "'out'", "'caso'", "'outro'", 
			"'repita'", "'executa'", "'receba'", "'ou'", "'e'", "'void'", null, null, 
			"':='", "';'", "':'", "'|'", "','", "'('", "')'", "'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATR", "COD", "TIPO", "INPUT", "OUTPUT", "IF", "ELSE", "WHILE", 
			"DO", "RETURN", "OR", "AND", "VAZIO", "OP_ARIT", "OP_COND", "OP_ATR", 
			"COL", "DP", "BARRA_VERT", "VIRGULA", "PARENT_ESQ", "PARENT_DIR", "CHAVE_DIR", 
			"CHAVE_ESq", "IDENT", "NUM", "WS", "ERRO"
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


	public GalirardoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Galirardo.g4"; }

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
		"\u0004\u0000\u001c\u00e9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"s\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u00ca\b\u0018\n\u0018\f\u0018\u00cd\t\u0018\u0001\u0019\u0004"+
		"\u0019\u00d0\b\u0019\u000b\u0019\f\u0019\u00d1\u0001\u0019\u0001\u0019"+
		"\u0004\u0019\u00d6\b\u0019\u000b\u0019\f\u0019\u00d7\u0003\u0019\u00da"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0005"+
		"\u001c\u00e1\b\u001c\n\u001c\f\u001c\u00e4\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u0000"+
		"7\u00009\u001b;\u001c\u0001\u0000\u0005\u0004\u0000%%*+--//\u0002\u0000"+
		"<<>>\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00f4\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"9\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001"+
		"\u0000\u0000\u0000\u0003I\u0001\u0000\u0000\u0000\u0005r\u0001\u0000\u0000"+
		"\u0000\u0007t\u0001\u0000\u0000\u0000\tw\u0001\u0000\u0000\u0000\u000b"+
		"{\u0001\u0000\u0000\u0000\r\u0080\u0001\u0000\u0000\u0000\u000f\u0086"+
		"\u0001\u0000\u0000\u0000\u0011\u008d\u0001\u0000\u0000\u0000\u0013\u0095"+
		"\u0001\u0000\u0000\u0000\u0015\u009c\u0001\u0000\u0000\u0000\u0017\u009f"+
		"\u0001\u0000\u0000\u0000\u0019\u00a1\u0001\u0000\u0000\u0000\u001b\u00a6"+
		"\u0001\u0000\u0000\u0000\u001d\u00b1\u0001\u0000\u0000\u0000\u001f\u00b3"+
		"\u0001\u0000\u0000\u0000!\u00b6\u0001\u0000\u0000\u0000#\u00b8\u0001\u0000"+
		"\u0000\u0000%\u00ba\u0001\u0000\u0000\u0000\'\u00bc\u0001\u0000\u0000"+
		"\u0000)\u00be\u0001\u0000\u0000\u0000+\u00c0\u0001\u0000\u0000\u0000-"+
		"\u00c2\u0001\u0000\u0000\u0000/\u00c4\u0001\u0000\u0000\u00001\u00c6\u0001"+
		"\u0000\u0000\u00003\u00cf\u0001\u0000\u0000\u00005\u00db\u0001\u0000\u0000"+
		"\u00007\u00dd\u0001\u0000\u0000\u00009\u00e2\u0001\u0000\u0000\u0000;"+
		"\u00e7\u0001\u0000\u0000\u0000=>\u0005A\u0000\u0000>?\u0005T\u0000\u0000"+
		"?@\u0005R\u0000\u0000@A\u0005I\u0000\u0000AB\u0005B\u0000\u0000BC\u0005"+
		"U\u0000\u0000CD\u0005I\u0000\u0000DE\u0005C\u0000\u0000EF\u0005O\u0000"+
		"\u0000FG\u0005E\u0000\u0000GH\u0005S\u0000\u0000H\u0002\u0001\u0000\u0000"+
		"\u0000IJ\u0005C\u0000\u0000JK\u0005O\u0000\u0000KL\u0005D\u0000\u0000"+
		"LM\u0005I\u0000\u0000MN\u0005G\u0000\u0000NO\u0005O\u0000\u0000O\u0004"+
		"\u0001\u0000\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005n\u0000\u0000RS\u0005"+
		"t\u0000\u0000ST\u0005e\u0000\u0000TU\u0005i\u0000\u0000UV\u0005r\u0000"+
		"\u0000Vs\u0005o\u0000\u0000WX\u0005b\u0000\u0000XY\u0005o\u0000\u0000"+
		"YZ\u0005o\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005"+
		"a\u0000\u0000]^\u0005n\u0000\u0000^s\u0005o\u0000\u0000_`\u0005c\u0000"+
		"\u0000`a\u0005a\u0000\u0000ab\u0005r\u0000\u0000bc\u0005a\u0000\u0000"+
		"cd\u0005c\u0000\u0000de\u0005t\u0000\u0000ef\u0005e\u0000\u0000fg\u0005"+
		"r\u0000\u0000gs\u0005e\u0000\u0000hi\u0005s\u0000\u0000ij\u0005t\u0000"+
		"\u0000jk\u0005r\u0000\u0000kl\u0005i\u0000\u0000lm\u0005n\u0000\u0000"+
		"ms\u0005g\u0000\u0000no\u0005r\u0000\u0000op\u0005e\u0000\u0000pq\u0005"+
		"a\u0000\u0000qs\u0005l\u0000\u0000rP\u0001\u0000\u0000\u0000rW\u0001\u0000"+
		"\u0000\u0000r_\u0001\u0000\u0000\u0000rh\u0001\u0000\u0000\u0000rn\u0001"+
		"\u0000\u0000\u0000s\u0006\u0001\u0000\u0000\u0000tu\u0005i\u0000\u0000"+
		"uv\u0005n\u0000\u0000v\b\u0001\u0000\u0000\u0000wx\u0005o\u0000\u0000"+
		"xy\u0005u\u0000\u0000yz\u0005t\u0000\u0000z\n\u0001\u0000\u0000\u0000"+
		"{|\u0005c\u0000\u0000|}\u0005a\u0000\u0000}~\u0005s\u0000\u0000~\u007f"+
		"\u0005o\u0000\u0000\u007f\f\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"o\u0000\u0000\u0081\u0082\u0005u\u0000\u0000\u0082\u0083\u0005t\u0000"+
		"\u0000\u0083\u0084\u0005r\u0000\u0000\u0084\u0085\u0005o\u0000\u0000\u0085"+
		"\u000e\u0001\u0000\u0000\u0000\u0086\u0087\u0005r\u0000\u0000\u0087\u0088"+
		"\u0005e\u0000\u0000\u0088\u0089\u0005p\u0000\u0000\u0089\u008a\u0005i"+
		"\u0000\u0000\u008a\u008b\u0005t\u0000\u0000\u008b\u008c\u0005a\u0000\u0000"+
		"\u008c\u0010\u0001\u0000\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e"+
		"\u008f\u0005x\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0091\u0005"+
		"c\u0000\u0000\u0091\u0092\u0005u\u0000\u0000\u0092\u0093\u0005t\u0000"+
		"\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0012\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005r\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098"+
		"\u0005c\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u009a\u0005b"+
		"\u0000\u0000\u009a\u009b\u0005a\u0000\u0000\u009b\u0014\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005o\u0000\u0000\u009d\u009e\u0005u\u0000\u0000\u009e"+
		"\u0016\u0001\u0000\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0\u0018"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005v\u0000\u0000\u00a2\u00a3\u0005"+
		"o\u0000\u0000\u00a3\u00a4\u0005i\u0000\u0000\u00a4\u00a5\u0005d\u0000"+
		"\u0000\u00a5\u001a\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0000\u0000"+
		"\u0000\u00a7\u001c\u0001\u0000\u0000\u0000\u00a8\u00b2\u0007\u0001\u0000"+
		"\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa\u00b2\u0005=\u0000\u0000\u00ab"+
		"\u00ac\u0005!\u0000\u0000\u00ac\u00b2\u0005=\u0000\u0000\u00ad\u00ae\u0005"+
		"<\u0000\u0000\u00ae\u00b2\u0005=\u0000\u0000\u00af\u00b0\u0005>\u0000"+
		"\u0000\u00b0\u00b2\u0005=\u0000\u0000\u00b1\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u001e\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005:\u0000\u0000\u00b4"+
		"\u00b5\u0005=\u0000\u0000\u00b5 \u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		";\u0000\u0000\u00b7\"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005:\u0000"+
		"\u0000\u00b9$\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005|\u0000\u0000\u00bb"+
		"&\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005,\u0000\u0000\u00bd(\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005(\u0000\u0000\u00bf*\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005)\u0000\u0000\u00c1,\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005}\u0000\u0000\u00c3.\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"{\u0000\u0000\u00c50\u0001\u0000\u0000\u0000\u00c6\u00cb\u00035\u001a"+
		"\u0000\u00c7\u00ca\u00037\u001b\u0000\u00c8\u00ca\u00035\u001a\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc2\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d0\u00037\u001b\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0005.\u0000\u0000\u00d4\u00d6\u00037\u001b"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da4\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0007\u0002\u0000\u0000\u00dc6\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0007\u0003\u0000\u0000\u00de8\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0007\u0004\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006\u001c\u0000\u0000\u00e6:\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\t\u0000\u0000\u0000\u00e8<\u0001\u0000"+
		"\u0000\u0000\t\u0000r\u00b1\u00c9\u00cb\u00d1\u00d7\u00d9\u00e2\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}