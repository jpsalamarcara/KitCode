package semantic;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import grammar.LITEBaseVisitor;
import grammar.LITEParser;

/**
 * Created by juanpablo on 22/05/16.
 */
public class EvalVisitor extends LITEBaseVisitor<Value> { // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    @Override
    public Value visitPrograma(LITEParser.ProgramaContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitSentencia(LITEParser.SentenciaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitSentencia_si(LITEParser.Sentencia_siContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitSentencia_mientras(LITEParser.Sentencia_mientrasContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitSentencia_imprimir(LITEParser.Sentencia_imprimirContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitSentencia_sino(LITEParser.Sentencia_sinoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitDeclaracion(LITEParser.DeclaracionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitAsignacion(LITEParser.AsignacionContext ctx) {
        String variable = ctx.VARIABLE().getText();
        Value valor = this.visit(ctx.expresion());
        return memory.put(variable,valor);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */


    @Override public Value visitExpAtomica(LITEParser.ExpAtomicaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpMenorIgual(LITEParser.ExpMenorIgualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpNoIgual(LITEParser.ExpNoIgualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpMayor(LITEParser.ExpMayorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitNumeroNegativo(LITEParser.NumeroNegativoContext ctx) {
        Value valor = this.visit(ctx.expresion());
        return new Value(-valor.asDouble()); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpMultiplicacion(LITEParser.ExpMultiplicacionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpPotencia(LITEParser.ExpPotenciaContext ctx) {
        Value izquierdo = this.visit(ctx.expresion(0));
        Value derecho = this.visit(ctx.expresion(1));
        return new Value(Math.pow(izquierdo.asDouble(),derecho.asDouble())); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpDivision(LITEParser.ExpDivisionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpO(LITEParser.ExpOContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpMenor(LITEParser.ExpMenorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpIgual(LITEParser.ExpIgualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpSuma(LITEParser.ExpSumaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpY(LITEParser.ExpYContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpResta(LITEParser.ExpRestaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpMayorIgual(LITEParser.ExpMayorIgualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitExpParentesis(LITEParser.ExpParentesisContext ctx) {

        return this.visit(ctx.expresion());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitANumero(LITEParser.ANumeroContext ctx) {

        return new Value(Double.valueOf(ctx.getText())); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitABooleano(LITEParser.ABooleanoContext ctx) {

        return new Value(Boolean.valueOf(ctx.getText()));
         }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitAVariable(LITEParser.AVariableContext ctx) {
        String variable = ctx.getText();
        Value valor = memory.get(variable);

        if(valor==null){
            throw new RuntimeException("la variable "+variable+" no está asignada");
        }

        return valor;

         }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitATexto(LITEParser.ATextoContext ctx) {

        String texto = ctx.getText();
        texto = texto.substring(1, texto.length()-1).replace("\"\"","\"");
        Value valor = new Value(texto);
        return valor;

    }



    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Value visitTipo(LITEParser.TipoContext ctx) { return visitChildren(ctx); }

}