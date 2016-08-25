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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		CHARSEQUENSE=17, CHARSEQUENSE_2=18, CHARSEQUENSE_Q=19, NUMBER=20, ID=21, 
		LINE_COMMENT=22, SPACE=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'use'", "'say'", "'{'", "'v6'", "';'", "'}'", "'='", 
		"'$'", "'print'", "'my'", "'('", "')'", "'*'", "'+'", "'-'", "CHARSEQUENSE", 
		"CHARSEQUENSE_2", "CHARSEQUENSE_Q", "NUMBER", "ID", "LINE_COMMENT", "SPACE"
	};
	public static final int
		RULE_program = 0, RULE_expr_list = 1, RULE_expr = 2, RULE_temp = 3, RULE_literalExpr = 4, 
		RULE_varExpr = 5, RULE_mathExpr = 6, RULE_multiplyingExpression = 7, RULE_addingExpression = 8, 
		RULE_block = 9;
	public static final String[] ruleNames = {
		"program", "expr_list", "expr", "temp", "literalExpr", "varExpr", "mathExpr", 
		"multiplyingExpression", "addingExpression", "block"
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
		public TerminalNode EOF() { return getToken(Perl6Parser.EOF, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
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
			setState(20); expr_list();
			setState(21); match(EOF);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << CHARSEQUENSE) | (1L << CHARSEQUENSE_2) | (1L << CHARSEQUENSE_Q) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(23); expr();
				setState(24); match(T__10);
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
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); temp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); varExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); literalExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34); addingExpression();
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
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 6, RULE_temp);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case T__13:
			case T__6:
				_localctx = new SayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((SayContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__6) ) {
					((SayContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(39);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(38); match(T__4);
					}
					break;
				}
				setState(41); ((SayContext)_localctx).value = expr();
				setState(43);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(42); match(T__3);
					}
					break;
				}
				}
				break;
			case T__12:
				_localctx = new CodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45); block();
				}
				break;
			case T__14:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46); match(T__14);
				setState(47); match(T__11);
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
		enterRule(_localctx, 8, RULE_literalExpr);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50); ((NumberLiteralContext)_localctx).num = match(NUMBER);
				}
				break;
			case CHARSEQUENSE:
			case CHARSEQUENSE_2:
			case CHARSEQUENSE_Q:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				switch (_input.LA(1)) {
				case CHARSEQUENSE:
					{
					setState(51); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE);
					}
					break;
				case CHARSEQUENSE_Q:
					{
					setState(52); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE_Q);
					}
					break;
				case CHARSEQUENSE_2:
					{
					setState(53); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE_2);
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
		enterRule(_localctx, 10, RULE_varExpr);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(T__5);
				setState(59); match(T__7);
				setState(60); ((CreateVarContext)_localctx).name = match(ID);
				}
				break;
			case 2:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(T__5);
				setState(62); match(T__7);
				setState(63); ((CreateVarContext)_localctx).name = match(ID);
				setState(64); match(T__8);
				setState(65); ((CreateVarContext)_localctx).value = expr();
				}
				break;
			case 3:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66); match(T__5);
				setState(67); ((CreateVarContext)_localctx).type = match(ID);
				setState(68); match(T__7);
				setState(69); ((CreateVarContext)_localctx).name = match(ID);
				}
				break;
			case 4:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70); match(T__5);
				setState(71); ((CreateVarContext)_localctx).type = match(ID);
				setState(72); match(T__7);
				setState(73); ((CreateVarContext)_localctx).name = match(ID);
				setState(74); match(T__8);
				setState(75); ((CreateVarContext)_localctx).value = expr();
				}
				break;
			case 5:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76); match(T__7);
				setState(77); ((AssignVarContext)_localctx).name = match(ID);
				setState(78); match(T__8);
				setState(79); ((AssignVarContext)_localctx).value = expr();
				}
				break;
			case 6:
				_localctx = new LoadVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80); match(T__7);
				setState(81); ((LoadVarContext)_localctx).name = match(ID);
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
		enterRule(_localctx, 12, RULE_mathExpr);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case T__14:
			case T__13:
			case T__12:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); temp();
				}
				break;
			case T__7:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); varExpr();
				}
				break;
			case CHARSEQUENSE:
			case CHARSEQUENSE_2:
			case CHARSEQUENSE_Q:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); literalExpr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87); match(T__4);
				setState(88); addingExpression();
				setState(89); match(T__3);
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
		enterRule(_localctx, 14, RULE_multiplyingExpression);
		try {
			int _alt;
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93); mathExpr();
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94); match(T__2);
						setState(95); mathExpr();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101); mathExpr();
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102); match(T__15);
						setState(103); mathExpr();
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 16, RULE_addingExpression);
		try {
			int _alt;
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111); multiplyingExpression();
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112); match(T__1);
						setState(113); multiplyingExpression();
						}
						} 
					}
					setState(118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119); multiplyingExpression();
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120); match(T__0);
						setState(121); multiplyingExpression();
						}
						} 
					}
					setState(126);
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

	public static class BlockContext extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
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
		enterRule(_localctx, 18, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(T__12);
			setState(130); expr_list();
			setState(131); match(T__9);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3"+
		"\4\5\4&\n\4\3\5\3\5\5\5*\n\5\3\5\3\5\5\5.\n\5\3\5\3\5\3\5\5\5\63\n\5\3"+
		"\6\3\6\3\6\3\6\5\69\n\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\7\tc\n\t\f\t\16\tf\13"+
		"\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\5\tp\n\t\3\n\3\n\3\n\7\nu\n\n\f"+
		"\n\16\nx\13\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\5\n\u0082\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\4\2\5\5\f\f"+
		"\u0096\2\26\3\2\2\2\4\36\3\2\2\2\6%\3\2\2\2\b\62\3\2\2\2\n:\3\2\2\2\f"+
		"T\3\2\2\2\16]\3\2\2\2\20o\3\2\2\2\22\u0081\3\2\2\2\24\u0083\3\2\2\2\26"+
		"\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32\33\7\b\2\2\33"+
		"\35\3\2\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5"+
		"\3\2\2\2 \36\3\2\2\2!&\5\b\5\2\"&\5\f\7\2#&\5\n\6\2$&\5\22\n\2%!\3\2\2"+
		"\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\')\t\2\2\2(*\7\16\2\2)(\3"+
		"\2\2\2)*\3\2\2\2*+\3\2\2\2+-\5\6\4\2,.\7\17\2\2-,\3\2\2\2-.\3\2\2\2.\63"+
		"\3\2\2\2/\63\5\24\13\2\60\61\7\4\2\2\61\63\7\7\2\2\62\'\3\2\2\2\62/\3"+
		"\2\2\2\62\60\3\2\2\2\63\t\3\2\2\2\64;\7\26\2\2\659\7\23\2\2\669\7\25\2"+
		"\2\679\7\24\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29;\3\2\2\2:\64\3\2"+
		"\2\2:8\3\2\2\2;\13\3\2\2\2<=\7\r\2\2=>\7\13\2\2>U\7\27\2\2?@\7\r\2\2@"+
		"A\7\13\2\2AB\7\27\2\2BC\7\n\2\2CU\5\6\4\2DE\7\r\2\2EF\7\27\2\2FG\7\13"+
		"\2\2GU\7\27\2\2HI\7\r\2\2IJ\7\27\2\2JK\7\13\2\2KL\7\27\2\2LM\7\n\2\2M"+
		"U\5\6\4\2NO\7\13\2\2OP\7\27\2\2PQ\7\n\2\2QU\5\6\4\2RS\7\13\2\2SU\7\27"+
		"\2\2T<\3\2\2\2T?\3\2\2\2TD\3\2\2\2TH\3\2\2\2TN\3\2\2\2TR\3\2\2\2U\r\3"+
		"\2\2\2V^\5\b\5\2W^\5\f\7\2X^\5\n\6\2YZ\7\16\2\2Z[\5\22\n\2[\\\7\17\2\2"+
		"\\^\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2^\17\3\2\2\2_d\5\16"+
		"\b\2`a\7\20\2\2ac\5\16\b\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ep\3"+
		"\2\2\2fd\3\2\2\2gl\5\16\b\2hi\7\3\2\2ik\5\16\b\2jh\3\2\2\2kn\3\2\2\2l"+
		"j\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2o_\3\2\2\2og\3\2\2\2p\21\3\2\2"+
		"\2qv\5\20\t\2rs\7\21\2\2su\5\20\t\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2w\u0082\3\2\2\2xv\3\2\2\2y~\5\20\t\2z{\7\22\2\2{}\5\20\t\2|z\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081q\3\2\2\2\u0081y\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\7\6"+
		"\2\2\u0084\u0085\5\4\3\2\u0085\u0086\7\t\2\2\u0086\25\3\2\2\2\21\36%)"+
		"-\628:T]dlov~\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}