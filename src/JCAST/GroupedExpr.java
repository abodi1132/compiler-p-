package JCAST;

public class GroupedExpr extends Expr {
    public Expr inner;

    public GroupedExpr(Expr inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "GroupedExpr(" + inner + ")";
    }
}
