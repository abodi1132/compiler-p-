package ast;
import java.util.*;

public class CssRule extends Node {
    public String selector;
    public final List<CssDecl> declarations = new ArrayList<>();
    @Override
    public String toString(){ return "CssRule(" + selector + ")"; }
}
