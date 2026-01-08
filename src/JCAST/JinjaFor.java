package JCAST;

import java.util.*;

public class JinjaFor extends Node {
    public String varName;
    public Expr iterable;
    public final List<Node> body = new ArrayList<>();
    @Override
    public String toString(){ return "JinjaFor(" + varName + " in " + iterable + ")"; }
}