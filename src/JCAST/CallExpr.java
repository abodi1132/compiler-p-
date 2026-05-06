package JCAST;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


 // callee(arg1, arg2, …)


public class CallExpr extends Expr {
    public Expr        callee;
    public List<Expr>  args = new ArrayList<>();

    public CallExpr(Expr callee) {
        this.callee = callee;
    }

    @Override
    public String toString() {
        String argStr = args.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return "CallExpr(" + callee + ", [" + argStr + "])";
    }
}
