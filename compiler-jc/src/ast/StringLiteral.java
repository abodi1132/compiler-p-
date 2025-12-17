package ast;

public class StringLiteral extends Expr {
    public final String value;
    public StringLiteral(String v){ this.value = v; }
    @Override public String toString(){ return "\"" + value + "\""; }
}