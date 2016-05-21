// Generated from /Users/juanpablo/Documents/GIT/KitCode/KitCode/src/grammar/LITE.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LITELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FRASE=1, NUMERO=2, PALABRA=3, BOOLEANO=4, LETRA=5, DIGITO=6, VALOR_BOOLEANO=7, 
		PR_INICIO=8, PR_FIN=9, PR_CREA=10, PR_DECLARADOR=11, PR_FIN_SENTENCIA=12, 
		PR_ASIGNADOR=13, PR_SI=14, PR_PARENTESIS_A=15, PR_PARENTESIS_C=16, PR_ENTONCES=17, 
		PR_MIENTRAS=18, PR_HACER=19, PR_IMPRIMIR=20, PR_SINO=21, PR_NEGATIVO=22, 
		OTRO=23, SPACE=24, OPERADOR_MATEMATICO=25, OPERADOR_LOGICO_MATEMATICO=26, 
		OPERADOR_LOGICO=27, PR_SEPARADOR_DECIMAL=28, PR_CONCATENAR=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FRASE", "NUMERO", "PALABRA", "BOOLEANO", "LETRA", "DIGITO", "VALOR_BOOLEANO", 
		"PR_INICIO", "PR_FIN", "PR_CREA", "PR_DECLARADOR", "PR_FIN_SENTENCIA", 
		"PR_ASIGNADOR", "PR_SI", "PR_PARENTESIS_A", "PR_PARENTESIS_C", "PR_ENTONCES", 
		"PR_MIENTRAS", "PR_HACER", "PR_IMPRIMIR", "PR_SINO", "PR_NEGATIVO", "OTRO", 
		"SPACE", "OPERADOR_MATEMATICO", "OPERADOR_LOGICO_MATEMATICO", "OPERADOR_LOGICO", 
		"PR_SEPARADOR_DECIMAL", "PR_CONCATENAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'palabra'", "'booleano'", null, null, null, "'inicio'", 
		"'fin'", "'crea'", "'como'", "';'", "'es'", "'si'", "'('", "')'", "'entonces'", 
		"'mientras'", "'hacer'", "'mostrar'", "'sino'", "'-'", null, null, null, 
		null, null, "'.'", "'con'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FRASE", "NUMERO", "PALABRA", "BOOLEANO", "LETRA", "DIGITO", "VALOR_BOOLEANO", 
		"PR_INICIO", "PR_FIN", "PR_CREA", "PR_DECLARADOR", "PR_FIN_SENTENCIA", 
		"PR_ASIGNADOR", "PR_SI", "PR_PARENTESIS_A", "PR_PARENTESIS_C", "PR_ENTONCES", 
		"PR_MIENTRAS", "PR_HACER", "PR_IMPRIMIR", "PR_SINO", "PR_NEGATIVO", "OTRO", 
		"SPACE", "OPERADOR_MATEMATICO", "OPERADOR_LOGICO_MATEMATICO", "OPERADOR_LOGICO", 
		"PR_SEPARADOR_DECIMAL", "PR_CONCATENAR"
	};
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


	public LITELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LITE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00ed\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d3\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00e6"+
		"\n\34\3\35\3\35\3\36\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\t\5\2\f\f\17\17$$\5\2"+
		"C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\5\2,-//\61\61\4\2>>@@\4\2qq{{\u00f6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5T\3\2\2\2\7V\3\2\2\2\t^\3\2\2\2\13g\3\2\2\2\ri\3\2"+
		"\2\2\17y\3\2\2\2\21{\3\2\2\2\23\u0082\3\2\2\2\25\u0086\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u0095\3\2\2\2\37\u0098\3"+
		"\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u00a5\3\2\2\2\'\u00ae\3\2\2\2)\u00b4"+
		"\3\2\2\2+\u00bc\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00c9\3\2\2\2\65\u00d2\3\2\2\2\67\u00e5\3\2\2\29\u00e7\3\2\2\2;\u00e9"+
		"\3\2\2\2=C\7$\2\2>B\n\2\2\2?@\7$\2\2@B\7$\2\2A>\3\2\2\2A?\3\2\2\2BE\3"+
		"\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7$\2\2G\4\3\2\2\2HI\7"+
		"p\2\2IJ\7\u00fc\2\2JK\7o\2\2KL\7g\2\2LM\7t\2\2MU\7q\2\2NO\7p\2\2OP\7w"+
		"\2\2PQ\7o\2\2QR\7g\2\2RS\7t\2\2SU\7q\2\2TH\3\2\2\2TN\3\2\2\2U\6\3\2\2"+
		"\2VW\7r\2\2WX\7c\2\2XY\7n\2\2YZ\7c\2\2Z[\7d\2\2[\\\7t\2\2\\]\7c\2\2]\b"+
		"\3\2\2\2^_\7d\2\2_`\7q\2\2`a\7q\2\2ab\7n\2\2bc\7g\2\2cd\7c\2\2de\7p\2"+
		"\2ef\7q\2\2f\n\3\2\2\2gh\t\3\2\2h\f\3\2\2\2ij\t\4\2\2j\16\3\2\2\2kl\7"+
		"x\2\2lm\7g\2\2mn\7t\2\2no\7f\2\2op\7c\2\2pq\7f\2\2qr\7g\2\2rs\7t\2\2s"+
		"z\7q\2\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2xz\7q\2\2yk\3\2\2\2yt\3\2"+
		"\2\2z\20\3\2\2\2{|\7k\2\2|}\7p\2\2}~\7k\2\2~\177\7e\2\2\177\u0080\7k\2"+
		"\2\u0080\u0081\7q\2\2\u0081\22\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7p\2\2\u0085\24\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\26\3\2\2\2\u008b\u008c"+
		"\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e\7o\2\2\u008e\u008f\7q\2\2\u008f"+
		"\30\3\2\2\2\u0090\u0091\7=\2\2\u0091\32\3\2\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7u\2\2\u0094\34\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7k\2\2\u0097"+
		"\36\3\2\2\2\u0098\u0099\7*\2\2\u0099 \3\2\2\2\u009a\u009b\7+\2\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\u00a4\7u\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7k\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2\u00ad&\3\2\2\2\u00ae\u00af"+
		"\7j\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7q\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7t\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2"+
		"\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7q\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		"/\2\2\u00c2.\3\2\2\2\u00c3\u00c4\13\2\2\2\u00c4\60\3\2\2\2\u00c5\u00c6"+
		"\t\5\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\31\2\2\u00c8\62\3\2\2\2\u00c9"+
		"\u00ca\t\6\2\2\u00ca\64\3\2\2\2\u00cb\u00d3\t\7\2\2\u00cc\u00cd\7@\2\2"+
		"\u00cd\u00d3\7?\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d3\7?\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1\u00d3\7?\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7k\2\2"+
		"\u00d5\u00d6\7i\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7c\2\2\u00d8\u00e6"+
		"\7n\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7p\2\2"+
		"\u00e0\u00e1\7v\2\2\u00e1\u00e6\7g\2\2\u00e2\u00e6\t\b\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4\u00e6\7q\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e68\3\2\2\2\u00e7\u00e8\7\60\2\2"+
		"\u00e8:\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7p\2"+
		"\2\u00ec<\3\2\2\2\t\2ACTy\u00d2\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}