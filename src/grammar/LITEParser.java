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
		FRASE=1, NUMERO=2, PALABRA=3, BOOLEANO=4, LETRA=5, DIGITO=6, VALOR_BOOLEANO=7, 
		PR_INICIO=8, PR_FIN=9, PR_CREA=10, PR_DECLARADOR=11, PR_FIN_SENTENCIA=12, 
		PR_ASIGNADOR=13, PR_SI=14, PR_PARENTESIS_A=15, PR_PARENTESIS_C=16, PR_ENTONCES=17, 
		PR_MIENTRAS=18, PR_HACER=19, PR_IMPRIMIR=20, PR_SINO=21, PR_NEGATIVO=22, 
		OTRO=23, SPACE=24, OPERADOR_MATEMATICO=25, OPERADOR_LOGICO_MATEMATICO=26, 
		OPERADOR_LOGICO=27, PR_SEPARADOR_DECIMAL=28, PR_CONCATENAR=29;
	public static final int
		RULE_programa = 0, RULE_cuerpo = 1, RULE_sentencia = 2, RULE_declaracion = 3, 
		RULE_asignacion = 4, RULE_sentencia_si = 5, RULE_sentencia_mientras = 6, 
		RULE_sentencia_imprimir = 7, RULE_sentencia_sino = 8, RULE_expresion = 9, 
		RULE_expresion_logica = 10, RULE_expresion_matematica = 11, RULE_expresion_logico_matematica = 12, 
		RULE_variable = 13, RULE_valor = 14, RULE_tipo = 15, RULE_valor_numero = 16, 
		RULE_texto = 17;
	public static final String[] ruleNames = {
		"programa", "cuerpo", "sentencia", "declaracion", "asignacion", "sentencia_si", 
		"sentencia_mientras", "sentencia_imprimir", "sentencia_sino", "expresion", 
		"expresion_logica", "expresion_matematica", "expresion_logico_matematica", 
		"variable", "valor", "tipo", "valor_numero", "texto"
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
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			cuerpo();
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

	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode PR_INICIO() { return getToken(LITEParser.PR_INICIO, 0); }
		public TerminalNode PR_FIN() { return getToken(LITEParser.PR_FIN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitCuerpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PR_INICIO);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0)) {
				{
				{
				setState(39);
				sentencia();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case PR_CREA:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				declaracion();
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				asignacion();
				}
				break;
			case PR_SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				sentencia_si();
				}
				break;
			case PR_MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				sentencia_mientras();
				}
				break;
			case PR_IMPRIMIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				sentencia_imprimir();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
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
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PR_CREA);
			setState(56);
			variable();
			setState(57);
			match(PR_DECLARADOR);
			setState(58);
			tipo();
			setState(59);
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
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			variable();
			setState(62);
			match(PR_ASIGNADOR);
			setState(63);
			expresion();
			setState(64);
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

	public static class Sentencia_siContext extends ParserRuleContext {
		public TerminalNode PR_SI() { return getToken(LITEParser.PR_SI, 0); }
		public TerminalNode PR_PARENTESIS_A() { return getToken(LITEParser.PR_PARENTESIS_A, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode PR_PARENTESIS_C() { return getToken(LITEParser.PR_PARENTESIS_C, 0); }
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
		enterRule(_localctx, 10, RULE_sentencia_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PR_SI);
			setState(67);
			match(PR_PARENTESIS_A);
			setState(68);
			expresion_logica();
			setState(69);
			match(PR_PARENTESIS_C);
			setState(70);
			match(PR_ENTONCES);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				sentencia();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << PR_CREA) | (1L << PR_SI) | (1L << PR_MIENTRAS) | (1L << PR_IMPRIMIR) | (1L << OTRO))) != 0) );
			setState(77);
			_la = _input.LA(1);
			if (_la==PR_SINO) {
				{
				setState(76);
				sentencia_sino();
				}
			}

			setState(79);
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
		public TerminalNode PR_PARENTESIS_A() { return getToken(LITEParser.PR_PARENTESIS_A, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode PR_PARENTESIS_C() { return getToken(LITEParser.PR_PARENTESIS_C, 0); }
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
		enterRule(_localctx, 12, RULE_sentencia_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PR_MIENTRAS);
			setState(82);
			match(PR_PARENTESIS_A);
			setState(83);
			expresion_logica();
			setState(84);
			match(PR_PARENTESIS_C);
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
		public TerminalNode PR_PARENTESIS_A() { return getToken(LITEParser.PR_PARENTESIS_A, 0); }
		public TerminalNode PR_PARENTESIS_C() { return getToken(LITEParser.PR_PARENTESIS_C, 0); }
		public TerminalNode PR_FIN_SENTENCIA() { return getToken(LITEParser.PR_FIN_SENTENCIA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_matematicaContext expresion_matematica() {
			return getRuleContext(Expresion_matematicaContext.class,0);
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
		enterRule(_localctx, 14, RULE_sentencia_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PR_IMPRIMIR);
			setState(95);
			match(PR_PARENTESIS_A);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				variable();
				}
				break;
			case 2:
				{
				setState(97);
				valor();
				}
				break;
			case 3:
				{
				setState(98);
				expresion_logica();
				}
				break;
			case 4:
				{
				setState(99);
				expresion_matematica();
				}
				break;
			}
			setState(102);
			match(PR_PARENTESIS_C);
			setState(103);
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
		enterRule(_localctx, 16, RULE_sentencia_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PR_SINO);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				sentencia();
				}
				}
				setState(109); 
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_matematicaContext expresion_matematica() {
			return getRuleContext(Expresion_matematicaContext.class,0);
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
		enterRule(_localctx, 18, RULE_expresion);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				expresion_logica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				expresion_matematica();
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

	public static class Expresion_logicaContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode OPERADOR_LOGICO() { return getToken(LITEParser.OPERADOR_LOGICO, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode PR_PARENTESIS_A() { return getToken(LITEParser.PR_PARENTESIS_A, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_PARENTESIS_C() { return getToken(LITEParser.PR_PARENTESIS_C, 0); }
		public Expresion_logico_matematicaContext expresion_logico_matematica() {
			return getRuleContext(Expresion_logico_matematicaContext.class,0);
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
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				variable();
				setState(116);
				match(OPERADOR_LOGICO);
				setState(117);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				valor();
				setState(120);
				match(OPERADOR_LOGICO);
				setState(121);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				valor();
				setState(124);
				match(OPERADOR_LOGICO);
				setState(125);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				variable();
				setState(128);
				match(OPERADOR_LOGICO);
				setState(129);
				valor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(PR_PARENTESIS_A);
				setState(132);
				expresion();
				setState(133);
				match(OPERADOR_LOGICO);
				setState(134);
				expresion();
				setState(135);
				match(PR_PARENTESIS_C);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				valor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				variable();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				expresion_logico_matematica();
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

	public static class Expresion_matematicaContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode OPERADOR_MATEMATICO() { return getToken(LITEParser.OPERADOR_MATEMATICO, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode PR_PARENTESIS_A() { return getToken(LITEParser.PR_PARENTESIS_A, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PR_PARENTESIS_C() { return getToken(LITEParser.PR_PARENTESIS_C, 0); }
		public Expresion_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_matematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterExpresion_matematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitExpresion_matematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitExpresion_matematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_matematicaContext expresion_matematica() throws RecognitionException {
		Expresion_matematicaContext _localctx = new Expresion_matematicaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion_matematica);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				variable();
				setState(143);
				match(OPERADOR_MATEMATICO);
				setState(144);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				valor();
				setState(147);
				match(OPERADOR_MATEMATICO);
				setState(148);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				valor();
				setState(151);
				match(OPERADOR_MATEMATICO);
				setState(152);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				variable();
				setState(155);
				match(OPERADOR_MATEMATICO);
				setState(156);
				valor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(PR_PARENTESIS_A);
				setState(159);
				expresion();
				setState(160);
				match(OPERADOR_MATEMATICO);
				setState(161);
				expresion();
				setState(162);
				match(PR_PARENTESIS_C);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				valor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				variable();
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

	public static class Expresion_logico_matematicaContext extends ParserRuleContext {
		public List<Expresion_matematicaContext> expresion_matematica() {
			return getRuleContexts(Expresion_matematicaContext.class);
		}
		public Expresion_matematicaContext expresion_matematica(int i) {
			return getRuleContext(Expresion_matematicaContext.class,i);
		}
		public TerminalNode OPERADOR_LOGICO_MATEMATICO() { return getToken(LITEParser.OPERADOR_LOGICO_MATEMATICO, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expresion_matematica();
			setState(169);
			match(OPERADOR_LOGICO_MATEMATICO);
			setState(170);
			expresion_matematica();
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
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(173); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(172);
					match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA || _la==DIGITO) {
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==LETRA || _la==DIGITO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(182);
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

	public static class ValorContext extends ParserRuleContext {
		public Valor_numeroContext valor_numero() {
			return getRuleContext(Valor_numeroContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode VALOR_BOOLEANO() { return getToken(LITEParser.VALOR_BOOLEANO, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case DIGITO:
			case PR_NEGATIVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				valor_numero();
				}
				break;
			case FRASE:
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				texto();
				}
				break;
			case VALOR_BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(VALOR_BOOLEANO);
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
		enterRule(_localctx, 30, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 32, RULE_valor_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if (_la==PR_NEGATIVO) {
				{
				setState(190);
				match(PR_NEGATIVO);
				}
			}

			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(DIGITO);
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			setState(204);
			_la = _input.LA(1);
			if (_la==PR_SEPARADOR_DECIMAL) {
				{
				setState(198);
				match(PR_SEPARADOR_DECIMAL);
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					match(DIGITO);
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
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

	public static class TextoContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PR_CONCATENAR() { return getToken(LITEParser.PR_CONCATENAR, 0); }
		public List<TerminalNode> FRASE() { return getTokens(LITEParser.FRASE); }
		public TerminalNode FRASE(int i) {
			return getToken(LITEParser.FRASE, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LITEListener ) ((LITEListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LITEVisitor ) return ((LITEVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_texto);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				variable();
				setState(207);
				match(PR_CONCATENAR);
				setState(208);
				match(FRASE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(FRASE);
				setState(211);
				match(PR_CONCATENAR);
				setState(212);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(FRASE);
				setState(214);
				match(PR_CONCATENAR);
				setState(215);
				match(FRASE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(FRASE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				variable();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\6\7K\n\7\r\7\16\7L\3\7\5\7P\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tg\n\t\3\t\3\t\3\t\3\n\3\n\6\nn\n\n\r\n\16\no\3\13\3\13\5\13t\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a9\n\r\3\16\3\16\3\16\3\16\3\17\6\17\u00b0\n\17\r\17\16\17\u00b1"+
		"\3\17\7\17\u00b5\n\17\f\17\16\17\u00b8\13\17\3\20\3\20\3\20\5\20\u00bd"+
		"\n\20\3\21\3\21\3\22\5\22\u00c2\n\22\3\22\6\22\u00c5\n\22\r\22\16\22\u00c6"+
		"\3\22\3\22\6\22\u00cb\n\22\r\22\16\22\u00cc\5\22\u00cf\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00dd\n\23\3\23"+
		"\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\7\b\3\2\4\6"+
		"\u00f4\2&\3\2\2\2\4(\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\n?\3\2\2\2\fD\3\2"+
		"\2\2\16S\3\2\2\2\20`\3\2\2\2\22k\3\2\2\2\24s\3\2\2\2\26\u008e\3\2\2\2"+
		"\30\u00a8\3\2\2\2\32\u00aa\3\2\2\2\34\u00af\3\2\2\2\36\u00bc\3\2\2\2 "+
		"\u00be\3\2\2\2\"\u00c1\3\2\2\2$\u00dc\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2("+
		",\7\n\2\2)+\5\6\4\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2"+
		".,\3\2\2\2/\60\7\13\2\2\60\5\3\2\2\2\618\5\b\5\2\628\5\n\6\2\638\5\f\7"+
		"\2\648\5\16\b\2\658\5\20\t\2\668\7\31\2\2\67\61\3\2\2\2\67\62\3\2\2\2"+
		"\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:"+
		"\7\f\2\2:;\5\34\17\2;<\7\r\2\2<=\5 \21\2=>\7\16\2\2>\t\3\2\2\2?@\5\34"+
		"\17\2@A\7\17\2\2AB\5\24\13\2BC\7\16\2\2C\13\3\2\2\2DE\7\20\2\2EF\7\21"+
		"\2\2FG\5\26\f\2GH\7\22\2\2HJ\7\23\2\2IK\5\6\4\2JI\3\2\2\2KL\3\2\2\2LJ"+
		"\3\2\2\2LM\3\2\2\2MO\3\2\2\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2"+
		"QR\7\13\2\2R\r\3\2\2\2ST\7\24\2\2TU\7\21\2\2UV\5\26\f\2VW\7\22\2\2W[\7"+
		"\25\2\2XZ\5\6\4\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"][\3\2\2\2^_\7\13\2\2_\17\3\2\2\2`a\7\26\2\2af\7\21\2\2bg\5\34\17\2cg"+
		"\5\36\20\2dg\5\26\f\2eg\5\30\r\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7\22\2\2ij\7\16\2\2j\21\3\2\2\2km\7\27\2\2ln"+
		"\5\6\4\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qt\5\26\f"+
		"\2rt\5\30\r\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\5\34\17\2vw\7\35\2\2w"+
		"x\5\34\17\2x\u008f\3\2\2\2yz\5\36\20\2z{\7\35\2\2{|\5\36\20\2|\u008f\3"+
		"\2\2\2}~\5\36\20\2~\177\7\35\2\2\177\u0080\5\34\17\2\u0080\u008f\3\2\2"+
		"\2\u0081\u0082\5\34\17\2\u0082\u0083\7\35\2\2\u0083\u0084\5\36\20\2\u0084"+
		"\u008f\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5\24\13\2\u0087\u0088"+
		"\7\35\2\2\u0088\u0089\5\24\13\2\u0089\u008a\7\22\2\2\u008a\u008f\3\2\2"+
		"\2\u008b\u008f\5\36\20\2\u008c\u008f\5\34\17\2\u008d\u008f\5\32\16\2\u008e"+
		"u\3\2\2\2\u008ey\3\2\2\2\u008e}\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u0085"+
		"\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\27\3\2\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7\33\2\2\u0092\u0093\5\34"+
		"\17\2\u0093\u00a9\3\2\2\2\u0094\u0095\5\36\20\2\u0095\u0096\7\33\2\2\u0096"+
		"\u0097\5\36\20\2\u0097\u00a9\3\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a"+
		"\7\33\2\2\u009a\u009b\5\34\17\2\u009b\u00a9\3\2\2\2\u009c\u009d\5\34\17"+
		"\2\u009d\u009e\7\33\2\2\u009e\u009f\5\36\20\2\u009f\u00a9\3\2\2\2\u00a0"+
		"\u00a1\7\21\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4"+
		"\5\24\13\2\u00a4\u00a5\7\22\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a9\5\36\20"+
		"\2\u00a7\u00a9\5\34\17\2\u00a8\u0090\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8"+
		"\u0098\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac"+
		"\7\34\2\2\u00ac\u00ad\5\30\r\2\u00ad\33\3\2\2\2\u00ae\u00b0\7\7\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\35\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\5\"\22\2\u00ba\u00bd\5$\23\2\u00bb"+
		"\u00bd\7\t\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\37\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf!\3\2\2\2\u00c0\u00c2\7"+
		"\30\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c5\7\b\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ce\3\2\2\2\u00c8\u00ca\7\36\2\2\u00c9"+
		"\u00cb\7\b\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf#\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7\37\2"+
		"\2\u00d2\u00d3\7\3\2\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6"+
		"\7\37\2\2\u00d6\u00dd\5\34\17\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\7\37\2"+
		"\2\u00d9\u00dd\7\3\2\2\u00da\u00dd\7\3\2\2\u00db\u00dd\5\34\17\2\u00dc"+
		"\u00d0\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00db\3\2\2\2\u00dd%\3\2\2\2\24,\67LO[fos\u008e\u00a8\u00b1"+
		"\u00b6\u00bc\u00c1\u00c6\u00cc\u00ce\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}