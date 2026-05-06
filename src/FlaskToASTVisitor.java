import flaskAst.*;
import FlaskGen.*;

import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.List;

public class FlaskToASTVisitor extends FlaskParserBaseVisitor<FlaskNode> {


    @Override
    public FlaskNode visitFile_input(FlaskParser.File_inputContext ctx) {
        FlaskProgram p = new FlaskProgram();
        setLine(p, ctx);
        for (var s : ctx.statement()) {
            FlaskNode node = visit(s);
            if (node != null) p.statements.add(node);
        }
        return p;
    }


    // Statement

    @Override
    public FlaskNode visitStmtSimple(FlaskParser.StmtSimpleContext ctx) {
        return visit(ctx.simple_stmt());
    }

    @Override
    public FlaskNode visitStmtCompound(FlaskParser.StmtCompoundContext ctx) {
        return visit(ctx.compound_stmt());
    }

    // Simple statement

    @Override
    public FlaskNode visitSimple_stmt(FlaskParser.Simple_stmtContext ctx) {
        if (!ctx.small_stmt().isEmpty()) {
            return visit(ctx.small_stmt(0));
        }
        return null;
    }

    // small_stmt alternatives

    @Override
    public FlaskNode visitSmallImport(FlaskParser.SmallImportContext ctx) {
        return visit(ctx.import_stmt());
    }

    @Override
    public FlaskNode visitSmallExpr(FlaskParser.SmallExprContext ctx) {
        return visit(ctx.expr_stmt());
    }

    @Override
    public FlaskNode visitSmallReturn(FlaskParser.SmallReturnContext ctx) {
        return visit(ctx.return_stmt());
    }

    @Override
    public FlaskNode visitSmallPass(FlaskParser.SmallPassContext ctx)         { return null; }
    @Override
    public FlaskNode visitSmallDel(FlaskParser.SmallDelContext ctx)           { return null; }
    @Override
    public FlaskNode visitSmallGlobal(FlaskParser.SmallGlobalContext ctx)     { return null; }
    @Override
    public FlaskNode visitSmallNonlocal(FlaskParser.SmallNonlocalContext ctx) { return null; }

    // Import

    @Override
    public FlaskNode visitImportFrom(FlaskParser.ImportFromContext ctx) {
        FlaskImportFromStmt i = new FlaskImportFromStmt();
        setLine(i, ctx);
        i.module = ctx.dotted_name().getText();
        if (ctx.import_as_names() != null) {
            for (var n : ctx.import_as_names().import_as_name()) {
                i.names.add(n.NAME(0).getText());
            }
        }
        return i;
    }

    @Override
    public FlaskNode visitImportRegular(FlaskParser.ImportRegularContext ctx) {
        return null;
    }

    // Expression statement

    @Override
    public FlaskNode visitExprAssign(FlaskParser.ExprAssignContext ctx) {
        FlaskAssignStmt assign = new FlaskAssignStmt();
        setLine(assign, ctx);
        assign.target = ctx.target.getText();
        assign.value  = (FlaskExpr) visit(ctx.value);
        return assign;
    }

    @Override
    public FlaskNode visitExprPlain(FlaskParser.ExprPlainContext ctx) {
        FlaskExprStmt e = new FlaskExprStmt();
        setLine(e, ctx);
        e.expr = (FlaskExpr) visit(ctx.testlist_star_expr());
        return e;
    }


    // Compound statement


    @Override
    public FlaskNode visitCompoundIf(FlaskParser.CompoundIfContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public FlaskNode visitCompoundWhile(FlaskParser.CompoundWhileContext ctx) {
        return visit(ctx.while_stmt());
    }

    @Override
    public FlaskNode visitCompoundFor(FlaskParser.CompoundForContext ctx) {
        return visit(ctx.for_stmt());
    }

    @Override
    public FlaskNode visitCompoundFuncdef(FlaskParser.CompoundFuncdefContext ctx) {
        return visit(ctx.funcdef());
    }

    @Override
    public FlaskNode visitCompoundClass(FlaskParser.CompoundClassContext ctx)  { return null; }
    @Override
    public FlaskNode visitCompoundWith(FlaskParser.CompoundWithContext ctx)    { return null; }
    @Override
    public FlaskNode visitCompoundTry(FlaskParser.CompoundTryContext ctx)      { return null; }

    // if_stmt

    @Override
    public FlaskNode visitIf_stmt(FlaskParser.If_stmtContext ctx) {
        FlaskIfStmt i = new FlaskIfStmt();
        setLine(i, ctx);

        i.test = (FlaskExpr) visit(ctx.test(0));
        i.body = stmtListBody(ctx.stmt_list(0));

        List<FlaskIfStmt> elifChain = new ArrayList<>();
        int elifCount = ctx.ELIF().size();
        for (int idx = 0; idx < elifCount; idx++) {
            FlaskIfStmt elif = new FlaskIfStmt();
            elif.test = (FlaskExpr) visit(ctx.test(idx + 1));
            elif.body = stmtListBody(ctx.stmt_list(idx + 1));
            elifChain.add(elif);
        }
        i.elifBranches = elifChain;

        if (ctx.ELSE() != null) {
            int elseIdx = elifCount + 1;
            i.elseBody = stmtListBody(ctx.stmt_list(elseIdx));
        }

        return i;
    }

    // while_stmt

    @Override
    public FlaskNode visitWhile_stmt(FlaskParser.While_stmtContext ctx) {
        FlaskExprStmt placeholder = new FlaskExprStmt();
        FlaskLiteralExpr cond = new FlaskLiteralExpr();
        cond.value = "while(" + ctx.test().getText() + ")";
        placeholder.expr = cond;
        return placeholder;
    }

    // for_stmt

    @Override
    public FlaskNode visitFor_stmt(FlaskParser.For_stmtContext ctx) {
        FlaskForStmt forStmt = new FlaskForStmt();
        setLine(forStmt, ctx);

        if (ctx.targets != null) {
            forStmt.target = ctx.targets.getText();
        } else if (ctx.loop_vars() != null) {
            forStmt.target = ctx.loop_vars().getText();
        }

        if (ctx.iters != null) {
            forStmt.iter = (FlaskExpr) visit(ctx.iters);
        } else if (ctx.testlist_star_expr() != null) {
            forStmt.iter = (FlaskExpr) visit(ctx.testlist_star_expr());
        }

        FlaskParser.Stmt_listContext bodyCtx = (ctx.body != null) ? ctx.body : ctx.stmt_list();
        forStmt.body = stmtListBody(bodyCtx);

        return forStmt;
    }

    // funcdef

    @Override
    public FlaskNode visitFuncdef(FlaskParser.FuncdefContext ctx) {
        FlaskFunctionDef f = new FlaskFunctionDef();
        setLine(f, ctx);
        f.name = ctx.NAME().getText();

        if (ctx.parameters() != null && ctx.parameters().typedargslist() != null) {
            for (var p : ctx.parameters().typedargslist().tfpdef()) {
                f.params.add(p.NAME().getText());
            }
        }

        if (ctx.decorators() != null) {
            for (var d : ctx.decorators().decorator()) {
                FlaskNode dn = visit(d);
                if (dn instanceof FlaskDecorator) f.decorators.add((FlaskDecorator) dn);
            }
        }

        f.body = stmtListBody(ctx.stmt_list());
        return f;
    }

    @Override
    public FlaskNode visitDecorator(FlaskParser.DecoratorContext ctx) {
        FlaskDecorator d = new FlaskDecorator();
        setLine(d, ctx);
        d.name = ctx.dotted_name().getText();
        if (ctx.arglist() != null) {
            d.argument = ctx.arglist().getText();
        }
        return d;
    }

    // return_stmt

    @Override
    public FlaskNode visitReturn_stmt(FlaskParser.Return_stmtContext ctx) {
        FlaskReturnStmt r = new FlaskReturnStmt();
        setLine(r, ctx);
        if (ctx.testlist_star_expr() != null) {
            r.value = (FlaskExpr) visit(ctx.testlist_star_expr());
        }
        return r;
    }

    // Expression chain

    @Override
    public FlaskNode visitTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx) {
        if (ctx.test().size() == 1) {
            return visit(ctx.test(0));
        }
        // Multiple comma-separated values → treat as tuple literal
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ctx.test().size(); i++) {
            if (i > 0) sb.append(", ");
            FlaskNode n = visit(ctx.test(i));
            sb.append(n != null ? n.toString() : "null");
        }
        sb.append(")");
        return makeLiteral(sb.toString());
    }

    // test  (#TestTernary | #TestSimple)

    @Override
    public FlaskNode visitTestTernary(FlaskParser.TestTernaryContext ctx) {
        FlaskNode body = visit(ctx.body);
        FlaskNode cond = visit(ctx.cond);
        FlaskNode alt  = visit(ctx.alt);
        return makeLiteral(body + " if " + cond + " else " + alt);
    }

    @Override
    public FlaskNode visitTestSimple(FlaskParser.TestSimpleContext ctx) {
        return visit(ctx.or_test());
    }

    // or_test

    @Override
    public FlaskNode visitOr_test(FlaskParser.Or_testContext ctx) {
        if (ctx.and_test().size() == 1) {
            return visit(ctx.and_test(0));
        }
        FlaskExpr result = (FlaskExpr) visit(ctx.and_test(0));
        for (int i = 1; i < ctx.and_test().size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = "or";
            bin.right = (FlaskExpr) visit(ctx.and_test(i));
            result = bin;
        }
        return result;
    }

    // and_test

    @Override
    public FlaskNode visitAnd_test(FlaskParser.And_testContext ctx) {
        if (ctx.not_test().size() == 1) {
            return visit(ctx.not_test(0));
        }
        FlaskExpr result = (FlaskExpr) visit(ctx.not_test(0));
        for (int i = 1; i < ctx.not_test().size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = "and";
            bin.right = (FlaskExpr) visit(ctx.not_test(i));
            result = bin;
        }
        return result;
    }

    //  not_test

    @Override
    public FlaskNode visitNotTestNot(FlaskParser.NotTestNotContext ctx) {
        FlaskExpr operand = (FlaskExpr) visit(ctx.not_test());
        return makeLiteral("not " + operand);
    }

    @Override
    public FlaskNode visitNotTestComp(FlaskParser.NotTestCompContext ctx) {
        return visit(ctx.comparison());
    }

    // comparison

    @Override
    public FlaskNode visitComparison(FlaskParser.ComparisonContext ctx) {
        if (ctx.expr().size() == 1) {
            return visit(ctx.expr(0));
        }
        FlaskExpr result = (FlaskExpr) visit(ctx.expr(0));
        for (int i = 0; i < ctx.comp_op().size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = ctx.comp_op(i).getText();
            bin.right = (FlaskExpr) visit(ctx.expr(i + 1));
            result = bin;
        }
        return result;
    }

    // ── expr / xor_expr / and_expr

    @Override
    public FlaskNode visitExpr(FlaskParser.ExprContext ctx) {
        return buildBinaryChain(ctx.xor_expr(), "|");
    }

    @Override
    public FlaskNode visitXor_expr(FlaskParser.Xor_exprContext ctx) {
        return buildBinaryChain(ctx.and_expr(), "^");
    }

    @Override
    public FlaskNode visitAnd_expr(FlaskParser.And_exprContext ctx) {
        return buildBinaryChain(ctx.shift_expr(), "&");
    }

    @Override
    public FlaskNode visitShift_expr(FlaskParser.Shift_exprContext ctx) {
        if (ctx.arith_expr().size() == 1) return visit(ctx.arith_expr(0));
        FlaskExpr result = (FlaskExpr) visit(ctx.arith_expr(0));
        for (int i = 1; i < ctx.arith_expr().size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = ctx.getChild(2 * i - 1).getText();
            bin.right = (FlaskExpr) visit(ctx.arith_expr(i));
            result = bin;
        }
        return result;
    }

    @Override
    public FlaskNode visitArith_expr(FlaskParser.Arith_exprContext ctx) {
        if (ctx.term().size() == 1) return visit(ctx.term(0));
        FlaskExpr result = (FlaskExpr) visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = ctx.getChild(2 * i - 1).getText();
            bin.right = (FlaskExpr) visit(ctx.term(i));
            result = bin;
        }
        return result;
    }

    @Override
    public FlaskNode visitTerm(FlaskParser.TermContext ctx) {
        if (ctx.factor().size() == 1) return visit(ctx.factor(0));
        FlaskExpr result = (FlaskExpr) visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = ctx.getChild(2 * i - 1).getText();
            bin.right = (FlaskExpr) visit(ctx.factor(i));
            result = bin;
        }
        return result;
    }

    //  factor  (#FactorUnary | #FactorPower)

    @Override
    public FlaskNode visitFactorUnary(FlaskParser.FactorUnaryContext ctx) {
        FlaskExpr operand = (FlaskExpr) visit(ctx.factor());
        return makeLiteral(ctx.op.getText() + operand);
    }

    @Override
    public FlaskNode visitFactorPower(FlaskParser.FactorPowerContext ctx) {
        return visit(ctx.power());
    }

    @Override
    public FlaskNode visitPower(FlaskParser.PowerContext ctx) {
        FlaskExpr base = (FlaskExpr) visit(ctx.atom_expr());
        if (ctx.factor() != null) {
            FlaskBinaryOpExpr pow = new FlaskBinaryOpExpr();
            pow.left  = base;
            pow.op    = "**";
            pow.right = (FlaskExpr) visit(ctx.factor());
            return pow;
        }
        return base;
    }

    // atom_expr

    @Override
    public FlaskNode visitAtom_expr(FlaskParser.Atom_exprContext ctx) {
        FlaskExpr current = (FlaskExpr) visit(ctx.atom());
        for (var trailer : ctx.trailer()) {
            current = processTrailer(current, trailer);
        }
        return current;
    }

    // atom alternatives

    @Override
    public FlaskNode visitAtomName(FlaskParser.AtomNameContext ctx) {
        FlaskNameExpr n = new FlaskNameExpr();
        setLine(n, ctx);
        n.name = ctx.NAME().getText();
        return n;
    }

    @Override
    public FlaskNode visitAtomNumber(FlaskParser.AtomNumberContext ctx) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        setLine(l, ctx);
        l.value = ctx.NUMBER().getText();
        return l;
    }

    @Override
    public FlaskNode visitAtomString(FlaskParser.AtomStringContext ctx) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        setLine(l, ctx);
        String raw = ctx.STRING().getText();
        l.value = raw;
        return l;
    }

    @Override
    public FlaskNode visitAtomTrue(FlaskParser.AtomTrueContext ctx) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        l.value = "True";
        return l;
    }

    @Override
    public FlaskNode visitAtomFalse(FlaskParser.AtomFalseContext ctx) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        l.value = "False";
        return l;
    }

    @Override
    public FlaskNode visitAtomNone(FlaskParser.AtomNoneContext ctx) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        l.value = "None";
        return l;
    }

    @Override
    public FlaskNode visitAtomList(FlaskParser.AtomListContext ctx) {
        StringBuilder sb = new StringBuilder("[");
        if (ctx.testlist_star_expr() != null) {
            boolean first = true;
            for (var test : ctx.testlist_star_expr().test()) {
                if (!first) sb.append(", ");
                FlaskNode n = visit(test);
                sb.append(n != null ? n.toString() : "null");
                first = false;
            }
        }
        sb.append("]");
        return makeLiteral(sb.toString());
    }

    @Override
    public FlaskNode visitAtomDict(FlaskParser.AtomDictContext ctx) {
        StringBuilder sb = new StringBuilder("{");
        if (ctx.dictorsetmaker() != null) {
            boolean first = true;
            for (var entry : ctx.dictorsetmaker().dict_entry()) {
                if (!first) sb.append(", ");
                FlaskNode key = visit(entry.test(0));
                FlaskNode val = visit(entry.test(1));
                sb.append(key).append(": ").append(val);
                first = false;
            }
        }
        sb.append("}");
        return makeLiteral(sb.toString());
    }

    @Override
    public FlaskNode visitAtomTuple(FlaskParser.AtomTupleContext ctx) {
        if (ctx.testlist_star_expr() == null) return makeLiteral("()");
        if (ctx.testlist_star_expr().test().size() == 1) {
            return visit(ctx.testlist_star_expr().test(0));
        }

        StringBuilder sb = new StringBuilder("(");
        boolean first = true;
        for (var t : ctx.testlist_star_expr().test()) {
            if (!first) sb.append(", ");
            FlaskNode n = visit(t);
            sb.append(n != null ? n : "null");
            first = false;
        }
        return makeLiteral(sb.append(")").toString());
    }

    @Override
    public FlaskNode visitAtomListComp(FlaskParser.AtomListCompContext ctx) {
        return makeLiteral("[" + ctx.list_comp().getText() + "]");
    }

    @Override
    public FlaskNode visitAtomGeneratorExpr(FlaskParser.AtomGeneratorExprContext ctx) {
        return makeLiteral("(" + ctx.generator_expression().getText() + ")");
    }

    // Trailer processing

    private FlaskExpr processTrailer(FlaskExpr base, FlaskParser.TrailerContext trailer) {

        if (trailer instanceof FlaskParser.TrailerCallContext callCtx) {
            FlaskCallExpr call = new FlaskCallExpr();
            call.func = base;
            if (callCtx.arglist() != null) {
                for (var arg : callCtx.arglist().argument()) {
                    FlaskExpr argExpr = buildArgument(arg);
                    if (argExpr != null) call.args.add(argExpr);
                }
            }
            return call;
        }

        if (trailer instanceof FlaskParser.TrailerAttrContext attrCtx) {
            FlaskAttributeExpr attr = new FlaskAttributeExpr();
            attr.object = base;
            attr.attr   = attrCtx.NAME().getText();
            return attr;
        }

        if (trailer instanceof FlaskParser.TrailerIndexContext indexCtx) {
            FlaskSubscriptExpr sub = new FlaskSubscriptExpr();
            sub.object = base;
            sub.index  = (FlaskExpr) visit(indexCtx.test());
            return sub;
        }

        if (trailer instanceof FlaskParser.TrailerSubscriptListContext slCtx) {
            // Slice / multi-subscript — represent as a raw literal
            FlaskSubscriptExpr sub = new FlaskSubscriptExpr();
            sub.object = base;
            sub.index  = makeLiteral(slCtx.subscriptlist().getText());
            return sub;
        }

        return base;
    }

    // argument

    private FlaskExpr buildArgument(FlaskParser.ArgumentContext arg) {
        if (arg instanceof FlaskParser.ArgKeywordContext kw) {

            FlaskBinaryOpExpr kwExpr = new FlaskBinaryOpExpr();
            kwExpr.left  = makeLiteral(kw.NAME().getText());
            kwExpr.op    = "=";
            kwExpr.right = (FlaskExpr) visit(kw.test());
            return kwExpr;
        }
        if (arg instanceof FlaskParser.ArgPositionalContext pos) {
            return (FlaskExpr) visit(pos.test());
        }
        if (arg instanceof FlaskParser.ArgStarContext star) {
            return makeLiteral("*" + visit(star.test()));
        }
        if (arg instanceof FlaskParser.ArgDoubleStarContext ds) {
            return makeLiteral("**" + visit(ds.test()));
        }
        return null;
    }

    // Helpers

    /** Walk a stmt_list and collect all non-null FlaskStmt children. */
    private List<FlaskStmt> stmtListBody(FlaskParser.Stmt_listContext ctx) {
        List<FlaskStmt> result = new ArrayList<>();
        if (ctx == null) return result;
        for (var s : ctx.statement()) {
            FlaskNode node = visit(s);
            if (node instanceof FlaskStmt stmt) result.add(stmt);
        }
        return result;
    }

    /** Build a left-associative binary chain where all operators are the same. */
    private <T extends ParserRuleContext> FlaskExpr buildBinaryChain(List<T> operands, String op) {
        if (operands.size() == 1) return (FlaskExpr) visit(operands.get(0));
        FlaskExpr result = (FlaskExpr) visit(operands.get(0));
        for (int i = 1; i < operands.size(); i++) {
            FlaskBinaryOpExpr bin = new FlaskBinaryOpExpr();
            bin.left  = result;
            bin.op    = op;
            bin.right = (FlaskExpr) visit(operands.get(i));
            result = bin;
        }
        return result;
    }

    private FlaskExpr safeVisitExpr(ParserRuleContext ctx) {
        if (ctx == null) return makeLiteral("null");
        FlaskNode result = visit(ctx);
        return (result instanceof FlaskExpr e) ? e : makeLiteral(ctx.getText());
    }

    private FlaskLiteralExpr makeLiteral(String text) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        l.value = text;
        return l;
    }

    private <T extends FlaskNode> T setLine(T node, ParserRuleContext ctx) {
        if (ctx.getStart() != null) node.lineNumber = ctx.getStart().getLine();
        return node;
    }
}