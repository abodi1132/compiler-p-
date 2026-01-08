package JCAST;

public class BoolLiteral extends Expr {
    public final boolean value;
    public BoolLiteral(boolean v){ this.value = v; }
    @Override public String toString(){ return Boolean.toString(value); }
}