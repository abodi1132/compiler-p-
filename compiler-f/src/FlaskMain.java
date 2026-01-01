import org.antlr.v4.runtime.*;
import java.nio.file.*;
import gen.FlaskLexer;
import gen.FlaskParser;
import flaskAst.FlaskProgram;

public class FlaskMain {

    public static void main(String[] args) throws Exception {
        String inputFile = args.length > 0 ? args[0] : "compiler-f/test.py";
        String source = Files.readString(Path.of(inputFile));

        FlaskLexer lexer = new FlaskLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        FlaskParser parser = new FlaskParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        FlaskParser.File_inputContext tree = parser.file_input();

        FlaskToASTVisitor builder = new FlaskToASTVisitor();
        FlaskProgram program = (FlaskProgram) builder.visit(tree);

        FlaskASTPrinter printer = new FlaskASTPrinter();
        printer.print(program);
    }
}