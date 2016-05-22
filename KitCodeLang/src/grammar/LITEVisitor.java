// Generated from /Users/juanpablo/Documents/GIT/KitCode/KitCode/src/grammar/LITE.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LITEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LITEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LITEParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LITEParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(LITEParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#sentencia_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_si(LITEParser.Sentencia_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#sentencia_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_mientras(LITEParser.Sentencia_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#sentencia_imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_imprimir(LITEParser.Sentencia_imprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#sentencia_sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_sino(LITEParser.Sentencia_sinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LITEParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LITEParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpAtomica}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAtomica(LITEParser.ExpAtomicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMenorIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenorIgual(LITEParser.ExpMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNoIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNoIgual(LITEParser.ExpNoIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMayor}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMayor(LITEParser.ExpMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumeroNegativo}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroNegativo(LITEParser.NumeroNegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMultiplicacion}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMultiplicacion(LITEParser.ExpMultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpPotencia}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPotencia(LITEParser.ExpPotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDivision}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDivision(LITEParser.ExpDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpO}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpO(LITEParser.ExpOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMenor}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenor(LITEParser.ExpMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIgual(LITEParser.ExpIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpSuma}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSuma(LITEParser.ExpSumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpY}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpY(LITEParser.ExpYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpResta}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpResta(LITEParser.ExpRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMayorIgual}
	 * labeled alternative in {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMayorIgual(LITEParser.ExpMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParentesis}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParentesis(LITEParser.ExpParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANumero}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANumero(LITEParser.ANumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ABooleano}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitABooleano(LITEParser.ABooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AVariable}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAVariable(LITEParser.AVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATexto}
	 * labeled alternative in {@link LITEParser#expresion_atomica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATexto(LITEParser.ATextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LITEParser.TipoContext ctx);
}