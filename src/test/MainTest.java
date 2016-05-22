package test;


import grammar.LITELexer;
import grammar.LITEParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

/**
 * Created by juanpablo on 21/05/16.
 */
public class MainTest {

    public static void main(String[] args){

        ANTLRInputStream in = new ANTLRInputStream(
                "inicio\n" +
                "crea actual como numero;\n" +
                "crea ant1 como numero;\n" +
                "crea ant2 como numero;\n" +
                "crea  n como numero;\n" +
                "crea i como numero;\n" +
                "\n" +
                "ant1 es 1;\n" +
                "ant2 es 1;\n" +
                "i es 2;\n" +
                "si ( n igual 0 o  n igual 1 )  entonces\n" +
                "    actual es 1;\n" +
                "sino\n" +
                "mientras (i menor_igual n) hacer\n" +
                "actual es ant1 + ant2;\n" +
                "ant2 es ant1;\n" +
                "ant1 es actual;\n" +
                "fin\n" +
                "mostrar(actual);\n" +
                "fin\n" +
                "\n" +
                "fin");

        LITELexer lexer = new LITELexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LITEParser parser = new LITEParser(tokens);
        parser.programa();
    }
}
