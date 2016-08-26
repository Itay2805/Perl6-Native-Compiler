// Generated from Perl6.g4 by ANTLR 4.4

	package com.itay.perl6.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Perl6Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, CHARSEQUENSE=19, CHARSEQUENSE_2=20, CHARSEQUENSE_Q=21, 
		NUMBER=22, ID=23, LINE_COMMENT=24, SPACE=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'use'", "'say'", "'{'", "'v6'", "';'", "'}'", "'='", 
		"'$'", "'print'", "'my'", "'''", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"CHARSEQUENSE", "CHARSEQUENSE_2", "CHARSEQUENSE_Q", "NUMBER", "ID", "LINE_COMMENT", 
		"SPACE"
	};
	public static final int
		RULE_program = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_expr = 3, RULE_temp = 4, 
		RULE_literalExpr = 5, RULE_varExpr = 6, RULE_mathExpr = 7, RULE_multiplyingExpression = 8, 
		RULE_addingExpression = 9, RULE_block = 10;
	public static final String[] ruleNames = {
		"program", "stmt_list", "stmt", "expr", "temp", "literalExpr", "varExpr", 
		"mathExpr", "multiplyingExpression", "addingExpression", "block"
	};

	@Override
	public String getGrammarFileName() { return "Perl6.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Perl6Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Perl6Parser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); stmt_list();
			setState(23); match(EOF);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << CHARSEQUENSE) | (1L << CHARSEQUENSE_2) | (1L << CHARSEQUENSE_Q) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(25); stmt();
				}
				}
				setState(30);
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); expr();
				setState(32); match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); expr();
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
		public AddingExpressionContext addingExpression() {
			return getRuleContext(AddingExpressionContext.class,0);
		}
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public LiteralExprContext literalExpr() {
			return getRuleContext(LiteralExprContext.class,0);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); temp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); varExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); literalExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40); addingExpression();
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

	public static class TempContext extends ParserRuleContext {
		public TempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp; }
	 
		public TempContext() { }
		public void copyFrom(TempContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CodeBlockContext extends TempContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CodeBlockContext(TempContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends TempContext {
		public UseContext(TempContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SayContext extends TempContext {
		public Token name;
		public ExprContext value1;
		public ExprContext value2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SayContext(TempContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitSay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempContext temp() throws RecognitionException {
		TempContext _localctx = new TempContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_temp);
		int _la;
		try {
			int _alt;
			setState(62);
			switch (_input.LA(1)) {
			case T__15:
			case T__8:
				_localctx = new SayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((SayContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__8) ) {
					((SayContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(45);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44); match(T__5);
					}
					break;
				}
				setState(47); ((SayContext)_localctx).value1 = expr();
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(48); match(T__1);
						setState(49); ((SayContext)_localctx).value2 = expr();
						}
						} 
					}
					setState(54);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(55); match(T__4);
					}
					break;
				}
				}
				break;
			case T__14:
				_localctx = new CodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58); block();
				}
				break;
			case T__16:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(T__16);
				setState(60); match(T__13);
				setState(61); match(T__12);
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

	public static class LiteralExprContext extends ParserRuleContext {
		public LiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpr; }
	 
		public LiteralExprContext() { }
		public void copyFrom(LiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends LiteralExprContext {
		public Token str;
		public TerminalNode CHARSEQUENSE_Q() { return getToken(Perl6Parser.CHARSEQUENSE_Q, 0); }
		public TerminalNode CHARSEQUENSE_2() { return getToken(Perl6Parser.CHARSEQUENSE_2, 0); }
		public TerminalNode CHARSEQUENSE() { return getToken(Perl6Parser.CHARSEQUENSE, 0); }
		public StringLiteralContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberLiteralContext extends LiteralExprContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(Perl6Parser.NUMBER, 0); }
		public NumberLiteralContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExprContext literalExpr() throws RecognitionException {
		LiteralExprContext _localctx = new LiteralExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literalExpr);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case T__6:
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(64); match(T__6);
					setState(65); ((NumberLiteralContext)_localctx).num = match(NUMBER);
					setState(66); match(T__6);
					}
					break;
				case NUMBER:
					{
					setState(67); ((NumberLiteralContext)_localctx).num = match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHARSEQUENSE:
			case CHARSEQUENSE_2:
			case CHARSEQUENSE_Q:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				switch (_input.LA(1)) {
				case CHARSEQUENSE:
					{
					setState(70); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE);
					}
					break;
				case CHARSEQUENSE_Q:
					{
					setState(71); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE_Q);
					}
					break;
				case CHARSEQUENSE_2:
					{
					setState(72); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE_2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class VarExprContext extends ParserRuleContext {
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
	 
		public VarExprContext() { }
		public void copyFrom(VarExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateVarContext extends VarExprContext {
		public Token name;
		public ExprContext value;
		public Token type;
		public List<TerminalNode> ID() { return getTokens(Perl6Parser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(Perl6Parser.ID, i);
		}
		public CreateVarContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitCreateVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadVarContext extends VarExprContext {
		public Token name;
		public TerminalNode ID() { return getToken(Perl6Parser.ID, 0); }
		public LoadVarContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitLoadVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarContext extends VarExprContext {
		public Token name;
		public ExprContext value;
		public TerminalNode ID() { return getToken(Perl6Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarContext(VarExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varExpr);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77); match(T__7);
				setState(78); match(T__9);
				setState(79); ((CreateVarContext)_localctx).name = match(ID);
				}
				break;
			case 2:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80); match(T__7);
				setState(81); match(T__9);
				setState(82); ((CreateVarContext)_localctx).name = match(ID);
				setState(83); match(T__10);
				setState(84); ((CreateVarContext)_localctx).value = expr();
				}
				break;
			case 3:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85); match(T__7);
				setState(86); ((CreateVarContext)_localctx).type = match(ID);
				setState(87); match(T__9);
				setState(88); ((CreateVarContext)_localctx).name = match(ID);
				}
				break;
			case 4:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89); match(T__7);
				setState(90); ((CreateVarContext)_localctx).type = match(ID);
				setState(91); match(T__9);
				setState(92); ((CreateVarContext)_localctx).name = match(ID);
				setState(93); match(T__10);
				setState(94); ((CreateVarContext)_localctx).value = expr();
				}
				break;
			case 5:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95); match(T__9);
				setState(96); ((AssignVarContext)_localctx).name = match(ID);
				setState(97); match(T__10);
				setState(98); ((AssignVarContext)_localctx).value = expr();
				}
				break;
			case 6:
				_localctx = new LoadVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99); match(T__9);
				setState(100); ((LoadVarContext)_localctx).name = match(ID);
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

	public static class MathExprContext extends ParserRuleContext {
		public AddingExpressionContext addingExpression() {
			return getRuleContext(AddingExpressionContext.class,0);
		}
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public LiteralExprContext literalExpr() {
			return getRuleContext(LiteralExprContext.class,0);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mathExpr);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__16:
			case T__15:
			case T__14:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); temp();
				}
				break;
			case T__9:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); varExpr();
				}
				break;
			case T__6:
			case CHARSEQUENSE:
			case CHARSEQUENSE_2:
			case CHARSEQUENSE_Q:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); literalExpr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(106); match(T__5);
				setState(107); addingExpression();
				setState(108); match(T__4);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
	 
		public MultiplyingExpressionContext() { }
		public void copyFrom(MultiplyingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends MultiplyingExpressionContext {
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public DivContext(MultiplyingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends MultiplyingExpressionContext {
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MulContext(MultiplyingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiplyingExpression);
		try {
			int _alt;
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112); mathExpr();
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113); match(T__3);
						setState(114); mathExpr();
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); mathExpr();
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121); match(T__17);
						setState(122); mathExpr();
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
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

	public static class AddingExpressionContext extends ParserRuleContext {
		public AddingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingExpression; }
	 
		public AddingExpressionContext() { }
		public void copyFrom(AddingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends AddingExpressionContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public AddContext(AddingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends AddingExpressionContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public SubContext(AddingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddingExpressionContext addingExpression() throws RecognitionException {
		AddingExpressionContext _localctx = new AddingExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addingExpression);
		try {
			int _alt;
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130); multiplyingExpression();
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(131); match(T__2);
						setState(132); multiplyingExpression();
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138); multiplyingExpression();
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139); match(T__0);
						setState(140); multiplyingExpression();
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
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

	public static class BlockContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__14);
			setState(149); stmt_list();
			setState(150); match(T__11);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3"+
		"\4\5\4&\n\4\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\5\6\60\n\6\3\6\3\6\3\6\7"+
		"\6\65\n\6\f\6\16\68\13\6\3\6\5\6;\n\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7"+
		"\3\7\3\7\5\7G\n\7\3\7\3\7\3\7\5\7L\n\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n\7\nv\n"+
		"\n\f\n\16\ny\13\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n\5\n\u0083\n"+
		"\n\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\13\3\13\3\13"+
		"\7\13\u0090\n\13\f\13\16\13\u0093\13\13\5\13\u0095\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\5\5\f\f\u00ab\2\30\3\2"+
		"\2\2\4\36\3\2\2\2\6%\3\2\2\2\b+\3\2\2\2\n@\3\2\2\2\fM\3\2\2\2\16g\3\2"+
		"\2\2\20p\3\2\2\2\22\u0082\3\2\2\2\24\u0094\3\2\2\2\26\u0096\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35"+
		" \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!\"\5\b"+
		"\5\2\"#\7\b\2\2#&\3\2\2\2$&\5\b\5\2%!\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\',"+
		"\5\n\6\2(,\5\16\b\2),\5\f\7\2*,\5\24\13\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2"+
		"\2+*\3\2\2\2,\t\3\2\2\2-/\t\2\2\2.\60\7\17\2\2/.\3\2\2\2/\60\3\2\2\2\60"+
		"\61\3\2\2\2\61\66\5\b\5\2\62\63\7\23\2\2\63\65\5\b\5\2\64\62\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29;\7\20\2"+
		"\2:9\3\2\2\2:;\3\2\2\2;A\3\2\2\2<A\5\26\f\2=>\7\4\2\2>?\7\7\2\2?A\7\b"+
		"\2\2@-\3\2\2\2@<\3\2\2\2@=\3\2\2\2A\13\3\2\2\2BC\7\16\2\2CD\7\30\2\2D"+
		"G\7\16\2\2EG\7\30\2\2FB\3\2\2\2FE\3\2\2\2GN\3\2\2\2HL\7\25\2\2IL\7\27"+
		"\2\2JL\7\26\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LN\3\2\2\2MF\3\2\2\2MK\3"+
		"\2\2\2N\r\3\2\2\2OP\7\r\2\2PQ\7\13\2\2Qh\7\31\2\2RS\7\r\2\2ST\7\13\2\2"+
		"TU\7\31\2\2UV\7\n\2\2Vh\5\b\5\2WX\7\r\2\2XY\7\31\2\2YZ\7\13\2\2Zh\7\31"+
		"\2\2[\\\7\r\2\2\\]\7\31\2\2]^\7\13\2\2^_\7\31\2\2_`\7\n\2\2`h\5\b\5\2"+
		"ab\7\13\2\2bc\7\31\2\2cd\7\n\2\2dh\5\b\5\2ef\7\13\2\2fh\7\31\2\2gO\3\2"+
		"\2\2gR\3\2\2\2gW\3\2\2\2g[\3\2\2\2ga\3\2\2\2ge\3\2\2\2h\17\3\2\2\2iq\5"+
		"\n\6\2jq\5\16\b\2kq\5\f\7\2lm\7\17\2\2mn\5\24\13\2no\7\20\2\2oq\3\2\2"+
		"\2pi\3\2\2\2pj\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\21\3\2\2\2rw\5\20\t\2st\7"+
		"\21\2\2tv\5\20\t\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0083\3\2"+
		"\2\2yw\3\2\2\2z\177\5\20\t\2{|\7\3\2\2|~\5\20\t\2}{\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082r\3\2\2\2\u0082z\3\2\2\2\u0083\23\3\2\2\2\u0084\u0089\5\22\n"+
		"\2\u0085\u0086\7\22\2\2\u0086\u0088\5\22\n\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0095\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u0091\5\22\n\2\u008d\u008e\7\24\2\2\u008e"+
		"\u0090\5\22\n\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0084\3\2\2\2\u0094\u008c\3\2\2\2\u0095\25\3\2\2\2\u0096\u0097\7\6\2"+
		"\2\u0097\u0098\5\4\3\2\u0098\u0099\7\t\2\2\u0099\27\3\2\2\2\24\36%+/\66"+
		":@FKMgpw\177\u0082\u0089\u0091\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}