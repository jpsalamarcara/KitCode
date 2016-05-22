// Generated from /Users/juanpablo/Documents/GIT/KitCode/KitCode/src/grammar/LITE.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LITEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR_OPERADOR_POTENCIA=1, PR_NEGATIVO=2, PR_OPERADOR_MULTIPLICACION=3, PR_OPERADOR_DIVISION=4, 
		PR_OPERADOR_SUMA=5, PR_OPERADOR_RESTA=6, PR_MENOR_IGUAL_QUE=7, PR_MAYOR_IGUAL_QUE=8, 
		PR_MENOR_QUE=9, PR_MAYOR_QUE=10, PR_NO_IGUAL_QUE=11, PR_IGUAL_QUE=12, 
		PR_Y=13, PR_O=14, PR_PAR_ABIERTO=15, PR_PAR_CERRADO=16, VERDADERO=17, 
		FALSO=18, PR_NUMERO=19, PR_PALABRA=20, PR_BOOLEANO=21, PR_INICIO=22, PR_FIN=23, 
		PR_CREA=24, PR_DECLARADOR=25, PR_FIN_SENTENCIA=26, PR_ASIGNADOR=27, PR_SI=28, 
		PR_ENTONCES=29, PR_MIENTRAS=30, PR_HACER=31, PR_IMPRIMIR=32, PR_SINO=33, 
		TEXTO=34, NUMERO=35, VARIABLE=36, SPACE=37, OTRO=38;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_sentencia_si = 2, RULE_sentencia_mientras = 3, 
		RULE_sentencia_imprimir = 4, RULE_sentencia_sino = 5, RULE_declaracion = 6, 
		RULE_asignacion = 7, RULE_expresion = 8, RULE_expresion_atomica = 9, RULE_tipo = 10;
	public static final String[] ruleNames = {
		"programa", "sentencia", "sentencia_si", "sentencia_mientras", "sentencia_imprimir", 
		"sentencia_sino", "declaracion", "asignacion", "expresion", "expresion_atomica", 
		"tipo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'elevado'", null, "'*'", "'/'", "'+'", null, "'menor_igual'", "'mayor_igual'", 
		"'menor'", "'mayor'", "'diferente'", "'igual'", null, null, "'('", "')'", 
		"'verdadero'", "'falso'", "'numero'", "'palabra'", "'booleano'", "'inicio'", 
		"'fin'", "'crea'", "'como'", "';'", "'es'", "'si'", "'entonces'", "'mientras'", 
		"'hacer'", "'mostrar'", "'sino'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PR_OPERADOR_POTENCIA", "PR_NEGATIVO", "PR_OPERADOR_MULTIPLICACION", 
		"PR_OPERADOR_DIVISION", "PR_OPERADOR_SUMA", "PR_OPERADOR_RESTA", "PR_MENOR_IGUAL_QUE", 
		"PR_MAYOR_IGUAL_QUE", "PR_MENOR_QUE", "PR_MAYOR_QUE", "PR_NO_IGUAL_QUE", 
		"PR_IGUAL_QUE", "PR_Y", "PR_O", "PR_PAR_ABIERTO", "PR_PAR_CERRADO", "VERDADERO", 
		"FALSO", "PR_NUMERO", "PR_PALABRA", "PR_BOOLEANO", "PR_INICIO", "PR_FIN", 
		"PR_CREA", "PR_DECLARADOR", "PR_FIN_SENTENCIA", "PR_ASIGNADOR", "PR_SI", 
		"PR_ENTONCES", "PR_MIENTRAS", "PR_HACER", "PR_IMPRIMIR", "PR_SINO", "TEXTO", 
		"NUMERO", "VARIABLE", "SPACE", "OTRO"
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

	@Override
	public String getGrammarFileName() { return "LITE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LITEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PR_INICIO() { return getToken(LITEParser.PR_INICIO, 0); }
		public TerminalNode PR_FIN() { return getToken(LITEParser.PR_FIN, 0); }
		public TerminalNode EOF() { return getToken(LITEParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(PR_INICIO);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << VARIABLE) | (1L << OTRO))) != 0)) {
				{
				{
				setState(23);
				sentencia();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(PR_FIN);
			setState(30);
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

	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Sentencia_siContext sentencia_si() {
			return getRuleContext(Sentencia_siContext.class,0);
		}
		public Sentencia_mientrasContext sentencia_mientras() {
			return getRuleContext(Sentencia_mientrasContext.class,0);
		}
		public Sentencia_imprimirContext sentencia_imprimir() {
			return getRuleContext(Sentencia_imprimirContext.class,0);
		}
		public TerminalNode OTRO() { return getToken(LITEParser.OTRO, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case PR_CREA:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				declaracion();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				asignacion();
				}
				break;
			case PR_SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				sentencia_si();
				}
				break;
			case PR_MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				sentencia_mientras();
				}
				break;
			case PR_IMPRIMIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				sentencia_imprimir();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				match(OTRO);
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

	public static class Sentencia_siContext extends ParserRuleContext {
		public TerminalNode PR_SI() { return getToken(LITEParser.PR_SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PR_ENTONCES() { return getToken(LITEParser.PR_ENTONCES, 0); }
		public TerminalNode PR_FIN() { return getToken(LITEParser.PR_FIN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Sentencia_sinoContext sentencia_sino() {
			return getRuleContext(Sentencia_sinoContext.class,0);
		}
		public Sentencia_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterSentencia_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitSentencia_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitSentencia_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_siContext sentencia_si() throws RecognitionException {
		Sentencia_siContext _localctx = new Sentencia_siContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PR_SI);
			setState(41);
			match(PR_PAR_ABIERTO);
			setState(42);
			expresion(0);
			setState(43);
			match(PR_PAR_CERRADO);
			setState(44);
			match(PR_ENTONCES);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				sentencia();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << VARIABLE) | (1L << OTRO))) != 0) );
			setState(51);
			_la = _input.LA(1);
			if (_la==PR_SINO) {
				{
				setState(50);
				sentencia_sino();
				}
			}

			setState(53);
			match(PR_FIN);
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

	public static class Sentencia_mientrasContext extends ParserRuleContext {
		public TerminalNode PR_MIENTRAS() { return getToken(LITEParser.PR_MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PR_HACER() { return getToken(LITEParser.PR_HACER, 0); }
		public TerminalNode PR_FIN() { return getToken(LITEParser.PR_FIN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Sentencia_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterSentencia_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitSentencia_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitSentencia_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_mientrasContext sentencia_mientras() throws RecognitionException {
		Sentencia_mientrasContext _localctx = new Sentencia_mientrasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PR_MIENTRAS);
			setState(56);
			match(PR_PAR_ABIERTO);
			setState(57);
			expresion(0);
			setState(58);
			match(PR_PAR_CERRADO);
			setState(59);
			match(PR_HACER);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				sentencia();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << VARIABLE) | (1L << OTRO))) != 0) );
			setState(65);
			match(PR_FIN);
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

	public static class Sentencia_imprimirContext extends ParserRuleContext {
		public TerminalNode PR_IMPRIMIR() { return getToken(LITEParser.PR_IMPRIMIR, 0); }
		public TerminalNode PR_FIN_SENTENCIA() { return getToken(LITEParser.PR_FIN_SENTENCIA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sentencia_imprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterSentencia_imprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitSentencia_imprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitSentencia_imprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_imprimirContext sentencia_imprimir() throws RecognitionException {
		Sentencia_imprimirContext _localctx = new Sentencia_imprimirContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PR_IMPRIMIR);
			setState(68);
			match(PR_PAR_ABIERTO);
			{
			setState(69);
			expresion(0);
			}
			setState(70);
			match(PR_PAR_CERRADO);
			setState(71);
			match(PR_FIN_SENTENCIA);
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

	public static class Sentencia_sinoContext extends ParserRuleContext {
		public TerminalNode PR_SINO() { return getToken(LITEParser.PR_SINO, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Sentencia_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterSentencia_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitSentencia_sino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitSentencia_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_sinoContext sentencia_sino() throws RecognitionException {
		Sentencia_sinoContext _localctx = new Sentencia_sinoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PR_SINO);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				sentencia();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << VARIABLE) | (1L << OTRO))) != 0) );
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode PR_CREA() { return getToken(LITEParser.PR_CREA, 0); }
		public TerminalNode VARIABLE() { return getToken(LITEParser.VARIABLE, 0); }
		public TerminalNode PR_DECLARADOR() { return getToken(LITEParser.PR_DECLARADOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PR_FIN_SENTENCIA() { return getToken(LITEParser.PR_FIN_SENTENCIA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PR_CREA);
			setState(80);
			match(VARIABLE);
			setState(81);
			match(PR_DECLARADOR);
			setState(82);
			tipo();
			setState(83);
			match(PR_FIN_SENTENCIA);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(LITEParser.VARIABLE, 0); }
		public TerminalNode PR_ASIGNADOR() { return getToken(LITEParser.PR_ASIGNADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PR_FIN_SENTENCIA() { return getToken(LITEParser.PR_FIN_SENTENCIA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VARIABLE);
			setState(86);
			match(PR_ASIGNADOR);
			setState(87);
			expresion(0);
			setState(88);
			match(PR_FIN_SENTENCIA);
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpAtomicaContext extends ExpresionContext {
		public Expresion_atomicaContext expresion_atomica() {
			return getRuleContext(Expresion_atomicaContext.class,0);
		}
		public ExpAtomicaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpAtomica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpAtomica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpAtomica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMenorIgualContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_MENOR_IGUAL_QUE() { return getToken(LITEParser.PR_MENOR_IGUAL_QUE, 0); }
		public ExpMenorIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNoIgualContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_NO_IGUAL_QUE() { return getToken(LITEParser.PR_NO_IGUAL_QUE, 0); }
		public ExpNoIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpNoIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpNoIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpNoIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMayorContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_MAYOR_QUE() { return getToken(LITEParser.PR_MAYOR_QUE, 0); }
		public ExpMayorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroNegativoContext extends ExpresionContext {
		public TerminalNode PR_NEGATIVO() { return getToken(LITEParser.PR_NEGATIVO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public NumeroNegativoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterNumeroNegativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitNumeroNegativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitNumeroNegativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMultiplicacionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_OPERADOR_MULTIPLICACION() { return getToken(LITEParser.PR_OPERADOR_MULTIPLICACION, 0); }
		public ExpMultiplicacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPotenciaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_OPERADOR_POTENCIA() { return getToken(LITEParser.PR_OPERADOR_POTENCIA, 0); }
		public ExpPotenciaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpDivisionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_OPERADOR_DIVISION() { return getToken(LITEParser.PR_OPERADOR_DIVISION, 0); }
		public ExpDivisionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_O() { return getToken(LITEParser.PR_O, 0); }
		public ExpOContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMenorContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_MENOR_QUE() { return getToken(LITEParser.PR_MENOR_QUE, 0); }
		public ExpMenorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpIgualContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_IGUAL_QUE() { return getToken(LITEParser.PR_IGUAL_QUE, 0); }
		public ExpIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpSumaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_OPERADOR_SUMA() { return getToken(LITEParser.PR_OPERADOR_SUMA, 0); }
		public ExpSumaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpSuma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpYContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_Y() { return getToken(LITEParser.PR_Y, 0); }
		public ExpYContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRestaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_OPERADOR_RESTA() { return getToken(LITEParser.PR_OPERADOR_RESTA, 0); }
		public ExpRestaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpResta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMayorIgualContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_MAYOR_IGUAL_QUE() { return getToken(LITEParser.PR_MAYOR_IGUAL_QUE, 0); }
		public ExpMayorIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch (_input.LA(1)) {
			case PR_NEGATIVO:
				{
				_localctx = new NumeroNegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				match(PR_NEGATIVO);
				setState(92);
				expresion(14);
				}
				break;
			case PR_PAR_ABIERTO:
			case VERDADERO:
			case FALSO:
			case TEXTO:
			case NUMERO:
			case VARIABLE:
				{
				_localctx = new ExpAtomicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				expresion_atomica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpPotenciaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(96);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(97);
						match(PR_OPERADOR_POTENCIA);
						setState(98);
						expresion(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpMultiplicacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(99);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(100);
						match(PR_OPERADOR_MULTIPLICACION);
						setState(101);
						expresion(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpDivisionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(102);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(103);
						match(PR_OPERADOR_DIVISION);
						setState(104);
						expresion(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpSumaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(105);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(106);
						match(PR_OPERADOR_SUMA);
						setState(107);
						expresion(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpRestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(108);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(109);
						match(PR_OPERADOR_RESTA);
						setState(110);
						expresion(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpMenorIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(111);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(112);
						match(PR_MENOR_IGUAL_QUE);
						setState(113);
						expresion(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpMayorIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(114);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(115);
						match(PR_MAYOR_IGUAL_QUE);
						setState(116);
						expresion(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpMenorContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(117);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(118);
						match(PR_MENOR_QUE);
						setState(119);
						expresion(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpMayorContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						match(PR_MAYOR_QUE);
						setState(122);
						expresion(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpNoIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						match(PR_NO_IGUAL_QUE);
						setState(125);
						expresion(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						match(PR_IGUAL_QUE);
						setState(128);
						expresion(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpYContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						match(PR_Y);
						setState(131);
						expresion(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpOContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(PR_O);
						setState(134);
						expresion(3);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Expresion_atomicaContext extends ParserRuleContext {
		public Expresion_atomicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_atomica; }
	 
		public Expresion_atomicaContext() { }
		public void copyFrom(Expresion_atomicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AVariableContext extends Expresion_atomicaContext {
		public TerminalNode VARIABLE() { return getToken(LITEParser.VARIABLE, 0); }
		public AVariableContext(Expresion_atomicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterAVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitAVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitAVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ABooleanoContext extends Expresion_atomicaContext {
		public TerminalNode VERDADERO() { return getToken(LITEParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(LITEParser.FALSO, 0); }
		public ABooleanoContext(Expresion_atomicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterABooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitABooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitABooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParentesisContext extends Expresion_atomicaContext {
		public TerminalNode PR_PAR_ABIERTO() { return getToken(LITEParser.PR_PAR_ABIERTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PR_PAR_CERRADO() { return getToken(LITEParser.PR_PAR_CERRADO, 0); }
		public ExpParentesisContext(Expresion_atomicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATextoContext extends Expresion_atomicaContext {
		public TerminalNode TEXTO() { return getToken(LITEParser.TEXTO, 0); }
		public ATextoContext(Expresion_atomicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterATexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitATexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitATexto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANumeroContext extends Expresion_atomicaContext {
		public TerminalNode NUMERO() { return getToken(LITEParser.NUMERO, 0); }
		public ANumeroContext(Expresion_atomicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterANumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitANumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitANumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_atomicaContext expresion_atomica() throws RecognitionException {
		Expresion_atomicaContext _localctx = new Expresion_atomicaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion_atomica);
		int _la;
		try {
			setState(148);
			switch (_input.LA(1)) {
			case PR_PAR_ABIERTO:
				_localctx = new ExpParentesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(PR_PAR_ABIERTO);
				setState(141);
				expresion(0);
				setState(142);
				match(PR_PAR_CERRADO);
				}
				break;
			case NUMERO:
				_localctx = new ANumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(NUMERO);
				}
				break;
			case VERDADERO:
			case FALSO:
				_localctx = new ABooleanoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==VERDADERO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case VARIABLE:
				_localctx = new AVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(VARIABLE);
				}
				break;
			case TEXTO:
				_localctx = new ATextoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(TEXTO);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode PR_NUMERO() { return getToken(LITEParser.PR_NUMERO, 0); }
		public TerminalNode PR_PALABRA() { return getToken(LITEParser.PR_PALABRA, 0); }
		public TerminalNode PR_BOOLEANO() { return getToken(LITEParser.PR_BOOLEANO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_NUMERO) | (1L << PR_PALABRA) | (1L << PR_BOOLEANO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4\61\n\4\r\4\16\4\62"+
		"\3\4\5\4\66\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\6\7N\n\7\r\7\16\7O\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\na\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0097\n\13\3\f\3\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\4\3\2\23\24\3\2\25\27\u00ab\2\30\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b9\3"+
		"\2\2\2\nE\3\2\2\2\fK\3\2\2\2\16Q\3\2\2\2\20W\3\2\2\2\22`\3\2\2\2\24\u0096"+
		"\3\2\2\2\26\u0098\3\2\2\2\30\34\7\30\2\2\31\33\5\4\3\2\32\31\3\2\2\2\33"+
		"\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37"+
		" \7\31\2\2 !\7\2\2\3!\3\3\2\2\2\")\5\16\b\2#)\5\20\t\2$)\5\6\4\2%)\5\b"+
		"\5\2&)\5\n\6\2\')\7(\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3"+
		"\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\36\2\2+,\7\21\2\2,-\5\22\n\2-.\7\22\2"+
		"\2.\60\7\37\2\2/\61\5\4\3\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\66\5\f\7\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\7\31\2\28\7\3\2\2\29:\7 \2\2:;\7\21\2\2;<\5\22\n\2<=\7"+
		"\22\2\2=?\7!\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3"+
		"\2\2\2CD\7\31\2\2D\t\3\2\2\2EF\7\"\2\2FG\7\21\2\2GH\5\22\n\2HI\7\22\2"+
		"\2IJ\7\34\2\2J\13\3\2\2\2KM\7#\2\2LN\5\4\3\2ML\3\2\2\2NO\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2P\r\3\2\2\2QR\7\32\2\2RS\7&\2\2ST\7\33\2\2TU\5\26\f\2UV"+
		"\7\34\2\2V\17\3\2\2\2WX\7&\2\2XY\7\35\2\2YZ\5\22\n\2Z[\7\34\2\2[\21\3"+
		"\2\2\2\\]\b\n\1\2]^\7\4\2\2^a\5\22\n\20_a\5\24\13\2`\\\3\2\2\2`_\3\2\2"+
		"\2a\u008b\3\2\2\2bc\f\21\2\2cd\7\3\2\2d\u008a\5\22\n\22ef\f\17\2\2fg\7"+
		"\5\2\2g\u008a\5\22\n\20hi\f\16\2\2ij\7\6\2\2j\u008a\5\22\n\17kl\f\r\2"+
		"\2lm\7\7\2\2m\u008a\5\22\n\16no\f\f\2\2op\7\b\2\2p\u008a\5\22\n\rqr\f"+
		"\13\2\2rs\7\t\2\2s\u008a\5\22\n\ftu\f\n\2\2uv\7\n\2\2v\u008a\5\22\n\13"+
		"wx\f\t\2\2xy\7\13\2\2y\u008a\5\22\n\nz{\f\b\2\2{|\7\f\2\2|\u008a\5\22"+
		"\n\t}~\f\7\2\2~\177\7\r\2\2\177\u008a\5\22\n\b\u0080\u0081\f\6\2\2\u0081"+
		"\u0082\7\16\2\2\u0082\u008a\5\22\n\7\u0083\u0084\f\5\2\2\u0084\u0085\7"+
		"\17\2\2\u0085\u008a\5\22\n\6\u0086\u0087\f\4\2\2\u0087\u0088\7\20\2\2"+
		"\u0088\u008a\5\22\n\5\u0089b\3\2\2\2\u0089e\3\2\2\2\u0089h\3\2\2\2\u0089"+
		"k\3\2\2\2\u0089n\3\2\2\2\u0089q\3\2\2\2\u0089t\3\2\2\2\u0089w\3\2\2\2"+
		"\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0083\3\2\2\2"+
		"\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\23\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\21\2\2\u008f"+
		"\u0090\5\22\n\2\u0090\u0091\7\22\2\2\u0091\u0097\3\2\2\2\u0092\u0097\7"+
		"%\2\2\u0093\u0097\t\2\2\2\u0094\u0097\7&\2\2\u0095\u0097\7$\2\2\u0096"+
		"\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\t\3\2\2\u0099\27"+
		"\3\2\2\2\f\34(\62\65AO`\u0089\u008b\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}