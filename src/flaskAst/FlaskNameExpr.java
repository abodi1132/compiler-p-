package flaskAst;

public class FlaskNameExpr extends FlaskExpr {
    public String name;

    @Override
    public String toString() {
        return name;
    }
}