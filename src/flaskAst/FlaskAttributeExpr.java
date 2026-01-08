package flaskAst;

public class FlaskAttributeExpr extends FlaskExpr {
    public FlaskExpr object;
    public String attr;

    @Override
    public String toString() {
        return object.toString() + "." + attr;
    }
}