package JCAST;
import java.util.*;

public class JinjaMacro extends Node {
    public String name;
    public final List<Parameter> params = new ArrayList<>();
    public final List<Node> body = new ArrayList<>();

    public static class Parameter {
        public String name;
        public Expr defaultValue; // nullable
    }

    @Override
    public String toString(){ return "JinjaMacro(" + name + ")"; }
}