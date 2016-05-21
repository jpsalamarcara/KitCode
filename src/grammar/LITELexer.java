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
		PROGRAMA=1, CUERPO=2, SENTENCIA=3, DECLARACION=4, ASIGNACION=5, SENTENCIA_SI=6, 
		SENTENCIA_MIENTRAS=7, SENTENCIA_IMPRIMIR=8, SENTENCIA_SINO=9, EXPRESION=10, 
		EXPRESION_LOGICA=11, EXPRESION_MATEMATICA=12, EXPRESION_LOGICO_MATEMATICA=13, 
		VARIABLE=14, VALOR=15, TIPO=16, VALOR_NUMERO=17, TEXTO=18, FRASE=19, NUMERO=20, 
		PALABRA=21, BOOLEANO=22, LETRA=23, DIGITO=24, VALOR_BOOLEANO=25, PR_INICIO=26, 
		PR_FIN=27, PR_CREA=28, PR_DECLARADOR=29, PR_FIN_SENTENCIA=30, PR_ASIGNADOR=31, 
		PR_SI=32, PR_PARENTESIS_A=33, PR_PARENTESIS_C=34, PR_ENTONCES=35, PR_MIENTRAS=36, 
		PR_HACER=37, PR_IMPRIMIR=38, PR_SINO=39, PR_NEGATIVO=40, OPERADOR_MATEMATICO=41, 
		OPERADOR_LOGICO_MATEMATICO=42, OPERADOR_LOGICO=43, PR_SEPARADOR_DECIMAL=44, 
		PR_CONCATENAR=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAMA", "CUERPO", "SENTENCIA", "DECLARACION", "ASIGNACION", "SENTENCIA_SI", 
		"SENTENCIA_MIENTRAS", "SENTENCIA_IMPRIMIR", "SENTENCIA_SINO", "EXPRESION", 
		"EXPRESION_LOGICA", "EXPRESION_MATEMATICA", "EXPRESION_LOGICO_MATEMATICA", 
		"VARIABLE", "VALOR", "TIPO", "VALOR_NUMERO", "TEXTO", "FRASE", "NUMERO", 
		"PALABRA", "BOOLEANO", "LETRA", "DIGITO", "VALOR_BOOLEANO", "PR_INICIO", 
		"PR_FIN", "PR_CREA", "PR_DECLARADOR", "PR_FIN_SENTENCIA", "PR_ASIGNADOR", 
		"PR_SI", "PR_PARENTESIS_A", "PR_PARENTESIS_C", "PR_ENTONCES", "PR_MIENTRAS", 
		"PR_HACER", "PR_IMPRIMIR", "PR_SINO", "PR_NEGATIVO", "OPERADOR_MATEMATICO", 
		"OPERADOR_LOGICO_MATEMATICO", "OPERADOR_LOGICO", "PR_SEPARADOR_DECIMAL", 
		"PR_CONCATENAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'palabra'", "'booleano'", 
		null, null, null, "'inicio'", "'fin'", "'crea'", "'como'", "';'", "'es'", 
		"'si'", "'('", "')'", "'entonces'", "'mientras'", "'hacer'", "'mostrar'", 
		"'sino'", "'-'", null, null, null, "'.'", "'con'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAMA", "CUERPO", "SENTENCIA", "DECLARACION", "ASIGNACION", 
		"SENTENCIA_SI", "SENTENCIA_MIENTRAS", "SENTENCIA_IMPRIMIR", "SENTENCIA_SINO", 
		"EXPRESION", "EXPRESION_LOGICA", "EXPRESION_MATEMATICA", "EXPRESION_LOGICO_MATEMATICA", 
		"VARIABLE", "VALOR", "TIPO", "VALOR_NUMERO", "TEXTO", "FRASE", "NUMERO", 
		"PALABRA", "BOOLEANO", "LETRA", "DIGITO", "VALOR_BOOLEANO", "PR_INICIO", 
		"PR_FIN", "PR_CREA", "PR_DECLARADOR", "PR_FIN_SENTENCIA", "PR_ASIGNADOR", 
		"PR_SI", "PR_PARENTESIS_A", "PR_PARENTESIS_C", "PR_ENTONCES", "PR_MIENTRAS", 
		"PR_HACER", "PR_IMPRIMIR", "PR_SINO", "PR_NEGATIVO", "OPERADOR_MATEMATICO", 
		"OPERADOR_LOGICO_MATEMATICO", "OPERADOR_LOGICO", "PR_SEPARADOR_DECIMAL", 
		"PR_CONCATENAR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u01c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\7\3b\n\3\f\3\16\3e\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\6\7\u0081\n\7\r\7\16\7\u0082\3\7\5\7\u0086\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\t\3\t\3\t\3\n\3\n\6\n\u00a4"+
		"\n\n\r\n\16\n\u00a5\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00df\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\6\17\u00e6\n\17\r\17\16\17\u00e7\3\17\3\17\7\17\u00ec"+
		"\n\17\f\17\16\17\u00ef\13\17\3\20\3\20\3\20\5\20\u00f4\n\20\3\21\3\21"+
		"\3\21\5\21\u00f9\n\21\3\22\5\22\u00fc\n\22\3\22\6\22\u00ff\n\22\r\22\16"+
		"\22\u0100\3\22\3\22\6\22\u0105\n\22\r\22\16\22\u0106\5\22\u0109\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0119\n\23\3\24\3\24\3\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0132\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0157\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u01aa\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u01bd\n,\3-\3-\3.\3.\3.\3.\2\2/\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/\3\2\b\5\2\f\f\17\17$$\5\2C\\aac|\3\2\62;\5\2,-//\61\61"+
		"\4\2>>@@\4\2qq{{\u01f7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3"+
		"\2\2\2\5_\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13u\3\2\2\2\rz\3\2\2\2\17\u0089"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u00a1\3\2\2\2\25\u00a9\3\2\2\2\27\u00c4\3"+
		"\2\2\2\31\u00de\3\2\2\2\33\u00e0\3\2\2\2\35\u00e5\3\2\2\2\37\u00f3\3\2"+
		"\2\2!\u00f8\3\2\2\2#\u00fb\3\2\2\2%\u0118\3\2\2\2\'\u011a\3\2\2\2)\u0131"+
		"\3\2\2\2+\u0133\3\2\2\2-\u013b\3\2\2\2/\u0144\3\2\2\2\61\u0146\3\2\2\2"+
		"\63\u0156\3\2\2\2\65\u0158\3\2\2\2\67\u015f\3\2\2\29\u0163\3\2\2\2;\u0168"+
		"\3\2\2\2=\u016d\3\2\2\2?\u016f\3\2\2\2A\u0172\3\2\2\2C\u0175\3\2\2\2E"+
		"\u0177\3\2\2\2G\u0179\3\2\2\2I\u0182\3\2\2\2K\u018b\3\2\2\2M\u0191\3\2"+
		"\2\2O\u0199\3\2\2\2Q\u019e\3\2\2\2S\u01a0\3\2\2\2U\u01a9\3\2\2\2W\u01bc"+
		"\3\2\2\2Y\u01be\3\2\2\2[\u01c0\3\2\2\2]^\5\5\3\2^\4\3\2\2\2_c\5\65\33"+
		"\2`b\5\7\4\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2"+
		"\2fg\5\67\34\2g\6\3\2\2\2hn\5\t\5\2in\5\13\6\2jn\5\r\7\2kn\5\17\b\2ln"+
		"\5\21\t\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\b\3\2\2\2"+
		"op\59\35\2pq\5\35\17\2qr\5;\36\2rs\5!\21\2st\5=\37\2t\n\3\2\2\2uv\5\35"+
		"\17\2vw\5? \2wx\5\25\13\2xy\5=\37\2y\f\3\2\2\2z{\5A!\2{|\5C\"\2|}\5\27"+
		"\f\2}~\5E#\2~\u0080\5G$\2\177\u0081\5\7\4\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0086\5\23\n\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\5\67\34\2\u0088\16\3\2\2\2\u0089\u008a\5I%\2\u008a"+
		"\u008b\5C\"\2\u008b\u008c\5\27\f\2\u008c\u008d\5E#\2\u008d\u0091\5K&\2"+
		"\u008e\u0090\5\7\4\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\5\67\34\2\u0095\20\3\2\2\2\u0096\u0097\5M\'\2\u0097\u009c\5C\""+
		"\2\u0098\u009d\5\35\17\2\u0099\u009d\5\37\20\2\u009a\u009d\5\27\f\2\u009b"+
		"\u009d\5\31\r\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\5E#\2\u009f\u00a0\5=\37\2\u00a0\22\3\2\2\2\u00a1\u00a3\5O(\2\u00a2"+
		"\u00a4\5\7\4\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\24\3\2\2\2\u00a7\u00aa\5\27\f\2\u00a8\u00aa"+
		"\5\31\r\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\26\3\2\2\2\u00ab"+
		"\u00ac\5\35\17\2\u00ac\u00ad\5W,\2\u00ad\u00ae\5\35\17\2\u00ae\u00c5\3"+
		"\2\2\2\u00af\u00b0\5\37\20\2\u00b0\u00b1\5W,\2\u00b1\u00b2\5\37\20\2\u00b2"+
		"\u00c5\3\2\2\2\u00b3\u00b4\5\37\20\2\u00b4\u00b5\5W,\2\u00b5\u00b6\5\35"+
		"\17\2\u00b6\u00c5\3\2\2\2\u00b7\u00b8\5\35\17\2\u00b8\u00b9\5W,\2\u00b9"+
		"\u00ba\5\37\20\2\u00ba\u00c5\3\2\2\2\u00bb\u00bc\5C\"\2\u00bc\u00bd\5"+
		"\25\13\2\u00bd\u00be\5W,\2\u00be\u00bf\5\25\13\2\u00bf\u00c0\5E#\2\u00c0"+
		"\u00c5\3\2\2\2\u00c1\u00c5\5\37\20\2\u00c2\u00c5\5\35\17\2\u00c3\u00c5"+
		"\5\33\16\2\u00c4\u00ab\3\2\2\2\u00c4\u00af\3\2\2\2\u00c4\u00b3\3\2\2\2"+
		"\u00c4\u00b7\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\30\3\2\2\2\u00c6\u00c7\5\35\17\2\u00c7"+
		"\u00c8\5S*\2\u00c8\u00c9\5\35\17\2\u00c9\u00df\3\2\2\2\u00ca\u00cb\5\37"+
		"\20\2\u00cb\u00cc\5S*\2\u00cc\u00cd\5\37\20\2\u00cd\u00df\3\2\2\2\u00ce"+
		"\u00cf\5\37\20\2\u00cf\u00d0\5S*\2\u00d0\u00d1\5\35\17\2\u00d1\u00df\3"+
		"\2\2\2\u00d2\u00d3\5\35\17\2\u00d3\u00d4\5S*\2\u00d4\u00d5\5\37\20\2\u00d5"+
		"\u00df\3\2\2\2\u00d6\u00d7\5C\"\2\u00d7\u00d8\5\25\13\2\u00d8\u00d9\5"+
		"S*\2\u00d9\u00da\5\25\13\2\u00da\u00db\5E#\2\u00db\u00df\3\2\2\2\u00dc"+
		"\u00df\5\37\20\2\u00dd\u00df\5\35\17\2\u00de\u00c6\3\2\2\2\u00de\u00ca"+
		"\3\2\2\2\u00de\u00ce\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d6\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\32\3\2\2\2\u00e0\u00e1\5\31\r"+
		"\2\u00e1\u00e2\5U+\2\u00e2\u00e3\5\31\r\2\u00e3\34\3\2\2\2\u00e4\u00e6"+
		"\5/\30\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00ec\5\61\31\2\u00ea\u00ec\5"+
		"/\30\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\36\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00f0\u00f4\5#\22\2\u00f1\u00f4\5%\23\2\u00f2\u00f4\5\63\32\2\u00f3"+
		"\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4 \3\2\2\2"+
		"\u00f5\u00f9\5)\25\2\u00f6\u00f9\5+\26\2\u00f7\u00f9\5-\27\2\u00f8\u00f5"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\"\3\2\2\2\u00fa"+
		"\u00fc\5Q)\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2"+
		"\2\u00fd\u00ff\5\61\31\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0108\3\2\2\2\u0102\u0104\5Y"+
		"-\2\u0103\u0105\5\61\31\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109$\3\2\2\2\u010a\u010b\5\35\17\2\u010b\u010c"+
		"\5[.\2\u010c\u010d\5\'\24\2\u010d\u0119\3\2\2\2\u010e\u010f\5\'\24\2\u010f"+
		"\u0110\5[.\2\u0110\u0111\5\35\17\2\u0111\u0119\3\2\2\2\u0112\u0113\5\'"+
		"\24\2\u0113\u0114\5[.\2\u0114\u0115\5\'\24\2\u0115\u0119\3\2\2\2\u0116"+
		"\u0119\5\'\24\2\u0117\u0119\5\35\17\2\u0118\u010a\3\2\2\2\u0118\u010e"+
		"\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"&\3\2\2\2\u011a\u0120\7$\2\2\u011b\u011f\n\2\2\2\u011c\u011d\7$\2\2\u011d"+
		"\u011f\7$\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124(\3\2\2\2\u0125\u0126\7p\2\2\u0126"+
		"\u0127\7\u00fc\2\2\u0127\u0128\7o\2\2\u0128\u0129\7g\2\2\u0129\u012a\7"+
		"t\2\2\u012a\u0132\7q\2\2\u012b\u012c\7p\2\2\u012c\u012d\7w\2\2\u012d\u012e"+
		"\7o\2\2\u012e\u012f\7g\2\2\u012f\u0130\7t\2\2\u0130\u0132\7q\2\2\u0131"+
		"\u0125\3\2\2\2\u0131\u012b\3\2\2\2\u0132*\3\2\2\2\u0133\u0134\7r\2\2\u0134"+
		"\u0135\7c\2\2\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2\u0137\u0138\7d\2\2"+
		"\u0138\u0139\7t\2\2\u0139\u013a\7c\2\2\u013a,\3\2\2\2\u013b\u013c\7d\2"+
		"\2\u013c\u013d\7q\2\2\u013d\u013e\7q\2\2\u013e\u013f\7n\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7c\2\2\u0141\u0142\7p\2\2\u0142\u0143\7q\2\2\u0143"+
		".\3\2\2\2\u0144\u0145\t\3\2\2\u0145\60\3\2\2\2\u0146\u0147\t\4\2\2\u0147"+
		"\62\3\2\2\2\u0148\u0149\7x\2\2\u0149\u014a\7g\2\2\u014a\u014b\7t\2\2\u014b"+
		"\u014c\7f\2\2\u014c\u014d\7c\2\2\u014d\u014e\7f\2\2\u014e\u014f\7g\2\2"+
		"\u014f\u0150\7t\2\2\u0150\u0157\7q\2\2\u0151\u0152\7h\2\2\u0152\u0153"+
		"\7c\2\2\u0153\u0154\7n\2\2\u0154\u0155\7u\2\2\u0155\u0157\7q\2\2\u0156"+
		"\u0148\3\2\2\2\u0156\u0151\3\2\2\2\u0157\64\3\2\2\2\u0158\u0159\7k\2\2"+
		"\u0159\u015a\7p\2\2\u015a\u015b\7k\2\2\u015b\u015c\7e\2\2\u015c\u015d"+
		"\7k\2\2\u015d\u015e\7q\2\2\u015e\66\3\2\2\2\u015f\u0160\7h\2\2\u0160\u0161"+
		"\7k\2\2\u0161\u0162\7p\2\2\u01628\3\2\2\2\u0163\u0164\7e\2\2\u0164\u0165"+
		"\7t\2\2\u0165\u0166\7g\2\2\u0166\u0167\7c\2\2\u0167:\3\2\2\2\u0168\u0169"+
		"\7e\2\2\u0169\u016a\7q\2\2\u016a\u016b\7o\2\2\u016b\u016c\7q\2\2\u016c"+
		"<\3\2\2\2\u016d\u016e\7=\2\2\u016e>\3\2\2\2\u016f\u0170\7g\2\2\u0170\u0171"+
		"\7u\2\2\u0171@\3\2\2\2\u0172\u0173\7u\2\2\u0173\u0174\7k\2\2\u0174B\3"+
		"\2\2\2\u0175\u0176\7*\2\2\u0176D\3\2\2\2\u0177\u0178\7+\2\2\u0178F\3\2"+
		"\2\2\u0179\u017a\7g\2\2\u017a\u017b\7p\2\2\u017b\u017c\7v\2\2\u017c\u017d"+
		"\7q\2\2\u017d\u017e\7p\2\2\u017e\u017f\7e\2\2\u017f\u0180\7g\2\2\u0180"+
		"\u0181\7u\2\2\u0181H\3\2\2\2\u0182\u0183\7o\2\2\u0183\u0184\7k\2\2\u0184"+
		"\u0185\7g\2\2\u0185\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187\u0188\7t\2\2"+
		"\u0188\u0189\7c\2\2\u0189\u018a\7u\2\2\u018aJ\3\2\2\2\u018b\u018c\7j\2"+
		"\2\u018c\u018d\7c\2\2\u018d\u018e\7e\2\2\u018e\u018f\7g\2\2\u018f\u0190"+
		"\7t\2\2\u0190L\3\2\2\2\u0191\u0192\7o\2\2\u0192\u0193\7q\2\2\u0193\u0194"+
		"\7u\2\2\u0194\u0195\7v\2\2\u0195\u0196\7t\2\2\u0196\u0197\7c\2\2\u0197"+
		"\u0198\7t\2\2\u0198N\3\2\2\2\u0199\u019a\7u\2\2\u019a\u019b\7k\2\2\u019b"+
		"\u019c\7p\2\2\u019c\u019d\7q\2\2\u019dP\3\2\2\2\u019e\u019f\7/\2\2\u019f"+
		"R\3\2\2\2\u01a0\u01a1\t\5\2\2\u01a1T\3\2\2\2\u01a2\u01aa\t\6\2\2\u01a3"+
		"\u01a4\7@\2\2\u01a4\u01aa\7?\2\2\u01a5\u01a6\7>\2\2\u01a6\u01aa\7?\2\2"+
		"\u01a7\u01a8\7?\2\2\u01a8\u01aa\7?\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01a3"+
		"\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aaV\3\2\2\2\u01ab"+
		"\u01ac\7k\2\2\u01ac\u01ad\7i\2\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7c\2\2"+
		"\u01af\u01bd\7n\2\2\u01b0\u01b1\7f\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3"+
		"\7h\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7g\2\2\u01b6"+
		"\u01b7\7p\2\2\u01b7\u01b8\7v\2\2\u01b8\u01bd\7g\2\2\u01b9\u01bd\t\7\2"+
		"\2\u01ba\u01bb\7p\2\2\u01bb\u01bd\7q\2\2\u01bc\u01ab\3\2\2\2\u01bc\u01b0"+
		"\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bdX\3\2\2\2\u01be"+
		"\u01bf\7\60\2\2\u01bfZ\3\2\2\2\u01c0\u01c1\7e\2\2\u01c1\u01c2\7q\2\2\u01c2"+
		"\u01c3\7p\2\2\u01c3\\\3\2\2\2\35\2cm\u0082\u0085\u0091\u009c\u00a5\u00a9"+
		"\u00c4\u00de\u00e7\u00eb\u00ed\u00f3\u00f8\u00fb\u0100\u0106\u0108\u0118"+
		"\u011e\u0120\u0131\u0156\u01a9\u01bc\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}