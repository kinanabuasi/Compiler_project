import antlr.classess.BaseVisitor;
import antlr.classess.prog;
import antlr.lexerproject;
import antlr.parserproject;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class
Main {
    public static void main(String[] args) {

        String fileName=getFileName(args);
        parserproject Parser=getParser(fileName);
        ParseTree AST= Parser.prog();
        prog screen=(prog) new BaseVisitor().visit(AST);
        System.out.println(screen);

    }

    private static parserproject getParser(String fileName)
    {
        parserproject Parser=null;

        try {
            CharStream input= CharStreams.fromFileName(fileName);
            lexerproject lexer=new lexerproject(input);
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            Parser=new parserproject(tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Parser;
    }
    private static String getFileName(String[] list)
    {
        StringBuilder fileName= new StringBuilder();
        for(String e:list)
        {
            fileName.append(e).append(" ");
        }
        fileName.delete(fileName.length()-1,fileName.length());
        return fileName.toString();
    }
}