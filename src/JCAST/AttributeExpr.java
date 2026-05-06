package JCAST;

 // Attribute access: object.attr

public class AttributeExpr extends Expr {
    public Expr   object;
    public String attr;

    public AttributeExpr(Expr object, String attr) {
        this.object = object;
        this.attr   = attr;
    }

    @Override
    public String toString() {
        return "AttributeExpr(" + object + ", \"" + attr + "\")";
    }
}
