// Generated from C:/compiler/compiler-p-/compiler-jc/JCParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JCParser}.
 */
public interface JCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JCParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JCParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JCParser.FunctionContext ctx);
}