package JCAST;

import java.util.*;

public class CssBlock extends Node {
    public final List<CssRule> rules = new ArrayList<>();
    @Override
    public String toString(){ return "CssBlock"; }
}