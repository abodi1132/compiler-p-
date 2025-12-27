import ast.*;
import gen.*;
import org.antlr.v4.runtime.tree.*;

public class JCToASTVisitor extends JCParserBaseVisitor<Node> {

    @Override
    public Node visitDocument(JCParser.DocumentContext ctx) {
        Program prog = new Program();
        for (JCParser.ElementContext ectx : ctx.element()) {
            Node n = visit(ectx);
            if (n != null) prog.children.add(n);
        }
        return prog;
    }

    @Override
    public Node visitElement(JCParser.ElementContext ctx) {
        if (ctx.jinjastatement() != null) {
            return visit(ctx.jinjastatement());
        }

        if (ctx.htmlelements() != null) {
            return visit(ctx.htmlelements());
        }

        if (ctx.cssblock() != null) {
            return visit(ctx.cssblock());
        }

        if (ctx.jinjaexpression() != null) {
            return visit(ctx.jinjaexpression());
        }

        if (ctx.HTML_TEXT() != null) {
            String text = ctx.HTML_TEXT().getText().trim();
            if (!text.isEmpty()) {
                return new HtmlText(text);
            }
        }

        if (ctx.HTML_COMMENT() != null) {
            return null;
        }

        return null;
    }

    @Override
    public Node visitVoidElement(JCParser.VoidElementContext ctx) {
        HtmlElement el = new HtmlElement();
        el.tagName = ctx.VOID_TAG().getText();
        el.selfClosing = true;

        for (JCParser.AttributesContext a : ctx.attributes()) {
            Attribute attr = (Attribute) visit(a);
            if (attr != null) el.attributes.add(attr);
        }

        return el;
    }

    @Override
    public Node visitJinjastatement(JCParser.JinjastatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public Node visitStatement(JCParser.StatementContext ctx) {
        if (ctx.ifstatement() != null) {
            return visit(ctx.ifstatement());
        }
        if (ctx.forstatement() != null) {
            return visit(ctx.forstatement());
        }
        if (ctx.blockstatement() != null) {
            return visit(ctx.blockstatement());
        }
        if (ctx.macrostatement() != null) {
            return visit(ctx.macrostatement());
        }
        if (ctx.setstatement() != null) {
            return visit(ctx.setstatement());
        }
        if (ctx.extendsstatement() != null) {
            return visit(ctx.extendsstatement());
        }
        if (ctx.includestatement() != null) {
            return visit(ctx.includestatement());
        }

        return null;
    }

    @Override
    public Node visitHtmlelements(JCParser.HtmlelementsContext ctx) {
        if (ctx.TAG_N() == null) {
            return null;
        }

        HtmlElement el = new HtmlElement();

        el.tagName = ctx.TAG_N().getText();

        if (ctx.SRT1() != null) {
            el.selfClosing = true;
        }

        for (JCParser.AttributesContext a : ctx.attributes()) {
            Attribute attr = (Attribute) visit(a);
            if (attr != null) el.attributes.add(attr);
        }

        if (ctx.SRT1() == null) {
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

        if (value != null && value.length() >= 2) {
            char first = value.charAt(0);
            char last = value.charAt(value.length() - 1);
            if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
                value = value.substring(1, value.length() - 1);
            }
        }

        return new Attribute(name, value);
    }

    @Override
    public Node visitCssblock(JCParser.CssblockContext ctx) {
        CssBlock block = new CssBlock();
        for (ParseTree ch : ctx.csscontent().children) {
            if (ch instanceof JCParser.CssrulesContext) {
                CssRule rule = (CssRule) visit(ch);
                if (rule != null) block.rules.add(rule);
            }
        }
        return block;
    }

    @Override
    public Node visitCssrules(JCParser.CssrulesContext ctx) {
        CssRule r = new CssRule();

        r.selector = ctx.selector().getText().trim().replaceAll("\\s+", " ");

        for (ParseTree ch : ctx.children) {
            if (ch instanceof JCParser.CssdeclarationContext) {
                CssDecl d = (CssDecl) visit(ch);
                if (d != null) r.declarations.add(d);
            }
        }
        return r;
    }

    @Override
    public Node visitCssdeclaration(JCParser.CssdeclarationContext ctx) {
        CssDecl d = new CssDecl();
        d.property = ctx.CSS_PROP().getText();
        d.value = ctx.CSS_VAL().getText().trim();
        return d;
    }

    @Override
    public Node visitJinjaexpression(JCParser.JinjaexpressionContext ctx) {
        Expr e = buildExpr(ctx.expression());
        return new JinjaExpression(e);
    }

    @Override
    public Node visitIfstatement(JCParser.IfstatementContext ctx) {
        JinjaIf node = new JinjaIf();
        if (!ctx.expression().isEmpty()) {
            node.condition = buildExpr(ctx.expression(0));
        }

        int firstElifOrElse = findFirstElifOrElse(ctx);
        for (int i = 0; i < firstElifOrElse; i++) {
            Node n = visit(ctx.element(i));
            if (n != null) node.thenBody.add(n);
        }

        int elifCount = ctx.J_ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            JinjaIf.ElifPart elif = new JinjaIf.ElifPart();
            elif.condition = buildExpr(ctx.expression(i + 1));
            node.elifs.add(elif);
        }

        return node;
    }

    private int findFirstElifOrElse(JCParser.IfstatementContext ctx) {
        return ctx.element().size();
    }

    @Override
    public Node visitForstatement(JCParser.ForstatementContext ctx) {
        JinjaFor node = new JinjaFor();
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
        s.name = ctx.ID().getText();
        s.value = buildExpr(ctx.expression());
        return s;
    }

    @Override
    public Node visitExtendsstatement(JCParser.ExtendsstatementContext ctx) {
        JinjaExtends ex = new JinjaExtends();
        ex.target = buildExpr(ctx.expression());
        return ex;
    }

    @Override
    public Node visitIncludestatement(JCParser.IncludestatementContext ctx) {
        JinjaInclude inc = new JinjaInclude();
        inc.target = buildExpr(ctx.expression());
        return inc;
    }

    @Override
    public Node visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }


    private Expr buildExpr(JCParser.ExpressionContext ctx) {
        if (ctx == null) return new RawExpr("null");

        if (ctx instanceof JCParser.FilterExprContext) {
            return new RawExpr(ctx.getText());
        }

        if (ctx instanceof JCParser.PrimaryExprContext) {
            JCParser.PrimaryExprContext pctx = (JCParser.PrimaryExprContext) ctx;
            JCParser.PrimaryContext p = pctx.primary();

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