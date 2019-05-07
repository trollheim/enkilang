// Generated from Enki.g4 by ANTLR 4.4
package org.trollheim.lang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnkiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, TypeId=12, Id=13, TYPE_BASE=14, TYPE_BOOL=15, TYPE_STRING=16, 
		TYPE_NUMBER=17, TYPE_BYTEBUF=18, TYPE_FUNCTION=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "'typedef'", "'('", "')'", "':'", "'{'", "'<'", "','", 
		"'}'", "'='", "'>'", "TypeId", "Id", "'Base'", "'Bool'", "'Str'", "'Num'", 
		"'ByteBuf'", "'func'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_typedef = 1, RULE_typearguments = 2, RULE_typeargument = 3, 
		RULE_baseType = 4, RULE_type = 5, RULE_type_function = 6, RULE_f_types_out = 7, 
		RULE_f_types_in = 8, RULE_my_rule = 9;
	public static final String[] ruleNames = {
		"program", "typedef", "typearguments", "typeargument", "baseType", "type", 
		"type_function", "f_types_out", "f_types_in", "my_rule"
	};

	@Override
	public String getGrammarFileName() { return "Enki.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnkiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(20); typedef();
				}
				}
				setState(25);
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

	public static class TypedefContext extends ParserRuleContext {
		public TypeargumentsContext typearguments() {
			return getRuleContext(TypeargumentsContext.class,0);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode TypeId() { return getToken(EnkiParser.TypeId, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typedef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(T__9);
			setState(27); match(TypeId);
			setState(28); match(T__1);
			setState(29); baseType();
			setState(30); match(T__8);
			setState(32);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(31); typearguments();
				}
			}

			setState(34); match(T__7);
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

	public static class TypeargumentsContext extends ParserRuleContext {
		public TypeargumentContext typeargument(int i) {
			return getRuleContext(TypeargumentContext.class,i);
		}
		public List<TypeargumentContext> typeargument() {
			return getRuleContexts(TypeargumentContext.class);
		}
		public TypeargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typearguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterTypearguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitTypearguments(this);
		}
	}

	public final TypeargumentsContext typearguments() throws RecognitionException {
		TypeargumentsContext _localctx = new TypeargumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typearguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(T__5);
			setState(37); typeargument();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(38); match(T__3);
				setState(39); typeargument();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45); match(T__2);
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

	public static class TypeargumentContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(EnkiParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterTypeargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitTypeargument(this);
		}
	}

	public final TypeargumentContext typeargument() throws RecognitionException {
		TypeargumentContext _localctx = new TypeargumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeargument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(Id);
			setState(48); match(T__6);
			setState(49); type();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_BASE() { return getToken(EnkiParser.TYPE_BASE, 0); }
		public TerminalNode TypeId() { return getToken(EnkiParser.TypeId, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitBaseType(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==TypeId || _la==TYPE_BASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public Type_functionContext type_function() {
			return getRuleContext(Type_functionContext.class,0);
		}
		public TerminalNode TYPE_BYTEBUF() { return getToken(EnkiParser.TYPE_BYTEBUF, 0); }
		public TerminalNode TYPE_STRING() { return getToken(EnkiParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(EnkiParser.TYPE_BOOL, 0); }
		public TerminalNode TypeId() { return getToken(EnkiParser.TypeId, 0); }
		public TerminalNode TYPE_NUMBER() { return getToken(EnkiParser.TYPE_NUMBER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case TYPE_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); type_function();
				}
				break;
			case TYPE_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(TYPE_NUMBER);
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); match(TYPE_STRING);
				}
				break;
			case TYPE_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); match(TYPE_BOOL);
				}
				break;
			case TYPE_BYTEBUF:
				enterOuterAlt(_localctx, 5);
				{
				setState(57); match(TYPE_BYTEBUF);
				}
				break;
			case TypeId:
				enterOuterAlt(_localctx, 6);
				{
				setState(58); match(TypeId);
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

	public static class Type_functionContext extends ParserRuleContext {
		public F_types_outContext f_types_out() {
			return getRuleContext(F_types_outContext.class,0);
		}
		public F_types_inContext f_types_in() {
			return getRuleContext(F_types_inContext.class,0);
		}
		public TerminalNode TYPE_FUNCTION() { return getToken(EnkiParser.TYPE_FUNCTION, 0); }
		public Type_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterType_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitType_function(this);
		}
	}

	public final Type_functionContext type_function() throws RecognitionException {
		Type_functionContext _localctx = new Type_functionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(TYPE_FUNCTION);
			setState(62); match(T__4);
			setState(63); f_types_in();
			setState(64); match(T__10);
			setState(65); f_types_out();
			setState(66); match(T__0);
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

	public static class F_types_outContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public F_types_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_types_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterF_types_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitF_types_out(this);
		}
	}

	public final F_types_outContext f_types_out() throws RecognitionException {
		F_types_outContext _localctx = new F_types_outContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_f_types_out);
		int _la;
		try {
			setState(80);
			switch (_input.LA(1)) {
			case TypeId:
			case TYPE_BOOL:
			case TYPE_STRING:
			case TYPE_NUMBER:
			case TYPE_BYTEBUF:
			case TYPE_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); type();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(69); match(T__8);
				setState(70); type();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(71); match(T__3);
					setState(72); type();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78); match(T__7);
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

	public static class F_types_inContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public F_types_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_types_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterF_types_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitF_types_in(this);
		}
	}

	public final F_types_inContext f_types_in() throws RecognitionException {
		F_types_inContext _localctx = new F_types_inContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_f_types_in);
		int _la;
		try {
			setState(94);
			switch (_input.LA(1)) {
			case TypeId:
			case TYPE_BOOL:
			case TYPE_STRING:
			case TYPE_NUMBER:
			case TYPE_BYTEBUF:
			case TYPE_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); type();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(83); match(T__8);
				setState(84); type();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(85); match(T__3);
					setState(86); type();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92); match(T__7);
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

	public static class My_ruleContext extends ParserRuleContext {
		public Type_functionContext type_function() {
			return getRuleContext(Type_functionContext.class,0);
		}
		public TerminalNode Id() { return getToken(EnkiParser.Id, 0); }
		public My_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).enterMy_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkiListener ) ((EnkiListener)listener).exitMy_rule(this);
		}
	}

	public final My_ruleContext my_rule() throws RecognitionException {
		My_ruleContext _localctx = new My_ruleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_my_rule);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(Id);
				}
				break;
			case TYPE_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); type_function();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\nZ\n\n\f\n\16\n]\13\n\3\n\3\n\5\na\n\n\3\13\3\13\5\13e\n\13"+
		"\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\4\2\16\16\20\20i\2\31\3\2\2\2"+
		"\4\34\3\2\2\2\6&\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f=\3\2\2\2\16?\3\2"+
		"\2\2\20R\3\2\2\2\22`\3\2\2\2\24d\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30"+
		"\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34"+
		"\35\7\4\2\2\35\36\7\16\2\2\36\37\7\f\2\2\37 \5\n\6\2 \"\7\5\2\2!#\5\6"+
		"\4\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\6\2\2%\5\3\2\2\2&\'\7\b\2\2\'"+
		",\5\b\5\2()\7\n\2\2)+\5\b\5\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-/\3\2\2\2.,\3\2\2\2/\60\7\13\2\2\60\7\3\2\2\2\61\62\7\17\2\2\62\63\7"+
		"\7\2\2\63\64\5\f\7\2\64\t\3\2\2\2\65\66\t\2\2\2\66\13\3\2\2\2\67>\5\16"+
		"\b\28>\7\23\2\29>\7\22\2\2:>\7\21\2\2;>\7\24\2\2<>\7\16\2\2=\67\3\2\2"+
		"\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\r\3\2\2\2?@\7\25"+
		"\2\2@A\7\t\2\2AB\5\22\n\2BC\7\3\2\2CD\5\20\t\2DE\7\r\2\2E\17\3\2\2\2F"+
		"S\5\f\7\2GH\7\5\2\2HM\5\f\7\2IJ\7\n\2\2JL\5\f\7\2KI\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\6\2\2QS\3\2\2\2RF\3\2\2\2"+
		"RG\3\2\2\2S\21\3\2\2\2Ta\5\f\7\2UV\7\5\2\2V[\5\f\7\2WX\7\n\2\2XZ\5\f\7"+
		"\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\6"+
		"\2\2_a\3\2\2\2`T\3\2\2\2`U\3\2\2\2a\23\3\2\2\2be\7\17\2\2ce\5\16\b\2d"+
		"b\3\2\2\2dc\3\2\2\2e\25\3\2\2\2\13\31\",=MR[`d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}