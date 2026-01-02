package flaskAst;


public class FlaskLiteralExpr extends FlaskExpr {
    public String value;

    @Override
    public String toString() {
        return value;
    }

}