package semantic;
import java.util.*;

public class SymbolTable {
    private final Map<String, Symbol> symbols = new LinkedHashMap<>();

    public void define(String name) {
        symbols.put(name, new Symbol(name));
    }

    public Collection<Symbol> getAll() {
        return symbols.values();
    }

    public boolean contains(String name) {
        return symbols.containsKey(name);
    }
}
