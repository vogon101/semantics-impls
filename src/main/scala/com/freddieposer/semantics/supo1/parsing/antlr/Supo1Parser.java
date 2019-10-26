// Generated from C:/Users/fredd/Google Drive/10. Cambridge/1. Work/2. Supervisions/24. Semantics/semantics-impls/src/main/scala/com/freddieposer/semantics/supo1/parsing\Supo1.g4 by ANTLR 4.7.2
package com.freddieposer.semantics.supo1.parsing.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Supo1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, L_PAREN=2, R_PAREN=3, L_BRACK=4, R_BRACK=5, STAR=6, PLUS=7, 
		EQ=8, IF=9, ELSE=10, RETURN=11, SEMICOLON=12, COMMA=13, INTEGER=14, IDENTIFIER=15, 
		WS=16;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_expr_list = 4, RULE_assignment = 5, RULE_ptr_assign = 6, RULE_local_assign = 7, 
		RULE_if_statement = 8, RULE_codeblock = 9, RULE_id = 10, RULE_id_list = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "statement", "expr", "expr_list", "assignment", 
			"ptr_assign", "local_assign", "if_statement", "codeblock", "id", "id_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'('", "')'", "'{'", "'}'", "'*'", "'+'", "'='", 
			"'if'", "'else'", "'return'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", "STAR", 
			"PLUS", "EQ", "IF", "ELSE", "RETURN", "SEMICOLON", "COMMA", "INTEGER", 
			"IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Supo1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Supo1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(24);
				function();
				}
				}
				setState(29);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Supo1Parser.FUNCTION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(FUNCTION);
			setState(31);
			id();
			setState(32);
			id_list();
			setState(33);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement_assignmentContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Supo1Parser.SEMICOLON, 0); }
		public Statement_assignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterStatement_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitStatement_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitStatement_assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_returnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(Supo1Parser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Supo1Parser.SEMICOLON, 0); }
		public Statement_returnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterStatement_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitStatement_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitStatement_return(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_exprContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Supo1Parser.SEMICOLON, 0); }
		public Statement_exprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterStatement_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitStatement_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitStatement_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_ifContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Statement_ifContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterStatement_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitStatement_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitStatement_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_cbContext extends StatementContext {
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Statement_cbContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterStatement_cb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitStatement_cb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitStatement_cb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Statement_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				expr(0);
				setState(36);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new Statement_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				assignment();
				setState(39);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new Statement_ifContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				if_statement();
				}
				break;
			case 4:
				_localctx = new Statement_cbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				codeblock();
				}
				break;
			case 5:
				_localctx = new Statement_returnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				match(RETURN);
				setState(44);
				expr(0);
				setState(45);
				match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_equalityContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(Supo1Parser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(Supo1Parser.EQ, i);
		}
		public Expr_equalityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_equality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_equality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_equality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_additionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Supo1Parser.PLUS, 0); }
		public Expr_additionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_addition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_function_callContext extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Expr_function_callContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_function_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_bracketContext extends ExprContext {
		public TerminalNode L_PAREN() { return getToken(Supo1Parser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(Supo1Parser.R_PAREN, 0); }
		public Expr_bracketContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_bracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_id_derefContext extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_id_derefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_id_deref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_id_deref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_id_deref(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_ptr_derefContext extends ExprContext {
		public TerminalNode STAR() { return getToken(Supo1Parser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_ptr_derefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_ptr_deref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_ptr_deref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_ptr_deref(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_integerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(Supo1Parser.INTEGER, 0); }
		public Expr_integerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(L_PAREN);
				setState(51);
				expr(0);
				setState(52);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new Expr_id_derefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				id();
				}
				break;
			case 3:
				{
				_localctx = new Expr_function_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				id();
				setState(56);
				expr_list();
				}
				break;
			case 4:
				{
				_localctx = new Expr_ptr_derefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(STAR);
				setState(59);
				expr(4);
				}
				break;
			case 5:
				{
				_localctx = new Expr_integerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_equalityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(64);
						match(EQ);
						setState(65);
						match(EQ);
						setState(66);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Expr_additionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						match(PLUS);
						setState(69);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(Supo1Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(Supo1Parser.R_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Supo1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Supo1Parser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(L_PAREN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << STAR) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						expr(0);
						setState(77);
						match(COMMA);
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(84);
				expr(0);
				}
			}

			setState(87);
			match(R_PAREN);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Ptr_assignContext ptr_assign() {
			return getRuleContext(Ptr_assignContext.class,0);
		}
		public Local_assignContext local_assign() {
			return getRuleContext(Local_assignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				ptr_assign();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				local_assign();
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

	public static class Ptr_assignContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(Supo1Parser.STAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(Supo1Parser.EQ, 0); }
		public Ptr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterPtr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitPtr_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitPtr_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_assignContext ptr_assign() throws RecognitionException {
		Ptr_assignContext _localctx = new Ptr_assignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ptr_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(STAR);
			setState(94);
			expr(0);
			setState(95);
			match(EQ);
			setState(96);
			expr(0);
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

	public static class Local_assignContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Supo1Parser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Local_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterLocal_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitLocal_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitLocal_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_assignContext local_assign() throws RecognitionException {
		Local_assignContext _localctx = new Local_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_local_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			id();
			setState(99);
			match(EQ);
			setState(100);
			expr(0);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Supo1Parser.IF, 0); }
		public TerminalNode L_PAREN() { return getToken(Supo1Parser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(Supo1Parser.R_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Supo1Parser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			match(L_PAREN);
			setState(104);
			expr(0);
			setState(105);
			match(R_PAREN);
			setState(106);
			statement();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(107);
				match(ELSE);
				setState(108);
				statement();
				}
				break;
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

	public static class CodeblockContext extends ParserRuleContext {
		public TerminalNode L_BRACK() { return getToken(Supo1Parser.L_BRACK, 0); }
		public TerminalNode R_BRACK() { return getToken(Supo1Parser.R_BRACK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Supo1Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Supo1Parser.SEMICOLON, i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(L_BRACK);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PAREN) | (1L << L_BRACK) | (1L << STAR) | (1L << IF) | (1L << RETURN) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(112);
				statement();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(113);
					match(SEMICOLON);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(R_BRACK);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Supo1Parser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(Supo1Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(Supo1Parser.R_PAREN, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Supo1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Supo1Parser.COMMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Supo1Listener ) ((Supo1Listener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Supo1Visitor ) return ((Supo1Visitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(L_PAREN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						id();
						setState(130);
						match(COMMA);
						}
						} 
					}
					setState(136);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(137);
				id();
				}
			}

			setState(140);
			match(R_PAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U"+
		"\13\6\3\6\5\6X\n\6\3\6\3\6\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\7\13u\n"+
		"\13\f\13\16\13x\13\13\7\13z\n\13\f\13\16\13}\13\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\5\r\u008d\n\r\3\r"+
		"\3\r\3\r\2\3\b\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u0097\2\35\3\2\2"+
		"\2\4 \3\2\2\2\6\61\3\2\2\2\b?\3\2\2\2\nM\3\2\2\2\f]\3\2\2\2\16_\3\2\2"+
		"\2\20d\3\2\2\2\22h\3\2\2\2\24q\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2\2"+
		"\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36\3\3\2\2\2\37\35\3\2\2\2 !\7\3\2\2!\"\5\26\f\2\"#\5\30\r\2#$\5\6"+
		"\4\2$\5\3\2\2\2%&\5\b\5\2&\'\7\16\2\2\'\62\3\2\2\2()\5\f\7\2)*\7\16\2"+
		"\2*\62\3\2\2\2+\62\5\22\n\2,\62\5\24\13\2-.\7\r\2\2./\5\b\5\2/\60\7\16"+
		"\2\2\60\62\3\2\2\2\61%\3\2\2\2\61(\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61"+
		"-\3\2\2\2\62\7\3\2\2\2\63\64\b\5\1\2\64\65\7\4\2\2\65\66\5\b\5\2\66\67"+
		"\7\5\2\2\67@\3\2\2\28@\5\26\f\29:\5\26\f\2:;\5\n\6\2;@\3\2\2\2<=\7\b\2"+
		"\2=@\5\b\5\6>@\7\20\2\2?\63\3\2\2\2?8\3\2\2\2?9\3\2\2\2?<\3\2\2\2?>\3"+
		"\2\2\2@J\3\2\2\2AB\f\5\2\2BC\7\n\2\2CD\7\n\2\2DI\5\b\5\6EF\f\4\2\2FG\7"+
		"\t\2\2GI\5\b\5\5HA\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t"+
		"\3\2\2\2LJ\3\2\2\2MW\7\4\2\2NO\5\b\5\2OP\7\17\2\2PR\3\2\2\2QN\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VX\5\b\5\2WS\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2YZ\7\5\2\2Z\13\3\2\2\2[^\5\16\b\2\\^\5\20\t\2][\3"+
		"\2\2\2]\\\3\2\2\2^\r\3\2\2\2_`\7\b\2\2`a\5\b\5\2ab\7\n\2\2bc\5\b\5\2c"+
		"\17\3\2\2\2de\5\26\f\2ef\7\n\2\2fg\5\b\5\2g\21\3\2\2\2hi\7\13\2\2ij\7"+
		"\4\2\2jk\5\b\5\2kl\7\5\2\2lo\5\6\4\2mn\7\f\2\2np\5\6\4\2om\3\2\2\2op\3"+
		"\2\2\2p\23\3\2\2\2q{\7\6\2\2rv\5\6\4\2su\7\16\2\2ts\3\2\2\2ux\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yr\3\2\2\2z}\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\7\2\2\177\25\3\2\2\2\u0080\u0081"+
		"\7\21\2\2\u0081\27\3\2\2\2\u0082\u008c\7\4\2\2\u0083\u0084\5\26\f\2\u0084"+
		"\u0085\7\17\2\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\5\26\f\2\u008c\u0088\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\5\2\2\u008f\31\3\2\2\2\17\35"+
		"\61?HJSW]ov{\u0088\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}