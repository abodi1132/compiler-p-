// Generated from C:/compiler/compiler-p-/compiler-f/FlaskParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FlaskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(FlaskParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(FlaskParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(FlaskParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(FlaskParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(FlaskParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(FlaskParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(FlaskParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(FlaskParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(FlaskParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(FlaskParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(FlaskParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(FlaskParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(FlaskParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(FlaskParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(FlaskParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(FlaskParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(FlaskParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FlaskParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(FlaskParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(FlaskParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(FlaskParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(FlaskParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FlaskParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(FlaskParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(FlaskParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(FlaskParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(FlaskParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(FlaskParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FlaskParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(FlaskParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#list_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_comp(FlaskParser.List_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#generator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerator_expression(FlaskParser.Generator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(FlaskParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dict_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_entry(FlaskParser.Dict_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(FlaskParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(FlaskParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(FlaskParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(FlaskParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(FlaskParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(FlaskParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(FlaskParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(FlaskParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(FlaskParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(FlaskParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(FlaskParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(FlaskParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(FlaskParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(FlaskParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(FlaskParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FlaskParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(FlaskParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(FlaskParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(FlaskParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(FlaskParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(FlaskParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(FlaskParser.Try_stmtContext ctx);
}