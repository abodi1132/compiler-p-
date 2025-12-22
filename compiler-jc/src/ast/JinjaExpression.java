package ast;


public class JinjaExpression extends Node {
    public Expr expr;
    public JinjaExpression(Expr e){ this.expr = e; }
    @Override
    public String toString(){ return "JinjaExpr(" + expr + ")"; }
}