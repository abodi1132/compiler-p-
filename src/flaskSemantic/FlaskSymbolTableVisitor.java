package flaskSemantic;

import flaskAst.*;

public class FlaskSymbolTableVisitor {

    private final FlaskSymbolTable table = new FlaskSymbolTable();
    private String currentScope = "global";

    public FlaskSymbolTable visit(FlaskNode node) {

        if (node instanceof FlaskProgram) {
            for (FlaskNode stmt : ((FlaskProgram) node).statements) {
                visit(stmt);
            }
        } else if (node instanceof FlaskAssignStmt) {
            String varName = ((FlaskAssignStmt) node).target;
            table.define(varName, currentScope);

            if (((FlaskAssignStmt) node).value != null)
                visit(((FlaskAssignStmt) node).value);

        } else if (node instanceof FlaskFunctionDef) {
            String oldScope = currentScope;
            currentScope = ((FlaskFunctionDef) node).name;

            // إضافة parameters للدالة
            for (String param : ((FlaskFunctionDef) node).params) {
                table.define(param, currentScope);
            }

            // زيارة جسم الدالة
            for (FlaskStmt stmt : ((FlaskFunctionDef) node).body) {
                visit(stmt);
            }

            currentScope = oldScope;
        } else if (node instanceof FlaskExprStmt) {
            visit(((FlaskExprStmt) node).expr);
        } else if (node instanceof FlaskNameExpr) {
            table.define(((FlaskNameExpr) node).name, currentScope);
        }

        return table;
    }
}
