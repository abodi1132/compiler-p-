package flaskAst;

public class FlaskExprStmt extends FlaskStmt {
    public FlaskExpr expr;
    @Override
    public String toString() {
        return expr.toString();
    }
}