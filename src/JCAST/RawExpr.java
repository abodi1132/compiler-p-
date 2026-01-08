package JCAST;

public class RawExpr extends Expr {
    public final String text;
    public RawExpr(String t){ this.text = t; }
    @Override public String toString(){ return text; }
}