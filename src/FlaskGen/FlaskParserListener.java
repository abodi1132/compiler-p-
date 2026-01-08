// Generated from C:/compiler-project-test/compiler-p-2/FlaskParser.g4 by ANTLR 4.13.2
package FlaskGen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlaskParser}.
 */
public interface FlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FlaskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FlaskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(FlaskParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(FlaskParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(FlaskParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(FlaskParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(FlaskParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(FlaskParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(FlaskParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(FlaskParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(FlaskParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(FlaskParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(FlaskParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(FlaskParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(FlaskParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(FlaskParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(FlaskParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(FlaskParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(FlaskParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(FlaskParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(FlaskParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(FlaskParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(FlaskParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(FlaskParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(FlaskParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(FlaskParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(FlaskParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(FlaskParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(FlaskParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(FlaskParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(FlaskParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(FlaskParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FlaskParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FlaskParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(FlaskParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(FlaskParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FlaskParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FlaskParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(FlaskParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(FlaskParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(FlaskParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(FlaskParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(FlaskParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(FlaskParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(FlaskParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(FlaskParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FlaskParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FlaskParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FlaskParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FlaskParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(FlaskParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(FlaskParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(FlaskParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(FlaskParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(FlaskParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(FlaskParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(FlaskParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(FlaskParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(FlaskParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(FlaskParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FlaskParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FlaskParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#list_comp}.
	 * @param ctx the parse tree
	 */
	void enterList_comp(FlaskParser.List_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#list_comp}.
	 * @param ctx the parse tree
	 */
	void exitList_comp(FlaskParser.List_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#generator_expression}.
	 * @param ctx the parse tree
	 */
	void enterGenerator_expression(FlaskParser.Generator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#generator_expression}.
	 * @param ctx the parse tree
	 */
	void exitGenerator_expression(FlaskParser.Generator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(FlaskParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(FlaskParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void enterDict_entry(FlaskParser.Dict_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dict_entry}.
	 * @param ctx the parse tree
	 */
	void exitDict_entry(FlaskParser.Dict_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(FlaskParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(FlaskParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(FlaskParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(FlaskParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(FlaskParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(FlaskParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(FlaskParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(FlaskParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(FlaskParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(FlaskParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(FlaskParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(FlaskParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(FlaskParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(FlaskParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(FlaskParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(FlaskParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(FlaskParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(FlaskParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(FlaskParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(FlaskParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(FlaskParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(FlaskParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(FlaskParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(FlaskParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(FlaskParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(FlaskParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(FlaskParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(FlaskParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(FlaskParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(FlaskParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FlaskParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FlaskParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(FlaskParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(FlaskParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(FlaskParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(FlaskParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(FlaskParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(FlaskParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(FlaskParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(FlaskParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(FlaskParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(FlaskParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(FlaskParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(FlaskParser.Try_stmtContext ctx);
}