package ast;

public class Attribute extends Node {
    public String name;
    public String value;
    public Attribute() {}
    public Attribute(String n, String v){ this.name = n; this.value = v; }
    @Override
    public String toString(){ return name + (value==null? "":("="+value)); }
}
