package ast;

public class NumberLiteral extends Expr {
    public final String raw;
    public NumberLiteral(String r){ this.raw = r; }
    @Override public String toString(){ return raw; }
}