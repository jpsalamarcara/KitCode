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
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				match(T__0);
				}
				break;
			}
			setState(62);
			expresion_logica();
			setState(64);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(63);
				match(T__1);
				}
			}

			setState(66);
			match(PR_ENTONCES);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				sentencia();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0) );
			setState(73);
			_la = _input.LA(1);
			if (_la==PR_SINO) {
				{
				setState(72);
				sentencia_sino();
				}
			}

			setState(75);
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
			setState(77);
			match(PR_MIENTRAS);
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(78);
				match(T__0);
				}
				break;
			}
			setState(81);
			expresion_logica();
			setState(83);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(82);
				match(T__1);
				}
			}

			setState(85);
			match(PR_HACER);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0)) {
				{
				{
				setState(86);
				sentencia();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PR_IMPRIMIR);
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(95);
				match(T__0);
				}
				break;
			}
			setState(99);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << FRASE) | (1L << LETRA) | (1L << DIGITO) | (1L << VALOR_BOOLEANO) | (1L << PR_NEGATIVO))) != 0)) {
				{
				setState(98);
				expresion();
				}
			}

			setState(102);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(101);
				match(T__1);
				}
			}

			setState(104);
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
			setState(106);
			match(PR_SINO);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				sentencia();
				}
				}
				setState(110); 
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
			setState(112);
			match(PR_CREA);
			setState(113);
			variable();
			setState(114);
			match(PR_DECLARADOR);
			setState(115);
			tipo();
			setState(116);
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
			setState(118);
			variable();
			setState(119);
			match(PR_ASIGNADOR);
			setState(120);
			expresion();
			setState(121);
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
			setState(123);
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
			setState(125);
			expresion_logica();
			setState(128);
			_la = _input.LA(1);
			if (_la==PR_CONCATENAR) {
				{
				setState(126);
				match(PR_CONCATENAR);
				setState(127);
				expresion_logica();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(130);
				match(T__0);
				}
				break;
			}
			setState(133);
			expresion_logica_atomica();
			setState(144);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(134);
				match(T__2);
				setState(135);
				expresion_logica_atomica();
				}
				break;
			case T__3:
				{
				setState(136);
				match(T__3);
				setState(137);
				expresion_logica_atomica();
				}
				break;
			case T__4:
				{
				setState(138);
				match(T__4);
				setState(139);
				expresion_logica_atomica();
				}
				break;
			case T__5:
				{
				setState(140);
				match(T__5);
				setState(141);
				expresion_logica_atomica();
				}
				break;
			case T__6:
				{
				setState(142);
				match(T__6);
				setState(143);
				expresion_logica_atomica();
				}
				break;
			case T__1:
			case PR_FIN_SENTENCIA:
			case PR_ENTONCES:
			case PR_HACER:
			case PR_CONCATENAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(146);
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
			setState(152);
			switch (_input.LA(1)) {
			case T__0:
			case T__12:
			case LETRA:
			case DIGITO:
			case PR_NEGATIVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expresion_logico_matematica();
				}
				break;
			case VALOR_BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(VALOR_BOOLEANO);
				}
				break;
			case FRASE:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
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
			setState(155);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(154);
				match(T__0);
				}
			}

			setState(157);
			expresion_potencia();
			setState(168);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(158);
				match(T__7);
				setState(159);
				expresion_potencia();
				}
				break;
			case T__8:
				{
				setState(160);
				match(T__8);
				setState(161);
				expresion_potencia();
				}
				break;
			case T__9:
				{
				setState(162);
				match(T__9);
				setState(163);
				expresion_potencia();
				}
				break;
			case T__10:
				{
				setState(164);
				match(T__10);
				setState(165);
				expresion_potencia();
				}
				break;
			case T__11:
				{
				setState(166);
				match(T__11);
				setState(167);
				expresion_potencia();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case PR_FIN_SENTENCIA:
			case PR_ENTONCES:
			case PR_HACER:
			case PR_CONCATENAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(170);
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
			setState(181);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__12);
				setState(174);
				match(T__0);
				setState(175);
				expresion_suma();
				setState(176);
				match(T__13);
				setState(177);
				expresion_suma();
				setState(178);
				match(T__1);
				}
				break;
			case LETRA:
			case DIGITO:
			case PR_NEGATIVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expresion_multiplicacion();
			setState(188);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(184);
				match(T__14);
				setState(185);
				expresion_multiplicacion();
				}
				break;
			case T__15:
				{
				setState(186);
				match(T__15);
				setState(187);
				expresion_multiplicacion();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case PR_FIN_SENTENCIA:
			case PR_ENTONCES:
			case PR_HACER:
			case PR_CONCATENAR:
				break;
			default:
				throw new NoViableAltException(this);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			expresion_aritmetica_atomica();
			setState(195);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(191);
				match(T__16);
				setState(192);
				expresion_aritmetica_atomica();
				}
				break;
			case T__17:
				{
				setState(193);
				match(T__17);
				setState(194);
				expresion_aritmetica_atomica();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case PR_FIN_SENTENCIA:
			case PR_ENTONCES:
			case PR_HACER:
			case PR_CONCATENAR:
				break;
			default:
				throw new NoViableAltException(this);
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
		public Expresion_potenciaContext expresion_potencia() {
			return getRuleContext(Expresion_potenciaContext.class,0);
		}
		public Valor_numeroContext valor_numero() {
			return getRuleContext(Valor_numeroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			setState(201);
			match(T__0);
			setState(202);
			expresion_potencia();
			setState(203);
			match(T__1);
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
			setState(206); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(205);
					match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA || _la==DIGITO) {
				{
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==LETRA || _la==DIGITO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(215);
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
			setState(216);
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
			setState(219);
			_la = _input.LA(1);
			if (_la==PR_NEGATIVO) {
				{
				setState(218);
				match(PR_NEGATIVO);
				}
			}

			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				match(DIGITO);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			setState(232);
			_la = _input.LA(1);
			if (_la==PR_SEPARADOR_DECIMAL) {
				{
				{
				setState(226);
				match(PR_SEPARADOR_DECIMAL);
				}
				{
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					match(DIGITO);
					}
					}
					setState(230); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\5\4?\n\4\3\4\3\4\5\4C"+
		"\n\4\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\5\4L\n\4\3\4\3\4\3\5\3\5\5\5R\n\5"+
		"\3\5\3\5\5\5V\n\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6\5\6"+
		"c\n\6\3\6\5\6f\n\6\3\6\5\6i\n\6\3\6\3\6\3\7\3\7\6\7o\n\7\r\7\16\7p\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u0083"+
		"\n\13\3\f\5\f\u0086\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0093\n\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\5\r\u009b\n\r\3\16\5\16\u009e"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ab"+
		"\n\16\3\16\5\16\u00ae\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00b8\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00c6\n\21\3\22\3\22\5\22\u00ca\n\22\3\22\3\22\3\22\3\22"+
		"\3\23\6\23\u00d1\n\23\r\23\16\23\u00d2\3\23\7\23\u00d6\n\23\f\23\16\23"+
		"\u00d9\13\23\3\24\3\24\3\25\5\25\u00de\n\25\3\25\6\25\u00e1\n\25\r\25"+
		"\16\25\u00e2\3\25\3\25\6\25\u00e7\n\25\r\25\16\25\u00e8\5\25\u00eb\n\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\31\32"+
		"\3\2\26\30\u0106\2*\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\bO\3\2\2\2\n`\3\2\2"+
		"\2\fl\3\2\2\2\16r\3\2\2\2\20x\3\2\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u009a\3\2\2\2\32\u009d\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3"+
		"\2\2\2 \u00c0\3\2\2\2\"\u00c9\3\2\2\2$\u00d0\3\2\2\2&\u00da\3\2\2\2(\u00dd"+
		"\3\2\2\2*.\7\35\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\36\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64"+
		";\5\16\b\2\65;\5\20\t\2\66;\5\6\4\2\67;\5\b\5\28;\5\n\6\29;\7-\2\2:\64"+
		"\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3"+
		"\2\2\2<>\7#\2\2=?\7\3\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\5\26\f\2AC\7"+
		"\4\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7$\2\2EG\5\4\3\2FE\3\2\2\2GH\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\f\7\2KJ\3\2\2\2KL\3\2\2\2LM\3"+
		"\2\2\2MN\7\36\2\2N\7\3\2\2\2OQ\7%\2\2PR\7\3\2\2QP\3\2\2\2QR\3\2\2\2RS"+
		"\3\2\2\2SU\5\26\f\2TV\7\4\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\7&\2\2X"+
		"Z\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2"+
		"\2^_\7\36\2\2_\t\3\2\2\2`b\7\'\2\2ac\7\3\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2df\5\22\n\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\7\4\2\2hg\3\2\2\2hi\3"+
		"\2\2\2ij\3\2\2\2jk\7!\2\2k\13\3\2\2\2ln\7(\2\2mo\5\4\3\2nm\3\2\2\2op\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rs\7\37\2\2st\5$\23\2tu\7 \2\2uv"+
		"\5&\24\2vw\7!\2\2w\17\3\2\2\2xy\5$\23\2yz\7\"\2\2z{\5\22\n\2{|\7!\2\2"+
		"|\21\3\2\2\2}~\5\24\13\2~\23\3\2\2\2\177\u0082\5\26\f\2\u0080\u0081\7"+
		"*\2\2\u0081\u0083\5\26\f\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\25\3\2\2\2\u0084\u0086\7\3\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0092\5\30\r\2\u0088\u0089\7\5\2\2\u0089"+
		"\u0093\5\30\r\2\u008a\u008b\7\6\2\2\u008b\u0093\5\30\r\2\u008c\u008d\7"+
		"\7\2\2\u008d\u0093\5\30\r\2\u008e\u008f\7\b\2\2\u008f\u0093\5\30\r\2\u0090"+
		"\u0091\7\t\2\2\u0091\u0093\5\30\r\2\u0092\u0088\3\2\2\2\u0092\u008a\3"+
		"\2\2\2\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\7\4\2\2\u0095\u0094\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\27\3\2\2\2\u0097\u009b\5\32\16\2\u0098"+
		"\u009b\7\33\2\2\u0099\u009b\7\25\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u0099\3\2\2\2\u009b\31\3\2\2\2\u009c\u009e\7\3\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00aa\5\34"+
		"\17\2\u00a0\u00a1\7\n\2\2\u00a1\u00ab\5\34\17\2\u00a2\u00a3\7\13\2\2\u00a3"+
		"\u00ab\5\34\17\2\u00a4\u00a5\7\f\2\2\u00a5\u00ab\5\34\17\2\u00a6\u00a7"+
		"\7\r\2\2\u00a7\u00ab\5\34\17\2\u00a8\u00a9\7\16\2\2\u00a9\u00ab\5\34\17"+
		"\2\u00aa\u00a0\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00ae\7\4\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\33\3\2\2"+
		"\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5\36\20\2\u00b2"+
		"\u00b3\7\20\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7\4\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b8\5\36\20\2\u00b7\u00af\3\2\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\35\3\2\2\2\u00b9\u00be\5 \21\2\u00ba\u00bb\7\21\2\2\u00bb\u00bf"+
		"\5 \21\2\u00bc\u00bd\7\22\2\2\u00bd\u00bf\5 \21\2\u00be\u00ba\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c5"+
		"\5\"\22\2\u00c1\u00c2\7\23\2\2\u00c2\u00c6\5\"\22\2\u00c3\u00c4\7\24\2"+
		"\2\u00c4\u00c6\5\"\22\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6!\3\2\2\2\u00c7\u00ca\5(\25\2\u00c8\u00ca\5$\23\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\7\3\2\2\u00cc\u00cd\5\34\17\2\u00cd\u00ce\7\4\2\2\u00ce#\3\2\2\2\u00cf"+
		"\u00d1\7\31\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8%\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\t\3\2\2\u00db\'\3"+
		"\2\2\2\u00dc\u00de\7)\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00e1\7\32\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ea\3\2\2\2\u00e4"+
		"\u00e6\7+\2\2\u00e5\u00e7\7\32\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e4\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb)\3\2\2\2!.:>BHKQU[behp\u0082"+
		"\u0085\u0092\u0095\u009a\u009d\u00aa\u00ad\u00b7\u00be\u00c5\u00c9\u00d2"+
		"\u00d7\u00dd\u00e2\u00e8\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}