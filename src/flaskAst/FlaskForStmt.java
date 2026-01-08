package flaskAst;

public class FlaskForStmt extends FlaskStmt {
    public String target;
    public FlaskExpr iter;
    public java.util.List<FlaskStmt> body = new java.util.ArrayList<>();
}