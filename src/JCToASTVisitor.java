import JCAST.*;
import JCGen.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class JCToASTVisitor extends JCParserBaseVisitor<Node> {

    private static final Set<String> VOID_TAGS = Set.of(
            "br", "img", "input","link", "hr"
    );

    @Override
    public Node visitDocument(JCParser.DocumentContext ctx) {
        Program prog = new Program();
        setLine(prog, ctx);
        for (JCParser.ElementContext ectx : ctx.element()) {
            Node n = visit(ectx);

            if (n != null) prog.children.add(n);
        }
        return prog;
    }

    @Override
    public Node visitElement(JCParser.ElementContext ctx) {
        if (ctx.jinjastatement() != null) return visit(ctx.jinjastatement());
        if (ctx.htmlelements() != null) return visit(ctx.htmlelements());
        if (ctx.cssblock() != null) return visit(ctx.cssblock());
        if (ctx.jinjaexpression() != null) return visit(ctx.jinjaexpression());

        if (!ctx.HTML_TEXT().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (TerminalNode t : ctx.HTML_TEXT()) {
                sb.append(t.getText());
            }
            String text = sb.toString();
            if (!text.trim().isEmpty()) {
                return new HtmlText(text);
            }
        }

        return null;
    }

    @Override
    public Node visitCssblock(JCParser.CssblockContext ctx) {
        CssBlock block = new CssBlock();
        setLine(block, ctx);
        JCParser.CsscontentContext contentCtx = ctx.csscontent();

        if (contentCtx != null) {
            for (ParseTree child : contentCtx.children) {
                if (child instanceof JCParser.CssrulesContext) {
                    CssRule rule = (CssRule) visit(child);
                    if (rule != null) {
                        block.rules.add(rule);
                    }
                }
            }
        }
        return block;
    }

    @Override
    public Node visitCssrules(JCParser.CssrulesContext ctx) {
        CssRule r = new CssRule();
        setLine(r, ctx);
        if (ctx.selector() != null) {
            r.selector = ctx.selector().getText();
        }

        for (ParseTree ch : ctx.children) {
            if (ch instanceof JCParser.CssdeclarationContext) {
                CssDecl d = (CssDecl) visit(ch);
                if (d != null) r.declarations.add(d);
            }
        }
        return r;
    }

    @Override
    public Node visitHtmlelements(JCParser.HtmlelementsContext ctx) {
        if (ctx.TAG_N() == null) return null;


        HtmlElement el = new HtmlElement();
        setLine(el, ctx);
        el.tagName = ctx.TAG_N().getText();

        if (ctx.SRT1() != null) el.selfClosing = true;
        if (VOID_TAGS.contains(el.tagName.toLowerCase())) el.selfClosing = true;

        for (JCParser.AttributesContext a : ctx.attributes()) {
            Attribute attr = (Attribute) visit(a);
            if (attr != null) el.attributes.add(attr);
        }

        if (!el.selfClosing) {
            for (JCParser.ElementContext c : ctx.element()) {
                Node child = visit(c);
                if (child != null) el.children.add(child);
            }
        }

        return el;
    }


    @Override
    public Node visitAttributes(JCParser.AttributesContext ctx) {
        String name = ctx.ATTR_N1().getText();
        String value = ctx.ATTR_V1() != null ? ctx.ATTR_V1().getText() : null;
        Attribute attr = new Attribute(name, value);
        setLine(attr, ctx);
        return attr;
    }

    @Override
    public Node visitCssdeclaration(JCParser.CssdeclarationContext ctx) {
        CssDecl d = new CssDecl();
        setLine(d, ctx);
        d.property = ctx.CSS_PROP().getText();
        d.value = ctx.CSS_VAL().getText().trim();
        return d;
    }

    @Override
    public Node visitJinjastatement(JCParser.JinjastatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public Node visitStatement(JCParser.StatementContext ctx) {
        if (ctx.ifstatement() != null) return visit(ctx.ifstatement());
        if (ctx.forstatement() != null) return visit(ctx.forstatement());
        if (ctx.blockstatement() != null) return visit(ctx.blockstatement());
        if (ctx.macrostatement() != null) return visit(ctx.macrostatement());
        if (ctx.setstatement() != null) return visit(ctx.setstatement());
        if (ctx.extendsstatement() != null) return visit(ctx.extendsstatement());
        if (ctx.includestatement() != null) return visit(ctx.includestatement());
        return null;
    }

    @Override
    public Node visitJinjaexpression(JCParser.JinjaexpressionContext ctx) {
        Expr e = buildExpr(ctx.expression());
        JinjaExpression expr = new JinjaExpression(e);
        setLine(expr, ctx);
        return expr;
    }

    @Override
    public Node visitIfstatement(JCParser.IfstatementContext ctx) {
        JinjaIf node = new JinjaIf();
        setLine(node, ctx);
        if (!ctx.expression().isEmpty()) {
            node.condition = buildExpr(ctx.expression(0));
        }
        for (JCParser.ElementContext ectx : ctx.element()) {
            Node n = visit(ectx);
            if (n != null) node.thenBody.add(n);
        }
        return node;
    }

    @Override
    public Node visitForstatement(JCParser.ForstatementContext ctx) {
        JinjaFor node = new JinjaFor();
        setLine(node, ctx);
        node.varName = ctx.ID().getText();
        node.iterable = buildExpr(ctx.expression());
        for (JCParser.ElementContext ectx : ctx.element()) {
            Node n = visit(ectx);
            if (n != null) node.body.add(n);
        }
        return node;
    }

    @Override
    public Node visitBlockstatement(JCParser.BlockstatementContext ctx) {
        JinjaBlock b = new JinjaBlock();
        setLine(b, ctx);
        b.name = ctx.ID().getText();
        for (JCParser.ElementContext ectx : ctx.element()) {
            Node n = visit(ectx);
            if (n != null) b.body.add(n);
        }
        return b;
    }

    @Override
    public Node visitMacrostatement(JCParser.MacrostatementContext ctx) {
        JinjaMacro m = new JinjaMacro();
        setLine(m, ctx);
        m.name = ctx.ID().getText();
        if (ctx.parameters() != null) {
            for (JCParser.ParameterContext p : ctx.parameters().parameter()) {
                JinjaMacro.Parameter param = new JinjaMacro.Parameter();
                param.name = p.ID().getText();
                if (p.ASSIGN() != null) {
                    param.defaultValue = buildExpr(p.expression());
                }
                m.params.add(param);
            }
        }
        for (JCParser.ElementContext ectx : ctx.element()) {
            Node n = visit(ectx);
            if (n != null) m.body.add(n);
        }
        return m;
    }

    @Override
    public Node visitSetstatement(JCParser.SetstatementContext ctx) {
        JinjaSet s = new JinjaSet();
        setLine(s, ctx);
        s.name = ctx.ID().getText();
        s.value = buildExpr(ctx.expression());
        return s;
    }

    @Override
    public Node visitExtendsstatement(JCParser.ExtendsstatementContext ctx) {
        JinjaExtends ex = new JinjaExtends();
        setLine(ex, ctx);
        ex.target = buildExpr(ctx.expression());
        return ex;
    }

    @Override
    public Node visitIncludestatement(JCParser.IncludestatementContext ctx) {
        JinjaInclude inc = new JinjaInclude();
        setLine(inc, ctx);
        inc.target = buildExpr(ctx.expression());
        return inc;
    }

    private <T extends Node> T setLine(T node, ParserRuleContext ctx) {
        if (ctx != null && ctx.getStart() != null) {
            node.lineNumber = ctx.getStart().getLine();
        }
        return node;
    }

    private Expr buildExpr(JCParser.ExpressionContext ctx) {
        if (ctx == null) return new RawExpr("null");
        if (ctx.primary() != null) {
            JCParser.PrimaryContext p = ctx.primary();
            if (p.ID() != null) return new VariableExpr(p.ID().getText());
            if (p.STRING() != null) {
                String s = p.STRING().getText();
                if ((s.startsWith("\"") && s.endsWith("\"")) || (s.startsWith("'") && s.endsWith("'"))) {
                    s = s.substring(1, s.length()-1);
                }
                return new StringLiteral(s);
            }
            if (p.NUMBER() != null) return new NumberLiteral(p.NUMBER().getText());
            if (p.TRUE() != null) return new BoolLiteral(true);
            if (p.FALSE() != null) return new BoolLiteral(false);
            if (p.NIL() != null) return new NilLiteral();
        }
        return new RawExpr(ctx.getText());
    }
}