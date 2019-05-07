// Generated from Enki.g4 by ANTLR 4.4
package org.trollheim.lang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnkiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, TypeId=12, Id=13, TYPE_BASE=14, TYPE_BOOL=15, TYPE_STRING=16, 
		TYPE_NUMBER=17, TYPE_BYTEBUF=18, TYPE_FUNCTION=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "TypeId", "Id", "TYPE_BASE", "TYPE_BOOL", "TYPE_STRING", 
		"TYPE_NUMBER", "TYPE_BYTEBUF", "TYPE_FUNCTION", "WS"
	};


	public EnkiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enki.g4"; }

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\6\rK\n\r\r\r\16\rL\3\16\3\16\7\16Q\n\16\f\16\16\16T\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\6\25v\n\25\r\25\16\25w\3\25\3\25\2\2\26\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2c|\5\2\13\f\17\17"+
		"\"\"}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7\66"+
		"\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23"+
		"B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33N\3\2\2\2\35U\3\2\2\2"+
		"\37Z\3\2\2\2!_\3\2\2\2#c\3\2\2\2%g\3\2\2\2\'o\3\2\2\2)u\3\2\2\2+,\7/\2"+
		"\2,-\7@\2\2-\4\3\2\2\2./\7v\2\2/\60\7{\2\2\60\61\7r\2\2\61\62\7g\2\2\62"+
		"\63\7f\2\2\63\64\7g\2\2\64\65\7h\2\2\65\6\3\2\2\2\66\67\7*\2\2\67\b\3"+
		"\2\2\289\7+\2\29\n\3\2\2\2:;\7<\2\2;\f\3\2\2\2<=\7}\2\2=\16\3\2\2\2>?"+
		"\7>\2\2?\20\3\2\2\2@A\7.\2\2A\22\3\2\2\2BC\7\177\2\2C\24\3\2\2\2DE\7?"+
		"\2\2E\26\3\2\2\2FG\7@\2\2G\30\3\2\2\2HJ\t\2\2\2IK\t\3\2\2JI\3\2\2\2KL"+
		"\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\32\3\2\2\2NR\t\4\2\2OQ\t\3\2\2PO\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\34\3\2\2\2TR\3\2\2\2UV\7D\2\2VW\7c\2\2"+
		"WX\7u\2\2XY\7g\2\2Y\36\3\2\2\2Z[\7D\2\2[\\\7q\2\2\\]\7q\2\2]^\7n\2\2^"+
		" \3\2\2\2_`\7U\2\2`a\7v\2\2ab\7t\2\2b\"\3\2\2\2cd\7P\2\2de\7w\2\2ef\7"+
		"o\2\2f$\3\2\2\2gh\7D\2\2hi\7{\2\2ij\7v\2\2jk\7g\2\2kl\7D\2\2lm\7w\2\2"+
		"mn\7h\2\2n&\3\2\2\2op\7h\2\2pq\7w\2\2qr\7p\2\2rs\7e\2\2s(\3\2\2\2tv\t"+
		"\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\25\2\2z*"+
		"\3\2\2\2\6\2LRw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}