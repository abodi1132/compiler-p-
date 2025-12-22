package ast;
import java.util.*;

public class JinjaBlock extends Node {
    public String name;
    public final List<Node> body = new ArrayList<>();
    @Override
    public String toString(){ return "JinjaBlock(" + name + ")"; }
}