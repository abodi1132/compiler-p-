package JCSemantic;
import JCAST.*;

public class SymbolTableVisitor {

    private final SymbolTable table = new SymbolTable();

    public SymbolTable visit(Node node) {
        if (node instanceof Program) {
            for (Node child : ((Program) node).children) visit(child);
        } else if (node instanceof HtmlElement) {
            for (Node child : ((HtmlElement) node).children) visit(child);
        } else if (node instanceof JinjaSet) {
            table.define(((JinjaSet) node).name);
            if (((JinjaSet) node).value != null) visitExpr(((JinjaSet) node).value);
        } else if (node instanceof JinjaFor) {
            table.define(((JinjaFor) node).varName);
            if (((JinjaFor) node).iterable != null) visitExpr(((JinjaFor) node).iterable);
            for (Node child : ((JinjaFor) node).body) visit(child);
        } else if (node instanceof JinjaIf) {
            JinjaIf ifNode = (JinjaIf) node;

            // main condition
            if (ifNode.condition != null) visitExpr(ifNode.condition);

            // then
            for (Node child : ifNode.thenBody) visit(child);

            // elifs
            for (JinjaIf.ElifPart e : ifNode.elifParts) {
                if (e.condition != null) visitExpr(e.condition);
                for (Node child : e.body) visit(child);
            }

            // else
            for (Node child : ifNode.elseBody) visit(child);
        } else if (node instanceof JinjaBlock) {
            for (Node child : ((JinjaBlock) node).body) visit(child);
        } else if (node instanceof JinjaMacro) {
            for (Node child : ((JinjaMacro) node).body) visit(child);
        }
        return table;
    }

    private void visitExpr(Expr expr) {
        if (expr instanceof VariableExpr) {
            table.define(((VariableExpr) expr).name);
        }
    }
}
