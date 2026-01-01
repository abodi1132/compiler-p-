package src.flaskAst;

public class FlaskBinaryOpExpr extends FlaskExpr {
    public FlaskExpr left;
    public String op;
    public FlaskExpr right;

    @Override
    public String toString() {
        return left.toString() + " " + op + " " + right.toString();
    }
}