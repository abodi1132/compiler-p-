package ast;

public class JinjaInclude extends Node {
    public Expr target;
    @Override
    public String toString(){ return "JinjaInclude"; }
}