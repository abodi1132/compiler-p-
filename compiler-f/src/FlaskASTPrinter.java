import flaskAst.*;

public class FlaskASTPrinter {

    private int indent = 0;
    private int nodeCounter = 0;

    private void p(String s) {
        System.out.println("  ".repeat(indent) + s);
    }

    public void print(FlaskNode n) {

        if (n instanceof FlaskProgram p) {
            int nodeNum = ++nodeCounter;
            p("Program #" + nodeNum + " (FlaskProgram) [Line: " + p.lineNumber + "][");
            indent++;
            p.statements.forEach(this::print);
            indent--;
            p("]");
        }

        else if (n instanceof FlaskImportFromStmt i) {
            int nodeNum = ++nodeCounter;
            p("ImportFrom #" + nodeNum + " (FlaskImportFromStmt) [Line: " + i.lineNumber + "] (" + i.module + ")[");
            indent++;
            i.names.forEach(name -> p(name));
            indent--;
            p("]");
        }

        else if (n instanceof FlaskAssignStmt a) {
            int nodeNum = ++nodeCounter;
            p("Assign #" + nodeNum + " (FlaskAssignStmt) [Line: " + a.lineNumber + "][");
            indent++;
            p("target: " + a.target);
            p("value: " + (a.value != null ? a.value.toString() : "null"));
            indent--;
            p("]");
        }

        else if (n instanceof FlaskFunctionDef f) {
            int nodeNum = ++nodeCounter;
            p("FunctionDef #" + nodeNum + " (FlaskFunctionDef) [Line: " + f.lineNumber + "] " + f.name + "[");
            indent++;
            f.decorators.forEach(d ->
                    p("Decorator: " + d.name + "(" + d.argument + ")")
            );
            if (!f.params.isEmpty()) {
                p("Args: " + String.join(", ", f.params));
            }
            p("Body[");
            indent++;
            f.body.forEach(this::print);
            indent--;
            p("]");
            indent--;
            p("]");
        }

        else if (n instanceof FlaskForStmt f) {
            int nodeNum = ++nodeCounter;
            p("For #" + nodeNum + " (FlaskForStmt) [Line: " + f.lineNumber + "][");
            indent++;
            p("target: " + f.target);
            p("iter: " + f.iter);
            p("Body[");
            indent++;
            f.body.forEach(this::print);
            indent--;
            p("]");
            indent--;
            p("]");
        }

        else if (n instanceof FlaskIfStmt i) {
            int nodeNum = ++nodeCounter;
            p("If #" + nodeNum + " (FlaskIfStmt) [Line: " + i.lineNumber + "][");
            indent++;
            p("Test: " + i.test);
            p("Body[");
            indent++;
            i.body.forEach(this::print);
            indent--;
            p("]");
            indent--;
            p("]");
        }

        else if (n instanceof FlaskReturnStmt r) {
            int nodeNum = ++nodeCounter;
            p("Return #" + nodeNum + " (FlaskReturnStmt) [Line: " + r.lineNumber + "]: " + r.value);
        }

        else if (n instanceof FlaskExprStmt e) {
            int nodeNum = ++nodeCounter;
            p("Expr #" + nodeNum + " (FlaskExprStmt) [Line: " + e.lineNumber + "]: " + e.expr);
        }
    }
}
