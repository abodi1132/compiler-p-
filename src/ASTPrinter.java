import JCAST.*;

public class ASTPrinter {

    private final StringBuilder sb = new StringBuilder();
    private int indent = 0;
    private int nodeCounter = 0;


    private void nl() { sb.append(System.lineSeparator()); }
    private void write(String s){ sb.append(s); }
    private void ind(){ for (int i=0;i<indent;i++) sb.append("  "); }

    private void header(String name, int line){
        int id = ++nodeCounter;
        write(name + " #" + id + " (" + name + ") [Line: " + line + "]");
    }


    public String print(Program p){
        sb.setLength(0);
        indent = 0;
        nodeCounter = 0;

        header("Program", p.lineNumber); write(" {"); nl();
        indent++; ind(); write("["); nl();
        indent++;

        for (Node n : p.children) {
            ind(); printNode(n); nl();
        }

        indent--; ind(); write("]"); nl();
        indent--; write("}");
        return sb.toString();
    }


    private void printNode(Node n) {
        if (n instanceof HtmlElement) printHtml((HtmlElement)n);
        else if (n instanceof HtmlText) write(n.toString());
        else if (n instanceof CssBlock) printCss((CssBlock)n);
        else if (n instanceof JinjaExpression) write(n.toString());
        else if (n instanceof JinjaIf) printIf((JinjaIf)n);
        else if (n instanceof JinjaFor) printFor((JinjaFor)n);
        else if (n instanceof JinjaBlock) printBlock((JinjaBlock)n);
        else if (n instanceof JinjaMacro) printMacro((JinjaMacro)n);
        else if (n instanceof JinjaSet) write(n.toString());
        else if (n instanceof JinjaInclude) write(n.toString());
        else if (n instanceof JinjaExtends) write(n.toString());
        else write(n.getClass().getSimpleName());
    }


    private void printHtml(HtmlElement h) {
        header("HtmlElement", h.lineNumber); write(" {"); nl();
        indent++;

        ind(); write("<start-tag " + h.tagName + ">"); nl();

        if (!h.attributes.isEmpty()) {
            ind(); write("attrs ["); nl(); indent++;
            for (Attribute a : h.attributes) { ind(); write(a.toString()); nl(); }
            indent--; ind(); write("]"); nl();
        }

        if (!h.children.isEmpty()) {
            ind(); write("children ["); nl(); indent++;
            for (Node c : h.children) { ind(); printNode(c); nl(); }
            indent--; ind(); write("]"); nl();
        }

        ind(); write("</end-tag " + h.tagName + ">"); nl();
        indent--; ind(); write("}");
    }


    private void printCss(CssBlock c) {
        header("CssBlock", c.lineNumber); write(" <style> {"); nl();
        indent++;

        ind(); write("rules ["); nl(); indent++;
        for (CssRule r : c.rules) {
            ind(); header("CssRule",r.lineNumber); write(" { selector = " + r.selector); nl();
            indent++;

            ind(); write("declarations ["); nl(); indent++;
            for (CssDecl d : r.declarations) { ind(); write(d.toString()); nl(); }
            indent--; ind(); write("]"); nl();

            indent--; ind(); write("}"); nl();
        }
        indent--; ind(); write("]"); nl();

        ind(); write("</style>"); nl();
        indent--; ind(); write("}");
    }


    private void printIf(JinjaIf n) {
        header("JinjaIf", n.lineNumber); write(" {"); nl();
        indent++;

        ind(); write("condition { " + escape(n.condition==null?"":n.condition.toString()) + " }"); nl();
        ind(); write("then ["); nl(); indent++;

        for (Node c : n.thenBody){ ind(); printNode(c); nl(); }
        indent--; ind(); write("]"); nl();

        if (!n.elifs.isEmpty()) {
            ind(); write("elifs ["); nl(); indent++;
            for (JinjaIf.ElifPart e : n.elifs) {
                ind(); write("Elif { condition=" +
                        escape(e.condition==null?"":e.condition.toString()) + " }"); nl();
            }
            indent--; ind(); write("]"); nl();
        }

        if (!n.elseBody.isEmpty()) {
            ind(); write("else ["); nl(); indent++;
            for (Node c : n.elseBody){ ind(); printNode(c); nl(); }
            indent--; ind(); write("]"); nl();
        }

        indent--; ind(); write("}");
    }

    private void printFor(JinjaFor f) {
        header("JinjaFor", f.lineNumber);
        write(" { var=" + f.varName +
                " iterable=" + (f.iterable==null ? "null" : f.iterable.toString()) + " }"); nl();

        indent++; ind(); write("body ["); nl(); indent++;
        for (Node n : f.body) { ind(); printNode(n); nl(); }
        indent--; ind(); write("]"); indent--;
    }

    private void printBlock(JinjaBlock b) {
        header("JinjaBlock", b.lineNumber); write(" { name=" + b.name + " }"); nl();
        indent++; ind(); write("body ["); nl(); indent++;
        for (Node n: b.body){ ind(); printNode(n); nl(); }
        indent--; ind(); write("]"); indent--;
    }

    private void printMacro(JinjaMacro m) {
        header("JinjaMacro", m.lineNumber);
        write(" { name=" + m.name + " params=" + m.params.size() + " }"); nl();
        indent++; ind(); write("body ["); nl(); indent++;
        for (Node n: m.body){ ind(); printNode(n); nl(); }
        indent--; ind(); write("]"); indent--;
    }


    private String escape(String s){
        if (s==null) return "";
        return s.replace("\n","\\n").replace("\r","\\r");
    }
}
