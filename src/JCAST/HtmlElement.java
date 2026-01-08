package JCAST;
import java.util.*;

public class HtmlElement extends Node {
    public String tagName;
    public final List<Attribute> attributes = new ArrayList<>();
    public final List<Node> children = new ArrayList<>();
    public boolean selfClosing = false;

    @Override
    public String toString() {
        return "HtmlElement(" + tagName + ")";
    }
}