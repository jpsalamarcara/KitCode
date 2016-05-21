// Generated from /Users/juanpablo/Documents/GIT/KitCode/KitCode/src/grammar/LITE.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LITEParser}.
 */
public interface LITEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LITEParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LITEParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LITEParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(LITEParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(LITEParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(LITEParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(LITEParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(LITEParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(LITEParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LITEParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LITEParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#sentencia_si}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_si(LITEParser.Sentencia_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#sentencia_si}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_si(LITEParser.Sentencia_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#sentencia_mientras}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_mientras(LITEParser.Sentencia_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#sentencia_mientras}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_mientras(LITEParser.Sentencia_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#sentencia_imprimir}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_imprimir(LITEParser.Sentencia_imprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#sentencia_imprimir}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_imprimir(LITEParser.Sentencia_imprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#sentencia_sino}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_sino(LITEParser.Sentencia_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#sentencia_sino}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_sino(LITEParser.Sentencia_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(LITEParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(LITEParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(LITEParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(LITEParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#expresion_matematica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_matematica(LITEParser.Expresion_matematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#expresion_matematica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_matematica(LITEParser.Expresion_matematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#expresion_logico_matematica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logico_matematica(LITEParser.Expresion_logico_matematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#expresion_logico_matematica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logico_matematica(LITEParser.Expresion_logico_matematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LITEParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LITEParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(LITEParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(LITEParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LITEParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LITEParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#valor_numero}.
	 * @param ctx the parse tree
	 */
	void enterValor_numero(LITEParser.Valor_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#valor_numero}.
	 * @param ctx the parse tree
	 */
	void exitValor_numero(LITEParser.Valor_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LITEParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(LITEParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LITEParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(LITEParser.TextoContext ctx);
}