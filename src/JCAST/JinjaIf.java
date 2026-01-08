package JCAST;
import java.util.*;

public class JinjaIf extends Node {
    public Expr condition;
    public final List<Node> thenBody = new ArrayList<>();
    public final List<ElifPart> elifs = new ArrayList<>();
    public final List<Node> elseBody = new ArrayList<>();

    public static class ElifPart {
        public Expr condition;
        public final List<Node> body = new ArrayList<>();
    }
    @Override
    public String toString(){ return "JinjaIf"; }
}