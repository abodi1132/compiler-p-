package JCAST;

 // e.g.  -x,  +n,  not flag

public class UnaryExpr extends Expr {
    public String op;
    public Expr   operand;

    public UnaryExpr(String op, Expr operand) {
        this.op      = op;
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "UnaryExpr(\"" + op + "\", " + operand + ")";
    }
}
