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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		CHARSEQUENSE_Q=10, NUMBER=11, ID=12, SPACE=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'$'", "'say'", "'my'", "'('", "')'", "'{'", "';'", "'}'", 
		"'='", "CHARSEQUENSE_Q", "NUMBER", "ID", "SPACE"
	};
	public static final int
		RULE_program = 0, RULE_expr_list = 1, RULE_expr = 2, RULE_block = 3;
	public static final String[] ruleNames = {
		"program", "expr_list", "expr", "block"
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
			setState(8); expr_list();
			setState(9); match(EOF);
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__3) | (1L << T__2) | (1L << CHARSEQUENSE_Q) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(11); expr();
				setState(12); match(T__2);
				}
				}
				setState(18);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateVarContext extends ExprContext {
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
		public CreateVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitCreateVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadVarContext extends ExprContext {
		public Token name;
		public TerminalNode ID() { return getToken(Perl6Parser.ID, 0); }
		public LoadVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitLoadVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarContext extends ExprContext {
		public Token name;
		public ExprContext value;
		public TerminalNode ID() { return getToken(Perl6Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ExprContext {
		public Token str;
		public TerminalNode CHARSEQUENSE_Q() { return getToken(Perl6Parser.CHARSEQUENSE_Q, 0); }
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeBlockContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CodeBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SayContext extends ExprContext {
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitSay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberLiteralContext extends ExprContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(Perl6Parser.NUMBER, 0); }
		public NumberLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Perl6Visitor ) return ((Perl6Visitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19); match(T__6);
				setState(20); match(T__8);
				setState(21); ((CreateVarContext)_localctx).name = match(ID);
				}
				break;
			case 2:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22); match(T__6);
				setState(23); match(T__8);
				setState(24); ((CreateVarContext)_localctx).name = match(ID);
				setState(25); match(T__0);
				setState(26); ((CreateVarContext)_localctx).value = expr();
				}
				break;
			case 3:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27); match(T__6);
				setState(28); ((CreateVarContext)_localctx).type = match(ID);
				setState(29); match(T__8);
				setState(30); ((CreateVarContext)_localctx).name = match(ID);
				}
				break;
			case 4:
				_localctx = new CreateVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31); match(T__6);
				setState(32); ((CreateVarContext)_localctx).type = match(ID);
				setState(33); match(T__8);
				setState(34); ((CreateVarContext)_localctx).name = match(ID);
				setState(35); match(T__0);
				setState(36); ((CreateVarContext)_localctx).value = expr();
				}
				break;
			case 5:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37); match(T__8);
				setState(38); ((AssignVarContext)_localctx).name = match(ID);
				setState(39); match(T__0);
				setState(40); ((AssignVarContext)_localctx).value = expr();
				}
				break;
			case 6:
				_localctx = new LoadVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(41); match(T__8);
				setState(42); ((LoadVarContext)_localctx).name = match(ID);
				}
				break;
			case 7:
				_localctx = new SayContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(43); match(T__7);
				setState(45);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(44); match(T__5);
					}
				}

				setState(47); ((SayContext)_localctx).value = expr();
				setState(49);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(48); match(T__4);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new CodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(51); block();
				}
				break;
			case 9:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(52); ((NumberLiteralContext)_localctx).num = match(NUMBER);
				}
				break;
			case 10:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(54);
				_la = _input.LA(1);
				if (_la==CHARSEQUENSE_Q) {
					{
					setState(53); ((StringLiteralContext)_localctx).str = match(CHARSEQUENSE_Q);
					}
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
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(T__3);
			setState(59); expr_list();
			setState(60); match(T__1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17A\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\5\4\64\n\4\3\4\3"+
		"\4\3\4\5\49\n\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2I\2\n\3"+
		"\2\2\2\4\22\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f"+
		"\3\3\2\2\2\r\16\5\6\4\2\16\17\7\t\2\2\17\21\3\2\2\2\20\r\3\2\2\2\21\24"+
		"\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\5\3\2\2\2\24\22\3\2\2\2\25\26"+
		"\7\5\2\2\26\27\7\3\2\2\27;\7\16\2\2\30\31\7\5\2\2\31\32\7\3\2\2\32\33"+
		"\7\16\2\2\33\34\7\13\2\2\34;\5\6\4\2\35\36\7\5\2\2\36\37\7\16\2\2\37 "+
		"\7\3\2\2 ;\7\16\2\2!\"\7\5\2\2\"#\7\16\2\2#$\7\3\2\2$%\7\16\2\2%&\7\13"+
		"\2\2&;\5\6\4\2\'(\7\3\2\2()\7\16\2\2)*\7\13\2\2*;\5\6\4\2+,\7\3\2\2,;"+
		"\7\16\2\2-/\7\4\2\2.\60\7\6\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\5\6\4\2\62\64\7\7\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64;\3\2\2\2\65;"+
		"\5\b\5\2\66;\7\r\2\2\679\7\f\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:\25\3"+
		"\2\2\2:\30\3\2\2\2:\35\3\2\2\2:!\3\2\2\2:\'\3\2\2\2:+\3\2\2\2:-\3\2\2"+
		"\2:\65\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;\7\3\2\2\2<=\7\b\2\2=>\5\4\3\2>?"+
		"\7\n\2\2?\t\3\2\2\2\7\22/\638:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}