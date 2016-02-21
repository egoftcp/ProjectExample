// Generated from DML.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IDENTIFIER=32, OP=33, STRING=34, INTEGER=35, WS=36;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_query = 2, RULE_relationname = 3, 
		RULE_expr = 4, RULE_atomicexpr = 5, RULE_selection = 6, RULE_condition = 7, 
		RULE_conjunction = 8, RULE_comparison = 9, RULE_operand = 10, RULE_attributename = 11, 
		RULE_literal = 12, RULE_projection = 13, RULE_attributelist = 14, RULE_renaming = 15, 
		RULE_union = 16, RULE_difference = 17, RULE_product = 18, RULE_naturaljoin = 19, 
		RULE_opencmd = 20, RULE_closecmd = 21, RULE_writecmd = 22, RULE_exitcmd = 23, 
		RULE_showcmd = 24, RULE_createcmd = 25, RULE_updatecmd = 26, RULE_insertcmd = 27, 
		RULE_deletecmd = 28, RULE_typedattributelist = 29, RULE_type = 30;
	public static final String[] ruleNames = {
		"program", "command", "query", "relationname", "expr", "atomicexpr", "selection", 
		"condition", "conjunction", "comparison", "operand", "attributename", 
		"literal", "projection", "attributelist", "renaming", "union", "difference", 
		"product", "naturaljoin", "opencmd", "closecmd", "writecmd", "exitcmd", 
		"showcmd", "createcmd", "updatecmd", "insertcmd", "deletecmd", "typedattributelist", 
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<-'", "'('", "')'", "'select'", "'||'", "'&&'", "'project'", 
		"','", "'rename'", "'+'", "'-'", "'*'", "'&'", "'OPEN'", "'CLOSE'", "'WRITE'", 
		"'EXIT'", "'SHOW'", "'CREATE TABLE'", "'PRIMARY KEY'", "'UPDATE'", "'SET'", 
		"'='", "'WHERE'", "'INSERT INTO'", "'VALUES FROM'", "'VALUES FROM RELATION'", 
		"'DELETE FROM'", "'VARCHAR'", "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IDENTIFIER", "OP", "STRING", 
		"INTEGER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(64);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__21:
				case T__25:
				case T__28:
					{
					setState(62);
					command();
					}
					break;
				case IDENTIFIER:
					{
					setState(63);
					query();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__25) | (1L << T__28) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public OpencmdContext opencmd() {
			return getRuleContext(OpencmdContext.class,0);
		}
		public ClosecmdContext closecmd() {
			return getRuleContext(ClosecmdContext.class,0);
		}
		public WritecmdContext writecmd() {
			return getRuleContext(WritecmdContext.class,0);
		}
		public ExitcmdContext exitcmd() {
			return getRuleContext(ExitcmdContext.class,0);
		}
		public ShowcmdContext showcmd() {
			return getRuleContext(ShowcmdContext.class,0);
		}
		public CreatecmdContext createcmd() {
			return getRuleContext(CreatecmdContext.class,0);
		}
		public UpdatecmdContext updatecmd() {
			return getRuleContext(UpdatecmdContext.class,0);
		}
		public InsertcmdContext insertcmd() {
			return getRuleContext(InsertcmdContext.class,0);
		}
		public DeletecmdContext deletecmd() {
			return getRuleContext(DeletecmdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(68);
				opencmd();
				}
				break;
			case T__15:
				{
				setState(69);
				closecmd();
				}
				break;
			case T__16:
				{
				setState(70);
				writecmd();
				}
				break;
			case T__17:
				{
				setState(71);
				exitcmd();
				}
				break;
			case T__18:
				{
				setState(72);
				showcmd();
				}
				break;
			case T__19:
				{
				setState(73);
				createcmd();
				}
				break;
			case T__21:
				{
				setState(74);
				updatecmd();
				}
				break;
			case T__25:
				{
				setState(75);
				insertcmd();
				}
				break;
			case T__28:
				{
				setState(76);
				deletecmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			relationname();
			setState(82);
			match(T__1);
			setState(83);
			expr();
			setState(84);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DMLParser.IDENTIFIER, 0); }
		public RelationnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterRelationname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitRelationname(this);
		}
	}

	public final RelationnameContext relationname() throws RecognitionException {
		RelationnameContext _localctx = new RelationnameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relationname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public RenamingContext renaming() {
			return getRuleContext(RenamingContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public DifferenceContext difference() {
			return getRuleContext(DifferenceContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public NaturaljoinContext naturaljoin() {
			return getRuleContext(NaturaljoinContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				atomicexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				renaming();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				union();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				difference();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				product();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				naturaljoin();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicexprContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAtomicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAtomicexpr(this);
		}
	}

	public final AtomicexprContext atomicexpr() throws RecognitionException {
		AtomicexprContext _localctx = new AtomicexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atomicexpr);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				relationname();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__2);
				setState(100);
				expr();
				setState(101);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__4);
			setState(106);
			match(T__2);
			setState(107);
			condition();
			setState(108);
			match(T__3);
			setState(109);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			conjunction();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(112);
				match(T__5);
				setState(113);
				conjunction();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			comparison();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(120);
				match(T__6);
				setState(121);
				comparison();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode OP() { return getToken(DMLParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STRING:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				operand();
				setState(128);
				match(OP);
				setState(129);
				operand();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__2);
				setState(132);
				condition();
				setState(133);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public AttributenameContext attributename() {
			return getRuleContext(AttributenameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operand);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				attributename();
				}
				break;
			case STRING:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DMLParser.IDENTIFIER, 0); }
		public AttributenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAttributename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAttributename(this);
		}
	}

	public final AttributenameContext attributename() throws RecognitionException {
		AttributenameContext _localctx = new AttributenameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DMLParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(DMLParser.INTEGER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__7);
			setState(146);
			match(T__2);
			setState(147);
			attributelist();
			setState(148);
			match(T__3);
			setState(149);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public List<AttributenameContext> attributename() {
			return getRuleContexts(AttributenameContext.class);
		}
		public AttributenameContext attributename(int i) {
			return getRuleContext(AttributenameContext.class,i);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		AttributelistContext _localctx = new AttributelistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			attributename();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(152);
				match(T__8);
				setState(153);
				attributename();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenamingContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
		public RenamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterRenaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitRenaming(this);
		}
	}

	public final RenamingContext renaming() throws RecognitionException {
		RenamingContext _localctx = new RenamingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__9);
			setState(160);
			match(T__2);
			setState(161);
			attributelist();
			setState(162);
			match(T__3);
			setState(163);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public List<AtomicexprContext> atomicexpr() {
			return getRuleContexts(AtomicexprContext.class);
		}
		public AtomicexprContext atomicexpr(int i) {
			return getRuleContext(AtomicexprContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			atomicexpr();
			setState(166);
			match(T__10);
			setState(167);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DifferenceContext extends ParserRuleContext {
		public List<AtomicexprContext> atomicexpr() {
			return getRuleContexts(AtomicexprContext.class);
		}
		public AtomicexprContext atomicexpr(int i) {
			return getRuleContext(AtomicexprContext.class,i);
		}
		public DifferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDifference(this);
		}
	}

	public final DifferenceContext difference() throws RecognitionException {
		DifferenceContext _localctx = new DifferenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_difference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			atomicexpr();
			setState(170);
			match(T__11);
			setState(171);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public List<AtomicexprContext> atomicexpr() {
			return getRuleContexts(AtomicexprContext.class);
		}
		public AtomicexprContext atomicexpr(int i) {
			return getRuleContext(AtomicexprContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			atomicexpr();
			setState(174);
			match(T__12);
			setState(175);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NaturaljoinContext extends ParserRuleContext {
		public List<AtomicexprContext> atomicexpr() {
			return getRuleContexts(AtomicexprContext.class);
		}
		public AtomicexprContext atomicexpr(int i) {
			return getRuleContext(AtomicexprContext.class,i);
		}
		public NaturaljoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturaljoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterNaturaljoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitNaturaljoin(this);
		}
	}

	public final NaturaljoinContext naturaljoin() throws RecognitionException {
		NaturaljoinContext _localctx = new NaturaljoinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_naturaljoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			atomicexpr();
			setState(178);
			match(T__13);
			setState(179);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpencmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public OpencmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opencmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterOpencmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitOpencmd(this);
		}
	}

	public final OpencmdContext opencmd() throws RecognitionException {
		OpencmdContext _localctx = new OpencmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_opencmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__14);
			setState(182);
			relationname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosecmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public ClosecmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closecmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterClosecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitClosecmd(this);
		}
	}

	public final ClosecmdContext closecmd() throws RecognitionException {
		ClosecmdContext _localctx = new ClosecmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_closecmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__15);
			setState(185);
			relationname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritecmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public WritecmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writecmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterWritecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitWritecmd(this);
		}
	}

	public final WritecmdContext writecmd() throws RecognitionException {
		WritecmdContext _localctx = new WritecmdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_writecmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__16);
			setState(188);
			relationname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitcmdContext extends ParserRuleContext {
		public ExitcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitcmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterExitcmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitExitcmd(this);
		}
	}

	public final ExitcmdContext exitcmd() throws RecognitionException {
		ExitcmdContext _localctx = new ExitcmdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exitcmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowcmdContext extends ParserRuleContext {
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
		public ShowcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showcmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterShowcmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitShowcmd(this);
		}
	}

	public final ShowcmdContext showcmd() throws RecognitionException {
		ShowcmdContext _localctx = new ShowcmdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_showcmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__18);
			setState(193);
			atomicexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatecmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public TypedattributelistContext typedattributelist() {
			return getRuleContext(TypedattributelistContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public CreatecmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createcmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterCreatecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitCreatecmd(this);
		}
	}

	public final CreatecmdContext createcmd() throws RecognitionException {
		CreatecmdContext _localctx = new CreatecmdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createcmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__19);
			setState(196);
			relationname();
			setState(197);
			match(T__2);
			setState(198);
			typedattributelist();
			setState(199);
			match(T__3);
			setState(200);
			match(T__20);
			setState(201);
			match(T__2);
			setState(202);
			attributelist();
			setState(203);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdatecmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public List<AttributenameContext> attributename() {
			return getRuleContexts(AttributenameContext.class);
		}
		public AttributenameContext attributename(int i) {
			return getRuleContext(AttributenameContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public UpdatecmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatecmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterUpdatecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitUpdatecmd(this);
		}
	}

	public final UpdatecmdContext updatecmd() throws RecognitionException {
		UpdatecmdContext _localctx = new UpdatecmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_updatecmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__21);
			setState(206);
			relationname();
			setState(207);
			match(T__22);
			setState(208);
			attributename();
			setState(209);
			match(T__23);
			setState(210);
			literal();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(211);
				match(T__8);
				setState(212);
				attributename();
				setState(213);
				match(T__23);
				setState(214);
				literal();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(T__24);
			setState(222);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertcmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InsertcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertcmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterInsertcmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitInsertcmd(this);
		}
	}

	public final InsertcmdContext insertcmd() throws RecognitionException {
		InsertcmdContext _localctx = new InsertcmdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insertcmd);
		int _la;
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__25);
				setState(225);
				relationname();
				setState(226);
				match(T__26);
				setState(227);
				match(T__2);
				setState(228);
				literal();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(229);
					match(T__8);
					setState(230);
					literal();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__25);
				setState(239);
				relationname();
				setState(240);
				match(T__27);
				setState(241);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeletecmdContext extends ParserRuleContext {
		public RelationnameContext relationname() {
			return getRuleContext(RelationnameContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DeletecmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletecmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDeletecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDeletecmd(this);
		}
	}

	public final DeletecmdContext deletecmd() throws RecognitionException {
		DeletecmdContext _localctx = new DeletecmdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deletecmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__28);
			setState(246);
			relationname();
			setState(247);
			match(T__24);
			setState(248);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedattributelistContext extends ParserRuleContext {
		public List<AttributenameContext> attributename() {
			return getRuleContexts(AttributenameContext.class);
		}
		public AttributenameContext attributename(int i) {
			return getRuleContext(AttributenameContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypedattributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedattributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterTypedattributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitTypedattributelist(this);
		}
	}

	public final TypedattributelistContext typedattributelist() throws RecognitionException {
		TypedattributelistContext _localctx = new TypedattributelistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typedattributelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			attributename();
			setState(251);
			type();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(252);
				match(T__8);
				setState(253);
				attributename();
				setState(254);
				type();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(DMLParser.INTEGER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__29);
				setState(262);
				match(T__2);
				setState(263);
				match(INTEGER);
				setState(264);
				match(T__3);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\6\2C\n\2\r\2\16\2D\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"c\n\6\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\7\tu\n\t\f\t\16\tx\13\t\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\5\f\u008e"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7"+
		"\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00db\n\34\f\34\16\34"+
		"\u00de\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00ea"+
		"\n\35\f\35\16\35\u00ed\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f6"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0103"+
		"\n\37\f\37\16\37\u0106\13\37\3 \3 \3 \3 \3 \5 \u010d\n \3 \2\2!\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\3\3\2$%\u010b"+
		"\2B\3\2\2\2\4O\3\2\2\2\6S\3\2\2\2\bX\3\2\2\2\nb\3\2\2\2\fi\3\2\2\2\16"+
		"k\3\2\2\2\20q\3\2\2\2\22y\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30"+
		"\u008f\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u0099\3\2\2\2 \u00a1"+
		"\3\2\2\2\"\u00a7\3\2\2\2$\u00ab\3\2\2\2&\u00af\3\2\2\2(\u00b3\3\2\2\2"+
		"*\u00b7\3\2\2\2,\u00ba\3\2\2\2.\u00bd\3\2\2\2\60\u00c0\3\2\2\2\62\u00c2"+
		"\3\2\2\2\64\u00c5\3\2\2\2\66\u00cf\3\2\2\28\u00f5\3\2\2\2:\u00f7\3\2\2"+
		"\2<\u00fc\3\2\2\2>\u010c\3\2\2\2@C\5\4\3\2AC\5\6\4\2B@\3\2\2\2BA\3\2\2"+
		"\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FP\5*\26\2GP\5,\27\2HP\5.\30"+
		"\2IP\5\60\31\2JP\5\62\32\2KP\5\64\33\2LP\5\66\34\2MP\58\35\2NP\5:\36\2"+
		"OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2"+
		"OM\3\2\2\2ON\3\2\2\2PQ\3\2\2\2QR\7\3\2\2R\5\3\2\2\2ST\5\b\5\2TU\7\4\2"+
		"\2UV\5\n\6\2VW\7\3\2\2W\7\3\2\2\2XY\7\"\2\2Y\t\3\2\2\2Zc\5\f\7\2[c\5\16"+
		"\b\2\\c\5\34\17\2]c\5 \21\2^c\5\"\22\2_c\5$\23\2`c\5&\24\2ac\5(\25\2b"+
		"Z\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2"+
		"ba\3\2\2\2c\13\3\2\2\2dj\5\b\5\2ef\7\5\2\2fg\5\n\6\2gh\7\6\2\2hj\3\2\2"+
		"\2id\3\2\2\2ie\3\2\2\2j\r\3\2\2\2kl\7\7\2\2lm\7\5\2\2mn\5\20\t\2no\7\6"+
		"\2\2op\5\f\7\2p\17\3\2\2\2qv\5\22\n\2rs\7\b\2\2su\5\22\n\2tr\3\2\2\2u"+
		"x\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2y~\5\24\13\2z{\7\t"+
		"\2\2{}\5\24\13\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\23"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7#\2\2\u0083"+
		"\u0084\5\26\f\2\u0084\u008a\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5"+
		"\20\t\2\u0087\u0088\7\6\2\2\u0088\u008a\3\2\2\2\u0089\u0081\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u008a\25\3\2\2\2\u008b\u008e\5\30\r\2\u008c\u008e\5\32"+
		"\16\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\27\3\2\2\2\u008f\u0090"+
		"\7\"\2\2\u0090\31\3\2\2\2\u0091\u0092\t\2\2\2\u0092\33\3\2\2\2\u0093\u0094"+
		"\7\n\2\2\u0094\u0095\7\5\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7\6\2\2"+
		"\u0097\u0098\5\f\7\2\u0098\35\3\2\2\2\u0099\u009e\5\30\r\2\u009a\u009b"+
		"\7\13\2\2\u009b\u009d\5\30\r\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\37\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\5\36\20\2"+
		"\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5\f\7\2\u00a6!\3\2\2\2\u00a7\u00a8\5"+
		"\f\7\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\5\f\7\2\u00aa#\3\2\2\2\u00ab\u00ac"+
		"\5\f\7\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\5\f\7\2\u00ae%\3\2\2\2\u00af"+
		"\u00b0\5\f\7\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\5\f\7\2\u00b2\'\3\2\2"+
		"\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5\f\7\2\u00b6"+
		")\3\2\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\5\b\5\2\u00b9+\3\2\2\2\u00ba"+
		"\u00bb\7\22\2\2\u00bb\u00bc\5\b\5\2\u00bc-\3\2\2\2\u00bd\u00be\7\23\2"+
		"\2\u00be\u00bf\5\b\5\2\u00bf/\3\2\2\2\u00c0\u00c1\7\24\2\2\u00c1\61\3"+
		"\2\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\5\f\7\2\u00c4\63\3\2\2\2\u00c5"+
		"\u00c6\7\26\2\2\u00c6\u00c7\5\b\5\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5"+
		"<\37\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\7\27\2\2\u00cb\u00cc\7\5\2\2\u00cc"+
		"\u00cd\5\36\20\2\u00cd\u00ce\7\6\2\2\u00ce\65\3\2\2\2\u00cf\u00d0\7\30"+
		"\2\2\u00d0\u00d1\5\b\5\2\u00d1\u00d2\7\31\2\2\u00d2\u00d3\5\30\r\2\u00d3"+
		"\u00d4\7\32\2\2\u00d4\u00dc\5\32\16\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7"+
		"\5\30\r\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00db\3\2\2"+
		"\2\u00da\u00d5\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\33\2\2"+
		"\u00e0\u00e1\5\20\t\2\u00e1\67\3\2\2\2\u00e2\u00e3\7\34\2\2\u00e3\u00e4"+
		"\5\b\5\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00eb\5\32\16"+
		"\2\u00e7\u00e8\7\13\2\2\u00e8\u00ea\5\32\16\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\6\2\2\u00ef\u00f6\3\2\2\2\u00f0"+
		"\u00f1\7\34\2\2\u00f1\u00f2\5\b\5\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\5"+
		"\n\6\2\u00f4\u00f6\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6"+
		"9\3\2\2\2\u00f7\u00f8\7\37\2\2\u00f8\u00f9\5\b\5\2\u00f9\u00fa\7\33\2"+
		"\2\u00fa\u00fb\5\20\t\2\u00fb;\3\2\2\2\u00fc\u00fd\5\30\r\2\u00fd\u0104"+
		"\5> \2\u00fe\u00ff\7\13\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\5> \2\u0101"+
		"\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105=\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108"+
		"\7 \2\2\u0108\u0109\7\5\2\2\u0109\u010a\7%\2\2\u010a\u010d\7\6\2\2\u010b"+
		"\u010d\7!\2\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2\2\2\u010d?\3\2\2\2\21"+
		"BDObiv~\u0089\u008d\u009e\u00dc\u00eb\u00f5\u0104\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}