package flaskAst;

public class FlaskCallExpr extends FlaskExpr {
    public FlaskExpr func;
    public java.util.List<FlaskExpr> args = new java.util.ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(func.toString()).append("(");
        for (int i = 0; i < args.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(args.get(i).toString());
        }
        sb.append(")");
        return sb.toString();
    }
}