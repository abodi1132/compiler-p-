package JCAST;

 // object[index]

public class SubscriptExpr extends Expr {
    public Expr object;
    public Expr index;

    public SubscriptExpr(Expr object, Expr index) {
        this.object = object;
        this.index  = index;
    }

    @Override
    public String toString() {
        return "SubscriptExpr(" + object + ", " + index + ")";
    }
}
