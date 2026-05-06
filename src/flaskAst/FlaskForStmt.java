package flaskAst;

import java.util.ArrayList;
import java.util.List;

public class FlaskForStmt extends FlaskStmt {
    public String target;
    public FlaskExpr iter;
    public List<FlaskStmt> body = new ArrayList<>();
}