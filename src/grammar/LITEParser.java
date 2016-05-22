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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, FRASE=19, NUMERO=20, PALABRA=21, BOOLEANO=22, LETRA=23, DIGITO=24, 
		VALOR_BOOLEANO=25, PR_POSITIVO=26, PR_INICIO=27, PR_FIN=28, PR_CREA=29, 
		PR_DECLARADOR=30, PR_FIN_SENTENCIA=31, PR_ASIGNADOR=32, PR_SI=33, PR_ENTONCES=34, 
		PR_MIENTRAS=35, PR_HACER=36, PR_IMPRIMIR=37, PR_SINO=38, PR_NEGATIVO=39, 
		PR_CONCATENAR=40, PR_SEPARADOR_DECIMAL=41, SPACE=42, OTRO=43;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_sentencia_si = 2, RULE_sentencia_mientras = 3, 
		RULE_sentencia_imprimir = 4, RULE_sentencia_sino = 5, RULE_declaracion = 6, 
		RULE_asignacion = 7, RULE_expresion = 8, RULE_expresion_concatenacion = 9, 
		RULE_expresion_logica = 10, RULE_expresion_logica_atomica = 11, RULE_expresion_logico_matematica = 12, 
		RULE_expresion_potencia = 13, RULE_expresion_suma = 14, RULE_expresion_multiplicacion = 15, 
		RULE_expresion_aritmetica_atomica = 16, RULE_variable = 17, RULE_tipo = 18, 
		RULE_valor_numero = 19;
	public static final String[] ruleNames = {
		"programa", "sentencia", "sentencia_si", "sentencia_mientras", "sentencia_imprimir", 
		"sentencia_sino", "declaracion", "asignacion", "expresion", "expresion_concatenacion", 
		"expresion_logica", "expresion_logica_atomica", "expresion_logico_matematica", 
		"expresion_potencia", "expresion_suma", "expresion_multiplicacion", "expresion_aritmetica_atomica", 
		"variable", "tipo", "valor_numero"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'igual'", "'diferente'", "'y'", "'o'", "'no'", "'>'", 
		"'<'", "'>='", "'<='", "'=='", "'potencia'", "','", "'+'", "'-'", "'*'", 
		"'/'", null, null, "'palabra'", "'booleano'", null, null, null, null, 
		"'inicio'", "'fin'", "'crea'", "'como'", "';'", "'es'", "'si'", "'entonces'", 
		"'mientras'", "'hacer'", "'mostrar'", "'sino'", "'menos'", "'con'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "FRASE", "NUMERO", "PALABRA", 
		"BOOLEANO", "LETRA", "DIGITO", "VALOR_BOOLEANO", "PR_POSITIVO", "PR_INICIO", 
		"PR_FIN", "PR_CREA", "PR_DECLARADOR", "PR_FIN_SENTENCIA", "PR_ASIGNADOR", 
		"PR_SI", "PR_ENTONCES", "PR_MIENTRAS", "PR_HACER", "PR_IMPRIMIR", "PR_SINO", 
		"PR_NEGATIVO", "PR_CONCATENAR", "PR_SEPARADOR_DECIMAL", "SPACE", "OTRO"
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
			setState(40);
			match(PR_INICIO);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0)) {
				{
				{
				setState(41);
				sentencia();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(PR_FIN);
			setState(48);
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
			setState(56);
			switch (_input.LA(1)) {
			case PR_CREA:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaracion();
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				asignacion();
				}
				break;
			case PR_SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				sentencia_si();
				}
				break;
			case PR_MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				sentencia_mientras();
				}
				break;
			case PR_IMPRIMIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				sentencia_imprimir();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
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
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
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
			setState(58);
			match(PR_SI);
			setState(59);
			match(T__0);
			setState(60);
			expresion_logica();
			setState(61);
			match(T__1);
			setState(62);
			match(PR_ENTONCES);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				sentencia();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0) );
			setState(69);
			_la = _input.LA(1);
			if (_la==PR_SINO) {
				{
				setState(68);
				sentencia_sino();
				}
			}

			setState(71);
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
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
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
			setState(73);
			match(PR_MIENTRAS);
			setState(74);
			match(T__0);
			setState(75);
			expresion_logica();
			setState(76);
			match(T__1);
			setState(77);
			match(PR_HACER);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				sentencia();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0) );
			setState(83);
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
			setState(85);
			match(PR_IMPRIMIR);
			setState(86);
			match(T__0);
			{
			setState(87);
			expresion();
			}
			setState(88);
			match(T__1);
			setState(89);
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
			setState(91);
			match(PR_SINO);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				sentencia();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0) );
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
			setState(97);
			match(PR_CREA);
			setState(98);
			variable();
			setState(99);
			match(PR_DECLARADOR);
			setState(100);
			tipo();
			setState(101);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
			setState(103);
			variable();
			setState(104);
			match(PR_ASIGNADOR);
			setState(105);
			expresion();
			setState(106);
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
		public Expresion_concatenacionContext expresion_concatenacion() {
			return getRuleContext(Expresion_concatenacionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			expresion_concatenacion();
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

	public static class Expresion_concatenacionContext extends ParserRuleContext {
		public List<Expresion_logicaContext> expresion_logica() {
			return getRuleContexts(Expresion_logicaContext.class);
		}
		public Expresion_logicaContext expresion_logica(int i) {
			return getRuleContext(Expresion_logicaContext.class,i);
		}
		public List<TerminalNode> PR_CONCATENAR() { return getTokens(LITEParser.PR_CONCATENAR); }
		public TerminalNode PR_CONCATENAR(int i) {
			return getToken(LITEParser.PR_CONCATENAR, i);
		}
		public Expresion_concatenacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_concatenacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_concatenacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_concatenacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_concatenacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_concatenacionContext expresion_concatenacion() throws RecognitionException {
		Expresion_concatenacionContext _localctx = new Expresion_concatenacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion_concatenacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			expresion_logica();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_CONCATENAR) {
				{
				{
				setState(111);
				match(PR_CONCATENAR);
				setState(112);
				expresion_logica();
				}
				}
				setState(117);
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

	public static class Expresion_logicaContext extends ParserRuleContext {
		public List<Expresion_logica_atomicaContext> expresion_logica_atomica() {
			return getRuleContexts(Expresion_logica_atomicaContext.class);
		}
		public Expresion_logica_atomicaContext expresion_logica_atomica(int i) {
			return getRuleContext(Expresion_logica_atomicaContext.class,i);
		}
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118);
				match(T__0);
				}
				break;
			}
			setState(121);
			expresion_logica_atomica();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				setState(132);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(122);
					match(T__2);
					setState(123);
					expresion_logica_atomica();
					}
					break;
				case T__3:
					{
					setState(124);
					match(T__3);
					setState(125);
					expresion_logica_atomica();
					}
					break;
				case T__4:
					{
					setState(126);
					match(T__4);
					setState(127);
					expresion_logica_atomica();
					}
					break;
				case T__5:
					{
					setState(128);
					match(T__5);
					setState(129);
					expresion_logica_atomica();
					}
					break;
				case T__6:
					{
					setState(130);
					match(T__6);
					setState(131);
					expresion_logica_atomica();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
				match(T__1);
				}
				break;
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

	public static class Expresion_logica_atomicaContext extends ParserRuleContext {
		public Expresion_logico_matematicaContext expresion_logico_matematica() {
			return getRuleContext(Expresion_logico_matematicaContext.class,0);
		}
		public TerminalNode VALOR_BOOLEANO() { return getToken(LITEParser.VALOR_BOOLEANO, 0); }
		public TerminalNode FRASE() { return getToken(LITEParser.FRASE, 0); }
		public Expresion_logica_atomicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica_atomica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_logica_atomica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_logica_atomica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_logica_atomica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logica_atomicaContext expresion_logica_atomica() throws RecognitionException {
		Expresion_logica_atomicaContext _localctx = new Expresion_logica_atomicaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion_logica_atomica);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case T__0:
			case T__12:
			case LETRA:
			case DIGITO:
			case PR_NEGATIVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				expresion_logico_matematica();
				}
				break;
			case VALOR_BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(VALOR_BOOLEANO);
				}
				break;
			case FRASE:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(FRASE);
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

	public static class Expresion_logico_matematicaContext extends ParserRuleContext {
		public List<Expresion_potenciaContext> expresion_potencia() {
			return getRuleContexts(Expresion_potenciaContext.class);
		}
		public Expresion_potenciaContext expresion_potencia(int i) {
			return getRuleContext(Expresion_potenciaContext.class,i);
		}
		public Expresion_logico_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logico_matematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_logico_matematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_logico_matematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_logico_matematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logico_matematicaContext expresion_logico_matematica() throws RecognitionException {
		Expresion_logico_matematicaContext _localctx = new Expresion_logico_matematicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion_logico_matematica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(145);
				match(T__0);
				}
				break;
			}
			setState(148);
			expresion_potencia();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(159);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(149);
					match(T__7);
					setState(150);
					expresion_potencia();
					}
					break;
				case T__8:
					{
					setState(151);
					match(T__8);
					setState(152);
					expresion_potencia();
					}
					break;
				case T__9:
					{
					setState(153);
					match(T__9);
					setState(154);
					expresion_potencia();
					}
					break;
				case T__10:
					{
					setState(155);
					match(T__10);
					setState(156);
					expresion_potencia();
					}
					break;
				case T__11:
					{
					setState(157);
					match(T__11);
					setState(158);
					expresion_potencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(164);
				match(T__1);
				}
				break;
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

	public static class Expresion_potenciaContext extends ParserRuleContext {
		public List<Expresion_sumaContext> expresion_suma() {
			return getRuleContexts(Expresion_sumaContext.class);
		}
		public Expresion_sumaContext expresion_suma(int i) {
			return getRuleContext(Expresion_sumaContext.class,i);
		}
		public Expresion_potenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_potencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_potencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_potencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_potenciaContext expresion_potencia() throws RecognitionException {
		Expresion_potenciaContext _localctx = new Expresion_potenciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_potencia);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__12);
				setState(168);
				match(T__0);
				setState(169);
				expresion_suma();
				setState(170);
				match(T__13);
				setState(171);
				expresion_suma();
				setState(172);
				match(T__1);
				}
				break;
			case T__0:
			case LETRA:
			case DIGITO:
			case PR_NEGATIVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expresion_suma();
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

	public static class Expresion_sumaContext extends ParserRuleContext {
		public List<Expresion_multiplicacionContext> expresion_multiplicacion() {
			return getRuleContexts(Expresion_multiplicacionContext.class);
		}
		public Expresion_multiplicacionContext expresion_multiplicacion(int i) {
			return getRuleContext(Expresion_multiplicacionContext.class,i);
		}
		public Expresion_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_suma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_suma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_sumaContext expresion_suma() throws RecognitionException {
		Expresion_sumaContext _localctx = new Expresion_sumaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expresion_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expresion_multiplicacion();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				setState(182);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(178);
					match(T__14);
					setState(179);
					expresion_multiplicacion();
					}
					break;
				case T__15:
					{
					setState(180);
					match(T__15);
					setState(181);
					expresion_multiplicacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(186);
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

	public static class Expresion_multiplicacionContext extends ParserRuleContext {
		public List<Expresion_aritmetica_atomicaContext> expresion_aritmetica_atomica() {
			return getRuleContexts(Expresion_aritmetica_atomicaContext.class);
		}
		public Expresion_aritmetica_atomicaContext expresion_aritmetica_atomica(int i) {
			return getRuleContext(Expresion_aritmetica_atomicaContext.class,i);
		}
		public Expresion_multiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_multiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_multiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_multiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_multiplicacionContext expresion_multiplicacion() throws RecognitionException {
		Expresion_multiplicacionContext _localctx = new Expresion_multiplicacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion_multiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			expresion_aritmetica_atomica();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				setState(192);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(188);
					match(T__16);
					setState(189);
					expresion_aritmetica_atomica();
					}
					break;
				case T__17:
					{
					setState(190);
					match(T__17);
					setState(191);
					expresion_aritmetica_atomica();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(196);
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

	public static class Expresion_aritmetica_atomicaContext extends ParserRuleContext {
		public Valor_numeroContext valor_numero() {
			return getRuleContext(Valor_numeroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Expresion_potenciaContext expresion_potencia() {
			return getRuleContext(Expresion_potenciaContext.class,0);
		}
		public Expresion_aritmetica_atomicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aritmetica_atomica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_aritmetica_atomica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_aritmetica_atomica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_aritmetica_atomica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_aritmetica_atomicaContext expresion_aritmetica_atomica() throws RecognitionException {
		Expresion_aritmetica_atomicaContext _localctx = new Expresion_aritmetica_atomicaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion_aritmetica_atomica);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case LETRA:
			case DIGITO:
			case PR_NEGATIVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				switch (_input.LA(1)) {
				case DIGITO:
				case PR_NEGATIVO:
					{
					setState(197);
					valor_numero();
					}
					break;
				case LETRA:
					{
					setState(198);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__0);
				setState(202);
				expresion_potencia();
				setState(203);
				match(T__1);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(LITEParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(LITEParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(LITEParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(LITEParser.DIGITO, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(207);
					match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA || _la==DIGITO) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==LETRA || _la==DIGITO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LITEParser.NUMERO, 0); }
		public TerminalNode PALABRA() { return getToken(LITEParser.PALABRA, 0); }
		public TerminalNode BOOLEANO() { return getToken(LITEParser.BOOLEANO, 0); }
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
		enterRule(_localctx, 36, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << PALABRA) | (1L << BOOLEANO))) != 0)) ) {
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

	public static class Valor_numeroContext extends ParserRuleContext {
		public TerminalNode PR_NEGATIVO() { return getToken(LITEParser.PR_NEGATIVO, 0); }
		public List<TerminalNode> DIGITO() { return getTokens(LITEParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(LITEParser.DIGITO, i);
		}
		public TerminalNode PR_SEPARADOR_DECIMAL() { return getToken(LITEParser.PR_SEPARADOR_DECIMAL, 0); }
		public Valor_numeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterValor_numero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitValor_numero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitValor_numero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_numeroContext valor_numero() throws RecognitionException {
		Valor_numeroContext _localctx = new Valor_numeroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valor_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if (_la==PR_NEGATIVO) {
				{
				setState(220);
				match(PR_NEGATIVO);
				}
			}

			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(DIGITO);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			setState(234);
			_la = _input.LA(1);
			if (_la==PR_SEPARADOR_DECIMAL) {
				{
				{
				setState(228);
				match(PR_SEPARADOR_DECIMAL);
				}
				{
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					match(DIGITO);
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4C\n"+
		"\4\r\4\16\4D\3\4\5\4H\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5R\n\5\r\5"+
		"\16\5S\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\6\7`\n\7\r\7\16\7a\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13t"+
		"\n\13\f\13\16\13w\13\13\3\f\5\fz\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\f\5\f\u008d\n\f\3\r\3\r"+
		"\3\r\5\r\u0092\n\r\3\16\5\16\u0095\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\16"+
		"\5\16\u00a8\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b2\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6\13\21\3\22\3"+
		"\22\5\22\u00ca\n\22\3\22\3\22\3\22\3\22\5\22\u00d0\n\22\3\23\6\23\u00d3"+
		"\n\23\r\23\16\23\u00d4\3\23\7\23\u00d8\n\23\f\23\16\23\u00db\13\23\3\24"+
		"\3\24\3\25\5\25\u00e0\n\25\3\25\6\25\u00e3\n\25\r\25\16\25\u00e4\3\25"+
		"\3\25\6\25\u00e9\n\25\r\25\16\25\u00ea\5\25\u00ed\n\25\3\25\2\2\26\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\31\32\3\2\26\30\u0102"+
		"\2*\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\bK\3\2\2\2\nW\3\2\2\2\f]\3\2\2\2\16"+
		"c\3\2\2\2\20i\3\2\2\2\22n\3\2\2\2\24p\3\2\2\2\26y\3\2\2\2\30\u0091\3\2"+
		"\2\2\32\u0094\3\2\2\2\34\u00b1\3\2\2\2\36\u00b3\3\2\2\2 \u00bd\3\2\2\2"+
		"\"\u00cf\3\2\2\2$\u00d2\3\2\2\2&\u00dc\3\2\2\2(\u00df\3\2\2\2*.\7\35\2"+
		"\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60"+
		".\3\2\2\2\61\62\7\36\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64;\5\16\b\2\65;\5"+
		"\20\t\2\66;\5\6\4\2\67;\5\b\5\28;\5\n\6\29;\7-\2\2:\64\3\2\2\2:\65\3\2"+
		"\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\7#\2\2="+
		">\7\3\2\2>?\5\26\f\2?@\7\4\2\2@B\7$\2\2AC\5\4\3\2BA\3\2\2\2CD\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\f\7\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2"+
		"IJ\7\36\2\2J\7\3\2\2\2KL\7%\2\2LM\7\3\2\2MN\5\26\f\2NO\7\4\2\2OQ\7&\2"+
		"\2PR\5\4\3\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\36"+
		"\2\2V\t\3\2\2\2WX\7\'\2\2XY\7\3\2\2YZ\5\22\n\2Z[\7\4\2\2[\\\7!\2\2\\\13"+
		"\3\2\2\2]_\7(\2\2^`\5\4\3\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r"+
		"\3\2\2\2cd\7\37\2\2de\5$\23\2ef\7 \2\2fg\5&\24\2gh\7!\2\2h\17\3\2\2\2"+
		"ij\5$\23\2jk\7\"\2\2kl\5\22\n\2lm\7!\2\2m\21\3\2\2\2no\5\24\13\2o\23\3"+
		"\2\2\2pu\5\26\f\2qr\7*\2\2rt\5\26\f\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2v\25\3\2\2\2wu\3\2\2\2xz\7\3\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{\u0088\5\30\r\2|}\7\5\2\2}\u0087\5\30\r\2~\177\7\6\2\2\177\u0087\5\30"+
		"\r\2\u0080\u0081\7\7\2\2\u0081\u0087\5\30\r\2\u0082\u0083\7\b\2\2\u0083"+
		"\u0087\5\30\r\2\u0084\u0085\7\t\2\2\u0085\u0087\5\30\r\2\u0086|\3\2\2"+
		"\2\u0086~\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\7\4\2\2\u008c\u008b\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u0092\5\32\16\2\u008f"+
		"\u0092\7\33\2\2\u0090\u0092\7\25\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0090\3\2\2\2\u0092\31\3\2\2\2\u0093\u0095\7\3\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a3\5\34"+
		"\17\2\u0097\u0098\7\n\2\2\u0098\u00a2\5\34\17\2\u0099\u009a\7\13\2\2\u009a"+
		"\u00a2\5\34\17\2\u009b\u009c\7\f\2\2\u009c\u00a2\5\34\17\2\u009d\u009e"+
		"\7\r\2\2\u009e\u00a2\5\34\17\2\u009f\u00a0\7\16\2\2\u00a0\u00a2\5\34\17"+
		"\2\u00a1\u0097\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7\4"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\33\3\2\2\2\u00a9\u00aa"+
		"\7\17\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\7\20\2"+
		"\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\4\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00b2\5\36\20\2\u00b1\u00a9\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\35\3\2"+
		"\2\2\u00b3\u00ba\5 \21\2\u00b4\u00b5\7\21\2\2\u00b5\u00b9\5 \21\2\u00b6"+
		"\u00b7\7\22\2\2\u00b7\u00b9\5 \21\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c4\5\"\22\2\u00be\u00bf\7\23"+
		"\2\2\u00bf\u00c3\5\"\22\2\u00c0\u00c1\7\24\2\2\u00c1\u00c3\5\"\22\2\u00c2"+
		"\u00be\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca"+
		"\5(\25\2\u00c8\u00ca\5$\23\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00d0\3\2\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\5\34\17\2\u00cd\u00ce\7"+
		"\4\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0"+
		"#\3\2\2\2\u00d1\u00d3\7\31\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8"+
		"\t\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da%\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\t\3\2\2"+
		"\u00dd\'\3\2\2\2\u00de\u00e0\7)\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\7\32\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ec\3\2"+
		"\2\2\u00e6\u00e8\7+\2\2\u00e7\u00e9\7\32\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed)\3\2\2\2\37.:DGSau"+
		"y\u0086\u0088\u008c\u0091\u0094\u00a1\u00a3\u00a7\u00b1\u00b8\u00ba\u00c2"+
		"\u00c4\u00c9\u00cf\u00d4\u00d9\u00df\u00e4\u00ea\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}