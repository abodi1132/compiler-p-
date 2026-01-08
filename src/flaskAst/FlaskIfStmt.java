package flaskAst;

import java.util.*;

public class FlaskIfStmt extends FlaskStmt {
    public FlaskExpr test;
    public List<FlaskStmt> body = new ArrayList<>();
}