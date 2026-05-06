import JCAST.*;
import JCGen.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

public class JCToASTVisitor extends JCParserBaseVisitor<Node> {

    private static final Set<String> VOID_TAGS = Set.of(
            "area", "base", "br", "col", "embed", "hr", "img", "input",
            "link", "meta", "param", "source", "track", "wbr"
    );

    // Document

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

    // element alternatives

    @Override public Node visitElementHtml(JCParser.ElementHtmlContext ctx)               { return visit(ctx.htmlelements()); }
    @Override public Node visitElementCss(JCParser.ElementCssContext ctx)                 { return visit(ctx.cssblock()); }
    @Override public Node visitElementJinjaExpr(JCParser.ElementJinjaExprContext ctx)     { return visit(ctx.jinjaexpression()); }
    @Override public Node visitElementJinjaStmt(JCParser.ElementJinjaStmtContext ctx)     { return visit(ctx.jinjastatement()); }
    @Override public Node visitElementJinjaComment(JCParser.ElementJinjaCommentContext ctx){ return null; }
    @Override public Node visitElementHtmlComment(JCParser.ElementHtmlCommentContext ctx)  { return null; }
    @Override public Node visitElementDoctype(JCParser.ElementDoctypeContext ctx)          { return null; }

    @Override
    public Node visitElementText(JCParser.ElementTextContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (TerminalNode t : ctx.HTML_TEXT()) sb.append(t.getText());
        String text = sb.toString();
        if (!text.isBlank()) {
            HtmlText node = new HtmlText(text);
            setLine(node, ctx);
            return node;
        }
        return null;
    }

    // HTML

    @Override
    public Node visitHtmlPaired(JCParser.HtmlPairedContext ctx) {
        HtmlElement el = new HtmlElement();
        setLine(el, ctx);
        el.tagName    = ctx.TAG_N().getText();
        el.selfClosing = false;
        for (JCParser.AttributesContext a : ctx.attributes()) {
            Attribute attr = (Attribute) visit(a);
            if (attr != null) el.attributes.add(attr);
        }
        for (JCParser.ElementContext c : ctx.element()) {
            Node child = visit(c);
            if (child != null) el.children.add(child);
        }
        return el;
    }

    @Override
    public Node visitHtmlSelfClosing(JCParser.HtmlSelfClosingContext ctx) {
        HtmlElement el = new HtmlElement();
        setLine(el, ctx);
        el.tagName     = ctx.TAG_N().getText();
        el.selfClosing = true;
        for (JCParser.AttributesContext a : ctx.attributes()) {
            Attribute attr = (Attribute) visit(a);
            if (attr != null) el.attributes.add(attr);
        }
        return el;
    }

    // Attributes

    @Override
    public Node visitAttrWithValue(JCParser.AttrWithValueContext ctx) {
        String value = ctx.ATTR_V1().getText();
        if (value.length() >= 2) value = value.substring(1, value.length() - 1);
        Attribute attr = new Attribute(ctx.ATTR_N1().getText(), value);
        setLine(attr, ctx);
        return attr;
    }

    @Override
    public Node visitAttrFlag(JCParser.AttrFlagContext ctx) {
        Attribute attr = new Attribute(ctx.ATTR_N1().getText(), null);
        setLine(attr, ctx);
        return attr;
    }

    // CSS

    @Override
    public Node visitCssblock(JCParser.CssblockContext ctx) {
        CssBlock block = new CssBlock();
        setLine(block, ctx);
        if (ctx.csscontent() != null) {
            for (JCParser.CssrulesContext ruleCtx : ctx.csscontent().cssrules()) {
                CssRule rule = (CssRule) visit(ruleCtx);
                if (rule != null) block.rules.add(rule);
            }
        }
        return block;
    }

    @Override
    public Node visitCssrules(JCParser.CssrulesContext ctx) {
        CssRule cssRule = new CssRule();
        setLine(cssRule, ctx);
        cssRule.selector = ctx.selector().getText();
        for (JCParser.CssdeclarationContext d : ctx.cssdeclaration()) {
            CssDecl decl = (CssDecl) visit(d);
            if (decl != null) cssRule.declarations.add(decl);
        }
        return cssRule;
    }

    @Override
    public Node visitCssdeclaration(JCParser.CssdeclarationContext ctx) {
        CssDecl d = new CssDecl();
        setLine(d, ctx);
        JCParser.CssruleContext r = ctx.cssrule();
        d.property = r.getChild(0).getText();
        d.value    = r.getChild(2).getText().trim();
        return d;
    }

    // Jinja wrappers

    @Override
    public Node visitJinjaexpression(JCParser.JinjaexpressionContext ctx) {
        Expr e = buildExpr(ctx.expression());
        JinjaExpression expr = new JinjaExpression(e);
        setLine(expr, ctx);
        return expr;
    }

    @Override
    public Node visitJinjastatement(JCParser.JinjastatementContext ctx) {
        return visit(ctx.statement());
    }

    // statement alternatives

    @Override public Node visitStmtIf(JCParser.StmtIfContext ctx)           { return visit(ctx.ifstatement()); }
    @Override public Node visitStmtFor(JCParser.StmtForContext ctx)         { return visit(ctx.forstatement()); }
    @Override public Node visitStmtBlock(JCParser.StmtBlockContext ctx)     { return visit(ctx.blockstatement()); }
    @Override public Node visitStmtMacro(JCParser.StmtMacroContext ctx)     { return visit(ctx.macrostatement()); }
    @Override public Node visitStmtSet(JCParser.StmtSetContext ctx)         { return visit(ctx.setstatement()); }
    @Override public Node visitStmtExtends(JCParser.StmtExtendsContext ctx) { return visit(ctx.extendsstatement()); }
    @Override public Node visitStmtInclude(JCParser.StmtIncludeContext ctx) { return visit(ctx.includestatement()); }

    // Individual statement visitors

    @Override
    public Node visitIfstatement(JCParser.IfstatementContext ctx) {
        JinjaIf node = new JinjaIf();
        setLine(node, ctx);

        node.condition = buildExpr(ctx.condition);

        for (JCParser.ElementContext ectx : ctx.thenElements) {
            Node n = visit(ectx);
            if (n != null) node.thenBody.add(n);
        }

        if (ctx.elifConditions != null) {
            for (int i = 0; i < ctx.elifConditions.size(); i++) {
                JinjaIf.ElifPart elif = new JinjaIf.ElifPart();
                elif.condition = buildExpr(ctx.elifConditions.get(i));
                node.elifParts.add(elif);
            }

            if (ctx.elifElements != null && node.elifParts.size() == 1) {
                for (JCParser.ElementContext ectx : ctx.elifElements) {
                    Node n = visit(ectx);
                    if (n != null) node.elifParts.get(0).body.add(n);
                }
            }
        }

        if (ctx.elseElements != null) {
            for (JCParser.ElementContext ectx : ctx.elseElements) {
                Node n = visit(ectx);
                if (n != null) node.elseBody.add(n);
            }
        }

        return node;
    }

    @Override
    public Node visitForstatement(JCParser.ForstatementContext ctx) {
        JinjaFor node = new JinjaFor();
        setLine(node, ctx);
        node.varName  = ctx.ID().getText();
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
        s.name  = ctx.ID().getText();
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

    // Expression builder

    private Expr buildExpr(JCParser.ExpressionContext ctx) {
        if (ctx == null) return new RawExpr("null");

        // Binary: OR
        if (ctx instanceof JCParser.ExprOrContext c) {
            return new BinaryExpr(buildExpr(c.left), "or", buildExpr(c.right));
        }

        //  Binary: AND
        if (ctx instanceof JCParser.ExprAndContext c) {
            return new BinaryExpr(buildExpr(c.left), "and", buildExpr(c.right));
        }

        //  Unary: NOT
        if (ctx instanceof JCParser.ExprNotContext c) {
            return new UnaryExpr("not", buildExpr(c.expression()));
        }

        //  Binary: comparison
        if (ctx instanceof JCParser.ExprComparisonContext c) {
            return new BinaryExpr(buildExpr(c.left), c.op.getText(), buildExpr(c.right));
        }

        // Binary: + / -
        if (ctx instanceof JCParser.ExprAddSubContext c) {
            return new BinaryExpr(buildExpr(c.left), c.op.getText(), buildExpr(c.right));
        }

        // Binary: * / / %
        if (ctx instanceof JCParser.ExprMulDivContext c) {
            return new BinaryExpr(buildExpr(c.left), c.op.getText(), buildExpr(c.right));
        }

        //  Unary: + / -
        if (ctx instanceof JCParser.ExprUnaryContext c) {
            return new UnaryExpr(c.unaryOp.getText(), buildExpr(c.expression()));
        }

        // Attribute access: obj.attr
        if (ctx instanceof JCParser.ExprAttributeContext c) {
            return new AttributeExpr(buildExpr(c.expression()), c.ID().getText());
        }

        //  Subscript: obj[index]
        if (ctx instanceof JCParser.ExprSubscriptContext c) {
            return new SubscriptExpr(buildExpr(c.expression(0)), buildExpr(c.expression(1)));
        }

        //  Call: callee(args…)
        if (ctx instanceof JCParser.ExprCallContext c) {
            CallExpr call = new CallExpr(buildExpr(c.expression()));
            if (c.arguments() != null) {
                for (JCParser.ExpressionContext argCtx : c.arguments().expression()) {
                    call.args.add(buildExpr(argCtx));
                }
            }
            return call;
        }

        // Grouped: (expr)
        if (ctx instanceof JCParser.ExprGroupedContext c) {
            return new GroupedExpr(buildExpr(c.expression()));
        }

        //  Primary leaf
        if (ctx instanceof JCParser.ExprPrimaryContext c) {
            return buildPrimary(c.primary());
        }

        // Fallback
        return new RawExpr(ctx.getText());
    }

    private Expr buildPrimary(JCParser.PrimaryContext ctx) {
        if (ctx instanceof JCParser.PrimaryIdContext c) {
            return new VariableExpr(c.ID().getText());
        }
        if (ctx instanceof JCParser.PrimaryStringContext c) {
            String s = c.STRING().getText();
            if (s.length() >= 2) s = s.substring(1, s.length() - 1);
            return new StringLiteral(s);
        }
        if (ctx instanceof JCParser.PrimaryNumberContext c) {
            return new NumberLiteral(c.NUMBER().getText());
        }
        if (ctx instanceof JCParser.PrimaryTrueContext)  return new BoolLiteral(true);
        if (ctx instanceof JCParser.PrimaryFalseContext) return new BoolLiteral(false);
        if (ctx instanceof JCParser.PrimaryNilContext)   return new NilLiteral();
        return new RawExpr(ctx.getText());
    }

    // Helpers

    private <T extends Node> T setLine(T node, ParserRuleContext ctx) {
        if (ctx != null && ctx.getStart() != null) {
            node.lineNumber = ctx.getStart().getLine();
        }
        return node;
    }
}
