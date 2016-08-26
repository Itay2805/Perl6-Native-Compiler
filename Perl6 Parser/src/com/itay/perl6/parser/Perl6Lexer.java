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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, CHARSEQUENSE=19, CHARSEQUENSE_2=20, CHARSEQUENSE_Q=21, 
		NUMBER=22, ID=23, LINE_COMMENT=24, SPACE=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "CHARSEQUENSE", "CHARSEQUENSE_2", "CHARSEQUENSE_Q", "NUMBER", 
		"DECIMAL_NUM", "OCTA_NUMBER", "HEX_NUMBER", "BINARY_NUM", "ID", "LINE_COMMENT", 
		"SPACE"
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
		case 27: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 28: SPACE_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\7\24n\n\24"+
		"\f\24\16\24q\13\24\3\24\3\24\3\25\3\25\7\25w\n\25\f\25\16\25z\13\25\3"+
		"\25\3\25\3\26\3\26\3\26\7\26\u0081\n\26\f\26\16\26\u0084\13\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u008c\n\27\3\30\3\30\7\30\u0090\n\30\f\30"+
		"\16\30\u0093\13\30\3\30\3\30\3\30\6\30\u0098\n\30\r\30\16\30\u0099\5\30"+
		"\u009c\n\30\3\31\3\31\3\31\6\31\u00a1\n\31\r\31\16\31\u00a2\3\32\3\32"+
		"\3\32\6\32\u00a8\n\32\r\32\16\32\u00a9\3\33\3\33\3\33\6\33\u00af\n\33"+
		"\r\33\16\33\u00b0\3\34\3\34\7\34\u00b5\n\34\f\34\16\34\u00b8\13\34\3\35"+
		"\3\35\7\35\u00bc\n\35\f\35\16\35\u00bf\13\35\3\35\3\35\3\36\6\36\u00c4"+
		"\n\36\r\36\16\36\u00c5\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\2\61\2\63\2\65\2\67\319\32;\33\3\2\r\5\2\f\f\17\17))\5\2\f\f\17"+
		"\17$$\4\2))\177\177\4\2\62;aa\4\2\629aa\5\2\62;aach\4\2\62\63aa\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00d3\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7C\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2"+
		"\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27Z\3\2\2"+
		"\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2"+
		"%i\3\2\2\2\'k\3\2\2\2)t\3\2\2\2+}\3\2\2\2-\u008b\3\2\2\2/\u009b\3\2\2"+
		"\2\61\u009d\3\2\2\2\63\u00a4\3\2\2\2\65\u00ab\3\2\2\2\67\u00b2\3\2\2\2"+
		"9\u00b9\3\2\2\2;\u00c3\3\2\2\2=>\7\61\2\2>\4\3\2\2\2?@\7w\2\2@A\7u\2\2"+
		"AB\7g\2\2B\6\3\2\2\2CD\7u\2\2DE\7c\2\2EF\7{\2\2F\b\3\2\2\2GH\7}\2\2H\n"+
		"\3\2\2\2IJ\7x\2\2JK\78\2\2K\f\3\2\2\2LM\7=\2\2M\16\3\2\2\2NO\7\177\2\2"+
		"O\20\3\2\2\2PQ\7?\2\2Q\22\3\2\2\2RS\7&\2\2S\24\3\2\2\2TU\7r\2\2UV\7t\2"+
		"\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\26\3\2\2\2Z[\7o\2\2[\\\7{\2\2\\\30\3\2"+
		"\2\2]^\7)\2\2^\32\3\2\2\2_`\7*\2\2`\34\3\2\2\2ab\7+\2\2b\36\3\2\2\2cd"+
		"\7,\2\2d \3\2\2\2ef\7-\2\2f\"\3\2\2\2gh\7.\2\2h$\3\2\2\2ij\7/\2\2j&\3"+
		"\2\2\2ko\7)\2\2ln\n\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qo\3\2\2\2rs\7)\2\2s(\3\2\2\2tx\7$\2\2uw\n\3\2\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|*\3\2\2\2}~\7s\2"+
		"\2~\u0082\7}\2\2\177\u0081\n\4\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\7\177\2\2\u0086,\3\2\2\2\u0087\u008c\5/\30\2\u0088"+
		"\u008c\5\61\31\2\u0089\u008c\5\63\32\2\u008a\u008c\5\65\33\2\u008b\u0087"+
		"\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		".\3\2\2\2\u008d\u0091\4\62;\2\u008e\u0090\t\5\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009c"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\62\2\2\u0095\u0097\7f\2\2\u0096"+
		"\u0098\t\5\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u008d\3\2\2\2\u009b"+
		"\u0094\3\2\2\2\u009c\60\3\2\2\2\u009d\u009e\7\62\2\2\u009e\u00a0\7q\2"+
		"\2\u009f\u00a1\t\6\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7\62\2\2\u00a5"+
		"\u00a7\7z\2\2\u00a6\u00a8\t\7\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\64\3\2\2\2\u00ab\u00ac"+
		"\7\62\2\2\u00ac\u00ae\7d\2\2\u00ad\u00af\t\b\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\66\3\2\2"+
		"\2\u00b2\u00b6\t\t\2\2\u00b3\u00b5\t\n\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b78\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bd\7%\2\2\u00ba\u00bc\n\13\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\35\2\2\u00c1:\3\2\2\2"+
		"\u00c2\u00c4\t\f\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\36\3\2"+
		"\u00c8<\3\2\2\2\20\2ox\u0082\u008b\u0091\u0099\u009b\u00a2\u00a9\u00b0"+
		"\u00b6\u00bd\u00c5\4\3\35\2\3\36\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}