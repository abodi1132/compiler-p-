package flaskSemantic;

import java.util.*;

public class FlaskSymbolTable {

    private final Map<String, FlaskSymbol> symbols = new LinkedHashMap<>();

    public void define(String name) {
        define(name, "global");
    }

    public void define(String name, String scope) {
        String key = scope + "::" + name; // مفتاح فريد حسب scope
        symbols.put(key, new FlaskSymbol(name, scope));
    }

    public boolean contains(String name) {
        return symbols.containsKey("global::" + name);
    }

    public boolean contains(String name, String scope) {
        return symbols.containsKey(scope + "::" + name);
    }

    public Collection<FlaskSymbol> getAll() {
        return symbols.values();
    }

    public void print() {
        System.out.println("Symbol Table:");
        for (FlaskSymbol s : symbols.values()) {
            System.out.println("- " + s);
        }
    }

    public void removeScope(String scope) {
        symbols.keySet().removeIf(key -> key.startsWith(scope + "::"));
    }

    public FlaskSymbol get(String name, String scope) {
        return symbols.get(scope + "::" + name);
    }
}
