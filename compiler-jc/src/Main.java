import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import ast.*;
import gen.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = args.length>0 ? args[0] : "compiler-jc/test.jc";
        String source = Files.readString(Path.of(inputFile));

        JCLexer lexer = new JCLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JCParser parser = new JCParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        JCParser.DocumentContext tree = parser.document();

        JCToASTVisitor builder = new JCToASTVisitor();
        Program prog = (Program) builder.visit(tree);

        ASTPrinter printer = new ASTPrinter();
        System.out.println(printer.print(prog));
    }
}