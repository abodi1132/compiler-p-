// Generated from C:/compiler/compiler-p-/compiler-f/FlaskParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlaskParser}.
 */
public interface FlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlaskParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FlaskParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FlaskParser.FunctionContext ctx);
}