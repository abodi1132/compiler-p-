package JCAST;

public class JinjaSet extends Node {
    public String name;
    public Expr value;
    @Override
    public String toString(){ return "JinjaSet(" + name + ")"; }
}