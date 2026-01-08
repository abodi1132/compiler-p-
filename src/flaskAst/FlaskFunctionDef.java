package flaskAst;

import java.util.*;

public class FlaskFunctionDef extends FlaskStmt {
    public String name;
    public List<String> params = new ArrayList<>();
    public List<FlaskDecorator> decorators = new ArrayList<>();
    public List<FlaskStmt> body = new ArrayList<>();
}