package flaskSemantic;

public class FlaskSymbol {
    private final String name;
    private final String scope;

    public FlaskSymbol(String name) {
        this(name, "global");
    }

    public FlaskSymbol(String name, String scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public String getScope() {
        return scope;
    }

    @Override
    public String toString() {
        return scope.equals("global") ? name : scope + "::" + name;
    }
}
