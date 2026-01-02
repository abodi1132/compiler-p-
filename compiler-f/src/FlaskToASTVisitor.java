import flaskAst.*;
import gen.*;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.List;

public class FlaskToASTVisitor extends FlaskParserBaseVisitor<FlaskNode> {

    @Override
    public FlaskNode visitFile_input(FlaskParser.File_inputContext ctx) {
        FlaskProgram p = new FlaskProgram();
        for (var s : ctx.statement()) {
            FlaskNode node = visit(s);
            if (node != null) p.statements.add(node);
        }


        p.statements = universalNormalize(p.statements);

        return p;
    }
    private boolean isEmpty(FlaskExpr expr) {
        return expr == null || expr.toString().trim().isEmpty() || expr.toString().equals("null");
    }

    @Override
    public FlaskNode visitStatement(FlaskParser.StatementContext ctx) {
        if (ctx.compound_stmt() != null) return visit(ctx.compound_stmt());
        if (ctx.simple_stmt() != null) return visit(ctx.simple_stmt());
        return null;
    }

    @Override
    public FlaskNode visitSimple_stmt(FlaskParser.Simple_stmtContext ctx) {
        if (ctx.small_stmt() != null && !ctx.small_stmt().isEmpty()) {
            return visit(ctx.small_stmt(0));
        }
        return null;
    }

    @Override
    public FlaskNode visitSmall_stmt(FlaskParser.Small_stmtContext ctx) {
        if (ctx.expr_stmt() != null) return visit(ctx.expr_stmt());
        if (ctx.return_stmt() != null) return visit(ctx.return_stmt());
        if (ctx.import_stmt() != null) return visit(ctx.import_stmt());
        if (ctx.pass_stmt() != null || ctx.del_stmt() != null ||
                ctx.global_stmt() != null || ctx.nonlocal_stmt() != null) {
            return null;
        }
        return null;
    }

    @Override
    public FlaskNode visitCompound_stmt(FlaskParser.Compound_stmtContext ctx) {
        if (ctx.if_stmt() != null) return visit(ctx.if_stmt());
        if (ctx.funcdef() != null) return visit(ctx.funcdef());
        if (ctx.while_stmt() != null) return visit(ctx.while_stmt());
        if (ctx.for_stmt() != null) return visit(ctx.for_stmt());
        if (ctx.classdef() != null) return visit(ctx.classdef());
        if (ctx.with_stmt() != null) return visit(ctx.with_stmt());
        if (ctx.try_stmt() != null) return visit(ctx.try_stmt());
        return null;
    }

    @Override
    public FlaskNode visitImport_stmt(FlaskParser.Import_stmtContext ctx) {
        if (ctx.FROM() != null) {
            FlaskImportFromStmt i = new FlaskImportFromStmt();
            setLine(i, ctx);
            i.module = ctx.dotted_name().getText();

            if (ctx.import_as_names() != null) {
                ctx.import_as_names().import_as_name()
                        .forEach(n -> i.names.add(n.NAME(0).getText()));
            }
            return i;
        }
        return null;
    }

    @Override
    public FlaskNode visitExpr_stmt(FlaskParser.Expr_stmtContext ctx) {
        if (ctx.testlist_star_expr().size() > 1) {
            FlaskAssignStmt assign = new FlaskAssignStmt();
            setLine(assign, ctx);
            assign.target = ctx.testlist_star_expr(0).getText();
            assign.value = (FlaskExpr) visit(ctx.testlist_star_expr(1));
            return assign;
        }

        FlaskExprStmt e = new FlaskExprStmt();
        setLine(e, ctx);
        e.expr = (FlaskExpr) visit(ctx.testlist_star_expr(0));
        return e;
    }

    @Override
    public FlaskNode visitFor_stmt(FlaskParser.For_stmtContext ctx) {
        FlaskForStmt forStmt = new FlaskForStmt();
        setLine(forStmt, ctx);

        if (ctx.exprlist() != null) {
            String fullExpr = ctx.exprlist().getText();
            int inPos = fullExpr.indexOf("in");
            if (inPos > 0) {
                forStmt.target = fullExpr.substring(0, inPos);
                String iterPart = fullExpr.substring(inPos + 2);

                FlaskLiteralExpr iter = new FlaskLiteralExpr();
                iter.value = iterPart;
                forStmt.iter = iter;
            }
        }
        return forStmt;
    }

    @Override
    public FlaskNode visitFuncdef(FlaskParser.FuncdefContext ctx) {
        FlaskFunctionDef f = new FlaskFunctionDef();
        setLine(f, ctx);
        f.name = ctx.NAME().getText();

        if (ctx.parameters() != null && ctx.parameters().typedargslist() != null) {
            ctx.parameters().typedargslist().tfpdef()
                    .forEach(p -> f.params.add(p.NAME().getText()));
        }

        if (ctx.decorators() != null) {
            ctx.decorators().decorator()
                    .forEach(d -> f.decorators.add((FlaskDecorator) visit(d)));
        }

        if (ctx.stmt_list() != null) {
            for (var s : ctx.stmt_list().statement()) {
                FlaskNode node = visit(s);
                if (node != null && node instanceof FlaskStmt) {
                    f.body.add((FlaskStmt) node);
                }
            }
        }

        normalizeListAssignments(f.body);
        normalizeDictAssignments(f.body);

        return f;
    }

    @Override
    public FlaskNode visitDecorator(FlaskParser.DecoratorContext ctx) {
        FlaskDecorator d = new FlaskDecorator();
        d.name = ctx.dotted_name().getText();
        if (ctx.arglist() != null) {
            d.argument = ctx.arglist().getText();
        }
        return d;
    }

    @Override
    public FlaskNode visitIf_stmt(FlaskParser.If_stmtContext ctx) {
        FlaskIfStmt i = new FlaskIfStmt();
        setLine(i, ctx);
        i.test = (FlaskExpr) visit(ctx.test(0));

        if (ctx.stmt_list(0) != null) {
            for (var s : ctx.stmt_list(0).statement()) {
                FlaskNode node = visit(s);
                if (node != null && node instanceof FlaskStmt) {
                    i.body.add((FlaskStmt) node);
                }
            }
        }
        return i;
    }

    @Override
    public FlaskNode visitReturn_stmt(FlaskParser.Return_stmtContext ctx) {
        FlaskReturnStmt r = new FlaskReturnStmt();
        setLine(r, ctx);
        if (ctx.testlist_star_expr() != null) {
            r.value = (FlaskExpr) visit(ctx.testlist_star_expr());
        }
        return r;
    }

    @Override
    public FlaskNode visitTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx) {
        if (ctx.test() != null && !ctx.test().isEmpty()) {
            return visit(ctx.test(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitTest(FlaskParser.TestContext ctx) {
        if (ctx.or_test() != null && !ctx.or_test().isEmpty()) {
            return visit(ctx.or_test(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitOr_test(FlaskParser.Or_testContext ctx) {
        if (ctx.and_test() != null && !ctx.and_test().isEmpty()) {
            return visit(ctx.and_test(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitAnd_test(FlaskParser.And_testContext ctx) {
        if (ctx.not_test() != null && !ctx.not_test().isEmpty()) {
            return visit(ctx.not_test(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitNot_test(FlaskParser.Not_testContext ctx) {
        if (ctx.not_test() != null) {
            return visit(ctx.not_test());
        }
        if (ctx.comparison() != null) {
            return visit(ctx.comparison());
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitComparison(FlaskParser.ComparisonContext ctx) {
        if (ctx.comp_op() == null || ctx.comp_op().isEmpty()) {
            if (ctx.expr() != null && !ctx.expr().isEmpty()) {
                return visit(ctx.expr(0));
            }
            return createLiteralExpr(ctx.getText());
        }

        FlaskBinaryOpExpr binOp = new FlaskBinaryOpExpr();
        binOp.left = (FlaskExpr) visit(ctx.expr(0));
        binOp.op = ctx.comp_op(0).getText();
        binOp.right = (FlaskExpr) visit(ctx.expr(1));

        return binOp;
    }

    @Override
    public FlaskNode visitExpr(FlaskParser.ExprContext ctx) {
        if (ctx.xor_expr() != null && !ctx.xor_expr().isEmpty()) {
            return visit(ctx.xor_expr(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitXor_expr(FlaskParser.Xor_exprContext ctx) {
        if (ctx.and_expr() != null && !ctx.and_expr().isEmpty()) {
            return visit(ctx.and_expr(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitAnd_expr(FlaskParser.And_exprContext ctx) {
        if (ctx.shift_expr() != null && !ctx.shift_expr().isEmpty()) {
            return visit(ctx.shift_expr(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitShift_expr(FlaskParser.Shift_exprContext ctx) {
        if (ctx.arith_expr() != null && !ctx.arith_expr().isEmpty()) {
            return visit(ctx.arith_expr(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitArith_expr(FlaskParser.Arith_exprContext ctx) {
        if (ctx.term().size() == 1) {
            return visit(ctx.term(0));
        }
        FlaskBinaryOpExpr binOp = new FlaskBinaryOpExpr();
        binOp.left = (FlaskExpr) visit(ctx.term(0));
        if (ctx.PLUS() != null && !ctx.PLUS().isEmpty()) {
            binOp.op = "+";
        } else if (ctx.MINUS() != null && !ctx.MINUS().isEmpty()) {
            binOp.op = "-";
        }
        binOp.right = (FlaskExpr) visit(ctx.term(1));
        return binOp;
    }

    @Override
    public FlaskNode visitTerm(FlaskParser.TermContext ctx) {
        if (ctx.factor() != null && !ctx.factor().isEmpty()) {
            return visit(ctx.factor(0));
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitFactor(FlaskParser.FactorContext ctx) {
        if (ctx.power() != null) {
            return visit(ctx.power());
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitPower(FlaskParser.PowerContext ctx) {
        if (ctx.atom_expr() != null) {
            return visit(ctx.atom_expr());
        }
        return createLiteralExpr(ctx.getText());
    }

    @Override
    public FlaskNode visitAtom_expr(FlaskParser.Atom_exprContext ctx) {
        FlaskExpr current = (FlaskExpr) visit(ctx.atom());
        for (var trailer : ctx.trailer()) {
            current = processTrailer(current, trailer);
        }
        return current;
    }

    @Override
    public FlaskNode visitAtom(FlaskParser.AtomContext ctx) {
        FlaskLiteralExpr l = new FlaskLiteralExpr();
        l.value = ctx.getText();
        return l;
    }

    private FlaskLiteralExpr createLiteralExpr(String text) {
        FlaskLiteralExpr expr = new FlaskLiteralExpr() {
            @Override public String toString() { return value; }
        };
        expr.value = text;
        return expr;
    }
    private FlaskExpr processTrailer(FlaskExpr base, FlaskParser.TrailerContext trailer) {
        if (trailer.LPAR() != null) {
            FlaskCallExpr call = new FlaskCallExpr();
            call.func = base;

            if (trailer.arglist() != null) {
                for (var arg : trailer.arglist().argument()) {
                    FlaskExpr argExpr = (FlaskExpr) visit(arg.test() != null ? arg.test() : arg);
                    if (argExpr != null) {
                        call.args.add(argExpr);
                    }
                }
            }
            return call;
        }

        if (trailer.DOT() != null) {
            FlaskAttributeExpr attr = new FlaskAttributeExpr();
            attr.object = base;
            attr.attr = trailer.NAME().getText();
            return attr;
        }

        if (trailer.LSQB() != null && trailer.test() != null) {
            FlaskSubscriptExpr sub = new FlaskSubscriptExpr();
            sub.object = base;
            sub.index = (FlaskExpr) visit(trailer.test());
            return sub;
        }

        return base;
    }

    private <T extends FlaskNode> T setLine(T node, ParserRuleContext ctx) {
        if (ctx.getStart() != null) node.lineNumber = ctx.getStart().getLine();
        return node;
    }

    private <T extends FlaskNode> void normalizeListAssignments(List<T> body) {
        for (int i = 0; i < body.size(); i++) {
            T node = body.get(i);
            if (node instanceof FlaskAssignStmt assign) {
                String valText = assign.value.toString().trim();

                if ("[".equals(valText)) {
                    StringBuilder listBuilder = new StringBuilder("[");
                    int j = i + 1;

                    while (j < body.size()) {
                        String currentText = body.get(j).toString().trim();

                        if ("]".equals(currentText)) {
                            listBuilder.append("]");
                            j++;
                            break;
                        } else if ("{".equals(currentText)) {
                            listBuilder.append("{");
                        } else if ("}".equals(currentText)) {
                            // Clean trailing comma inside dict
                            if (listBuilder.lastIndexOf(",") == listBuilder.length() - 2) {
                                listBuilder.setLength(listBuilder.length() - 2);
                            }
                            listBuilder.append("}, ");
                        } else {
                            listBuilder.append(currentText);
                            if (j % 2 != i % 2) {
                                listBuilder.append(": ");
                            } else {
                                listBuilder.append(", ");
                            }
                        }
                        j++;
                    }

                    String result = listBuilder.toString().replace(", }", "}").replace(", ]", "]");
                    FlaskLiteralExpr literal = new FlaskLiteralExpr();
                    literal.value = result;
                    assign.value = literal;

                    if (j > i + 1) {
                        body.subList(i + 1, j).clear();
                    }
                }
            }
        }
    }

    private <T extends FlaskNode> void normalizeDictAssignments(List<T> body) {
        for (int i = 0; i < body.size(); i++) {
            if (body.get(i) instanceof FlaskAssignStmt assign &&
                    assign.value instanceof FlaskLiteralExpr &&
                    "{".equals(((FlaskLiteralExpr) assign.value).value)) {

                String target = assign.target;
                StringBuilder dict = new StringBuilder("{");

                int j = i + 1;

                while (j + 1 < body.size()
                        && body.get(j) instanceof FlaskExprStmt key
                        && body.get(j + 1) instanceof FlaskExprStmt value) {

                    dict.append(key.expr.toString())
                            .append(": ")
                            .append(value.expr.toString())
                            .append(", ");
                    j += 2;
                }

                if (dict.length() > 2 && dict.charAt(dict.length() - 2) == ',') {
                    dict.setLength(dict.length() - 2);
                }
                dict.append("}");

                FlaskLiteralExpr literal = new FlaskLiteralExpr();
                literal.value = dict.toString();
                assign.value = literal;

                if (j > i + 1) {
                    body.subList(i + 1, j).clear();
                }
            }
        }
    }
    private <T extends FlaskNode> List<T> universalNormalize(List<T> body) {
        List<T> newBody = new ArrayList<>();
        int i = 0;

        while (i < body.size()) {
            T current = body.get(i);

            if (current instanceof FlaskAssignStmt assign && isEmpty(assign.value)) {
                StringBuilder collector = new StringBuilder("[");
                int j = i + 1;

                while (j < body.size() && (body.get(j) instanceof FlaskExprStmt)) {
                    FlaskExprStmt expr = (FlaskExprStmt) body.get(j);
                    String txt = expr.expr.toString();

                    if (txt.equals("{")) {
                        collector.append("{");
                    } else if (j + 1 < body.size() && body.get(j+1) instanceof FlaskExprStmt) {
                        String key = txt;
                        String val = ((FlaskExprStmt)body.get(j+1)).expr.toString();
                        collector.append(key).append(": ").append(val).append(", ");
                        j++;
                    }
                    j++;

                    if (j < body.size() && body.get(j).toString().equals("{")) {
                        collector.append("}, ");
                    }
                }

                String finalVal = collector.toString().trim();
                if (finalVal.endsWith(",")) finalVal = finalVal.substring(0, finalVal.length()-1);
                assign.value = createLiteralExpr(finalVal + "}]");
                newBody.add((T) assign);
                i = j;
            }
            else if (current instanceof FlaskReturnStmt ret && ret.value != null && ret.value.toString().contains("render_template()")) {
                StringBuilder callBuilder = new StringBuilder("render_template(");
                int j = i + 1;
                while (j < body.size() && !(body.get(j) instanceof FlaskFunctionDef || body.get(j) instanceof FlaskReturnStmt)) {
                    T next = body.get(j);
                    if (next instanceof FlaskExprStmt e) callBuilder.append(e.expr.toString()).append(", ");
                    if (next instanceof FlaskAssignStmt a) callBuilder.append(a.target).append("=").append(a.value.toString()).append(", ");
                    j++;
                }
                String call = callBuilder.toString().trim();
                if (call.endsWith(",")) call = call.substring(0, call.length()-1);
                ret.value = createLiteralExpr(call + ")");
                newBody.add((T) ret);
                i = j;
            }
            else {
                newBody.add(current);
                i++;
            }
        }
        return newBody;
    }
}