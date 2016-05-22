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
	 * Enter a parse tree produced by the {@code ExpAtomica}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpAtomica(LITEParser.ExpAtomicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpAtomica}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpAtomica(LITEParser.ExpAtomicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMenorIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMenorIgual(LITEParser.ExpMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMenorIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMenorIgual(LITEParser.ExpMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNoIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpNoIgual(LITEParser.ExpNoIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNoIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpNoIgual(LITEParser.ExpNoIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMayor}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMayor(LITEParser.ExpMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMayor}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMayor(LITEParser.ExpMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumeroNegativo}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNumeroNegativo(LITEParser.NumeroNegativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumeroNegativo}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNumeroNegativo(LITEParser.NumeroNegativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMultiplicacion}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMultiplicacion(LITEParser.ExpMultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMultiplicacion}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMultiplicacion(LITEParser.ExpMultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpPotencia}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPotencia(LITEParser.ExpPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpPotencia}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPotencia(LITEParser.ExpPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDivision}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpDivision(LITEParser.ExpDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDivision}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpDivision(LITEParser.ExpDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpO}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpO(LITEParser.ExpOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpO}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpO(LITEParser.ExpOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMenor}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMenor(LITEParser.ExpMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMenor}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMenor(LITEParser.ExpMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpIgual(LITEParser.ExpIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpIgual(LITEParser.ExpIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpSuma}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpSuma(LITEParser.ExpSumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpSuma}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpSuma(LITEParser.ExpSumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpY}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpY(LITEParser.ExpYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpY}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpY(LITEParser.ExpYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpResta}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpResta(LITEParser.ExpRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpResta}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpResta(LITEParser.ExpRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMayorIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpMayorIgual(LITEParser.ExpMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMayorIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpMayorIgual(LITEParser.ExpMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParentesis}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void enterExpParentesis(LITEParser.ExpParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParentesis}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void exitExpParentesis(LITEParser.ExpParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANumero}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void enterANumero(LITEParser.ANumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANumero}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void exitANumero(LITEParser.ANumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ABooleano}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void enterABooleano(LITEParser.ABooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ABooleano}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void exitABooleano(LITEParser.ABooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AVariable}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void enterAVariable(LITEParser.AVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AVariable}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void exitAVariable(LITEParser.AVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATexto}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void enterATexto(LITEParser.ATextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATexto}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 */
	void exitATexto(LITEParser.ATextoContext ctx);
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
}