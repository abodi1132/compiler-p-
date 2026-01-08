package JCAST;

public class CssDecl extends Node {
    public String property;
    public String value;
    public CssDecl() {}
    public CssDecl(String p, String v){ this.property = p; this.value = v; }
    @Override
    public String toString(){ return property + ":" + value; }
}
