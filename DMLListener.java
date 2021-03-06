// Generated from DML.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DMLParser}.
 */
public interface DMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DMLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DMLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(DMLParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(DMLParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DMLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DMLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#relationname}.
	 * @param ctx the parse tree
	 */
	void enterRelationname(DMLParser.RelationnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#relationname}.
	 * @param ctx the parse tree
	 */
	void exitRelationname(DMLParser.RelationnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DMLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DMLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#atomicexpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomicexpr(DMLParser.AtomicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#atomicexpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomicexpr(DMLParser.AtomicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(DMLParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(DMLParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DMLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DMLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(DMLParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(DMLParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DMLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DMLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(DMLParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(DMLParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#attributename}.
	 * @param ctx the parse tree
	 */
	void enterAttributename(DMLParser.AttributenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#attributename}.
	 * @param ctx the parse tree
	 */
	void exitAttributename(DMLParser.AttributenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DMLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DMLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(DMLParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(DMLParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(DMLParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(DMLParser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#renaming}.
	 * @param ctx the parse tree
	 */
	void enterRenaming(DMLParser.RenamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#renaming}.
	 * @param ctx the parse tree
	 */
	void exitRenaming(DMLParser.RenamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(DMLParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(DMLParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#difference}.
	 * @param ctx the parse tree
	 */
	void enterDifference(DMLParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#difference}.
	 * @param ctx the parse tree
	 */
	void exitDifference(DMLParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(DMLParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(DMLParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#naturaljoin}.
	 * @param ctx the parse tree
	 */
	void enterNaturaljoin(DMLParser.NaturaljoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#naturaljoin}.
	 * @param ctx the parse tree
	 */
	void exitNaturaljoin(DMLParser.NaturaljoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#opencmd}.
	 * @param ctx the parse tree
	 */
	void enterOpencmd(DMLParser.OpencmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#opencmd}.
	 * @param ctx the parse tree
	 */
	void exitOpencmd(DMLParser.OpencmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#closecmd}.
	 * @param ctx the parse tree
	 */
	void enterClosecmd(DMLParser.ClosecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#closecmd}.
	 * @param ctx the parse tree
	 */
	void exitClosecmd(DMLParser.ClosecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#writecmd}.
	 * @param ctx the parse tree
	 */
	void enterWritecmd(DMLParser.WritecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#writecmd}.
	 * @param ctx the parse tree
	 */
	void exitWritecmd(DMLParser.WritecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#exitcmd}.
	 * @param ctx the parse tree
	 */
	void enterExitcmd(DMLParser.ExitcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#exitcmd}.
	 * @param ctx the parse tree
	 */
	void exitExitcmd(DMLParser.ExitcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#showcmd}.
	 * @param ctx the parse tree
	 */
	void enterShowcmd(DMLParser.ShowcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#showcmd}.
	 * @param ctx the parse tree
	 */
	void exitShowcmd(DMLParser.ShowcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#createcmd}.
	 * @param ctx the parse tree
	 */
	void enterCreatecmd(DMLParser.CreatecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#createcmd}.
	 * @param ctx the parse tree
	 */
	void exitCreatecmd(DMLParser.CreatecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#updatecmd}.
	 * @param ctx the parse tree
	 */
	void enterUpdatecmd(DMLParser.UpdatecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#updatecmd}.
	 * @param ctx the parse tree
	 */
	void exitUpdatecmd(DMLParser.UpdatecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#insertcmd}.
	 * @param ctx the parse tree
	 */
	void enterInsertcmd(DMLParser.InsertcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#insertcmd}.
	 * @param ctx the parse tree
	 */
	void exitInsertcmd(DMLParser.InsertcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#deletecmd}.
	 * @param ctx the parse tree
	 */
	void enterDeletecmd(DMLParser.DeletecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#deletecmd}.
	 * @param ctx the parse tree
	 */
	void exitDeletecmd(DMLParser.DeletecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#typedattributelist}.
	 * @param ctx the parse tree
	 */
	void enterTypedattributelist(DMLParser.TypedattributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#typedattributelist}.
	 * @param ctx the parse tree
	 */
	void exitTypedattributelist(DMLParser.TypedattributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DMLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DMLParser.TypeContext ctx);
}