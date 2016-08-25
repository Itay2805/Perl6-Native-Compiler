// Generated from Perl6.g4 by ANTLR 4.4

	package com.itay.perl6.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Perl6Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		CHARSEQUENSE=17, CHARSEQUENSE_2=18, CHARSEQUENSE_Q=19, NUMBER=20, ID=21, 
		LINE_COMMENT=22, SPACE=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "CHARSEQUENSE", 
		"CHARSEQUENSE_2", "CHARSEQUENSE_Q", "NUMBER", "ID", "LINE_COMMENT", "SPACE"
	};


	public Perl6Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Perl6.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 22: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\7\22^\n\22\f\22\16\22"+
		"a\13\22\3\22\3\22\3\23\3\23\7\23g\n\23\f\23\16\23j\13\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24q\n\24\f\24\16\24t\13\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"{\n\25\f\25\16\25~\13\25\5\25\u0080\n\25\3\26\3\26\7\26\u0084\n\26\f\26"+
		"\16\26\u0087\13\26\3\27\3\27\7\27\u008b\n\27\f\27\16\27\u008e\13\27\3"+
		"\27\3\27\3\30\6\30\u0093\n\30\r\30\16\30\u0094\3\30\3\30\2\2\31\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\t\5\2\f\f\17\17))\5\2\f\f\17\17"+
		"$$\4\2))\177\177\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13=\3\2"+
		"\2\2\r@\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27N\3"+
		"\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!Y\3\2\2\2#[\3\2"+
		"\2\2%d\3\2\2\2\'m\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0088\3\2\2\2/"+
		"\u0092\3\2\2\2\61\62\7\61\2\2\62\4\3\2\2\2\63\64\7w\2\2\64\65\7u\2\2\65"+
		"\66\7g\2\2\66\6\3\2\2\2\678\7u\2\289\7c\2\29:\7{\2\2:\b\3\2\2\2;<\7}\2"+
		"\2<\n\3\2\2\2=>\7x\2\2>?\78\2\2?\f\3\2\2\2@A\7=\2\2A\16\3\2\2\2BC\7\177"+
		"\2\2C\20\3\2\2\2DE\7?\2\2E\22\3\2\2\2FG\7&\2\2G\24\3\2\2\2HI\7r\2\2IJ"+
		"\7t\2\2JK\7k\2\2KL\7p\2\2LM\7v\2\2M\26\3\2\2\2NO\7o\2\2OP\7{\2\2P\30\3"+
		"\2\2\2QR\7*\2\2R\32\3\2\2\2ST\7+\2\2T\34\3\2\2\2UV\7,\2\2V\36\3\2\2\2"+
		"WX\7-\2\2X \3\2\2\2YZ\7/\2\2Z\"\3\2\2\2[_\7)\2\2\\^\n\2\2\2]\\\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7)\2\2c$\3\2\2\2"+
		"dh\7$\2\2eg\n\3\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2kl\7$\2\2l&\3\2\2\2mn\7s\2\2nr\7}\2\2oq\n\4\2\2po\3\2\2\2qt"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\177\2\2v(\3\2\2\2"+
		"w\u0080\7\62\2\2x|\4\63;\2y{\4\62;\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3\2\2\2\177x\3\2\2\2\u0080*\3\2\2"+
		"\2\u0081\u0085\t\5\2\2\u0082\u0084\t\6\2\2\u0083\u0082\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086,\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008c\7%\2\2\u0089\u008b\n\7\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\27\2\2\u0090.\3\2\2\2"+
		"\u0091\u0093\t\b\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\30\3\2"+
		"\u0097\60\3\2\2\2\13\2_hr|\177\u0085\u008c\u0094\4\3\27\2\3\30\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}