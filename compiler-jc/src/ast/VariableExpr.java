package ast;

public class VariableExpr extends Expr {
    public final String name;
    public VariableExpr(String n){ this.name = n; }
    @Override public String toString(){ return name; }
}