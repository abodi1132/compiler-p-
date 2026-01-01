// Generated from C:/compiler/compiler-p-/compiler-jc/JCParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JCParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(JCParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JCParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#htmlelements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlelements(JCParser.HtmlelementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(JCParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#cssblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssblock(JCParser.CssblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#csscontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsscontent(JCParser.CsscontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#cssrules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssrules(JCParser.CssrulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(JCParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#cssdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssdeclaration(JCParser.CssdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#csscomment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsscomment(JCParser.CsscommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#jinjaexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaexpression(JCParser.JinjaexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#jinjastatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjastatement(JCParser.JinjastatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#jinjacomment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjacomment(JCParser.JinjacommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JCParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JCParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(JCParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(JCParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#blockstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstatement(JCParser.BlockstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#macrostatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacrostatement(JCParser.MacrostatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JCParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JCParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#setstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetstatement(JCParser.SetstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#extendsstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsstatement(JCParser.ExtendsstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JCParser#includestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludestatement(JCParser.IncludestatementContext ctx);
}