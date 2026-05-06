package flaskAst;

import java.util.ArrayList;
import java.util.List;


public class FlaskIfStmt extends FlaskStmt {
    public FlaskExpr test;

    public List<FlaskStmt> body = new ArrayList<>();

    public List<FlaskIfStmt> elifBranches = new ArrayList<>();

    public List<FlaskStmt> elseBody = new ArrayList<>();
}