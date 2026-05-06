package JCAST;

 // A binary operation: left OP right

public class BinaryExpr extends Expr {
    public Expr   left;
    public String op;
    public Expr   right;

    public BinaryExpr(Expr left, String op, Expr right) {
        this.left  = left;
        this.op    = op;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryExpr(" + left + ", \"" + op + "\", " + right + ")";
    }
}
