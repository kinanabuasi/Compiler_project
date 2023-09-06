// Generated from C:/Users/VISION/IdeaProjects/Compiler_Project_V4/src/antlr\parserproject.g4 by ANTLR 4.10.1
package antlr;

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parserproject extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, Package=2, VAR=3, LIST=4, BOOL_TYPE=5, Double_TYPE=6, INT_TYPE=7, 
		STRING_TYPE=8, FINAL=9, LATE=10, VOID=11, DOTEDART=12, TRUE=13, FALSE=14, 
		IF=15, NULL=16, ABSTRACT=17, CLASS=18, RETURN=19, PRINT=20, MAP=21, FOR=22, 
		EXTENDES=23, StatefulWidget=24, StatelessWidget=25, Const=26, Key=27, 
		Super=28, Override=29, State=30, Build=31, CreateState=32, Widget=33, 
		BUILD=34, ITEM=35, ITEMBUILDER1=36, Scaffold=37, AppBar=38, AppBar1=39, 
		Title=40, TEXT=41, BODY=42, Width=43, Hieght=44, Only=45, TOP=46, Center=47, 
		ROW=48, Children=49, Container=50, List_View=51, Builder=52, GestureDetector=53, 
		COLUMN=54, Length=55, Index=56, ONTAP=57, SetState=58, Color=59, Colors=60, 
		GRAY=61, Padding=62, Padding_BigP=63, EdgeInsets=64, All=65, ObscureText=66, 
		TextField=67, Decoration=68, InputDecoration=69, Border=70, OutlineInputBorder=71, 
		LabelText=72, HintText=73, Boxdecoration=74, BorderRadius=75, BorderRadius1=76, 
		Circular=77, ElevatedButton=78, OnPressed=79, CHILD=80, Image=81, ASSET=82, 
		LIB=83, IMAGES=84, PNG=85, SizedBox=86, Expanded=87, CONTEXTE=88, COTATION=89, 
		COMA=90, QoOrSmal=91, QcOrBig=92, SmalOrEQUAL=93, BigOrEQUAL=94, SlashOrDivision=95, 
		DOTSLASH=96, TOWDOTSLASH=97, COMA1=98, DOTE=99, MULT=100, SUM=101, MINUS=102, 
		EQUAL=103, EqualEqual=104, NotEqual=105, DOUBLE_ZERO=106, OPEN_ARCH_LIST=107, 
		CLOSE_ARCH_LIST=108, OQCLASS=109, CQCLASS=110, OQFUNC=111, CQFUNC=112, 
		BLUSBLUS=113, MINUSMINUS=114, TOWPOIT=115, QUESTION_MARK=116, AT=117, 
		AROW=118, ADER_SCORE=119, Dolar=120, STRING=121, StringTitelWithDolar=122, 
		Target=123, NUMBER=124, DoubleNUMBER=125, ID=126, WS=127;
	public static final int
		RULE_prog = 0, RULE_libraryDefinition = 1, RULE_classDefinition = 2, RULE_normalclassDefinition = 3, 
		RULE_futerrclassDefinition = 4, RULE_statefulWidget = 5, RULE_statelessWidget = 6, 
		RULE_buildScreen = 7, RULE_flutterline = 8, RULE_appBar = 9, RULE_body = 10, 
		RULE_columns = 11, RULE_rows = 12, RULE_children = 13, RULE_list_view = 14, 
		RULE_itemCount = 15, RULE_itemBuilder = 16, RULE_gestureDetector = 17, 
		RULE_widgets = 18, RULE_container = 19, RULE_containerBody = 20, RULE_expanded = 21, 
		RULE_child = 22, RULE_sizedBox = 23, RULE_width = 24, RULE_hieght = 25, 
		RULE_onTap = 26, RULE_setState = 27, RULE_color = 28, RULE_padding = 29, 
		RULE_title = 30, RULE_padding_bigP = 31, RULE_center = 32, RULE_text_Failed = 33, 
		RULE_elevatedButton = 34, RULE_obscureText = 35, RULE_decoration = 36, 
		RULE_container_decoration = 37, RULE_borderRadius = 38, RULE_border = 39, 
		RULE_labeltext = 40, RULE_hinttext = 41, RULE_image = 42, RULE_stringImage = 43, 
		RULE_line = 44, RULE_uri = 45, RULE_className = 46, RULE_folderName = 47, 
		RULE_variabelDefinition = 48, RULE_functionDefinition = 49, RULE_voidFunction = 50, 
		RULE_typeFunction = 51, RULE_ifDefinition = 52, RULE_forDefinition = 53, 
		RULE_for = 54, RULE_qcOrBig = 55, RULE_qoOrSmal = 56, RULE_smalOrEQUAL = 57, 
		RULE_bigOrEQUAL = 58, RULE_equalEqual = 59, RULE_notEqual = 60, RULE_variablecondition = 61, 
		RULE_condition = 62, RULE_exp = 63, RULE_trueBoolVar = 64, RULE_mapDefinition = 65, 
		RULE_parameters = 66, RULE_publicTyeps = 67, RULE_print = 68, RULE_leteOrFinal = 69, 
		RULE_varOrType = 70, RULE_lineWithType = 71, RULE_variabelForType = 72, 
		RULE_listType = 73, RULE_value = 74, RULE_valueKey = 75, RULE_valueValue = 76, 
		RULE_value1 = 77, RULE_value2 = 78, RULE_value3 = 79, RULE_value4 = 80;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "libraryDefinition", "classDefinition", "normalclassDefinition", 
			"futerrclassDefinition", "statefulWidget", "statelessWidget", "buildScreen", 
			"flutterline", "appBar", "body", "columns", "rows", "children", "list_view", 
			"itemCount", "itemBuilder", "gestureDetector", "widgets", "container", 
			"containerBody", "expanded", "child", "sizedBox", "width", "hieght", 
			"onTap", "setState", "color", "padding", "title", "padding_bigP", "center", 
			"text_Failed", "elevatedButton", "obscureText", "decoration", "container_decoration", 
			"borderRadius", "border", "labeltext", "hinttext", "image", "stringImage", 
			"line", "uri", "className", "folderName", "variabelDefinition", "functionDefinition", 
			"voidFunction", "typeFunction", "ifDefinition", "forDefinition", "for", 
			"qcOrBig", "qoOrSmal", "smalOrEQUAL", "bigOrEQUAL", "equalEqual", "notEqual", 
			"variablecondition", "condition", "exp", "trueBoolVar", "mapDefinition", 
			"parameters", "publicTyeps", "print", "leteOrFinal", "varOrType", "lineWithType", 
			"variabelForType", "listType", "value", "valueKey", "valueValue", "value1", 
			"value2", "value3", "value4"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'package'", "'var'", "'List'", "'bool '", "'double '", 
			"'int'", "'String'", "'final '", "'late'", "'void'", "'.dart'", "'true'", 
			"'false'", "'if'", "'null'", "'abstract'", "'class'", "'return'", "'print'", 
			"'map'", "'for'", "'extends'", "'StatefulWidget'", "'StatelessWidget'", 
			"'const'", "'key'", "'super'", "'override'", "'State'", "'build'", "'createState'", 
			"'Widget'", "'BuildContext'", "'itemCount'", "'itemBuilder'", "'Scaffold'", 
			"'appBar'", "'AppBar'", "'title'", "'Text'", "'body'", "'width'", "'height'", 
			"'only'", "'top'", "'Center'", "'Row'", "'children'", "'Container'", 
			"'ListView'", "'builder'", "'GestureDetector'", "'Column'", "'length'", 
			"'index'", "'onTap'", "'setState'", "'color'", "'Colors'", "'gray'", 
			"'padding'", "'Padding'", "'EdgeInsets'", "'all'", "'obscureText'", "'TextField'", 
			"'decoration'", "'InputDecoration'", "'border'", "'OutlineInputBorder'", 
			"'labelText'", "'hintText'", "'BoxDecoration'", "'borderRadius'", "'BorderRadius'", 
			"'circular'", "'ElevatedButton'", "'onPressed'", "'child'", "'Image'", 
			"'asset'", "'lib'", "'images'", "'png'", "'SizedBox'", "'Expanded'", 
			"'context'", "'\"'", "';'", "'<'", "'>'", "'<='", "'>='", "'/'", "'./'", 
			"'../'", "','", "'.'", "'*'", "'+'", "'-'", "'='", "'=='", "'!='", "'0.0'", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", "'++'", "'--'", "':'", "'?'", 
			"'@'", "'=>'", "'_'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "Package", "VAR", "LIST", "BOOL_TYPE", "Double_TYPE", 
			"INT_TYPE", "STRING_TYPE", "FINAL", "LATE", "VOID", "DOTEDART", "TRUE", 
			"FALSE", "IF", "NULL", "ABSTRACT", "CLASS", "RETURN", "PRINT", "MAP", 
			"FOR", "EXTENDES", "StatefulWidget", "StatelessWidget", "Const", "Key", 
			"Super", "Override", "State", "Build", "CreateState", "Widget", "BUILD", 
			"ITEM", "ITEMBUILDER1", "Scaffold", "AppBar", "AppBar1", "Title", "TEXT", 
			"BODY", "Width", "Hieght", "Only", "TOP", "Center", "ROW", "Children", 
			"Container", "List_View", "Builder", "GestureDetector", "COLUMN", "Length", 
			"Index", "ONTAP", "SetState", "Color", "Colors", "GRAY", "Padding", "Padding_BigP", 
			"EdgeInsets", "All", "ObscureText", "TextField", "Decoration", "InputDecoration", 
			"Border", "OutlineInputBorder", "LabelText", "HintText", "Boxdecoration", 
			"BorderRadius", "BorderRadius1", "Circular", "ElevatedButton", "OnPressed", 
			"CHILD", "Image", "ASSET", "LIB", "IMAGES", "PNG", "SizedBox", "Expanded", 
			"CONTEXTE", "COTATION", "COMA", "QoOrSmal", "QcOrBig", "SmalOrEQUAL", 
			"BigOrEQUAL", "SlashOrDivision", "DOTSLASH", "TOWDOTSLASH", "COMA1", 
			"DOTE", "MULT", "SUM", "MINUS", "EQUAL", "EqualEqual", "NotEqual", "DOUBLE_ZERO", 
			"OPEN_ARCH_LIST", "CLOSE_ARCH_LIST", "OQCLASS", "CQCLASS", "OQFUNC", 
			"CQFUNC", "BLUSBLUS", "MINUSMINUS", "TOWPOIT", "QUESTION_MARK", "AT", 
			"AROW", "ADER_SCORE", "Dolar", "STRING", "StringTitelWithDolar", "Target", 
			"NUMBER", "DoubleNUMBER", "ID", "WS"
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
	public String getGrammarFileName() { return "parserproject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parserproject(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(parserproject.EOF, 0); }
		public List<LibraryDefinitionContext> libraryDefinition() {
			return getRuleContexts(LibraryDefinitionContext.class);
		}
		public LibraryDefinitionContext libraryDefinition(int i) {
			return getRuleContext(LibraryDefinitionContext.class,i);
		}
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(162);
				libraryDefinition();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				classDefinition();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ABSTRACT || _la==CLASS );
			setState(173);
			match(EOF);
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

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(parserproject.IMPORT, 0); }
		public List<TerminalNode> COTATION() { return getTokens(parserproject.COTATION); }
		public TerminalNode COTATION(int i) {
			return getToken(parserproject.COTATION, i);
		}
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterLibraryDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitLibraryDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitLibraryDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libraryDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IMPORT);
			setState(176);
			match(COTATION);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(177);
				uri();
				}
				break;
			case 2:
				{
				setState(178);
				className();
				}
				break;
			}
			setState(181);
			match(COTATION);
			setState(182);
			match(COMA);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public NormalclassDefinitionContext normalclassDefinition() {
			return getRuleContext(NormalclassDefinitionContext.class,0);
		}
		public FuterrclassDefinitionContext futerrclassDefinition() {
			return getRuleContext(FuterrclassDefinitionContext.class,0);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefinition);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				normalclassDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				futerrclassDefinition();
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

	public static class NormalclassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(parserproject.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(parserproject.ID); }
		public TerminalNode ID(int i) {
			return getToken(parserproject.ID, i);
		}
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public TerminalNode ABSTRACT() { return getToken(parserproject.ABSTRACT, 0); }
		public TerminalNode EXTENDES() { return getToken(parserproject.EXTENDES, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public NormalclassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalclassDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterNormalclassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitNormalclassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitNormalclassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalclassDefinitionContext normalclassDefinition() throws RecognitionException {
		NormalclassDefinitionContext _localctx = new NormalclassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalclassDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(188);
				match(ABSTRACT);
				}
			}

			setState(191);
			match(CLASS);
			setState(192);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDES) {
				{
				setState(193);
				match(EXTENDES);
				setState(194);
				match(ID);
				}
			}

			setState(197);
			match(OQCLASS);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
				{
				{
				setState(198);
				line();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(CQCLASS);
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

	public static class FuterrclassDefinitionContext extends ParserRuleContext {
		public StatefulWidgetContext statefulWidget() {
			return getRuleContext(StatefulWidgetContext.class,0);
		}
		public StatelessWidgetContext statelessWidget() {
			return getRuleContext(StatelessWidgetContext.class,0);
		}
		public FuterrclassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futerrclassDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterFuterrclassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitFuterrclassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitFuterrclassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuterrclassDefinitionContext futerrclassDefinition() throws RecognitionException {
		FuterrclassDefinitionContext _localctx = new FuterrclassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_futerrclassDefinition);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				statefulWidget();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				statelessWidget();
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

	public static class StatefulWidgetContext extends ParserRuleContext {
		public List<TerminalNode> CLASS() { return getTokens(parserproject.CLASS); }
		public TerminalNode CLASS(int i) {
			return getToken(parserproject.CLASS, i);
		}
		public List<TerminalNode> ID() { return getTokens(parserproject.ID); }
		public TerminalNode ID(int i) {
			return getToken(parserproject.ID, i);
		}
		public List<TerminalNode> EXTENDES() { return getTokens(parserproject.EXTENDES); }
		public TerminalNode EXTENDES(int i) {
			return getToken(parserproject.EXTENDES, i);
		}
		public TerminalNode StatefulWidget() { return getToken(parserproject.StatefulWidget, 0); }
		public List<TerminalNode> OQCLASS() { return getTokens(parserproject.OQCLASS); }
		public TerminalNode OQCLASS(int i) {
			return getToken(parserproject.OQCLASS, i);
		}
		public TerminalNode Const() { return getToken(parserproject.Const, 0); }
		public List<TerminalNode> OQFUNC() { return getTokens(parserproject.OQFUNC); }
		public TerminalNode OQFUNC(int i) {
			return getToken(parserproject.OQFUNC, i);
		}
		public List<TerminalNode> Key() { return getTokens(parserproject.Key); }
		public TerminalNode Key(int i) {
			return getToken(parserproject.Key, i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(parserproject.QUESTION_MARK, 0); }
		public List<TerminalNode> CQCLASS() { return getTokens(parserproject.CQCLASS); }
		public TerminalNode CQCLASS(int i) {
			return getToken(parserproject.CQCLASS, i);
		}
		public List<TerminalNode> CQFUNC() { return getTokens(parserproject.CQFUNC); }
		public TerminalNode CQFUNC(int i) {
			return getToken(parserproject.CQFUNC, i);
		}
		public List<TerminalNode> TOWPOIT() { return getTokens(parserproject.TOWPOIT); }
		public TerminalNode TOWPOIT(int i) {
			return getToken(parserproject.TOWPOIT, i);
		}
		public TerminalNode Super() { return getToken(parserproject.Super, 0); }
		public List<TerminalNode> COMA() { return getTokens(parserproject.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(parserproject.COMA, i);
		}
		public TerminalNode AT() { return getToken(parserproject.AT, 0); }
		public TerminalNode Override() { return getToken(parserproject.Override, 0); }
		public List<TerminalNode> State() { return getTokens(parserproject.State); }
		public TerminalNode State(int i) {
			return getToken(parserproject.State, i);
		}
		public List<TerminalNode> QoOrSmal() { return getTokens(parserproject.QoOrSmal); }
		public TerminalNode QoOrSmal(int i) {
			return getToken(parserproject.QoOrSmal, i);
		}
		public List<TerminalNode> QcOrBig() { return getTokens(parserproject.QcOrBig); }
		public TerminalNode QcOrBig(int i) {
			return getToken(parserproject.QcOrBig, i);
		}
		public TerminalNode CreateState() { return getToken(parserproject.CreateState, 0); }
		public TerminalNode AROW() { return getToken(parserproject.AROW, 0); }
		public List<TerminalNode> ADER_SCORE() { return getTokens(parserproject.ADER_SCORE); }
		public TerminalNode ADER_SCORE(int i) {
			return getToken(parserproject.ADER_SCORE, i);
		}
		public BuildScreenContext buildScreen() {
			return getRuleContext(BuildScreenContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(parserproject.ABSTRACT, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StatefulWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statefulWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterStatefulWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitStatefulWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitStatefulWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatefulWidgetContext statefulWidget() throws RecognitionException {
		StatefulWidgetContext _localctx = new StatefulWidgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statefulWidget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(210);
				match(ABSTRACT);
				}
			}

			setState(213);
			match(CLASS);
			setState(214);
			match(ID);
			setState(215);
			match(EXTENDES);
			setState(216);
			match(StatefulWidget);
			setState(217);
			match(OQCLASS);
			setState(218);
			match(Const);
			setState(219);
			match(ID);
			setState(220);
			match(OQFUNC);
			setState(221);
			match(OQCLASS);
			setState(222);
			match(Key);
			setState(223);
			match(QUESTION_MARK);
			setState(224);
			match(Key);
			setState(225);
			match(CQCLASS);
			setState(226);
			match(CQFUNC);
			setState(227);
			match(TOWPOIT);
			setState(228);
			match(Super);
			setState(229);
			match(OQFUNC);
			setState(230);
			match(Key);
			setState(231);
			match(TOWPOIT);
			setState(232);
			match(Key);
			setState(233);
			match(CQFUNC);
			setState(234);
			match(COMA);
			setState(235);
			match(AT);
			setState(236);
			match(Override);
			setState(237);
			match(State);
			setState(238);
			match(QoOrSmal);
			setState(239);
			match(ID);
			setState(240);
			match(QcOrBig);
			setState(241);
			match(CreateState);
			setState(242);
			match(OQFUNC);
			setState(243);
			match(CQFUNC);
			setState(244);
			match(AROW);
			setState(245);
			match(ADER_SCORE);
			setState(246);
			match(ID);
			setState(247);
			match(OQFUNC);
			setState(248);
			match(CQFUNC);
			setState(249);
			match(COMA);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
				{
				{
				setState(250);
				line();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(CQCLASS);
			setState(257);
			match(CLASS);
			setState(258);
			match(ADER_SCORE);
			setState(259);
			match(ID);
			setState(260);
			match(EXTENDES);
			setState(261);
			match(State);
			setState(262);
			match(QoOrSmal);
			setState(263);
			match(ID);
			setState(264);
			match(QcOrBig);
			setState(265);
			match(OQCLASS);
			setState(266);
			buildScreen();
			setState(267);
			match(CQCLASS);
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

	public static class StatelessWidgetContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(parserproject.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(parserproject.ID); }
		public TerminalNode ID(int i) {
			return getToken(parserproject.ID, i);
		}
		public TerminalNode EXTENDES() { return getToken(parserproject.EXTENDES, 0); }
		public TerminalNode StatelessWidget() { return getToken(parserproject.StatelessWidget, 0); }
		public List<TerminalNode> OQCLASS() { return getTokens(parserproject.OQCLASS); }
		public TerminalNode OQCLASS(int i) {
			return getToken(parserproject.OQCLASS, i);
		}
		public TerminalNode Const() { return getToken(parserproject.Const, 0); }
		public List<TerminalNode> OQFUNC() { return getTokens(parserproject.OQFUNC); }
		public TerminalNode OQFUNC(int i) {
			return getToken(parserproject.OQFUNC, i);
		}
		public List<TerminalNode> Key() { return getTokens(parserproject.Key); }
		public TerminalNode Key(int i) {
			return getToken(parserproject.Key, i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(parserproject.QUESTION_MARK, 0); }
		public List<TerminalNode> CQCLASS() { return getTokens(parserproject.CQCLASS); }
		public TerminalNode CQCLASS(int i) {
			return getToken(parserproject.CQCLASS, i);
		}
		public List<TerminalNode> CQFUNC() { return getTokens(parserproject.CQFUNC); }
		public TerminalNode CQFUNC(int i) {
			return getToken(parserproject.CQFUNC, i);
		}
		public List<TerminalNode> TOWPOIT() { return getTokens(parserproject.TOWPOIT); }
		public TerminalNode TOWPOIT(int i) {
			return getToken(parserproject.TOWPOIT, i);
		}
		public TerminalNode Super() { return getToken(parserproject.Super, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public BuildScreenContext buildScreen() {
			return getRuleContext(BuildScreenContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(parserproject.ABSTRACT, 0); }
		public StatelessWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelessWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterStatelessWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitStatelessWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitStatelessWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatelessWidgetContext statelessWidget() throws RecognitionException {
		StatelessWidgetContext _localctx = new StatelessWidgetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statelessWidget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(269);
				match(ABSTRACT);
				}
			}

			setState(272);
			match(CLASS);
			setState(273);
			match(ID);
			setState(274);
			match(EXTENDES);
			setState(275);
			match(StatelessWidget);
			setState(276);
			match(OQCLASS);
			setState(277);
			match(Const);
			setState(278);
			match(ID);
			setState(279);
			match(OQFUNC);
			setState(280);
			match(OQCLASS);
			setState(281);
			match(Key);
			setState(282);
			match(QUESTION_MARK);
			setState(283);
			match(Key);
			setState(284);
			match(CQCLASS);
			setState(285);
			match(CQFUNC);
			setState(286);
			match(TOWPOIT);
			setState(287);
			match(Super);
			setState(288);
			match(OQFUNC);
			setState(289);
			match(Key);
			setState(290);
			match(TOWPOIT);
			setState(291);
			match(Key);
			setState(292);
			match(CQFUNC);
			setState(293);
			match(COMA);
			setState(294);
			buildScreen();
			setState(295);
			match(CQCLASS);
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

	public static class BuildScreenContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(parserproject.AT, 0); }
		public TerminalNode Override() { return getToken(parserproject.Override, 0); }
		public TerminalNode Widget() { return getToken(parserproject.Widget, 0); }
		public TerminalNode Build() { return getToken(parserproject.Build, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode BUILD() { return getToken(parserproject.BUILD, 0); }
		public TerminalNode CONTEXTE() { return getToken(parserproject.CONTEXTE, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public FlutterlineContext flutterline() {
			return getRuleContext(FlutterlineContext.class,0);
		}
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public BuildScreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildScreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterBuildScreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitBuildScreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitBuildScreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildScreenContext buildScreen() throws RecognitionException {
		BuildScreenContext _localctx = new BuildScreenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_buildScreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(AT);
			setState(298);
			match(Override);
			setState(299);
			match(Widget);
			setState(300);
			match(Build);
			setState(301);
			match(OQFUNC);
			setState(302);
			match(BUILD);
			setState(303);
			match(CONTEXTE);
			setState(304);
			match(CQFUNC);
			setState(305);
			match(OQCLASS);
			setState(306);
			flutterline();
			setState(307);
			match(CQCLASS);
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

	public static class FlutterlineContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(parserproject.RETURN, 0); }
		public TerminalNode Scaffold() { return getToken(parserproject.Scaffold, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public FlutterlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flutterline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterFlutterline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitFlutterline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitFlutterline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlutterlineContext flutterline() throws RecognitionException {
		FlutterlineContext _localctx = new FlutterlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flutterline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(RETURN);
			setState(310);
			match(Scaffold);
			setState(311);
			match(OQFUNC);
			setState(312);
			appBar();
			setState(313);
			body();
			setState(314);
			match(CQFUNC);
			setState(315);
			match(COMA);
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

	public static class AppBarContext extends ParserRuleContext {
		public TerminalNode AppBar() { return getToken(parserproject.AppBar, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode AppBar1() { return getToken(parserproject.AppBar1, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarContext appBar() throws RecognitionException {
		AppBarContext _localctx = new AppBarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_appBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(AppBar);
			setState(318);
			match(TOWPOIT);
			setState(319);
			match(AppBar1);
			setState(320);
			match(OQFUNC);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Title || _la==TEXT) {
				{
				setState(321);
				title();
				}
			}

			setState(324);
			match(CQFUNC);
			setState(325);
			match(COMA1);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(parserproject.BODY, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(BODY);
			setState(328);
			match(TOWPOIT);
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				{
				setState(329);
				rows();
				}
				break;
			case COLUMN:
				{
				setState(330);
				columns();
				}
				break;
			case Container:
				{
				setState(331);
				container();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnsContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(parserproject.COLUMN, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(COLUMN);
			setState(335);
			match(OQFUNC);
			setState(336);
			children();
			setState(337);
			match(CQFUNC);
			setState(338);
			match(COMA1);
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

	public static class RowsContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(parserproject.ROW, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ROW);
			setState(341);
			match(OQFUNC);
			setState(342);
			children();
			setState(343);
			match(CQFUNC);
			setState(344);
			match(COMA1);
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

	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode Children() { return getToken(parserproject.Children, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode OPEN_ARCH_LIST() { return getToken(parserproject.OPEN_ARCH_LIST, 0); }
		public TerminalNode CLOSE_ARCH_LIST() { return getToken(parserproject.CLOSE_ARCH_LIST, 0); }
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public List<WidgetsContext> widgets() {
			return getRuleContexts(WidgetsContext.class);
		}
		public WidgetsContext widgets(int i) {
			return getRuleContext(WidgetsContext.class,i);
		}
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(Children);
			setState(347);
			match(TOWPOIT);
			setState(348);
			match(OPEN_ARCH_LIST);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Title - 40)) | (1L << (TEXT - 40)) | (1L << (Center - 40)) | (1L << (ROW - 40)) | (1L << (Container - 40)) | (1L << (List_View - 40)) | (1L << (COLUMN - 40)) | (1L << (Color - 40)) | (1L << (Padding_BigP - 40)) | (1L << (ObscureText - 40)) | (1L << (TextField - 40)) | (1L << (Decoration - 40)) | (1L << (ElevatedButton - 40)) | (1L << (Image - 40)) | (1L << (SizedBox - 40)) | (1L << (Expanded - 40)))) != 0)) {
				{
				{
				setState(349);
				widgets();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA1) {
					{
					{
					setState(350);
					match(COMA1);
					setState(351);
					widgets();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(CLOSE_ARCH_LIST);
			setState(363);
			match(COMA1);
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

	public static class List_viewContext extends ParserRuleContext {
		public TerminalNode List_View() { return getToken(parserproject.List_View, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode Builder() { return getToken(parserproject.Builder, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ItemCountContext itemCount() {
			return getRuleContext(ItemCountContext.class,0);
		}
		public ItemBuilderContext itemBuilder() {
			return getRuleContext(ItemBuilderContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public List_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterList_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitList_view(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitList_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_viewContext list_view() throws RecognitionException {
		List_viewContext _localctx = new List_viewContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list_view);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(List_View);
			setState(366);
			match(DOTE);
			setState(367);
			match(Builder);
			setState(368);
			match(OQFUNC);
			setState(369);
			itemCount();
			setState(370);
			itemBuilder();
			setState(371);
			match(CQFUNC);
			setState(372);
			match(COMA1);
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

	public static class ItemCountContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(parserproject.ITEM, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode Length() { return getToken(parserproject.Length, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public ItemCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterItemCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitItemCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitItemCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemCountContext itemCount() throws RecognitionException {
		ItemCountContext _localctx = new ItemCountContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_itemCount);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(ITEM);
				setState(375);
				match(TOWPOIT);
				setState(376);
				match(ID);
				setState(377);
				match(DOTE);
				setState(378);
				match(Length);
				setState(379);
				match(COMA1);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(NUMBER);
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

	public static class ItemBuilderContext extends ParserRuleContext {
		public TerminalNode ITEMBUILDER1() { return getToken(parserproject.ITEMBUILDER1, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public List<TerminalNode> OQFUNC() { return getTokens(parserproject.OQFUNC); }
		public TerminalNode OQFUNC(int i) {
			return getToken(parserproject.OQFUNC, i);
		}
		public TerminalNode BUILD() { return getToken(parserproject.BUILD, 0); }
		public TerminalNode CONTEXTE() { return getToken(parserproject.CONTEXTE, 0); }
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public TerminalNode INT_TYPE() { return getToken(parserproject.INT_TYPE, 0); }
		public TerminalNode Index() { return getToken(parserproject.Index, 0); }
		public List<TerminalNode> CQFUNC() { return getTokens(parserproject.CQFUNC); }
		public TerminalNode CQFUNC(int i) {
			return getToken(parserproject.CQFUNC, i);
		}
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode RETURN() { return getToken(parserproject.RETURN, 0); }
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public ItemBuilderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemBuilder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterItemBuilder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitItemBuilder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitItemBuilder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemBuilderContext itemBuilder() throws RecognitionException {
		ItemBuilderContext _localctx = new ItemBuilderContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_itemBuilder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ITEMBUILDER1);
			setState(384);
			match(TOWPOIT);
			setState(385);
			match(OQFUNC);
			setState(386);
			match(OQFUNC);
			setState(387);
			match(BUILD);
			setState(388);
			match(CONTEXTE);
			setState(389);
			match(COMA1);
			setState(390);
			match(INT_TYPE);
			setState(391);
			match(Index);
			setState(392);
			match(CQFUNC);
			setState(393);
			match(OQCLASS);
			setState(394);
			match(RETURN);
			setState(395);
			gestureDetector();
			setState(396);
			match(CQCLASS);
			setState(397);
			match(CQFUNC);
			setState(398);
			match(COMA1);
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

	public static class GestureDetectorContext extends ParserRuleContext {
		public TerminalNode GestureDetector() { return getToken(parserproject.GestureDetector, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public OnTapContext onTap() {
			return getRuleContext(OnTapContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public GestureDetectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterGestureDetector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitGestureDetector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gestureDetector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(GestureDetector);
			setState(401);
			match(OQFUNC);
			setState(402);
			onTap();
			setState(403);
			child();
			setState(404);
			match(CQFUNC);
			setState(405);
			match(COMA1);
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

	public static class WidgetsContext extends ParserRuleContext {
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public List_viewContext list_view() {
			return getRuleContext(List_viewContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Padding_bigPContext padding_bigP() {
			return getRuleContext(Padding_bigPContext.class,0);
		}
		public Text_FailedContext text_Failed() {
			return getRuleContext(Text_FailedContext.class,0);
		}
		public ElevatedButtonContext elevatedButton() {
			return getRuleContext(ElevatedButtonContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public SizedBoxContext sizedBox() {
			return getRuleContext(SizedBoxContext.class,0);
		}
		public ExpandedContext expanded() {
			return getRuleContext(ExpandedContext.class,0);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public WidgetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterWidgets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitWidgets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitWidgets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetsContext widgets() throws RecognitionException {
		WidgetsContext _localctx = new WidgetsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_widgets);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				rows();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				columns();
				}
				break;
			case List_View:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				list_view();
				}
				break;
			case Container:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				container();
				}
				break;
			case Title:
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				title();
				}
				break;
			case Color:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				color();
				}
				break;
			case Padding_BigP:
				enterOuterAlt(_localctx, 7);
				{
				setState(413);
				padding_bigP();
				}
				break;
			case ObscureText:
			case TextField:
			case Decoration:
				enterOuterAlt(_localctx, 8);
				{
				setState(414);
				text_Failed();
				}
				break;
			case ElevatedButton:
				enterOuterAlt(_localctx, 9);
				{
				setState(415);
				elevatedButton();
				}
				break;
			case Image:
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				image();
				}
				break;
			case SizedBox:
				enterOuterAlt(_localctx, 11);
				{
				setState(417);
				sizedBox();
				}
				break;
			case Expanded:
				enterOuterAlt(_localctx, 12);
				{
				setState(418);
				expanded();
				}
				break;
			case Center:
				enterOuterAlt(_localctx, 13);
				{
				setState(419);
				center();
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

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode Container() { return getToken(parserproject.Container, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public List<ContainerBodyContext> containerBody() {
			return getRuleContexts(ContainerBodyContext.class);
		}
		public ContainerBodyContext containerBody(int i) {
			return getRuleContext(ContainerBodyContext.class,i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(Container);
			setState(423);
			match(OQFUNC);
			setState(425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				containerBody();
				}
				}
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (Width - 43)) | (1L << (Hieght - 43)) | (1L << (Padding - 43)) | (1L << (Decoration - 43)) | (1L << (Boxdecoration - 43)))) != 0) );
			setState(429);
			child();
			setState(430);
			match(CQFUNC);
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==COMA || _la==COMA1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ContainerBodyContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HieghtContext hieght() {
			return getRuleContext(HieghtContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public Container_decorationContext container_decoration() {
			return getRuleContext(Container_decorationContext.class,0);
		}
		public ContainerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterContainerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitContainerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitContainerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerBodyContext containerBody() throws RecognitionException {
		ContainerBodyContext _localctx = new ContainerBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_containerBody);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Width:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				width();
				}
				break;
			case Hieght:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				hieght();
				}
				break;
			case Padding:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				padding();
				}
				break;
			case Decoration:
			case Boxdecoration:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				container_decoration();
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

	public static class ExpandedContext extends ParserRuleContext {
		public TerminalNode Expanded() { return getToken(parserproject.Expanded, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public ExpandedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expanded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterExpanded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitExpanded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitExpanded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedContext expanded() throws RecognitionException {
		ExpandedContext _localctx = new ExpandedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expanded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(Expanded);
			setState(440);
			match(OQFUNC);
			setState(441);
			child();
			setState(442);
			match(CQFUNC);
			setState(443);
			match(COMA1);
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

	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(parserproject.CHILD, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(CHILD);
			setState(446);
			match(TOWPOIT);
			setState(447);
			widgets();
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

	public static class SizedBoxContext extends ParserRuleContext {
		public TerminalNode SizedBox() { return getToken(parserproject.SizedBox, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HieghtContext hieght() {
			return getRuleContext(HieghtContext.class,0);
		}
		public SizedBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterSizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitSizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitSizedBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedBoxContext sizedBox() throws RecognitionException {
		SizedBoxContext _localctx = new SizedBoxContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sizedBox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(SizedBox);
			setState(450);
			match(OQFUNC);
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Width:
				{
				setState(451);
				width();
				}
				break;
			case Hieght:
				{
				setState(452);
				hieght();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(455);
			match(CQFUNC);
			setState(456);
			match(COMA1);
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

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode Width() { return getToken(parserproject.Width, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(Width);
			setState(459);
			match(TOWPOIT);
			setState(460);
			match(NUMBER);
			setState(461);
			match(COMA1);
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

	public static class HieghtContext extends ParserRuleContext {
		public TerminalNode Hieght() { return getToken(parserproject.Hieght, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public HieghtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hieght; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterHieght(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitHieght(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitHieght(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HieghtContext hieght() throws RecognitionException {
		HieghtContext _localctx = new HieghtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hieght);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(Hieght);
			setState(464);
			match(TOWPOIT);
			setState(465);
			match(NUMBER);
			setState(466);
			match(COMA1);
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

	public static class OnTapContext extends ParserRuleContext {
		public TerminalNode ONTAP() { return getToken(parserproject.ONTAP, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public SetStateContext setState() {
			return getRuleContext(SetStateContext.class,0);
		}
		public OnTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterOnTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitOnTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitOnTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnTapContext onTap() throws RecognitionException {
		OnTapContext _localctx = new OnTapContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_onTap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(ONTAP);
			setState(469);
			match(TOWPOIT);
			setState(470);
			match(OQFUNC);
			setState(471);
			match(CQFUNC);
			setState(472);
			match(OQCLASS);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SetState) {
				{
				setState(473);
				setState();
				}
			}

			setState(476);
			match(CQCLASS);
			setState(477);
			match(COMA1);
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

	public static class SetStateContext extends ParserRuleContext {
		public TerminalNode SetState() { return getToken(parserproject.SetState, 0); }
		public List<TerminalNode> OQFUNC() { return getTokens(parserproject.OQFUNC); }
		public TerminalNode OQFUNC(int i) {
			return getToken(parserproject.OQFUNC, i);
		}
		public List<TerminalNode> CQFUNC() { return getTokens(parserproject.CQFUNC); }
		public TerminalNode CQFUNC(int i) {
			return getToken(parserproject.CQFUNC, i);
		}
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public SetStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterSetState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitSetState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitSetState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStateContext setState() throws RecognitionException {
		SetStateContext _localctx = new SetStateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(SetState);
			setState(480);
			match(OQFUNC);
			setState(481);
			match(OQFUNC);
			setState(482);
			match(CQFUNC);
			setState(483);
			match(OQCLASS);
			setState(484);
			widgets();
			setState(485);
			match(CQCLASS);
			setState(486);
			match(CQFUNC);
			setState(487);
			match(COMA);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode Color() { return getToken(parserproject.Color, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode Colors() { return getToken(parserproject.Colors, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(Color);
			setState(490);
			match(TOWPOIT);
			setState(491);
			match(Colors);
			setState(492);
			match(DOTE);
			setState(493);
			match(ID);
			setState(494);
			match(COMA1);
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

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode Padding() { return getToken(parserproject.Padding, 0); }
		public List<TerminalNode> TOWPOIT() { return getTokens(parserproject.TOWPOIT); }
		public TerminalNode TOWPOIT(int i) {
			return getToken(parserproject.TOWPOIT, i);
		}
		public TerminalNode EdgeInsets() { return getToken(parserproject.EdgeInsets, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TerminalNode All() { return getToken(parserproject.All, 0); }
		public TerminalNode Only() { return getToken(parserproject.Only, 0); }
		public TerminalNode Const() { return getToken(parserproject.Const, 0); }
		public TerminalNode TOP() { return getToken(parserproject.TOP, 0); }
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitPadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(Padding);
			setState(497);
			match(TOWPOIT);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(498);
				match(Const);
				}
			}

			setState(501);
			match(EdgeInsets);
			setState(502);
			match(DOTE);
			setState(503);
			_la = _input.LA(1);
			if ( !(_la==Only || _la==All) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(504);
			match(OQFUNC);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(505);
				match(TOP);
				setState(506);
				match(TOWPOIT);
				}
			}

			setState(509);
			value1();
			setState(510);
			match(CQFUNC);
			setState(511);
			match(COMA1);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(parserproject.TEXT, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TerminalNode Title() { return getToken(parserproject.Title, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode StringTitelWithDolar() { return getToken(parserproject.StringTitelWithDolar, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_title);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Title) {
					{
					setState(513);
					match(Title);
					setState(514);
					match(TOWPOIT);
					}
				}

				setState(517);
				match(TEXT);
				setState(518);
				match(OQFUNC);
				setState(519);
				match(STRING);
				setState(520);
				match(CQFUNC);
				setState(521);
				match(COMA1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Title) {
					{
					setState(522);
					match(Title);
					setState(523);
					match(TOWPOIT);
					}
				}

				setState(526);
				match(TEXT);
				setState(527);
				match(OQFUNC);
				setState(528);
				match(StringTitelWithDolar);
				setState(529);
				match(CQFUNC);
				setState(530);
				match(COMA1);
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

	public static class Padding_bigPContext extends ParserRuleContext {
		public TerminalNode Padding_BigP() { return getToken(parserproject.Padding_BigP, 0); }
		public List<TerminalNode> OQFUNC() { return getTokens(parserproject.OQFUNC); }
		public TerminalNode OQFUNC(int i) {
			return getToken(parserproject.OQFUNC, i);
		}
		public TerminalNode Padding() { return getToken(parserproject.Padding, 0); }
		public List<TerminalNode> TOWPOIT() { return getTokens(parserproject.TOWPOIT); }
		public TerminalNode TOWPOIT(int i) {
			return getToken(parserproject.TOWPOIT, i);
		}
		public TerminalNode EdgeInsets() { return getToken(parserproject.EdgeInsets, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public List<TerminalNode> CQFUNC() { return getTokens(parserproject.CQFUNC); }
		public TerminalNode CQFUNC(int i) {
			return getToken(parserproject.CQFUNC, i);
		}
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode All() { return getToken(parserproject.All, 0); }
		public TerminalNode Only() { return getToken(parserproject.Only, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode Const() { return getToken(parserproject.Const, 0); }
		public TerminalNode TOP() { return getToken(parserproject.TOP, 0); }
		public Padding_bigPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding_bigP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterPadding_bigP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitPadding_bigP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitPadding_bigP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding_bigPContext padding_bigP() throws RecognitionException {
		Padding_bigPContext _localctx = new Padding_bigPContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_padding_bigP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(Padding_BigP);
			setState(534);
			match(OQFUNC);
			setState(535);
			match(Padding);
			setState(536);
			match(TOWPOIT);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(537);
				match(Const);
				}
			}

			setState(540);
			match(EdgeInsets);
			setState(541);
			match(DOTE);
			setState(542);
			_la = _input.LA(1);
			if ( !(_la==Only || _la==All) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(543);
			match(OQFUNC);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(544);
				match(TOP);
				setState(545);
				match(TOWPOIT);
				}
			}

			setState(548);
			value1();
			setState(549);
			match(CQFUNC);
			setState(550);
			match(COMA1);
			setState(551);
			child();
			setState(552);
			match(CQFUNC);
			setState(553);
			_la = _input.LA(1);
			if ( !(_la==COMA || _la==COMA1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class CenterContext extends ParserRuleContext {
		public TerminalNode Center() { return getToken(parserproject.Center, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(Center);
			setState(556);
			match(OQFUNC);
			setState(557);
			child();
			setState(558);
			match(CQFUNC);
			setState(559);
			match(COMA1);
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

	public static class Text_FailedContext extends ParserRuleContext {
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode TextField() { return getToken(parserproject.TextField, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ObscureTextContext obscureText() {
			return getRuleContext(ObscureTextContext.class,0);
		}
		public Text_FailedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_Failed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterText_Failed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitText_Failed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitText_Failed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_FailedContext text_Failed() throws RecognitionException {
		Text_FailedContext _localctx = new Text_FailedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_text_Failed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TextField) {
				{
				setState(561);
				match(TextField);
				setState(562);
				match(OQFUNC);
				}
			}

			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ObscureText) {
				{
				setState(565);
				obscureText();
				}
			}

			setState(568);
			decoration();
			setState(569);
			match(CQFUNC);
			setState(570);
			_la = _input.LA(1);
			if ( !(_la==COMA || _la==COMA1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ElevatedButtonContext extends ParserRuleContext {
		public TerminalNode ElevatedButton() { return getToken(parserproject.ElevatedButton, 0); }
		public List<TerminalNode> OQFUNC() { return getTokens(parserproject.OQFUNC); }
		public TerminalNode OQFUNC(int i) {
			return getToken(parserproject.OQFUNC, i);
		}
		public TerminalNode OnPressed() { return getToken(parserproject.OnPressed, 0); }
		public List<TerminalNode> TOWPOIT() { return getTokens(parserproject.TOWPOIT); }
		public TerminalNode TOWPOIT(int i) {
			return getToken(parserproject.TOWPOIT, i);
		}
		public List<TerminalNode> CQFUNC() { return getTokens(parserproject.CQFUNC); }
		public TerminalNode CQFUNC(int i) {
			return getToken(parserproject.CQFUNC, i);
		}
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public TerminalNode CHILD() { return getToken(parserproject.CHILD, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public ElevatedButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elevatedButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterElevatedButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitElevatedButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitElevatedButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElevatedButtonContext elevatedButton() throws RecognitionException {
		ElevatedButtonContext _localctx = new ElevatedButtonContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elevatedButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(ElevatedButton);
			setState(573);
			match(OQFUNC);
			setState(574);
			match(OnPressed);
			setState(575);
			match(TOWPOIT);
			setState(576);
			match(OQFUNC);
			setState(577);
			match(CQFUNC);
			setState(578);
			match(OQCLASS);
			setState(579);
			match(CQCLASS);
			setState(580);
			match(COMA1);
			setState(581);
			match(CHILD);
			setState(582);
			match(TOWPOIT);
			setState(583);
			title();
			setState(584);
			match(CQFUNC);
			setState(585);
			match(COMA1);
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

	public static class ObscureTextContext extends ParserRuleContext {
		public TerminalNode ObscureText() { return getToken(parserproject.ObscureText, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TerminalNode TRUE() { return getToken(parserproject.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserproject.FALSE, 0); }
		public ObscureTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obscureText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterObscureText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitObscureText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitObscureText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObscureTextContext obscureText() throws RecognitionException {
		ObscureTextContext _localctx = new ObscureTextContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_obscureText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(ObscureText);
			setState(588);
			match(TOWPOIT);
			setState(589);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(590);
			match(COMA1);
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

	public static class DecorationContext extends ParserRuleContext {
		public TerminalNode Decoration() { return getToken(parserproject.Decoration, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode InputDecoration() { return getToken(parserproject.InputDecoration, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public BorderContext border() {
			return getRuleContext(BorderContext.class,0);
		}
		public LabeltextContext labeltext() {
			return getRuleContext(LabeltextContext.class,0);
		}
		public HinttextContext hinttext() {
			return getRuleContext(HinttextContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public DecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitDecoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationContext decoration() throws RecognitionException {
		DecorationContext _localctx = new DecorationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_decoration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(Decoration);
			setState(593);
			match(TOWPOIT);
			setState(594);
			match(InputDecoration);
			setState(595);
			match(OQFUNC);
			setState(596);
			border();
			setState(597);
			labeltext();
			setState(598);
			hinttext();
			setState(599);
			match(CQFUNC);
			setState(600);
			match(COMA1);
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

	public static class Container_decorationContext extends ParserRuleContext {
		public TerminalNode Boxdecoration() { return getToken(parserproject.Boxdecoration, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public BorderRadiusContext borderRadius() {
			return getRuleContext(BorderRadiusContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public TerminalNode Decoration() { return getToken(parserproject.Decoration, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public Container_decorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_decoration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterContainer_decoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitContainer_decoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitContainer_decoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_decorationContext container_decoration() throws RecognitionException {
		Container_decorationContext _localctx = new Container_decorationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_container_decoration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Decoration) {
				{
				setState(602);
				match(Decoration);
				setState(603);
				match(TOWPOIT);
				}
			}

			setState(606);
			match(Boxdecoration);
			setState(607);
			match(OQFUNC);
			setState(608);
			color();
			setState(609);
			borderRadius();
			setState(610);
			match(CQFUNC);
			setState(611);
			match(COMA1);
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

	public static class BorderRadiusContext extends ParserRuleContext {
		public TerminalNode BorderRadius() { return getToken(parserproject.BorderRadius, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode BorderRadius1() { return getToken(parserproject.BorderRadius1, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode Circular() { return getToken(parserproject.Circular, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public BorderRadiusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadius; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterBorderRadius(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitBorderRadius(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusContext borderRadius() throws RecognitionException {
		BorderRadiusContext _localctx = new BorderRadiusContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_borderRadius);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(BorderRadius);
			setState(614);
			match(TOWPOIT);
			setState(615);
			match(BorderRadius1);
			setState(616);
			match(DOTE);
			setState(617);
			match(Circular);
			setState(618);
			match(OQFUNC);
			setState(619);
			value1();
			setState(620);
			match(CQFUNC);
			setState(621);
			match(COMA1);
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

	public static class BorderContext extends ParserRuleContext {
		public TerminalNode Border() { return getToken(parserproject.Border, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode OutlineInputBorder() { return getToken(parserproject.OutlineInputBorder, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public BorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitBorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderContext border() throws RecognitionException {
		BorderContext _localctx = new BorderContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_border);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(Border);
			setState(624);
			match(TOWPOIT);
			setState(625);
			match(OutlineInputBorder);
			setState(626);
			match(OQFUNC);
			setState(627);
			match(CQFUNC);
			setState(628);
			match(COMA1);
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

	public static class LabeltextContext extends ParserRuleContext {
		public TerminalNode LabelText() { return getToken(parserproject.LabelText, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public LabeltextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeltext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterLabeltext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitLabeltext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitLabeltext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeltextContext labeltext() throws RecognitionException {
		LabeltextContext _localctx = new LabeltextContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_labeltext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(LabelText);
			setState(631);
			match(TOWPOIT);
			setState(632);
			match(STRING);
			setState(633);
			match(COMA1);
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

	public static class HinttextContext extends ParserRuleContext {
		public TerminalNode HintText() { return getToken(parserproject.HintText, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public HinttextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hinttext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterHinttext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitHinttext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitHinttext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HinttextContext hinttext() throws RecognitionException {
		HinttextContext _localctx = new HinttextContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hinttext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(HintText);
			setState(636);
			match(TOWPOIT);
			setState(637);
			match(STRING);
			setState(638);
			match(COMA1);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode Image() { return getToken(parserproject.Image, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode ASSET() { return getToken(parserproject.ASSET, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public StringImageContext stringImage() {
			return getRuleContext(StringImageContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA1() { return getToken(parserproject.COMA1, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_image);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(Image);
				setState(641);
				match(DOTE);
				setState(642);
				match(ASSET);
				setState(643);
				match(OQFUNC);
				setState(644);
				stringImage();
				setState(645);
				match(CQFUNC);
				setState(646);
				match(COMA1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				match(Image);
				setState(649);
				match(DOTE);
				setState(650);
				match(ASSET);
				setState(651);
				match(OQFUNC);
				setState(652);
				stringImage();
				setState(653);
				match(CQFUNC);
				setState(654);
				match(COMA1);
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

	public static class StringImageContext extends ParserRuleContext {
		public TerminalNode ASSET() { return getToken(parserproject.ASSET, 0); }
		public List<TerminalNode> SlashOrDivision() { return getTokens(parserproject.SlashOrDivision); }
		public TerminalNode SlashOrDivision(int i) {
			return getToken(parserproject.SlashOrDivision, i);
		}
		public TerminalNode LIB() { return getToken(parserproject.LIB, 0); }
		public TerminalNode IMAGES() { return getToken(parserproject.IMAGES, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode DOTE() { return getToken(parserproject.DOTE, 0); }
		public TerminalNode PNG() { return getToken(parserproject.PNG, 0); }
		public TerminalNode StringTitelWithDolar() { return getToken(parserproject.StringTitelWithDolar, 0); }
		public StringImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterStringImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitStringImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitStringImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringImageContext stringImage() throws RecognitionException {
		StringImageContext _localctx = new StringImageContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stringImage);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(ASSET);
				setState(659);
				match(SlashOrDivision);
				setState(660);
				match(LIB);
				setState(661);
				match(SlashOrDivision);
				setState(662);
				match(IMAGES);
				setState(663);
				match(SlashOrDivision);
				setState(664);
				match(ID);
				setState(665);
				match(DOTE);
				setState(666);
				match(PNG);
				}
				break;
			case StringTitelWithDolar:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(StringTitelWithDolar);
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

	public static class LineContext extends ParserRuleContext {
		public VariabelDefinitionContext variabelDefinition() {
			return getRuleContext(VariabelDefinitionContext.class,0);
		}
		public MapDefinitionContext mapDefinition() {
			return getRuleContext(MapDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForDefinitionContext forDefinition() {
			return getRuleContext(ForDefinitionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_line);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				variabelDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				mapDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				functionDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				ifDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(674);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(675);
				forDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(676);
				print();
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

	public static class UriContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode Package() { return getToken(parserproject.Package, 0); }
		public TerminalNode TOWPOIT() { return getToken(parserproject.TOWPOIT, 0); }
		public List<FolderNameContext> folderName() {
			return getRuleContexts(FolderNameContext.class);
		}
		public FolderNameContext folderName(int i) {
			return getRuleContext(FolderNameContext.class,i);
		}
		public List<TerminalNode> SlashOrDivision() { return getTokens(parserproject.SlashOrDivision); }
		public TerminalNode SlashOrDivision(int i) {
			return getToken(parserproject.SlashOrDivision, i);
		}
		public TerminalNode DOTSLASH() { return getToken(parserproject.DOTSLASH, 0); }
		public TerminalNode TOWDOTSLASH() { return getToken(parserproject.TOWDOTSLASH, 0); }
		public UriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriContext uri() throws RecognitionException {
		UriContext _localctx = new UriContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_uri);
		int _la;
		try {
			int _alt;
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Package:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Package) {
					{
					setState(679);
					match(Package);
					setState(680);
					match(TOWPOIT);
					}
				}

				setState(686); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(683);
						folderName();
						setState(684);
						match(SlashOrDivision);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(688); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(690);
				className();
				}
				break;
			case DOTSLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				match(DOTSLASH);
				setState(693);
				className();
				}
				break;
			case TOWDOTSLASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				match(TOWDOTSLASH);
				setState(695);
				className();
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode DOTEDART() { return getToken(parserproject.DOTEDART, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(ID);
			setState(699);
			match(DOTEDART);
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

	public static class FolderNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public FolderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folderName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterFolderName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitFolderName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitFolderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderNameContext folderName() throws RecognitionException {
		FolderNameContext _localctx = new FolderNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_folderName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(ID);
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

	public static class VariabelDefinitionContext extends ParserRuleContext {
		public LeteOrFinalContext leteOrFinal() {
			return getRuleContext(LeteOrFinalContext.class,0);
		}
		public VariabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterVariabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitVariabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitVariabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabelDefinitionContext variabelDefinition() throws RecognitionException {
		VariabelDefinitionContext _localctx = new VariabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variabelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			leteOrFinal();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public VoidFunctionContext voidFunction() {
			return getRuleContext(VoidFunctionContext.class,0);
		}
		public TypeFunctionContext typeFunction() {
			return getRuleContext(TypeFunctionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionDefinition);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				voidFunction();
				}
				break;
			case BOOL_TYPE:
			case Double_TYPE:
			case INT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				typeFunction();
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

	public static class VoidFunctionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(parserproject.VOID, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public VoidFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionContext voidFunction() throws RecognitionException {
		VoidFunctionContext _localctx = new VoidFunctionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_voidFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(VOID);
			setState(710);
			match(ID);
			setState(711);
			match(OQFUNC);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				{
				setState(712);
				parameters();
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA1) {
					{
					{
					setState(713);
					match(COMA1);
					setState(714);
					parameters();
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			match(CQFUNC);
			setState(726);
			match(OQCLASS);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
				{
				{
				setState(727);
				line();
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(733);
			match(CQCLASS);
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

	public static class TypeFunctionContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(parserproject.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode RETURN() { return getToken(parserproject.RETURN, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public TerminalNode STRING_TYPE() { return getToken(parserproject.STRING_TYPE, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode BOOL_TYPE() { return getToken(parserproject.BOOL_TYPE, 0); }
		public Value4Context value4() {
			return getRuleContext(Value4Context.class,0);
		}
		public TerminalNode Double_TYPE() { return getToken(parserproject.Double_TYPE, 0); }
		public Value3Context value3() {
			return getRuleContext(Value3Context.class,0);
		}
		public TypeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionContext typeFunction() throws RecognitionException {
		TypeFunctionContext _localctx = new TypeFunctionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeFunction);
		int _la;
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(INT_TYPE);
				setState(736);
				match(ID);
				setState(737);
				match(OQFUNC);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(738);
					parameters();
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA1) {
						{
						{
						setState(739);
						match(COMA1);
						setState(740);
						parameters();
						}
						}
						setState(745);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(748);
				match(CQFUNC);
				setState(749);
				match(OQCLASS);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
					{
					{
					setState(750);
					line();
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(RETURN);
				setState(757);
				value1();
				setState(758);
				match(COMA);
				setState(759);
				match(CQCLASS);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(STRING_TYPE);
				setState(762);
				match(ID);
				setState(763);
				match(OQFUNC);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(764);
					parameters();
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA1) {
						{
						{
						setState(765);
						match(COMA1);
						setState(766);
						parameters();
						}
						}
						setState(771);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(774);
				match(CQFUNC);
				setState(775);
				match(OQCLASS);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
					{
					{
					setState(776);
					line();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(RETURN);
				setState(783);
				value2();
				setState(784);
				match(COMA);
				setState(785);
				match(CQCLASS);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				match(BOOL_TYPE);
				setState(788);
				match(ID);
				setState(789);
				match(OQFUNC);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(790);
					parameters();
					setState(795);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA1) {
						{
						{
						setState(791);
						match(COMA1);
						setState(792);
						parameters();
						}
						}
						setState(797);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(800);
				match(CQFUNC);
				setState(801);
				match(OQCLASS);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
					{
					{
					setState(802);
					line();
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(808);
				match(RETURN);
				setState(809);
				value4();
				setState(810);
				match(COMA);
				setState(811);
				match(CQCLASS);
				}
				break;
			case Double_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(813);
				match(Double_TYPE);
				setState(814);
				match(ID);
				setState(815);
				match(OQFUNC);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(816);
					parameters();
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA1) {
						{
						{
						setState(817);
						match(COMA1);
						setState(818);
						parameters();
						}
						}
						setState(823);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(826);
				match(CQFUNC);
				setState(827);
				match(OQCLASS);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
					{
					{
					setState(828);
					line();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(834);
				match(RETURN);
				setState(835);
				value3();
				setState(836);
				match(COMA);
				setState(837);
				match(CQCLASS);
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

	public static class IfDefinitionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(parserproject.IF, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterIfDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitIfDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitIfDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefinitionContext ifDefinition() throws RecognitionException {
		IfDefinitionContext _localctx = new IfDefinitionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(IF);
			setState(842);
			match(OQFUNC);
			setState(843);
			condition();
			setState(844);
			match(CQFUNC);
			setState(845);
			match(OQCLASS);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
				{
				{
				setState(846);
				line();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852);
			match(CQCLASS);
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

	public static class ForDefinitionContext extends ParserRuleContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ForDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterForDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitForDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitForDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDefinitionContext forDefinition() throws RecognitionException {
		ForDefinitionContext _localctx = new ForDefinitionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_forDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			for_();
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(parserproject.FOR, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public List<TerminalNode> COMA() { return getTokens(parserproject.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(parserproject.COMA, i);
		}
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public VariabelForTypeContext variabelForType() {
			return getRuleContext(VariabelForTypeContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode BLUSBLUS() { return getToken(parserproject.BLUSBLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(parserproject.MINUSMINUS, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(FOR);
			setState(857);
			match(OQFUNC);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(858);
				variabelForType();
				}
			}

			setState(861);
			match(COMA);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==ID) {
				{
				setState(862);
				condition();
				}
			}

			setState(865);
			match(COMA);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(866);
				match(ID);
				setState(867);
				_la = _input.LA(1);
				if ( !(_la==BLUSBLUS || _la==MINUSMINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(870);
			match(CQFUNC);
			setState(871);
			match(OQCLASS);
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LIST) | (1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << FINAL) | (1L << LATE) | (1L << VOID) | (1L << IF) | (1L << PRINT) | (1L << MAP) | (1L << FOR))) != 0) || _la==NUMBER || _la==ID) {
				{
				{
				setState(872);
				line();
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			match(CQCLASS);
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

	public static class QcOrBigContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode QcOrBig() { return getToken(parserproject.QcOrBig, 0); }
		public QcOrBigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qcOrBig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterQcOrBig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitQcOrBig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitQcOrBig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QcOrBigContext qcOrBig() throws RecognitionException {
		QcOrBigContext _localctx = new QcOrBigContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qcOrBig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			exp(0);
			setState(881);
			match(QcOrBig);
			setState(882);
			exp(0);
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

	public static class QoOrSmalContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode QoOrSmal() { return getToken(parserproject.QoOrSmal, 0); }
		public QoOrSmalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qoOrSmal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterQoOrSmal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitQoOrSmal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitQoOrSmal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QoOrSmalContext qoOrSmal() throws RecognitionException {
		QoOrSmalContext _localctx = new QoOrSmalContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_qoOrSmal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			exp(0);
			setState(885);
			match(QoOrSmal);
			setState(886);
			exp(0);
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

	public static class SmalOrEQUALContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SmalOrEQUAL() { return getToken(parserproject.SmalOrEQUAL, 0); }
		public SmalOrEQUALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smalOrEQUAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterSmalOrEQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitSmalOrEQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitSmalOrEQUAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmalOrEQUALContext smalOrEQUAL() throws RecognitionException {
		SmalOrEQUALContext _localctx = new SmalOrEQUALContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_smalOrEQUAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			exp(0);
			setState(889);
			match(SmalOrEQUAL);
			setState(890);
			exp(0);
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

	public static class BigOrEQUALContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BigOrEQUAL() { return getToken(parserproject.BigOrEQUAL, 0); }
		public BigOrEQUALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigOrEQUAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterBigOrEQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitBigOrEQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitBigOrEQUAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigOrEQUALContext bigOrEQUAL() throws RecognitionException {
		BigOrEQUALContext _localctx = new BigOrEQUALContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bigOrEQUAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			exp(0);
			setState(893);
			match(BigOrEQUAL);
			setState(894);
			exp(0);
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

	public static class EqualEqualContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EqualEqual() { return getToken(parserproject.EqualEqual, 0); }
		public EqualEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterEqualEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitEqualEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitEqualEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualEqualContext equalEqual() throws RecognitionException {
		EqualEqualContext _localctx = new EqualEqualContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_equalEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			exp(0);
			setState(897);
			match(EqualEqual);
			setState(898);
			exp(0);
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

	public static class NotEqualContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NotEqual() { return getToken(parserproject.NotEqual, 0); }
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			exp(0);
			setState(901);
			match(NotEqual);
			setState(902);
			exp(0);
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

	public static class VariableconditionContext extends ParserRuleContext {
		public TrueBoolVarContext trueBoolVar() {
			return getRuleContext(TrueBoolVarContext.class,0);
		}
		public VariableconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablecondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterVariablecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitVariablecondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitVariablecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableconditionContext variablecondition() throws RecognitionException {
		VariableconditionContext _localctx = new VariableconditionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variablecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			trueBoolVar();
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
		public QcOrBigContext qcOrBig() {
			return getRuleContext(QcOrBigContext.class,0);
		}
		public QoOrSmalContext qoOrSmal() {
			return getRuleContext(QoOrSmalContext.class,0);
		}
		public SmalOrEQUALContext smalOrEQUAL() {
			return getRuleContext(SmalOrEQUALContext.class,0);
		}
		public BigOrEQUALContext bigOrEQUAL() {
			return getRuleContext(BigOrEQUALContext.class,0);
		}
		public EqualEqualContext equalEqual() {
			return getRuleContext(EqualEqualContext.class,0);
		}
		public NotEqualContext notEqual() {
			return getRuleContext(NotEqualContext.class,0);
		}
		public VariableconditionContext variablecondition() {
			return getRuleContext(VariableconditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condition);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				qcOrBig();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				qoOrSmal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				smalOrEQUAL();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(909);
				bigOrEQUAL();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(910);
				equalEqual();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(911);
				notEqual();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(912);
				variablecondition();
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends ExpContext {
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpContext {
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public NumberContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULTContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULT() { return getToken(parserproject.MULT, 0); }
		public MULTContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterMULT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitMULT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitMULT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SlashOrDivisionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SlashOrDivision() { return getToken(parserproject.SlashOrDivision, 0); }
		public SlashOrDivisionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterSlashOrDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitSlashOrDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitSlashOrDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUMContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUM() { return getToken(parserproject.SUM, 0); }
		public SUMContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterSUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitSUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitSUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MINUSContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(parserproject.MINUS, 0); }
		public MINUSContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitMINUS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(916);
				match(ID);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(917);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(932);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new MULTContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(920);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(921);
						match(MULT);
						setState(922);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new SUMContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(923);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(924);
						match(SUM);
						setState(925);
						exp(6);
						}
						break;
					case 3:
						{
						_localctx = new MINUSContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(926);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(927);
						match(MINUS);
						setState(928);
						exp(5);
						}
						break;
					case 4:
						{
						_localctx = new SlashOrDivisionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(929);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(930);
						match(SlashOrDivision);
						setState(931);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class TrueBoolVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TrueBoolVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueBoolVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterTrueBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitTrueBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitTrueBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueBoolVarContext trueBoolVar() throws RecognitionException {
		TrueBoolVarContext _localctx = new TrueBoolVarContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_trueBoolVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(ID);
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

	public static class MapDefinitionContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(parserproject.MAP, 0); }
		public TerminalNode QoOrSmal() { return getToken(parserproject.QoOrSmal, 0); }
		public List<PublicTyepsContext> publicTyeps() {
			return getRuleContexts(PublicTyepsContext.class);
		}
		public PublicTyepsContext publicTyeps(int i) {
			return getRuleContext(PublicTyepsContext.class,i);
		}
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public TerminalNode QcOrBig() { return getToken(parserproject.QcOrBig, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode EQUAL() { return getToken(parserproject.EQUAL, 0); }
		public TerminalNode OQCLASS() { return getToken(parserproject.OQCLASS, 0); }
		public TerminalNode CQCLASS() { return getToken(parserproject.CQCLASS, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public List<ValueKeyContext> valueKey() {
			return getRuleContexts(ValueKeyContext.class);
		}
		public ValueKeyContext valueKey(int i) {
			return getRuleContext(ValueKeyContext.class,i);
		}
		public List<TerminalNode> TOWPOIT() { return getTokens(parserproject.TOWPOIT); }
		public TerminalNode TOWPOIT(int i) {
			return getToken(parserproject.TOWPOIT, i);
		}
		public List<ValueValueContext> valueValue() {
			return getRuleContexts(ValueValueContext.class);
		}
		public ValueValueContext valueValue(int i) {
			return getRuleContext(ValueValueContext.class,i);
		}
		public MapDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterMapDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitMapDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitMapDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapDefinitionContext mapDefinition() throws RecognitionException {
		MapDefinitionContext _localctx = new MapDefinitionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_mapDefinition);
		int _la;
		try {
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(MAP);
				setState(940);
				match(QoOrSmal);
				setState(941);
				publicTyeps();
				setState(942);
				match(COMA1);
				setState(943);
				publicTyeps();
				setState(944);
				match(QcOrBig);
				setState(945);
				match(ID);
				setState(946);
				match(EQUAL);
				setState(947);
				match(OQCLASS);
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (STRING - 121)) | (1L << (NUMBER - 121)) | (1L << (DoubleNUMBER - 121)))) != 0)) {
					{
					{
					setState(948);
					valueKey();
					setState(949);
					match(TOWPOIT);
					setState(950);
					valueValue();
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA1) {
						{
						{
						setState(951);
						match(COMA1);
						setState(952);
						valueKey();
						setState(953);
						match(TOWPOIT);
						setState(954);
						valueValue();
						}
						}
						setState(960);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(CQCLASS);
				setState(967);
				match(COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(MAP);
				setState(970);
				match(QoOrSmal);
				setState(971);
				publicTyeps();
				setState(972);
				match(COMA1);
				setState(973);
				publicTyeps();
				setState(974);
				match(QcOrBig);
				setState(975);
				match(ID);
				setState(976);
				match(COMA);
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

	public static class ParametersContext extends ParserRuleContext {
		public PublicTyepsContext publicTyeps() {
			return getRuleContext(PublicTyepsContext.class,0);
		}
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			publicTyeps();
			setState(981);
			match(ID);
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

	public static class PublicTyepsContext extends ParserRuleContext {
		public TerminalNode Double_TYPE() { return getToken(parserproject.Double_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(parserproject.BOOL_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(parserproject.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(parserproject.STRING_TYPE, 0); }
		public PublicTyepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicTyeps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterPublicTyeps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitPublicTyeps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitPublicTyeps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicTyepsContext publicTyeps() throws RecognitionException {
		PublicTyepsContext _localctx = new PublicTyepsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_publicTyeps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << Double_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(parserproject.PRINT, 0); }
		public TerminalNode OQFUNC() { return getToken(parserproject.OQFUNC, 0); }
		public TerminalNode CQFUNC() { return getToken(parserproject.CQFUNC, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(PRINT);
			setState(986);
			match(OQFUNC);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (STRING - 121)) | (1L << (NUMBER - 121)) | (1L << (DoubleNUMBER - 121)))) != 0)) {
				{
				{
				setState(987);
				value();
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA1) {
					{
					{
					setState(988);
					match(COMA1);
					setState(989);
					value();
					}
					}
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			match(CQFUNC);
			setState(1001);
			match(COMA);
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

	public static class LeteOrFinalContext extends ParserRuleContext {
		public VarOrTypeContext varOrType() {
			return getRuleContext(VarOrTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TerminalNode LATE() { return getToken(parserproject.LATE, 0); }
		public LineWithTypeContext lineWithType() {
			return getRuleContext(LineWithTypeContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(parserproject.FINAL, 0); }
		public LeteOrFinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leteOrFinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterLeteOrFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitLeteOrFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitLeteOrFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeteOrFinalContext leteOrFinal() throws RecognitionException {
		LeteOrFinalContext _localctx = new LeteOrFinalContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_leteOrFinal);
		int _la;
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE) {
					{
					setState(1003);
					match(LATE);
					}
				}

				setState(1008);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case BOOL_TYPE:
				case Double_TYPE:
				case INT_TYPE:
				case STRING_TYPE:
					{
					setState(1006);
					varOrType();
					}
					break;
				case LIST:
					{
					setState(1007);
					listType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(1010);
					match(FINAL);
					}
				}

				setState(1015);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_TYPE:
				case Double_TYPE:
				case INT_TYPE:
				case STRING_TYPE:
					{
					setState(1013);
					lineWithType();
					}
					break;
				case LIST:
					{
					setState(1014);
					listType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATE) {
					{
					setState(1017);
					match(LATE);
					setState(1018);
					match(FINAL);
					}
				}

				setState(1023);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_TYPE:
				case Double_TYPE:
				case INT_TYPE:
				case STRING_TYPE:
					{
					setState(1021);
					lineWithType();
					}
					break;
				case LIST:
					{
					setState(1022);
					listType();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class VarOrTypeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(parserproject.VAR, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode EQUAL() { return getToken(parserproject.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LineWithTypeContext lineWithType() {
			return getRuleContext(LineWithTypeContext.class,0);
		}
		public VarOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterVarOrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitVarOrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitVarOrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrTypeContext varOrType() throws RecognitionException {
		VarOrTypeContext _localctx = new VarOrTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_varOrType);
		int _la;
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(VAR);
				setState(1028);
				match(ID);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1029);
					match(EQUAL);
					setState(1030);
					value();
					}
				}

				setState(1033);
				match(COMA);
				}
				break;
			case BOOL_TYPE:
			case Double_TYPE:
			case INT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				lineWithType();
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

	public static class LineWithTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(parserproject.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode EQUAL() { return getToken(parserproject.EQUAL, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(parserproject.STRING_TYPE, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode Double_TYPE() { return getToken(parserproject.Double_TYPE, 0); }
		public Value3Context value3() {
			return getRuleContext(Value3Context.class,0);
		}
		public TerminalNode BOOL_TYPE() { return getToken(parserproject.BOOL_TYPE, 0); }
		public Value4Context value4() {
			return getRuleContext(Value4Context.class,0);
		}
		public LineWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterLineWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitLineWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitLineWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineWithTypeContext lineWithType() throws RecognitionException {
		LineWithTypeContext _localctx = new LineWithTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lineWithType);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				match(INT_TYPE);
				setState(1038);
				match(ID);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1039);
					match(EQUAL);
					setState(1040);
					value1();
					}
				}

				setState(1043);
				match(COMA);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(STRING_TYPE);
				setState(1045);
				match(ID);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1046);
					match(EQUAL);
					setState(1047);
					value2();
					}
				}

				setState(1050);
				match(COMA);
				}
				break;
			case Double_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
				match(Double_TYPE);
				setState(1052);
				match(ID);
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1053);
					match(EQUAL);
					setState(1054);
					value3();
					}
				}

				setState(1057);
				match(COMA);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1058);
				match(BOOL_TYPE);
				setState(1059);
				match(ID);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1060);
					match(EQUAL);
					setState(1061);
					value4();
					}
				}

				setState(1064);
				match(COMA);
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

	public static class VariabelForTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(parserproject.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode EQUAL() { return getToken(parserproject.EQUAL, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode STRING_TYPE() { return getToken(parserproject.STRING_TYPE, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode Double_TYPE() { return getToken(parserproject.Double_TYPE, 0); }
		public Value3Context value3() {
			return getRuleContext(Value3Context.class,0);
		}
		public TerminalNode BOOL_TYPE() { return getToken(parserproject.BOOL_TYPE, 0); }
		public Value4Context value4() {
			return getRuleContext(Value4Context.class,0);
		}
		public VariabelForTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabelForType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterVariabelForType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitVariabelForType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitVariabelForType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabelForTypeContext variabelForType() throws RecognitionException {
		VariabelForTypeContext _localctx = new VariabelForTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variabelForType);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				match(INT_TYPE);
				setState(1068);
				match(ID);
				setState(1069);
				match(EQUAL);
				setState(1070);
				value1();
				setState(1071);
				match(COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(STRING_TYPE);
				setState(1074);
				match(ID);
				setState(1075);
				match(EQUAL);
				setState(1076);
				value2();
				setState(1077);
				match(COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(Double_TYPE);
				setState(1080);
				match(ID);
				setState(1081);
				match(EQUAL);
				setState(1082);
				value3();
				setState(1083);
				match(COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1085);
				match(BOOL_TYPE);
				setState(1086);
				match(ID);
				setState(1087);
				match(EQUAL);
				setState(1088);
				value4();
				setState(1089);
				match(COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1091);
				match(INT_TYPE);
				setState(1092);
				match(ID);
				setState(1093);
				match(EQUAL);
				setState(1094);
				value1();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1095);
				match(STRING_TYPE);
				setState(1096);
				match(ID);
				setState(1097);
				match(EQUAL);
				setState(1098);
				value2();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1099);
				match(Double_TYPE);
				setState(1100);
				match(ID);
				setState(1101);
				match(EQUAL);
				setState(1102);
				value3();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1103);
				match(BOOL_TYPE);
				setState(1104);
				match(ID);
				setState(1105);
				match(EQUAL);
				setState(1106);
				value4();
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

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(parserproject.LIST, 0); }
		public TerminalNode QoOrSmal() { return getToken(parserproject.QoOrSmal, 0); }
		public TerminalNode INT_TYPE() { return getToken(parserproject.INT_TYPE, 0); }
		public TerminalNode QcOrBig() { return getToken(parserproject.QcOrBig, 0); }
		public TerminalNode ID() { return getToken(parserproject.ID, 0); }
		public TerminalNode COMA() { return getToken(parserproject.COMA, 0); }
		public TerminalNode EQUAL() { return getToken(parserproject.EQUAL, 0); }
		public TerminalNode OPEN_ARCH_LIST() { return getToken(parserproject.OPEN_ARCH_LIST, 0); }
		public TerminalNode CLOSE_ARCH_LIST() { return getToken(parserproject.CLOSE_ARCH_LIST, 0); }
		public List<Value1Context> value1() {
			return getRuleContexts(Value1Context.class);
		}
		public Value1Context value1(int i) {
			return getRuleContext(Value1Context.class,i);
		}
		public List<TerminalNode> COMA1() { return getTokens(parserproject.COMA1); }
		public TerminalNode COMA1(int i) {
			return getToken(parserproject.COMA1, i);
		}
		public TerminalNode STRING_TYPE() { return getToken(parserproject.STRING_TYPE, 0); }
		public List<Value2Context> value2() {
			return getRuleContexts(Value2Context.class);
		}
		public Value2Context value2(int i) {
			return getRuleContext(Value2Context.class,i);
		}
		public TerminalNode Double_TYPE() { return getToken(parserproject.Double_TYPE, 0); }
		public List<Value3Context> value3() {
			return getRuleContexts(Value3Context.class);
		}
		public Value3Context value3(int i) {
			return getRuleContext(Value3Context.class,i);
		}
		public TerminalNode BOOL_TYPE() { return getToken(parserproject.BOOL_TYPE, 0); }
		public List<Value4Context> value4() {
			return getRuleContexts(Value4Context.class);
		}
		public Value4Context value4(int i) {
			return getRuleContext(Value4Context.class,i);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_listType);
		int _la;
		try {
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				match(LIST);
				setState(1110);
				match(QoOrSmal);
				setState(1111);
				match(INT_TYPE);
				setState(1112);
				match(QcOrBig);
				setState(1113);
				match(ID);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1114);
					match(EQUAL);
					setState(1115);
					match(OPEN_ARCH_LIST);
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUMBER) {
						{
						{
						setState(1116);
						value1();
						setState(1121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMA1) {
							{
							{
							setState(1117);
							match(COMA1);
							setState(1118);
							value1();
							}
							}
							setState(1123);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(1128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1129);
					match(CLOSE_ARCH_LIST);
					}
				}

				setState(1132);
				match(COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(LIST);
				setState(1134);
				match(QoOrSmal);
				setState(1135);
				match(STRING_TYPE);
				setState(1136);
				match(QcOrBig);
				setState(1137);
				match(ID);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1138);
					match(EQUAL);
					setState(1139);
					match(OPEN_ARCH_LIST);
					setState(1150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING) {
						{
						{
						setState(1140);
						value2();
						setState(1145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMA1) {
							{
							{
							setState(1141);
							match(COMA1);
							setState(1142);
							value2();
							}
							}
							setState(1147);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(1152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1153);
					match(CLOSE_ARCH_LIST);
					}
				}

				setState(1156);
				match(COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
				match(LIST);
				setState(1158);
				match(QoOrSmal);
				setState(1159);
				match(Double_TYPE);
				setState(1160);
				match(QcOrBig);
				setState(1161);
				match(ID);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1162);
					match(EQUAL);
					setState(1163);
					match(OPEN_ARCH_LIST);
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DoubleNUMBER) {
						{
						{
						setState(1164);
						value3();
						setState(1169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMA1) {
							{
							{
							setState(1165);
							match(COMA1);
							setState(1166);
							value3();
							}
							}
							setState(1171);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(1176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1177);
					match(CLOSE_ARCH_LIST);
					}
				}

				setState(1180);
				match(COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1181);
				match(LIST);
				setState(1182);
				match(QoOrSmal);
				setState(1183);
				match(BOOL_TYPE);
				setState(1184);
				match(QcOrBig);
				setState(1185);
				match(ID);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1186);
					match(EQUAL);
					setState(1187);
					match(OPEN_ARCH_LIST);
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TRUE || _la==FALSE) {
						{
						{
						setState(1188);
						value4();
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMA1) {
							{
							{
							setState(1189);
							match(COMA1);
							setState(1190);
							value4();
							}
							}
							setState(1195);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(1200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1201);
					match(CLOSE_ARCH_LIST);
					}
				}

				setState(1204);
				match(COMA);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public TerminalNode DoubleNUMBER() { return getToken(parserproject.DoubleNUMBER, 0); }
		public TerminalNode TRUE() { return getToken(parserproject.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserproject.FALSE, 0); }
		public TerminalNode NULL() { return getToken(parserproject.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (STRING - 121)) | (1L << (NUMBER - 121)) | (1L << (DoubleNUMBER - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ValueKeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public TerminalNode DoubleNUMBER() { return getToken(parserproject.DoubleNUMBER, 0); }
		public TerminalNode TRUE() { return getToken(parserproject.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserproject.FALSE, 0); }
		public TerminalNode NULL() { return getToken(parserproject.NULL, 0); }
		public ValueKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValueKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValueKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValueKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueKeyContext valueKey() throws RecognitionException {
		ValueKeyContext _localctx = new ValueKeyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_valueKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (STRING - 121)) | (1L << (NUMBER - 121)) | (1L << (DoubleNUMBER - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ValueValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public TerminalNode DoubleNUMBER() { return getToken(parserproject.DoubleNUMBER, 0); }
		public TerminalNode TRUE() { return getToken(parserproject.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserproject.FALSE, 0); }
		public TerminalNode NULL() { return getToken(parserproject.NULL, 0); }
		public ValueValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValueValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueValueContext valueValue() throws RecognitionException {
		ValueValueContext _localctx = new ValueValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_valueValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (STRING - 121)) | (1L << (NUMBER - 121)) | (1L << (DoubleNUMBER - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Value1Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(parserproject.NUMBER, 0); }
		public Value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValue1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValue1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value1Context value1() throws RecognitionException {
		Value1Context _localctx = new Value1Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_value1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(NUMBER);
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

	public static class Value2Context extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parserproject.STRING, 0); }
		public Value2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValue2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValue2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value2Context value2() throws RecognitionException {
		Value2Context _localctx = new Value2Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_value2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(STRING);
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

	public static class Value3Context extends ParserRuleContext {
		public TerminalNode DoubleNUMBER() { return getToken(parserproject.DoubleNUMBER, 0); }
		public Value3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValue3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValue3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValue3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value3Context value3() throws RecognitionException {
		Value3Context _localctx = new Value3Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_value3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(DoubleNUMBER);
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

	public static class Value4Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(parserproject.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserproject.FALSE, 0); }
		public Value4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).enterValue4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserprojectListener ) ((parserprojectListener)listener).exitValue4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserprojectVisitor ) return ((parserprojectVisitor<? extends T>)visitor).visitValue4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value4Context value4() throws RecognitionException {
		Value4Context _localctx = new Value4Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_value4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 63:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u007f\u04c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0001\u0000\u0005\u0000\u00a4\b\u0000\n\u0000\f\u0000"+
		"\u00a7\t\u0000\u0001\u0000\u0004\u0000\u00aa\b\u0000\u000b\u0000\f\u0000"+
		"\u00ab\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00b4\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u00bb\b\u0002\u0001\u0003\u0003\u0003\u00be"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c4"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00c8\b\u0003\n\u0003\f\u0003"+
		"\u00cb\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00d1\b\u0004\u0001\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00fc\b\u0005\n\u0005\f\u0005\u00ff\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0003\u0006\u010f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0143\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u014d\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0161"+
		"\b\r\n\r\f\r\u0164\t\r\u0005\r\u0166\b\r\n\r\f\r\u0169\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u017e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01a5\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u01aa\b\u0013\u000b\u0013\f\u0013\u01ab\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01b6\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01c6\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01db\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01f4\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01fc\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0204\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u020d"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0214\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u021b\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0223\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0003!\u0234\b!\u0001"+
		"!\u0003!\u0237\b!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0003%\u025d\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0291\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u029d\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u02a6\b,\u0001-\u0001-\u0003-\u02aa"+
		"\b-\u0001-\u0001-\u0001-\u0004-\u02af\b-\u000b-\f-\u02b0\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u02b9\b-\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u00010\u00010\u00011\u00011\u00031\u02c4\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00052\u02cc\b2\n2\f2\u02cf\t2\u00052\u02d1\b2"+
		"\n2\f2\u02d4\t2\u00012\u00012\u00012\u00052\u02d9\b2\n2\f2\u02dc\t2\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00053\u02e6\b3\n3"+
		"\f3\u02e9\t3\u00033\u02eb\b3\u00013\u00013\u00013\u00053\u02f0\b3\n3\f"+
		"3\u02f3\t3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u0300\b3\n3\f3\u0303\t3\u00033\u0305\b3\u00013"+
		"\u00013\u00013\u00053\u030a\b3\n3\f3\u030d\t3\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00053\u031a\b3\n3"+
		"\f3\u031d\t3\u00033\u031f\b3\u00013\u00013\u00013\u00053\u0324\b3\n3\f"+
		"3\u0327\t3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u0334\b3\n3\f3\u0337\t3\u00033\u0339\b3\u00013"+
		"\u00013\u00013\u00053\u033e\b3\n3\f3\u0341\t3\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u0348\b3\u00014\u00014\u00014\u00014\u00014\u00014\u0005"+
		"4\u0350\b4\n4\f4\u0353\t4\u00014\u00014\u00015\u00015\u00016\u00016\u0001"+
		"6\u00036\u035c\b6\u00016\u00016\u00036\u0360\b6\u00016\u00016\u00016\u0003"+
		"6\u0365\b6\u00016\u00016\u00016\u00056\u036a\b6\n6\f6\u036d\t6\u00016"+
		"\u00016\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0003>\u0392\b>\u0001?\u0001?\u0001?\u0003"+
		"?\u0397\b?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0005?\u03a5\b?\n?\f?\u03a8\t?\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u03bd\bA\nA\fA\u03c0"+
		"\tA\u0005A\u03c2\bA\nA\fA\u03c5\tA\u0001A\u0001A\u0001A\u0001A\u0001A"+
		"\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u03d3\bA\u0001"+
		"B\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0005"+
		"D\u03df\bD\nD\fD\u03e2\tD\u0005D\u03e4\bD\nD\fD\u03e7\tD\u0001D\u0001"+
		"D\u0001D\u0001E\u0003E\u03ed\bE\u0001E\u0001E\u0003E\u03f1\bE\u0001E\u0003"+
		"E\u03f4\bE\u0001E\u0001E\u0003E\u03f8\bE\u0001E\u0001E\u0003E\u03fc\b"+
		"E\u0001E\u0001E\u0003E\u0400\bE\u0003E\u0402\bE\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u0408\bF\u0001F\u0001F\u0003F\u040c\bF\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u0412\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0419\bG\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0003G\u0420\bG\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u0427\bG\u0001G\u0003G\u042a\bG\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0454\bH\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u0460"+
		"\bI\nI\fI\u0463\tI\u0005I\u0465\bI\nI\fI\u0468\tI\u0001I\u0003I\u046b"+
		"\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0005I\u0478\bI\nI\fI\u047b\tI\u0005I\u047d\bI\nI\fI\u0480\t"+
		"I\u0001I\u0003I\u0483\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0005I\u0490\bI\nI\fI\u0493\tI\u0005I\u0495"+
		"\bI\nI\fI\u0498\tI\u0001I\u0003I\u049b\bI\u0001I\u0001I\u0001I\u0001I"+
		"\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u04a8\bI\nI\f"+
		"I\u04ab\tI\u0005I\u04ad\bI\nI\fI\u04b0\tI\u0001I\u0003I\u04b3\bI\u0001"+
		"I\u0003I\u04b6\bI\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001"+
		"M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001P\u0000\u0001~Q\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u0000\u0006\u0002\u0000ZZbb\u0002\u0000--AA\u0001\u0000\r"+
		"\u000e\u0001\u0000qr\u0001\u0000\u0005\b\u0004\u0000\r\u000e\u0010\u0010"+
		"yy|}\u04fc\u0000\u00a5\u0001\u0000\u0000\u0000\u0002\u00af\u0001\u0000"+
		"\u0000\u0000\u0004\u00ba\u0001\u0000\u0000\u0000\u0006\u00bd\u0001\u0000"+
		"\u0000\u0000\b\u00d0\u0001\u0000\u0000\u0000\n\u00d3\u0001\u0000\u0000"+
		"\u0000\f\u010e\u0001\u0000\u0000\u0000\u000e\u0129\u0001\u0000\u0000\u0000"+
		"\u0010\u0135\u0001\u0000\u0000\u0000\u0012\u013d\u0001\u0000\u0000\u0000"+
		"\u0014\u0147\u0001\u0000\u0000\u0000\u0016\u014e\u0001\u0000\u0000\u0000"+
		"\u0018\u0154\u0001\u0000\u0000\u0000\u001a\u015a\u0001\u0000\u0000\u0000"+
		"\u001c\u016d\u0001\u0000\u0000\u0000\u001e\u017d\u0001\u0000\u0000\u0000"+
		" \u017f\u0001\u0000\u0000\u0000\"\u0190\u0001\u0000\u0000\u0000$\u01a4"+
		"\u0001\u0000\u0000\u0000&\u01a6\u0001\u0000\u0000\u0000(\u01b5\u0001\u0000"+
		"\u0000\u0000*\u01b7\u0001\u0000\u0000\u0000,\u01bd\u0001\u0000\u0000\u0000"+
		".\u01c1\u0001\u0000\u0000\u00000\u01ca\u0001\u0000\u0000\u00002\u01cf"+
		"\u0001\u0000\u0000\u00004\u01d4\u0001\u0000\u0000\u00006\u01df\u0001\u0000"+
		"\u0000\u00008\u01e9\u0001\u0000\u0000\u0000:\u01f0\u0001\u0000\u0000\u0000"+
		"<\u0213\u0001\u0000\u0000\u0000>\u0215\u0001\u0000\u0000\u0000@\u022b"+
		"\u0001\u0000\u0000\u0000B\u0233\u0001\u0000\u0000\u0000D\u023c\u0001\u0000"+
		"\u0000\u0000F\u024b\u0001\u0000\u0000\u0000H\u0250\u0001\u0000\u0000\u0000"+
		"J\u025c\u0001\u0000\u0000\u0000L\u0265\u0001\u0000\u0000\u0000N\u026f"+
		"\u0001\u0000\u0000\u0000P\u0276\u0001\u0000\u0000\u0000R\u027b\u0001\u0000"+
		"\u0000\u0000T\u0290\u0001\u0000\u0000\u0000V\u029c\u0001\u0000\u0000\u0000"+
		"X\u02a5\u0001\u0000\u0000\u0000Z\u02b8\u0001\u0000\u0000\u0000\\\u02ba"+
		"\u0001\u0000\u0000\u0000^\u02bd\u0001\u0000\u0000\u0000`\u02bf\u0001\u0000"+
		"\u0000\u0000b\u02c3\u0001\u0000\u0000\u0000d\u02c5\u0001\u0000\u0000\u0000"+
		"f\u0347\u0001\u0000\u0000\u0000h\u0349\u0001\u0000\u0000\u0000j\u0356"+
		"\u0001\u0000\u0000\u0000l\u0358\u0001\u0000\u0000\u0000n\u0370\u0001\u0000"+
		"\u0000\u0000p\u0374\u0001\u0000\u0000\u0000r\u0378\u0001\u0000\u0000\u0000"+
		"t\u037c\u0001\u0000\u0000\u0000v\u0380\u0001\u0000\u0000\u0000x\u0384"+
		"\u0001\u0000\u0000\u0000z\u0388\u0001\u0000\u0000\u0000|\u0391\u0001\u0000"+
		"\u0000\u0000~\u0396\u0001\u0000\u0000\u0000\u0080\u03a9\u0001\u0000\u0000"+
		"\u0000\u0082\u03d2\u0001\u0000\u0000\u0000\u0084\u03d4\u0001\u0000\u0000"+
		"\u0000\u0086\u03d7\u0001\u0000\u0000\u0000\u0088\u03d9\u0001\u0000\u0000"+
		"\u0000\u008a\u0401\u0001\u0000\u0000\u0000\u008c\u040b\u0001\u0000\u0000"+
		"\u0000\u008e\u0429\u0001\u0000\u0000\u0000\u0090\u0453\u0001\u0000\u0000"+
		"\u0000\u0092\u04b5\u0001\u0000\u0000\u0000\u0094\u04b7\u0001\u0000\u0000"+
		"\u0000\u0096\u04b9\u0001\u0000\u0000\u0000\u0098\u04bb\u0001\u0000\u0000"+
		"\u0000\u009a\u04bd\u0001\u0000\u0000\u0000\u009c\u04bf\u0001\u0000\u0000"+
		"\u0000\u009e\u04c1\u0001\u0000\u0000\u0000\u00a0\u04c3\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0004\u0002"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0000\u0000"+
		"\u0001\u00ae\u0001\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0001\u0000"+
		"\u0000\u00b0\u00b3\u0005Y\u0000\u0000\u00b1\u00b4\u0003Z-\u0000\u00b2"+
		"\u00b4\u0003\\.\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005Y\u0000\u0000\u00b6\u00b7\u0005Z\u0000\u0000\u00b7\u0003\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0003\u0006\u0003\u0000\u00b9\u00bb\u0003\b\u0004"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u0005\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u0011\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0012\u0000"+
		"\u0000\u00c0\u00c3\u0005~\u0000\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000"+
		"\u00c2\u00c4\u0005~\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c9\u0005m\u0000\u0000\u00c6\u00c8\u0003X,\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"n\u0000\u0000\u00cd\u0007\u0001\u0000\u0000\u0000\u00ce\u00d1\u0003\n"+
		"\u0005\u0000\u00cf\u00d1\u0003\f\u0006\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\t\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d4\u0005\u0011\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0012\u0000\u0000\u00d6\u00d7\u0005~\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0017\u0000\u0000\u00d8\u00d9\u0005\u0018\u0000\u0000\u00d9"+
		"\u00da\u0005m\u0000\u0000\u00da\u00db\u0005\u001a\u0000\u0000\u00db\u00dc"+
		"\u0005~\u0000\u0000\u00dc\u00dd\u0005o\u0000\u0000\u00dd\u00de\u0005m"+
		"\u0000\u0000\u00de\u00df\u0005\u001b\u0000\u0000\u00df\u00e0\u0005t\u0000"+
		"\u0000\u00e0\u00e1\u0005\u001b\u0000\u0000\u00e1\u00e2\u0005n\u0000\u0000"+
		"\u00e2\u00e3\u0005p\u0000\u0000\u00e3\u00e4\u0005s\u0000\u0000\u00e4\u00e5"+
		"\u0005\u001c\u0000\u0000\u00e5\u00e6\u0005o\u0000\u0000\u00e6\u00e7\u0005"+
		"\u001b\u0000\u0000\u00e7\u00e8\u0005s\u0000\u0000\u00e8\u00e9\u0005\u001b"+
		"\u0000\u0000\u00e9\u00ea\u0005p\u0000\u0000\u00ea\u00eb\u0005Z\u0000\u0000"+
		"\u00eb\u00ec\u0005u\u0000\u0000\u00ec\u00ed\u0005\u001d\u0000\u0000\u00ed"+
		"\u00ee\u0005\u001e\u0000\u0000\u00ee\u00ef\u0005[\u0000\u0000\u00ef\u00f0"+
		"\u0005~\u0000\u0000\u00f0\u00f1\u0005\\\u0000\u0000\u00f1\u00f2\u0005"+
		" \u0000\u0000\u00f2\u00f3\u0005o\u0000\u0000\u00f3\u00f4\u0005p\u0000"+
		"\u0000\u00f4\u00f5\u0005v\u0000\u0000\u00f5\u00f6\u0005w\u0000\u0000\u00f6"+
		"\u00f7\u0005~\u0000\u0000\u00f7\u00f8\u0005o\u0000\u0000\u00f8\u00f9\u0005"+
		"p\u0000\u0000\u00f9\u00fd\u0005Z\u0000\u0000\u00fa\u00fc\u0003X,\u0000"+
		"\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005n\u0000\u0000\u0101\u0102\u0005\u0012\u0000\u0000\u0102"+
		"\u0103\u0005w\u0000\u0000\u0103\u0104\u0005~\u0000\u0000\u0104\u0105\u0005"+
		"\u0017\u0000\u0000\u0105\u0106\u0005\u001e\u0000\u0000\u0106\u0107\u0005"+
		"[\u0000\u0000\u0107\u0108\u0005~\u0000\u0000\u0108\u0109\u0005\\\u0000"+
		"\u0000\u0109\u010a\u0005m\u0000\u0000\u010a\u010b\u0003\u000e\u0007\u0000"+
		"\u010b\u010c\u0005n\u0000\u0000\u010c\u000b\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0005\u0011\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u0012\u0000\u0000\u0111\u0112\u0005~\u0000\u0000\u0112\u0113"+
		"\u0005\u0017\u0000\u0000\u0113\u0114\u0005\u0019\u0000\u0000\u0114\u0115"+
		"\u0005m\u0000\u0000\u0115\u0116\u0005\u001a\u0000\u0000\u0116\u0117\u0005"+
		"~\u0000\u0000\u0117\u0118\u0005o\u0000\u0000\u0118\u0119\u0005m\u0000"+
		"\u0000\u0119\u011a\u0005\u001b\u0000\u0000\u011a\u011b\u0005t\u0000\u0000"+
		"\u011b\u011c\u0005\u001b\u0000\u0000\u011c\u011d\u0005n\u0000\u0000\u011d"+
		"\u011e\u0005p\u0000\u0000\u011e\u011f\u0005s\u0000\u0000\u011f\u0120\u0005"+
		"\u001c\u0000\u0000\u0120\u0121\u0005o\u0000\u0000\u0121\u0122\u0005\u001b"+
		"\u0000\u0000\u0122\u0123\u0005s\u0000\u0000\u0123\u0124\u0005\u001b\u0000"+
		"\u0000\u0124\u0125\u0005p\u0000\u0000\u0125\u0126\u0005Z\u0000\u0000\u0126"+
		"\u0127\u0003\u000e\u0007\u0000\u0127\u0128\u0005n\u0000\u0000\u0128\r"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0005u\u0000\u0000\u012a\u012b\u0005"+
		"\u001d\u0000\u0000\u012b\u012c\u0005!\u0000\u0000\u012c\u012d\u0005\u001f"+
		"\u0000\u0000\u012d\u012e\u0005o\u0000\u0000\u012e\u012f\u0005\"\u0000"+
		"\u0000\u012f\u0130\u0005X\u0000\u0000\u0130\u0131\u0005p\u0000\u0000\u0131"+
		"\u0132\u0005m\u0000\u0000\u0132\u0133\u0003\u0010\b\u0000\u0133\u0134"+
		"\u0005n\u0000\u0000\u0134\u000f\u0001\u0000\u0000\u0000\u0135\u0136\u0005"+
		"\u0013\u0000\u0000\u0136\u0137\u0005%\u0000\u0000\u0137\u0138\u0005o\u0000"+
		"\u0000\u0138\u0139\u0003\u0012\t\u0000\u0139\u013a\u0003\u0014\n\u0000"+
		"\u013a\u013b\u0005p\u0000\u0000\u013b\u013c\u0005Z\u0000\u0000\u013c\u0011"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0005&\u0000\u0000\u013e\u013f\u0005"+
		"s\u0000\u0000\u013f\u0140\u0005\'\u0000\u0000\u0140\u0142\u0005o\u0000"+
		"\u0000\u0141\u0143\u0003<\u001e\u0000\u0142\u0141\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005p\u0000\u0000\u0145\u0146\u0005b\u0000\u0000\u0146\u0013"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0005*\u0000\u0000\u0148\u014c\u0005"+
		"s\u0000\u0000\u0149\u014d\u0003\u0018\f\u0000\u014a\u014d\u0003\u0016"+
		"\u000b\u0000\u014b\u014d\u0003&\u0013\u0000\u014c\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d\u0015\u0001\u0000\u0000\u0000\u014e\u014f\u00056\u0000\u0000"+
		"\u014f\u0150\u0005o\u0000\u0000\u0150\u0151\u0003\u001a\r\u0000\u0151"+
		"\u0152\u0005p\u0000\u0000\u0152\u0153\u0005b\u0000\u0000\u0153\u0017\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u00050\u0000\u0000\u0155\u0156\u0005o\u0000"+
		"\u0000\u0156\u0157\u0003\u001a\r\u0000\u0157\u0158\u0005p\u0000\u0000"+
		"\u0158\u0159\u0005b\u0000\u0000\u0159\u0019\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u00051\u0000\u0000\u015b\u015c\u0005s\u0000\u0000\u015c\u0167\u0005"+
		"k\u0000\u0000\u015d\u0162\u0003$\u0012\u0000\u015e\u015f\u0005b\u0000"+
		"\u0000\u015f\u0161\u0003$\u0012\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000"+
		"\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u015d\u0001\u0000\u0000\u0000"+
		"\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005l\u0000\u0000\u016b"+
		"\u016c\u0005b\u0000\u0000\u016c\u001b\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u00053\u0000\u0000\u016e\u016f\u0005c\u0000\u0000\u016f\u0170\u00054"+
		"\u0000\u0000\u0170\u0171\u0005o\u0000\u0000\u0171\u0172\u0003\u001e\u000f"+
		"\u0000\u0172\u0173\u0003 \u0010\u0000\u0173\u0174\u0005p\u0000\u0000\u0174"+
		"\u0175\u0005b\u0000\u0000\u0175\u001d\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005#\u0000\u0000\u0177\u0178\u0005s\u0000\u0000\u0178\u0179\u0005~"+
		"\u0000\u0000\u0179\u017a\u0005c\u0000\u0000\u017a\u017b\u00057\u0000\u0000"+
		"\u017b\u017e\u0005b\u0000\u0000\u017c\u017e\u0005|\u0000\u0000\u017d\u0176"+
		"\u0001\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u001f"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0005$\u0000\u0000\u0180\u0181\u0005"+
		"s\u0000\u0000\u0181\u0182\u0005o\u0000\u0000\u0182\u0183\u0005o\u0000"+
		"\u0000\u0183\u0184\u0005\"\u0000\u0000\u0184\u0185\u0005X\u0000\u0000"+
		"\u0185\u0186\u0005b\u0000\u0000\u0186\u0187\u0005\u0007\u0000\u0000\u0187"+
		"\u0188\u00058\u0000\u0000\u0188\u0189\u0005p\u0000\u0000\u0189\u018a\u0005"+
		"m\u0000\u0000\u018a\u018b\u0005\u0013\u0000\u0000\u018b\u018c\u0003\""+
		"\u0011\u0000\u018c\u018d\u0005n\u0000\u0000\u018d\u018e\u0005p\u0000\u0000"+
		"\u018e\u018f\u0005b\u0000\u0000\u018f!\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u00055\u0000\u0000\u0191\u0192\u0005o\u0000\u0000\u0192\u0193\u00034"+
		"\u001a\u0000\u0193\u0194\u0003,\u0016\u0000\u0194\u0195\u0005p\u0000\u0000"+
		"\u0195\u0196\u0005b\u0000\u0000\u0196#\u0001\u0000\u0000\u0000\u0197\u01a5"+
		"\u0003\u0018\f\u0000\u0198\u01a5\u0003\u0016\u000b\u0000\u0199\u01a5\u0003"+
		"\u001c\u000e\u0000\u019a\u01a5\u0003&\u0013\u0000\u019b\u01a5\u0003<\u001e"+
		"\u0000\u019c\u01a5\u00038\u001c\u0000\u019d\u01a5\u0003>\u001f\u0000\u019e"+
		"\u01a5\u0003B!\u0000\u019f\u01a5\u0003D\"\u0000\u01a0\u01a5\u0003T*\u0000"+
		"\u01a1\u01a5\u0003.\u0017\u0000\u01a2\u01a5\u0003*\u0015\u0000\u01a3\u01a5"+
		"\u0003@ \u0000\u01a4\u0197\u0001\u0000\u0000\u0000\u01a4\u0198\u0001\u0000"+
		"\u0000\u0000\u01a4\u0199\u0001\u0000\u0000\u0000\u01a4\u019a\u0001\u0000"+
		"\u0000\u0000\u01a4\u019b\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000"+
		"\u0000\u0000\u01a4\u019d\u0001\u0000\u0000\u0000\u01a4\u019e\u0001\u0000"+
		"\u0000\u0000\u01a4\u019f\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5%\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u00052\u0000\u0000\u01a7\u01a9\u0005o\u0000\u0000\u01a8"+
		"\u01aa\u0003(\u0014\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0003,\u0016\u0000\u01ae\u01af\u0005p\u0000\u0000\u01af\u01b0\u0007\u0000"+
		"\u0000\u0000\u01b0\'\u0001\u0000\u0000\u0000\u01b1\u01b6\u00030\u0018"+
		"\u0000\u01b2\u01b6\u00032\u0019\u0000\u01b3\u01b6\u0003:\u001d\u0000\u01b4"+
		"\u01b6\u0003J%\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6)\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005W\u0000"+
		"\u0000\u01b8\u01b9\u0005o\u0000\u0000\u01b9\u01ba\u0003,\u0016\u0000\u01ba"+
		"\u01bb\u0005p\u0000\u0000\u01bb\u01bc\u0005b\u0000\u0000\u01bc+\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0005P\u0000\u0000\u01be\u01bf\u0005s\u0000"+
		"\u0000\u01bf\u01c0\u0003$\u0012\u0000\u01c0-\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005V\u0000\u0000\u01c2\u01c5\u0005o\u0000\u0000\u01c3\u01c6\u0003"+
		"0\u0018\u0000\u01c4\u01c6\u00032\u0019\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005p\u0000\u0000\u01c8\u01c9\u0005b\u0000\u0000\u01c9"+
		"/\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005+\u0000\u0000\u01cb\u01cc\u0005"+
		"s\u0000\u0000\u01cc\u01cd\u0005|\u0000\u0000\u01cd\u01ce\u0005b\u0000"+
		"\u0000\u01ce1\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005,\u0000\u0000\u01d0"+
		"\u01d1\u0005s\u0000\u0000\u01d1\u01d2\u0005|\u0000\u0000\u01d2\u01d3\u0005"+
		"b\u0000\u0000\u01d33\u0001\u0000\u0000\u0000\u01d4\u01d5\u00059\u0000"+
		"\u0000\u01d5\u01d6\u0005s\u0000\u0000\u01d6\u01d7\u0005o\u0000\u0000\u01d7"+
		"\u01d8\u0005p\u0000\u0000\u01d8\u01da\u0005m\u0000\u0000\u01d9\u01db\u0003"+
		"6\u001b\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005n\u0000"+
		"\u0000\u01dd\u01de\u0005b\u0000\u0000\u01de5\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0005:\u0000\u0000\u01e0\u01e1\u0005o\u0000\u0000\u01e1\u01e2\u0005"+
		"o\u0000\u0000\u01e2\u01e3\u0005p\u0000\u0000\u01e3\u01e4\u0005m\u0000"+
		"\u0000\u01e4\u01e5\u0003$\u0012\u0000\u01e5\u01e6\u0005n\u0000\u0000\u01e6"+
		"\u01e7\u0005p\u0000\u0000\u01e7\u01e8\u0005Z\u0000\u0000\u01e87\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0005;\u0000\u0000\u01ea\u01eb\u0005s\u0000"+
		"\u0000\u01eb\u01ec\u0005<\u0000\u0000\u01ec\u01ed\u0005c\u0000\u0000\u01ed"+
		"\u01ee\u0005~\u0000\u0000\u01ee\u01ef\u0005b\u0000\u0000\u01ef9\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0005>\u0000\u0000\u01f1\u01f3\u0005s\u0000"+
		"\u0000\u01f2\u01f4\u0005\u001a\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0005@\u0000\u0000\u01f6\u01f7\u0005c\u0000\u0000\u01f7"+
		"\u01f8\u0007\u0001\u0000\u0000\u01f8\u01fb\u0005o\u0000\u0000\u01f9\u01fa"+
		"\u0005.\u0000\u0000\u01fa\u01fc\u0005s\u0000\u0000\u01fb\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0003\u009aM\u0000\u01fe\u01ff\u0005p\u0000\u0000"+
		"\u01ff\u0200\u0005b\u0000\u0000\u0200;\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0005(\u0000\u0000\u0202\u0204\u0005s\u0000\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0005)\u0000\u0000\u0206\u0207\u0005o\u0000\u0000"+
		"\u0207\u0208\u0005y\u0000\u0000\u0208\u0209\u0005p\u0000\u0000\u0209\u0214"+
		"\u0005b\u0000\u0000\u020a\u020b\u0005(\u0000\u0000\u020b\u020d\u0005s"+
		"\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0005)\u0000"+
		"\u0000\u020f\u0210\u0005o\u0000\u0000\u0210\u0211\u0005z\u0000\u0000\u0211"+
		"\u0212\u0005p\u0000\u0000\u0212\u0214\u0005b\u0000\u0000\u0213\u0203\u0001"+
		"\u0000\u0000\u0000\u0213\u020c\u0001\u0000\u0000\u0000\u0214=\u0001\u0000"+
		"\u0000\u0000\u0215\u0216\u0005?\u0000\u0000\u0216\u0217\u0005o\u0000\u0000"+
		"\u0217\u0218\u0005>\u0000\u0000\u0218\u021a\u0005s\u0000\u0000\u0219\u021b"+
		"\u0005\u001a\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0005@\u0000\u0000\u021d\u021e\u0005c\u0000\u0000\u021e\u021f\u0007\u0001"+
		"\u0000\u0000\u021f\u0222\u0005o\u0000\u0000\u0220\u0221\u0005.\u0000\u0000"+
		"\u0221\u0223\u0005s\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0003\u009aM\u0000\u0225\u0226\u0005p\u0000\u0000\u0226\u0227\u0005"+
		"b\u0000\u0000\u0227\u0228\u0003,\u0016\u0000\u0228\u0229\u0005p\u0000"+
		"\u0000\u0229\u022a\u0007\u0000\u0000\u0000\u022a?\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0005/\u0000\u0000\u022c\u022d\u0005o\u0000\u0000\u022d\u022e"+
		"\u0003,\u0016\u0000\u022e\u022f\u0005p\u0000\u0000\u022f\u0230\u0005b"+
		"\u0000\u0000\u0230A\u0001\u0000\u0000\u0000\u0231\u0232\u0005C\u0000\u0000"+
		"\u0232\u0234\u0005o\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233"+
		"\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235"+
		"\u0237\u0003F#\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0003"+
		"H$\u0000\u0239\u023a\u0005p\u0000\u0000\u023a\u023b\u0007\u0000\u0000"+
		"\u0000\u023bC\u0001\u0000\u0000\u0000\u023c\u023d\u0005N\u0000\u0000\u023d"+
		"\u023e\u0005o\u0000\u0000\u023e\u023f\u0005O\u0000\u0000\u023f\u0240\u0005"+
		"s\u0000\u0000\u0240\u0241\u0005o\u0000\u0000\u0241\u0242\u0005p\u0000"+
		"\u0000\u0242\u0243\u0005m\u0000\u0000\u0243\u0244\u0005n\u0000\u0000\u0244"+
		"\u0245\u0005b\u0000\u0000\u0245\u0246\u0005P\u0000\u0000\u0246\u0247\u0005"+
		"s\u0000\u0000\u0247\u0248\u0003<\u001e\u0000\u0248\u0249\u0005p\u0000"+
		"\u0000\u0249\u024a\u0005b\u0000\u0000\u024aE\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005B\u0000\u0000\u024c\u024d\u0005s\u0000\u0000\u024d\u024e\u0007"+
		"\u0002\u0000\u0000\u024e\u024f\u0005b\u0000\u0000\u024fG\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0005D\u0000\u0000\u0251\u0252\u0005s\u0000\u0000\u0252"+
		"\u0253\u0005E\u0000\u0000\u0253\u0254\u0005o\u0000\u0000\u0254\u0255\u0003"+
		"N\'\u0000\u0255\u0256\u0003P(\u0000\u0256\u0257\u0003R)\u0000\u0257\u0258"+
		"\u0005p\u0000\u0000\u0258\u0259\u0005b\u0000\u0000\u0259I\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0005D\u0000\u0000\u025b\u025d\u0005s\u0000\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005J\u0000\u0000\u025f"+
		"\u0260\u0005o\u0000\u0000\u0260\u0261\u00038\u001c\u0000\u0261\u0262\u0003"+
		"L&\u0000\u0262\u0263\u0005p\u0000\u0000\u0263\u0264\u0005b\u0000\u0000"+
		"\u0264K\u0001\u0000\u0000\u0000\u0265\u0266\u0005K\u0000\u0000\u0266\u0267"+
		"\u0005s\u0000\u0000\u0267\u0268\u0005L\u0000\u0000\u0268\u0269\u0005c"+
		"\u0000\u0000\u0269\u026a\u0005M\u0000\u0000\u026a\u026b\u0005o\u0000\u0000"+
		"\u026b\u026c\u0003\u009aM\u0000\u026c\u026d\u0005p\u0000\u0000\u026d\u026e"+
		"\u0005b\u0000\u0000\u026eM\u0001\u0000\u0000\u0000\u026f\u0270\u0005F"+
		"\u0000\u0000\u0270\u0271\u0005s\u0000\u0000\u0271\u0272\u0005G\u0000\u0000"+
		"\u0272\u0273\u0005o\u0000\u0000\u0273\u0274\u0005p\u0000\u0000\u0274\u0275"+
		"\u0005b\u0000\u0000\u0275O\u0001\u0000\u0000\u0000\u0276\u0277\u0005H"+
		"\u0000\u0000\u0277\u0278\u0005s\u0000\u0000\u0278\u0279\u0005y\u0000\u0000"+
		"\u0279\u027a\u0005b\u0000\u0000\u027aQ\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0005I\u0000\u0000\u027c\u027d\u0005s\u0000\u0000\u027d\u027e\u0005y"+
		"\u0000\u0000\u027e\u027f\u0005b\u0000\u0000\u027fS\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0005Q\u0000\u0000\u0281\u0282\u0005c\u0000\u0000\u0282\u0283"+
		"\u0005R\u0000\u0000\u0283\u0284\u0005o\u0000\u0000\u0284\u0285\u0003V"+
		"+\u0000\u0285\u0286\u0005p\u0000\u0000\u0286\u0287\u0005b\u0000\u0000"+
		"\u0287\u0291\u0001\u0000\u0000\u0000\u0288\u0289\u0005Q\u0000\u0000\u0289"+
		"\u028a\u0005c\u0000\u0000\u028a\u028b\u0005R\u0000\u0000\u028b\u028c\u0005"+
		"o\u0000\u0000\u028c\u028d\u0003V+\u0000\u028d\u028e\u0005p\u0000\u0000"+
		"\u028e\u028f\u0005b\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290"+
		"\u0280\u0001\u0000\u0000\u0000\u0290\u0288\u0001\u0000\u0000\u0000\u0291"+
		"U\u0001\u0000\u0000\u0000\u0292\u0293\u0005R\u0000\u0000\u0293\u0294\u0005"+
		"_\u0000\u0000\u0294\u0295\u0005S\u0000\u0000\u0295\u0296\u0005_\u0000"+
		"\u0000\u0296\u0297\u0005T\u0000\u0000\u0297\u0298\u0005_\u0000\u0000\u0298"+
		"\u0299\u0005~\u0000\u0000\u0299\u029a\u0005c\u0000\u0000\u029a\u029d\u0005"+
		"U\u0000\u0000\u029b\u029d\u0005z\u0000\u0000\u029c\u0292\u0001\u0000\u0000"+
		"\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029dW\u0001\u0000\u0000\u0000"+
		"\u029e\u02a6\u0003`0\u0000\u029f\u02a6\u0003\u0082A\u0000\u02a0\u02a6"+
		"\u0003b1\u0000\u02a1\u02a6\u0003h4\u0000\u02a2\u02a6\u0003~?\u0000\u02a3"+
		"\u02a6\u0003j5\u0000\u02a4\u02a6\u0003\u0088D\u0000\u02a5\u029e\u0001"+
		"\u0000\u0000\u0000\u02a5\u029f\u0001\u0000\u0000\u0000\u02a5\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000\u02a5\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a6Y\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005\u0002"+
		"\u0000\u0000\u02a8\u02aa\u0005s\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ae\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ac\u0003^/\u0000\u02ac\u02ad\u0005_\u0000\u0000\u02ad"+
		"\u02af\u0001\u0000\u0000\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b3\u0003\\.\u0000\u02b3\u02b9\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0005`\u0000\u0000\u02b5\u02b9\u0003\\.\u0000\u02b6\u02b7\u0005a\u0000"+
		"\u0000\u02b7\u02b9\u0003\\.\u0000\u02b8\u02a9\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b4\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b9[\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005~\u0000\u0000\u02bb\u02bc"+
		"\u0005\f\u0000\u0000\u02bc]\u0001\u0000\u0000\u0000\u02bd\u02be\u0005"+
		"~\u0000\u0000\u02be_\u0001\u0000\u0000\u0000\u02bf\u02c0\u0003\u008aE"+
		"\u0000\u02c0a\u0001\u0000\u0000\u0000\u02c1\u02c4\u0003d2\u0000\u02c2"+
		"\u02c4\u0003f3\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c4c\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005\u000b"+
		"\u0000\u0000\u02c6\u02c7\u0005~\u0000\u0000\u02c7\u02d2\u0005o\u0000\u0000"+
		"\u02c8\u02cd\u0003\u0084B\u0000\u02c9\u02ca\u0005b\u0000\u0000\u02ca\u02cc"+
		"\u0003\u0084B\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001"+
		"\u0000\u0000\u0000\u02ce\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02d0\u02c8\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d6\u0005p\u0000\u0000\u02d6\u02da\u0005m\u0000"+
		"\u0000\u02d7\u02d9\u0003X,\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9"+
		"\u02dc\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u0001\u0000\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc"+
		"\u02da\u0001\u0000\u0000\u0000\u02dd\u02de\u0005n\u0000\u0000\u02dee\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0005\u0007\u0000\u0000\u02e0\u02e1\u0005"+
		"~\u0000\u0000\u02e1\u02ea\u0005o\u0000\u0000\u02e2\u02e7\u0003\u0084B"+
		"\u0000\u02e3\u02e4\u0005b\u0000\u0000\u02e4\u02e6\u0003\u0084B\u0000\u02e5"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8"+
		"\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e2\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005p\u0000\u0000\u02ed\u02f1"+
		"\u0005m\u0000\u0000\u02ee\u02f0\u0003X,\u0000\u02ef\u02ee\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005\u0013"+
		"\u0000\u0000\u02f5\u02f6\u0003\u009aM\u0000\u02f6\u02f7\u0005Z\u0000\u0000"+
		"\u02f7\u02f8\u0005n\u0000\u0000\u02f8\u0348\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fa\u0005\b\u0000\u0000\u02fa\u02fb\u0005~\u0000\u0000\u02fb\u0304"+
		"\u0005o\u0000\u0000\u02fc\u0301\u0003\u0084B\u0000\u02fd\u02fe\u0005b"+
		"\u0000\u0000\u02fe\u0300\u0003\u0084B\u0000\u02ff\u02fd\u0001\u0000\u0000"+
		"\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0305\u0001\u0000\u0000"+
		"\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u02fc\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u0005p\u0000\u0000\u0307\u030b\u0005m\u0000\u0000\u0308"+
		"\u030a\u0003X,\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a\u030d\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030b\u0001"+
		"\u0000\u0000\u0000\u030e\u030f\u0005\u0013\u0000\u0000\u030f\u0310\u0003"+
		"\u009cN\u0000\u0310\u0311\u0005Z\u0000\u0000\u0311\u0312\u0005n\u0000"+
		"\u0000\u0312\u0348\u0001\u0000\u0000\u0000\u0313\u0314\u0005\u0005\u0000"+
		"\u0000\u0314\u0315\u0005~\u0000\u0000\u0315\u031e\u0005o\u0000\u0000\u0316"+
		"\u031b\u0003\u0084B\u0000\u0317\u0318\u0005b\u0000\u0000\u0318\u031a\u0003"+
		"\u0084B\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u031a\u031d\u0001\u0000"+
		"\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000"+
		"\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031e\u0316\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000"+
		"\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0321\u0005p\u0000"+
		"\u0000\u0321\u0325\u0005m\u0000\u0000\u0322\u0324\u0003X,\u0000\u0323"+
		"\u0322\u0001\u0000\u0000\u0000\u0324\u0327\u0001\u0000\u0000\u0000\u0325"+
		"\u0323\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326"+
		"\u0328\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0328"+
		"\u0329\u0005\u0013\u0000\u0000\u0329\u032a\u0003\u00a0P\u0000\u032a\u032b"+
		"\u0005Z\u0000\u0000\u032b\u032c\u0005n\u0000\u0000\u032c\u0348\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0005\u0006\u0000\u0000\u032e\u032f\u0005~\u0000"+
		"\u0000\u032f\u0338\u0005o\u0000\u0000\u0330\u0335\u0003\u0084B\u0000\u0331"+
		"\u0332\u0005b\u0000\u0000\u0332\u0334\u0003\u0084B\u0000\u0333\u0331\u0001"+
		"\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0333\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0339\u0001"+
		"\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u0330\u0001"+
		"\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0005p\u0000\u0000\u033b\u033f\u0005m\u0000"+
		"\u0000\u033c\u033e\u0003X,\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033e"+
		"\u0341\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f"+
		"\u0340\u0001\u0000\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341"+
		"\u033f\u0001\u0000\u0000\u0000\u0342\u0343\u0005\u0013\u0000\u0000\u0343"+
		"\u0344\u0003\u009eO\u0000\u0344\u0345\u0005Z\u0000\u0000\u0345\u0346\u0005"+
		"n\u0000\u0000\u0346\u0348\u0001\u0000\u0000\u0000\u0347\u02df\u0001\u0000"+
		"\u0000\u0000\u0347\u02f9\u0001\u0000\u0000\u0000\u0347\u0313\u0001\u0000"+
		"\u0000\u0000\u0347\u032d\u0001\u0000\u0000\u0000\u0348g\u0001\u0000\u0000"+
		"\u0000\u0349\u034a\u0005\u000f\u0000\u0000\u034a\u034b\u0005o\u0000\u0000"+
		"\u034b\u034c\u0003|>\u0000\u034c\u034d\u0005p\u0000\u0000\u034d\u0351"+
		"\u0005m\u0000\u0000\u034e\u0350\u0003X,\u0000\u034f\u034e\u0001\u0000"+
		"\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000"+
		"\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0354\u0001\u0000"+
		"\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0355\u0005n\u0000"+
		"\u0000\u0355i\u0001\u0000\u0000\u0000\u0356\u0357\u0003l6\u0000\u0357"+
		"k\u0001\u0000\u0000\u0000\u0358\u0359\u0005\u0016\u0000\u0000\u0359\u035b"+
		"\u0005o\u0000\u0000\u035a\u035c\u0003\u0090H\u0000\u035b\u035a\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000"+
		"\u0000\u0000\u035d\u035f\u0005Z\u0000\u0000\u035e\u0360\u0003|>\u0000"+
		"\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000"+
		"\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0364\u0005Z\u0000\u0000\u0362"+
		"\u0363\u0005~\u0000\u0000\u0363\u0365\u0007\u0003\u0000\u0000\u0364\u0362"+
		"\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0366"+
		"\u0001\u0000\u0000\u0000\u0366\u0367\u0005p\u0000\u0000\u0367\u036b\u0005"+
		"m\u0000\u0000\u0368\u036a\u0003X,\u0000\u0369\u0368\u0001\u0000\u0000"+
		"\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000\u0000"+
		"\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e\u0001\u0000\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u036f\u0005n\u0000\u0000"+
		"\u036fm\u0001\u0000\u0000\u0000\u0370\u0371\u0003~?\u0000\u0371\u0372"+
		"\u0005\\\u0000\u0000\u0372\u0373\u0003~?\u0000\u0373o\u0001\u0000\u0000"+
		"\u0000\u0374\u0375\u0003~?\u0000\u0375\u0376\u0005[\u0000\u0000\u0376"+
		"\u0377\u0003~?\u0000\u0377q\u0001\u0000\u0000\u0000\u0378\u0379\u0003"+
		"~?\u0000\u0379\u037a\u0005]\u0000\u0000\u037a\u037b\u0003~?\u0000\u037b"+
		"s\u0001\u0000\u0000\u0000\u037c\u037d\u0003~?\u0000\u037d\u037e\u0005"+
		"^\u0000\u0000\u037e\u037f\u0003~?\u0000\u037fu\u0001\u0000\u0000\u0000"+
		"\u0380\u0381\u0003~?\u0000\u0381\u0382\u0005h\u0000\u0000\u0382\u0383"+
		"\u0003~?\u0000\u0383w\u0001\u0000\u0000\u0000\u0384\u0385\u0003~?\u0000"+
		"\u0385\u0386\u0005i\u0000\u0000\u0386\u0387\u0003~?\u0000\u0387y\u0001"+
		"\u0000\u0000\u0000\u0388\u0389\u0003\u0080@\u0000\u0389{\u0001\u0000\u0000"+
		"\u0000\u038a\u0392\u0003n7\u0000\u038b\u0392\u0003p8\u0000\u038c\u0392"+
		"\u0003r9\u0000\u038d\u0392\u0003t:\u0000\u038e\u0392\u0003v;\u0000\u038f"+
		"\u0392\u0003x<\u0000\u0390\u0392\u0003z=\u0000\u0391\u038a\u0001\u0000"+
		"\u0000\u0000\u0391\u038b\u0001\u0000\u0000\u0000\u0391\u038c\u0001\u0000"+
		"\u0000\u0000\u0391\u038d\u0001\u0000\u0000\u0000\u0391\u038e\u0001\u0000"+
		"\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0391\u0390\u0001\u0000"+
		"\u0000\u0000\u0392}\u0001\u0000\u0000\u0000\u0393\u0394\u0006?\uffff\uffff"+
		"\u0000\u0394\u0397\u0005~\u0000\u0000\u0395\u0397\u0005|\u0000\u0000\u0396"+
		"\u0393\u0001\u0000\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0397"+
		"\u03a6\u0001\u0000\u0000\u0000\u0398\u0399\n\u0006\u0000\u0000\u0399\u039a"+
		"\u0005d\u0000\u0000\u039a\u03a5\u0003~?\u0007\u039b\u039c\n\u0005\u0000"+
		"\u0000\u039c\u039d\u0005e\u0000\u0000\u039d\u03a5\u0003~?\u0006\u039e"+
		"\u039f\n\u0004\u0000\u0000\u039f\u03a0\u0005f\u0000\u0000\u03a0\u03a5"+
		"\u0003~?\u0005\u03a1\u03a2\n\u0003\u0000\u0000\u03a2\u03a3\u0005_\u0000"+
		"\u0000\u03a3\u03a5\u0003~?\u0004\u03a4\u0398\u0001\u0000\u0000\u0000\u03a4"+
		"\u039b\u0001\u0000\u0000\u0000\u03a4\u039e\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a5\u03a8\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7"+
		"\u007f\u0001\u0000\u0000\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9"+
		"\u03aa\u0005~\u0000\u0000\u03aa\u0081\u0001\u0000\u0000\u0000\u03ab\u03ac"+
		"\u0005\u0015\u0000\u0000\u03ac\u03ad\u0005[\u0000\u0000\u03ad\u03ae\u0003"+
		"\u0086C\u0000\u03ae\u03af\u0005b\u0000\u0000\u03af\u03b0\u0003\u0086C"+
		"\u0000\u03b0\u03b1\u0005\\\u0000\u0000\u03b1\u03b2\u0005~\u0000\u0000"+
		"\u03b2\u03b3\u0005g\u0000\u0000\u03b3\u03c3\u0005m\u0000\u0000\u03b4\u03b5"+
		"\u0003\u0096K\u0000\u03b5\u03b6\u0005s\u0000\u0000\u03b6\u03be\u0003\u0098"+
		"L\u0000\u03b7\u03b8\u0005b\u0000\u0000\u03b8\u03b9\u0003\u0096K\u0000"+
		"\u03b9\u03ba\u0005s\u0000\u0000\u03ba\u03bb\u0003\u0098L\u0000\u03bb\u03bd"+
		"\u0001\u0000\u0000\u0000\u03bc\u03b7\u0001\u0000\u0000\u0000\u03bd\u03c0"+
		"\u0001\u0000\u0000\u0000\u03be\u03bc\u0001\u0000\u0000\u0000\u03be\u03bf"+
		"\u0001\u0000\u0000\u0000\u03bf\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be"+
		"\u0001\u0000\u0000\u0000\u03c1\u03b4\u0001\u0000\u0000\u0000\u03c2\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c6\u03c7\u0005n\u0000\u0000\u03c7\u03c8\u0005"+
		"Z\u0000\u0000\u03c8\u03d3\u0001\u0000\u0000\u0000\u03c9\u03ca\u0005\u0015"+
		"\u0000\u0000\u03ca\u03cb\u0005[\u0000\u0000\u03cb\u03cc\u0003\u0086C\u0000"+
		"\u03cc\u03cd\u0005b\u0000\u0000\u03cd\u03ce\u0003\u0086C\u0000\u03ce\u03cf"+
		"\u0005\\\u0000\u0000\u03cf\u03d0\u0005~\u0000\u0000\u03d0\u03d1\u0005"+
		"Z\u0000\u0000\u03d1\u03d3\u0001\u0000\u0000\u0000\u03d2\u03ab\u0001\u0000"+
		"\u0000\u0000\u03d2\u03c9\u0001\u0000\u0000\u0000\u03d3\u0083\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d5\u0003\u0086C\u0000\u03d5\u03d6\u0005~\u0000\u0000"+
		"\u03d6\u0085\u0001\u0000\u0000\u0000\u03d7\u03d8\u0007\u0004\u0000\u0000"+
		"\u03d8\u0087\u0001\u0000\u0000\u0000\u03d9\u03da\u0005\u0014\u0000\u0000"+
		"\u03da\u03e5\u0005o\u0000\u0000\u03db\u03e0\u0003\u0094J\u0000\u03dc\u03dd"+
		"\u0005b\u0000\u0000\u03dd\u03df\u0003\u0094J\u0000\u03de\u03dc\u0001\u0000"+
		"\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e3\u03db\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e7\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005p\u0000"+
		"\u0000\u03e9\u03ea\u0005Z\u0000\u0000\u03ea\u0089\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ed\u0005\n\u0000\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ec"+
		"\u03ed\u0001\u0000\u0000\u0000\u03ed\u03f0\u0001\u0000\u0000\u0000\u03ee"+
		"\u03f1\u0003\u008cF\u0000\u03ef\u03f1\u0003\u0092I\u0000\u03f0\u03ee\u0001"+
		"\u0000\u0000\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u0402\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f4\u0005\t\u0000\u0000\u03f3\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f8\u0003\u008eG\u0000\u03f6\u03f8\u0003\u0092I\u0000"+
		"\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f6\u0001\u0000\u0000\u0000"+
		"\u03f8\u0402\u0001\u0000\u0000\u0000\u03f9\u03fa\u0005\n\u0000\u0000\u03fa"+
		"\u03fc\u0005\t\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc"+
		"\u0001\u0000\u0000\u0000\u03fc\u03ff\u0001\u0000\u0000\u0000\u03fd\u0400"+
		"\u0003\u008eG\u0000\u03fe\u0400\u0003\u0092I\u0000\u03ff\u03fd\u0001\u0000"+
		"\u0000\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u0400\u0402\u0001\u0000"+
		"\u0000\u0000\u0401\u03ec\u0001\u0000\u0000\u0000\u0401\u03f3\u0001\u0000"+
		"\u0000\u0000\u0401\u03fb\u0001\u0000\u0000\u0000\u0402\u008b\u0001\u0000"+
		"\u0000\u0000\u0403\u0404\u0005\u0003\u0000\u0000\u0404\u0407\u0005~\u0000"+
		"\u0000\u0405\u0406\u0005g\u0000\u0000\u0406\u0408\u0003\u0094J\u0000\u0407"+
		"\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408"+
		"\u0409\u0001\u0000\u0000\u0000\u0409\u040c\u0005Z\u0000\u0000\u040a\u040c"+
		"\u0003\u008eG\u0000\u040b\u0403\u0001\u0000\u0000\u0000\u040b\u040a\u0001"+
		"\u0000\u0000\u0000\u040c\u008d\u0001\u0000\u0000\u0000\u040d\u040e\u0005"+
		"\u0007\u0000\u0000\u040e\u0411\u0005~\u0000\u0000\u040f\u0410\u0005g\u0000"+
		"\u0000\u0410\u0412\u0003\u009aM\u0000\u0411\u040f\u0001\u0000\u0000\u0000"+
		"\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000\u0000"+
		"\u0413\u042a\u0005Z\u0000\u0000\u0414\u0415\u0005\b\u0000\u0000\u0415"+
		"\u0418\u0005~\u0000\u0000\u0416\u0417\u0005g\u0000\u0000\u0417\u0419\u0003"+
		"\u009cN\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000"+
		"\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u042a\u0005Z\u0000"+
		"\u0000\u041b\u041c\u0005\u0006\u0000\u0000\u041c\u041f\u0005~\u0000\u0000"+
		"\u041d\u041e\u0005g\u0000\u0000\u041e\u0420\u0003\u009eO\u0000\u041f\u041d"+
		"\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0421"+
		"\u0001\u0000\u0000\u0000\u0421\u042a\u0005Z\u0000\u0000\u0422\u0423\u0005"+
		"\u0005\u0000\u0000\u0423\u0426\u0005~\u0000\u0000\u0424\u0425\u0005g\u0000"+
		"\u0000\u0425\u0427\u0003\u00a0P\u0000\u0426\u0424\u0001\u0000\u0000\u0000"+
		"\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0428\u0001\u0000\u0000\u0000"+
		"\u0428\u042a\u0005Z\u0000\u0000\u0429\u040d\u0001\u0000\u0000\u0000\u0429"+
		"\u0414\u0001\u0000\u0000\u0000\u0429\u041b\u0001\u0000\u0000\u0000\u0429"+
		"\u0422\u0001\u0000\u0000\u0000\u042a\u008f\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0005\u0007\u0000\u0000\u042c\u042d\u0005~\u0000\u0000\u042d\u042e"+
		"\u0005g\u0000\u0000\u042e\u042f\u0003\u009aM\u0000\u042f\u0430\u0005Z"+
		"\u0000\u0000\u0430\u0454\u0001\u0000\u0000\u0000\u0431\u0432\u0005\b\u0000"+
		"\u0000\u0432\u0433\u0005~\u0000\u0000\u0433\u0434\u0005g\u0000\u0000\u0434"+
		"\u0435\u0003\u009cN\u0000\u0435\u0436\u0005Z\u0000\u0000\u0436\u0454\u0001"+
		"\u0000\u0000\u0000\u0437\u0438\u0005\u0006\u0000\u0000\u0438\u0439\u0005"+
		"~\u0000\u0000\u0439\u043a\u0005g\u0000\u0000\u043a\u043b\u0003\u009eO"+
		"\u0000\u043b\u043c\u0005Z\u0000\u0000\u043c\u0454\u0001\u0000\u0000\u0000"+
		"\u043d\u043e\u0005\u0005\u0000\u0000\u043e\u043f\u0005~\u0000\u0000\u043f"+
		"\u0440\u0005g\u0000\u0000\u0440\u0441\u0003\u00a0P\u0000\u0441\u0442\u0005"+
		"Z\u0000\u0000\u0442\u0454\u0001\u0000\u0000\u0000\u0443\u0444\u0005\u0007"+
		"\u0000\u0000\u0444\u0445\u0005~\u0000\u0000\u0445\u0446\u0005g\u0000\u0000"+
		"\u0446\u0454\u0003\u009aM\u0000\u0447\u0448\u0005\b\u0000\u0000\u0448"+
		"\u0449\u0005~\u0000\u0000\u0449\u044a\u0005g\u0000\u0000\u044a\u0454\u0003"+
		"\u009cN\u0000\u044b\u044c\u0005\u0006\u0000\u0000\u044c\u044d\u0005~\u0000"+
		"\u0000\u044d\u044e\u0005g\u0000\u0000\u044e\u0454\u0003\u009eO\u0000\u044f"+
		"\u0450\u0005\u0005\u0000\u0000\u0450\u0451\u0005~\u0000\u0000\u0451\u0452"+
		"\u0005g\u0000\u0000\u0452\u0454\u0003\u00a0P\u0000\u0453\u042b\u0001\u0000"+
		"\u0000\u0000\u0453\u0431\u0001\u0000\u0000\u0000\u0453\u0437\u0001\u0000"+
		"\u0000\u0000\u0453\u043d\u0001\u0000\u0000\u0000\u0453\u0443\u0001\u0000"+
		"\u0000\u0000\u0453\u0447\u0001\u0000\u0000\u0000\u0453\u044b\u0001\u0000"+
		"\u0000\u0000\u0453\u044f\u0001\u0000\u0000\u0000\u0454\u0091\u0001\u0000"+
		"\u0000\u0000\u0455\u0456\u0005\u0004\u0000\u0000\u0456\u0457\u0005[\u0000"+
		"\u0000\u0457\u0458\u0005\u0007\u0000\u0000\u0458\u0459\u0005\\\u0000\u0000"+
		"\u0459\u046a\u0005~\u0000\u0000\u045a\u045b\u0005g\u0000\u0000\u045b\u0466"+
		"\u0005k\u0000\u0000\u045c\u0461\u0003\u009aM\u0000\u045d\u045e\u0005b"+
		"\u0000\u0000\u045e\u0460\u0003\u009aM\u0000\u045f\u045d\u0001\u0000\u0000"+
		"\u0000\u0460\u0463\u0001\u0000\u0000\u0000\u0461\u045f\u0001\u0000\u0000"+
		"\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0465\u0001\u0000\u0000"+
		"\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0464\u045c\u0001\u0000\u0000"+
		"\u0000\u0465\u0468\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000"+
		"\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0469\u0001\u0000\u0000"+
		"\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0469\u046b\u0005l\u0000\u0000"+
		"\u046a\u045a\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000"+
		"\u046b\u046c\u0001\u0000\u0000\u0000\u046c\u04b6\u0005Z\u0000\u0000\u046d"+
		"\u046e\u0005\u0004\u0000\u0000\u046e\u046f\u0005[\u0000\u0000\u046f\u0470"+
		"\u0005\b\u0000\u0000\u0470\u0471\u0005\\\u0000\u0000\u0471\u0482\u0005"+
		"~\u0000\u0000\u0472\u0473\u0005g\u0000\u0000\u0473\u047e\u0005k\u0000"+
		"\u0000\u0474\u0479\u0003\u009cN\u0000\u0475\u0476\u0005b\u0000\u0000\u0476"+
		"\u0478\u0003\u009cN\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u047b"+
		"\u0001\u0000\u0000\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u0479\u047a"+
		"\u0001\u0000\u0000\u0000\u047a\u047d\u0001\u0000\u0000\u0000\u047b\u0479"+
		"\u0001\u0000\u0000\u0000\u047c\u0474\u0001\u0000\u0000\u0000\u047d\u0480"+
		"\u0001\u0000\u0000\u0000\u047e\u047c\u0001\u0000\u0000\u0000\u047e\u047f"+
		"\u0001\u0000\u0000\u0000\u047f\u0481\u0001\u0000\u0000\u0000\u0480\u047e"+
		"\u0001\u0000\u0000\u0000\u0481\u0483\u0005l\u0000\u0000\u0482\u0472\u0001"+
		"\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0484\u0001"+
		"\u0000\u0000\u0000\u0484\u04b6\u0005Z\u0000\u0000\u0485\u0486\u0005\u0004"+
		"\u0000\u0000\u0486\u0487\u0005[\u0000\u0000\u0487\u0488\u0005\u0006\u0000"+
		"\u0000\u0488\u0489\u0005\\\u0000\u0000\u0489\u049a\u0005~\u0000\u0000"+
		"\u048a\u048b\u0005g\u0000\u0000\u048b\u0496\u0005k\u0000\u0000\u048c\u0491"+
		"\u0003\u009eO\u0000\u048d\u048e\u0005b\u0000\u0000\u048e\u0490\u0003\u009e"+
		"O\u0000\u048f\u048d\u0001\u0000\u0000\u0000\u0490\u0493\u0001\u0000\u0000"+
		"\u0000\u0491\u048f\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000"+
		"\u0000\u0492\u0495\u0001\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000"+
		"\u0000\u0494\u048c\u0001\u0000\u0000\u0000\u0495\u0498\u0001\u0000\u0000"+
		"\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000"+
		"\u0000\u0497\u0499\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000"+
		"\u0000\u0499\u049b\u0005l\u0000\u0000\u049a\u048a\u0001\u0000\u0000\u0000"+
		"\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000"+
		"\u049c\u04b6\u0005Z\u0000\u0000\u049d\u049e\u0005\u0004\u0000\u0000\u049e"+
		"\u049f\u0005[\u0000\u0000\u049f\u04a0\u0005\u0005\u0000\u0000\u04a0\u04a1"+
		"\u0005\\\u0000\u0000\u04a1\u04b2\u0005~\u0000\u0000\u04a2\u04a3\u0005"+
		"g\u0000\u0000\u04a3\u04ae\u0005k\u0000\u0000\u04a4\u04a9\u0003\u00a0P"+
		"\u0000\u04a5\u04a6\u0005b\u0000\u0000\u04a6\u04a8\u0003\u00a0P\u0000\u04a7"+
		"\u04a5\u0001\u0000\u0000\u0000\u04a8\u04ab\u0001\u0000\u0000\u0000\u04a9"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa"+
		"\u04ad\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ac"+
		"\u04a4\u0001\u0000\u0000\u0000\u04ad\u04b0\u0001\u0000\u0000\u0000\u04ae"+
		"\u04ac\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af"+
		"\u04b1\u0001\u0000\u0000\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b1"+
		"\u04b3\u0005l\u0000\u0000\u04b2\u04a2\u0001\u0000\u0000\u0000\u04b2\u04b3"+
		"\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b6"+
		"\u0005Z\u0000\u0000\u04b5\u0455\u0001\u0000\u0000\u0000\u04b5\u046d\u0001"+
		"\u0000\u0000\u0000\u04b5\u0485\u0001\u0000\u0000\u0000\u04b5\u049d\u0001"+
		"\u0000\u0000\u0000\u04b6\u0093\u0001\u0000\u0000\u0000\u04b7\u04b8\u0007"+
		"\u0005\u0000\u0000\u04b8\u0095\u0001\u0000\u0000\u0000\u04b9\u04ba\u0007"+
		"\u0005\u0000\u0000\u04ba\u0097\u0001\u0000\u0000\u0000\u04bb\u04bc\u0007"+
		"\u0005\u0000\u0000\u04bc\u0099\u0001\u0000\u0000\u0000\u04bd\u04be\u0005"+
		"|\u0000\u0000\u04be\u009b\u0001\u0000\u0000\u0000\u04bf\u04c0\u0005y\u0000"+
		"\u0000\u04c0\u009d\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005}\u0000\u0000"+
		"\u04c2\u009f\u0001\u0000\u0000\u0000\u04c3\u04c4\u0007\u0002\u0000\u0000"+
		"\u04c4\u00a1\u0001\u0000\u0000\u0000`\u00a5\u00ab\u00b3\u00ba\u00bd\u00c3"+
		"\u00c9\u00d0\u00d3\u00fd\u010e\u0142\u014c\u0162\u0167\u017d\u01a4\u01ab"+
		"\u01b5\u01c5\u01da\u01f3\u01fb\u0203\u020c\u0213\u021a\u0222\u0233\u0236"+
		"\u025c\u0290\u029c\u02a5\u02a9\u02b0\u02b8\u02c3\u02cd\u02d2\u02da\u02e7"+
		"\u02ea\u02f1\u0301\u0304\u030b\u031b\u031e\u0325\u0335\u0338\u033f\u0347"+
		"\u0351\u035b\u035f\u0364\u036b\u0391\u0396\u03a4\u03a6\u03be\u03c3\u03d2"+
		"\u03e0\u03e5\u03ec\u03f0\u03f3\u03f7\u03fb\u03ff\u0401\u0407\u040b\u0411"+
		"\u0418\u041f\u0426\u0429\u0453\u0461\u0466\u046a\u0479\u047e\u0482\u0491"+
		"\u0496\u049a\u04a9\u04ae\u04b2\u04b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}