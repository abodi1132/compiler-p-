import JCAST.Program;
import org.antlr.v4.runtime.*;
import java.nio.file.*;
import JCGen.*;

import FlaskGen.*;
import flaskAst.FlaskProgram;
import flaskSemantic.FlaskSymbolTable;
import flaskSemantic.FlaskSymbolTableVisitor;

import JCSemantic.SymbolTable;
import JCSemantic.Symbol;
import JCSemantic.SymbolTableVisitor;

public class Main {

    public static void main(String[] args) throws Exception {
        //Flask Section
        String flaskInputFile = args.length > 0 ? args[0] : "flask-test/routes/product_details.py";
        String flaskSource = Files.readString(Path.of(flaskInputFile));

        FlaskLexer flaskLexer = new FlaskLexer(CharStreams.fromString(flaskSource));
        CommonTokenStream flaskTokens = new CommonTokenStream(flaskLexer);
        FlaskParser flaskParser = new FlaskParser(flaskTokens);

        flaskParser.removeErrorListeners();
        flaskParser.addErrorListener(new DiagnosticErrorListener());

        FlaskParser.File_inputContext flaskTree = flaskParser.file_input();

        FlaskToASTVisitor flaskBuilder = new FlaskToASTVisitor();
        FlaskProgram flaskProgram = (FlaskProgram) flaskBuilder.visit(flaskTree);

        FlaskASTPrinter flaskPrinter = new FlaskASTPrinter();
        flaskPrinter.print(flaskProgram);

        FlaskSymbolTableVisitor flaskStv = new FlaskSymbolTableVisitor();
        FlaskSymbolTable flaskTable = flaskStv.visit(flaskProgram);

        flaskTable.print();

        // JC Section
        String jcInputFile = args.length > 1 ? args[1] : "template-jc-products.jc";
        String jcSource = Files.readString(Path.of(jcInputFile));

        JCLexer jcLexer = new JCLexer(CharStreams.fromString(jcSource));
        CommonTokenStream jcTokens = new CommonTokenStream(jcLexer);
        JCParser jcParser = new JCParser(jcTokens);

        jcParser.removeErrorListeners();
        jcParser.addErrorListener(new DiagnosticErrorListener());

        JCParser.DocumentContext jcTree = jcParser.document();

        JCToASTVisitor jcBuilder = new JCToASTVisitor();
        Program jcProg = (Program) jcBuilder.visit(jcTree);

        ASTPrinter jcPrinter = new ASTPrinter();
        System.out.println(jcPrinter.print(jcProg));

        SymbolTableVisitor jcStv = new SymbolTableVisitor();
        SymbolTable jcTable = jcStv.visit(jcProg);

        System.out.println("Defined variables:");
        for (Symbol s : jcTable.getAll()) {
            System.out.println("- " + s.getName());
        }
    }
}
