package ast;

public class HtmlText extends Node {
    public final String text;
    public HtmlText(String t){ this.text = t; }
    @Override
    public String toString() {
        return text.trim();
    }
}