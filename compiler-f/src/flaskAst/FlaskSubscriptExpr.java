package flaskAst;

public class FlaskSubscriptExpr extends FlaskExpr {
    public FlaskExpr object;
    public FlaskExpr index;

    @Override
    public String toString() {
        return object.toString() + "[" + index.toString() + "]";
    }
}