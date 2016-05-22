package semantic;

import grammar.LITELexer;
import grammar.LITEParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by juanpablo on 22/05/16.
 */
public class ExecuteLITEProgram {

    public static String execute(String programa){

        ANTLRInputStream in = new ANTLRInputStream(programa
        );
        LITELexer lexer = new LITELexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LITEParser parser = new LITEParser(tokens);
        ParseTree tree = parser.programa();
        EvalVisitor visitor = new EvalVisitor();

        String extra_msgs ="";
        try{
            visitor.visit(tree);
        }catch(Exception e){
            extra_msgs = extra_msgs.concat("ERROR: "+e.getMessage());
        }

        return visitor.getSalida() +extra_msgs;
    }


}
