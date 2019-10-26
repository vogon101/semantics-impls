// Generated from C:/Users/fredd/Google Drive/10. Cambridge/1. Work/2. Supervisions/24. Semantics/semantics-impls/src/main/scala/com/freddieposer/semantics/supo1/parsing\Supo1.g4 by ANTLR 4.7.2
package com.freddieposer.semantics.supo1.parsing.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Supo1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, L_PAREN=2, R_PAREN=3, L_BRACK=4, R_BRACK=5, STAR=6, PLUS=7, 
		EQ=8, IF=9, ELSE=10, RETURN=11, SEMICOLON=12, COMMA=13, INTEGER=14, IDENTIFIER=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUNCTION", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", "STAR", "PLUS", 
			"EQ", "IF", "ELSE", "RETURN", "SEMICOLON", "COMMA", "INTEGER", "IDENTIFIER", 
			"WS"
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


	public Supo1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Supo1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17O\n\17\3\17\3\17\7\17S\n\17\f\17\16"+
		"\17V\13\17\3\20\3\20\7\20Z\n\20\f\20\16\20]\13\20\3\21\3\21\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\""+
		"\"\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3"+
		"#\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2"+
		"\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25=\3\2\2\2\27B\3\2\2\2\31I\3"+
		"\2\2\2\33K\3\2\2\2\35N\3\2\2\2\37W\3\2\2\2!^\3\2\2\2#$\7h\2\2$%\7w\2\2"+
		"%&\7p\2\2&\'\7e\2\2\'(\7v\2\2()\7k\2\2)*\7q\2\2*+\7p\2\2+\4\3\2\2\2,-"+
		"\7*\2\2-\6\3\2\2\2./\7+\2\2/\b\3\2\2\2\60\61\7}\2\2\61\n\3\2\2\2\62\63"+
		"\7\177\2\2\63\f\3\2\2\2\64\65\7,\2\2\65\16\3\2\2\2\66\67\7-\2\2\67\20"+
		"\3\2\2\289\7?\2\29\22\3\2\2\2:;\7k\2\2;<\7h\2\2<\24\3\2\2\2=>\7g\2\2>"+
		"?\7n\2\2?@\7u\2\2@A\7g\2\2A\26\3\2\2\2BC\7t\2\2CD\7g\2\2DE\7v\2\2EF\7"+
		"w\2\2FG\7t\2\2GH\7p\2\2H\30\3\2\2\2IJ\7=\2\2J\32\3\2\2\2KL\7.\2\2L\34"+
		"\3\2\2\2MO\7/\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\t\2\2\2QS\t\2\2\2RQ"+
		"\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\36\3\2\2\2VT\3\2\2\2W[\t\3\2\2"+
		"XZ\t\4\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\ \3\2\2\2][\3\2\2"+
		"\2^_\t\5\2\2_`\3\2\2\2`a\b\21\2\2a\"\3\2\2\2\6\2NT[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}