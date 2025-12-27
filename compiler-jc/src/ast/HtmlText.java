package ast;

public class HtmlText extends Node {
    public String text;

    public HtmlText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HtmlText(\"" + escape(text) + "\")";
    }

    private String escape(String s) {
        if (s == null) return "";
        return s.replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t")
                .replace("\"", "\\\"");
    }
}