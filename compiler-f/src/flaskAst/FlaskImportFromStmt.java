package flaskAst;

import java.util.*;

public class FlaskImportFromStmt extends FlaskStmt {
    public String module;
    public List<String> names = new ArrayList<>();
}