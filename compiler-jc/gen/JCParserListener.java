// Generated from C:/Users/karam 2/Documents/compiler-p-/compiler-jc/JCParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JCParser}.
 */
public interface JCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JCParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(JCParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(JCParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(JCParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(JCParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#htmlelements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlelements(JCParser.HtmlelementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#htmlelements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlelements(JCParser.HtmlelementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(JCParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(JCParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#voidElement}.
	 * @param ctx the parse tree
	 */
	void enterVoidElement(JCParser.VoidElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#voidElement}.
	 * @param ctx the parse tree
	 */
	void exitVoidElement(JCParser.VoidElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#cssblock}.
	 * @param ctx the parse tree
	 */
	void enterCssblock(JCParser.CssblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#cssblock}.
	 * @param ctx the parse tree
	 */
	void exitCssblock(JCParser.CssblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#csscontent}.
	 * @param ctx the parse tree
	 */
	void enterCsscontent(JCParser.CsscontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#csscontent}.
	 * @param ctx the parse tree
	 */
	void exitCsscontent(JCParser.CsscontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#cssrules}.
	 * @param ctx the parse tree
	 */
	void enterCssrules(JCParser.CssrulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#cssrules}.
	 * @param ctx the parse tree
	 */
	void exitCssrules(JCParser.CssrulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(JCParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(JCParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#cssdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssdeclaration(JCParser.CssdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#cssdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssdeclaration(JCParser.CssdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#csscomment}.
	 * @param ctx the parse tree
	 */
	void enterCsscomment(JCParser.CsscommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#csscomment}.
	 * @param ctx the parse tree
	 */
	void exitCsscomment(JCParser.CsscommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#jinjaexpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaexpression(JCParser.JinjaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#jinjaexpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaexpression(JCParser.JinjaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#jinjastatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjastatement(JCParser.JinjastatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#jinjastatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjastatement(JCParser.JinjastatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#jinjacomment}.
	 * @param ctx the parse tree
	 */
	void enterJinjacomment(JCParser.JinjacommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#jinjacomment}.
	 * @param ctx the parse tree
	 */
	void exitJinjacomment(JCParser.JinjacommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JCParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JCParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(JCParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(JCParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(JCParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(JCParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JCParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JCParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(JCParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(JCParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(JCParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(JCParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFilterExpr(JCParser.FilterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFilterExpr(JCParser.FilterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(JCParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(JCParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(JCParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(JCParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(JCParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(JCParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(JCParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(JCParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(JCParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(JCParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(JCParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(JCParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JCParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JCParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JCParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JCParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(JCParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(JCParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(JCParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(JCParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#blockstatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockstatement(JCParser.BlockstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#blockstatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockstatement(JCParser.BlockstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#macrostatement}.
	 * @param ctx the parse tree
	 */
	void enterMacrostatement(JCParser.MacrostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#macrostatement}.
	 * @param ctx the parse tree
	 */
	void exitMacrostatement(JCParser.MacrostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JCParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JCParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JCParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JCParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#setstatement}.
	 * @param ctx the parse tree
	 */
	void enterSetstatement(JCParser.SetstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#setstatement}.
	 * @param ctx the parse tree
	 */
	void exitSetstatement(JCParser.SetstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#extendsstatement}.
	 * @param ctx the parse tree
	 */
	void enterExtendsstatement(JCParser.ExtendsstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#extendsstatement}.
	 * @param ctx the parse tree
	 */
	void exitExtendsstatement(JCParser.ExtendsstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCParser#includestatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludestatement(JCParser.IncludestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#includestatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludestatement(JCParser.IncludestatementContext ctx);
}