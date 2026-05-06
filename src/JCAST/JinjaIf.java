package JCAST;

import java.util.ArrayList;
import java.util.List;

public class JinjaIf extends Node {

    public Expr condition;

    public List<Node> thenBody = new ArrayList<>();

    public List<ElifPart> elifParts = new ArrayList<>();

    public List<Node> elseBody = new ArrayList<>();

    // Inner class
    public static class ElifPart {
        public Expr condition;

        public List<Node> body = new ArrayList<>();
    }
}
