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
	 * Visit a parse tree produced by {@link LITEParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(LITEParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(LITEParser.SentenciaContext ctx);
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
	 * Visit a parse tree produced by {@link LITEParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LITEParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(LITEParser.Expresion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#expresion_matematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_matematica(LITEParser.Expresion_matematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#expresion_logico_matematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logico_matematica(LITEParser.Expresion_logico_matematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LITEParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(LITEParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LITEParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#valor_numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_numero(LITEParser.Valor_numeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LITEParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(LITEParser.TextoContext ctx);
}