// Generated from C:/compiler-project-test/compiler-p-2/JCParser.g4 by ANTLR 4.13.2
package JCGen;
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
	 * Enter a parse tree produced by {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JCParser.ExpressionContext ctx);
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