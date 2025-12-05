// Generated from F:/coding/Grammar/src/main/antlr/SONNXParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SONNXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODELPROTO=1, GRAPH=2, NAME=3, NODE=4, INPUT=5, OUTPUT=6, OP_TYPE=7, ATTRIBUTE=8, 
		INITIALIZER=9, DOC_STRING=10, DOMAIN=11, MODEL_VERSION=12, PRODUCER_NAME=13, 
		PRODUCER_VERSION=14, TYPE=15, TENSOR_TYPE=16, IR_VERSION=17, ELEM_TYPE=18, 
		SHAPE=19, DIM=20, DIMS=21, RAW_DATA=22, OPSET_IMPORT=23, DIM_VALUE=24, 
		DIM_PARAM=25, DATA_TYPE=26, VERSION=27, VALUE=28, INT=29, FLOAT=30, STRING_T=31, 
		BOOL=32, LBRACK=33, RBRACK=34, LBRACE=35, RBRACE=36, COMMA=37, EQUAL=38, 
		INTEGER=39, BYTES=40, STRING=41, WS=42;
	public static final int
		RULE_model = 0, RULE_model_body_def = 1, RULE_ir_version_def = 2, RULE_producer_name_def = 3, 
		RULE_producer_version_def = 4, RULE_domain_def = 5, RULE_model_version_def = 6, 
		RULE_doc_string_def = 7, RULE_graph_def = 8, RULE_graph_body_def = 9, 
		RULE_name_def = 10, RULE_node_list = 11, RULE_node_repeats = 12, RULE_input_list = 13, 
		RULE_input_repeats = 14, RULE_output_list = 15, RULE_output_repeats = 16, 
		RULE_initializer_list = 17, RULE_initializer_repeats = 18, RULE_node_def = 19, 
		RULE_op_type_def = 20, RULE_input_arr = 21, RULE_output_arr = 22, RULE_id_repeats = 23, 
		RULE_attribute_list = 24, RULE_attribute_repeats = 25, RULE_attribute_def = 26, 
		RULE_value_def = 27, RULE_value_info_def = 28, RULE_type_def = 29, RULE_tensor_type_def = 30, 
		RULE_elem_type_def = 31, RULE_shape_def = 32, RULE_dim_list = 33, RULE_dim_repeats = 34, 
		RULE_dim_def = 35, RULE_tensor_def = 36, RULE_data_type_def = 37, RULE_dims_def = 38, 
		RULE_dims_repeats = 39, RULE_raw_data_def = 40, RULE_opset_import_def = 41, 
		RULE_version_def = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "model_body_def", "ir_version_def", "producer_name_def", "producer_version_def", 
			"domain_def", "model_version_def", "doc_string_def", "graph_def", "graph_body_def", 
			"name_def", "node_list", "node_repeats", "input_list", "input_repeats", 
			"output_list", "output_repeats", "initializer_list", "initializer_repeats", 
			"node_def", "op_type_def", "input_arr", "output_arr", "id_repeats", "attribute_list", 
			"attribute_repeats", "attribute_def", "value_def", "value_info_def", 
			"type_def", "tensor_type_def", "elem_type_def", "shape_def", "dim_list", 
			"dim_repeats", "dim_def", "tensor_def", "data_type_def", "dims_def", 
			"dims_repeats", "raw_data_def", "opset_import_def", "version_def"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ModelProto'", "'graph'", "'name'", "'node'", "'input'", "'output'", 
			"'op_type'", "'attribute'", "'initializer'", "'doc_string'", "'domain'", 
			"'model_version'", "'producer_name'", "'producer_version'", "'type'", 
			"'tensor_type'", "'ir_version'", "'elem_type'", "'shape'", "'dim'", "'dims'", 
			"'raw_data'", "'opset_import'", "'dim_value'", "'dim_param'", "'data_type'", 
			"'version'", "'value'", "'int'", "'float'", "'string'", "'bool'", "'['", 
			"']'", "'{'", "'}'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODELPROTO", "GRAPH", "NAME", "NODE", "INPUT", "OUTPUT", "OP_TYPE", 
			"ATTRIBUTE", "INITIALIZER", "DOC_STRING", "DOMAIN", "MODEL_VERSION", 
			"PRODUCER_NAME", "PRODUCER_VERSION", "TYPE", "TENSOR_TYPE", "IR_VERSION", 
			"ELEM_TYPE", "SHAPE", "DIM", "DIMS", "RAW_DATA", "OPSET_IMPORT", "DIM_VALUE", 
			"DIM_PARAM", "DATA_TYPE", "VERSION", "VALUE", "INT", "FLOAT", "STRING_T", 
			"BOOL", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "EQUAL", "INTEGER", 
			"BYTES", "STRING", "WS"
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
	public String getGrammarFileName() { return "SONNXParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SONNXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode MODELPROTO() { return getToken(SONNXParser.MODELPROTO, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Model_body_defContext model_body_def() {
			return getRuleContext(Model_body_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(MODELPROTO);
			setState(87);
			match(LBRACE);
			setState(88);
			model_body_def();
			setState(89);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Model_body_defContext extends ParserRuleContext {
		public Ir_version_defContext ir_version_def() {
			return getRuleContext(Ir_version_defContext.class,0);
		}
		public Producer_name_defContext producer_name_def() {
			return getRuleContext(Producer_name_defContext.class,0);
		}
		public Producer_version_defContext producer_version_def() {
			return getRuleContext(Producer_version_defContext.class,0);
		}
		public Domain_defContext domain_def() {
			return getRuleContext(Domain_defContext.class,0);
		}
		public Model_version_defContext model_version_def() {
			return getRuleContext(Model_version_defContext.class,0);
		}
		public Doc_string_defContext doc_string_def() {
			return getRuleContext(Doc_string_defContext.class,0);
		}
		public Graph_defContext graph_def() {
			return getRuleContext(Graph_defContext.class,0);
		}
		public Opset_import_defContext opset_import_def() {
			return getRuleContext(Opset_import_defContext.class,0);
		}
		public Model_body_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_body_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterModel_body_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitModel_body_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitModel_body_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_body_defContext model_body_def() throws RecognitionException {
		Model_body_defContext _localctx = new Model_body_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_model_body_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			ir_version_def();
			setState(92);
			producer_name_def();
			setState(93);
			producer_version_def();
			setState(94);
			domain_def();
			setState(95);
			model_version_def();
			setState(96);
			doc_string_def();
			setState(97);
			graph_def();
			setState(98);
			opset_import_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ir_version_defContext extends ParserRuleContext {
		public TerminalNode IR_VERSION() { return getToken(SONNXParser.IR_VERSION, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(SONNXParser.INTEGER, 0); }
		public Ir_version_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ir_version_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterIr_version_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitIr_version_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitIr_version_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ir_version_defContext ir_version_def() throws RecognitionException {
		Ir_version_defContext _localctx = new Ir_version_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ir_version_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IR_VERSION);
			setState(101);
			match(EQUAL);
			setState(102);
			match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Producer_name_defContext extends ParserRuleContext {
		public TerminalNode PRODUCER_NAME() { return getToken(SONNXParser.PRODUCER_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Producer_name_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_producer_name_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterProducer_name_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitProducer_name_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitProducer_name_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Producer_name_defContext producer_name_def() throws RecognitionException {
		Producer_name_defContext _localctx = new Producer_name_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_producer_name_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(PRODUCER_NAME);
			setState(105);
			match(EQUAL);
			setState(106);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Producer_version_defContext extends ParserRuleContext {
		public TerminalNode PRODUCER_VERSION() { return getToken(SONNXParser.PRODUCER_VERSION, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Producer_version_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_producer_version_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterProducer_version_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitProducer_version_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitProducer_version_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Producer_version_defContext producer_version_def() throws RecognitionException {
		Producer_version_defContext _localctx = new Producer_version_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_producer_version_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PRODUCER_VERSION);
			setState(109);
			match(EQUAL);
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Domain_defContext extends ParserRuleContext {
		public TerminalNode DOMAIN() { return getToken(SONNXParser.DOMAIN, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Domain_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDomain_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDomain_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDomain_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Domain_defContext domain_def() throws RecognitionException {
		Domain_defContext _localctx = new Domain_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_domain_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DOMAIN);
			setState(113);
			match(EQUAL);
			setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Model_version_defContext extends ParserRuleContext {
		public TerminalNode MODEL_VERSION() { return getToken(SONNXParser.MODEL_VERSION, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(SONNXParser.INTEGER, 0); }
		public Model_version_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_version_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterModel_version_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitModel_version_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitModel_version_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_version_defContext model_version_def() throws RecognitionException {
		Model_version_defContext _localctx = new Model_version_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_model_version_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(MODEL_VERSION);
			setState(117);
			match(EQUAL);
			setState(118);
			match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Doc_string_defContext extends ParserRuleContext {
		public TerminalNode DOC_STRING() { return getToken(SONNXParser.DOC_STRING, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Doc_string_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_string_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDoc_string_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDoc_string_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDoc_string_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Doc_string_defContext doc_string_def() throws RecognitionException {
		Doc_string_defContext _localctx = new Doc_string_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doc_string_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(DOC_STRING);
			setState(121);
			match(EQUAL);
			setState(122);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Graph_defContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(SONNXParser.GRAPH, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Graph_body_defContext graph_body_def() {
			return getRuleContext(Graph_body_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Graph_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterGraph_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitGraph_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitGraph_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_defContext graph_def() throws RecognitionException {
		Graph_defContext _localctx = new Graph_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_graph_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(GRAPH);
			setState(125);
			match(LBRACE);
			setState(126);
			graph_body_def();
			setState(127);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Graph_body_defContext extends ParserRuleContext {
		public Name_defContext name_def() {
			return getRuleContext(Name_defContext.class,0);
		}
		public Node_listContext node_list() {
			return getRuleContext(Node_listContext.class,0);
		}
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public Output_listContext output_list() {
			return getRuleContext(Output_listContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Graph_body_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_body_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterGraph_body_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitGraph_body_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitGraph_body_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_body_defContext graph_body_def() throws RecognitionException {
		Graph_body_defContext _localctx = new Graph_body_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_graph_body_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			name_def();
			setState(130);
			node_list();
			setState(131);
			input_list();
			setState(132);
			output_list();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(133);
				initializer_list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Name_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SONNXParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Name_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterName_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitName_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitName_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_defContext name_def() throws RecognitionException {
		Name_defContext _localctx = new Name_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(NAME);
			setState(137);
			match(EQUAL);
			setState(138);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Node_listContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(SONNXParser.NODE, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Node_defContext node_def() {
			return getRuleContext(Node_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Node_repeatsContext node_repeats() {
			return getRuleContext(Node_repeatsContext.class,0);
		}
		public Node_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterNode_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitNode_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitNode_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_listContext node_list() throws RecognitionException {
		Node_listContext _localctx = new Node_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_node_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NODE);
			setState(141);
			match(LBRACE);
			setState(142);
			node_def();
			setState(143);
			match(RBRACE);
			setState(144);
			node_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Node_repeatsContext extends ParserRuleContext {
		public Node_listContext node_list() {
			return getRuleContext(Node_listContext.class,0);
		}
		public Node_repeatsContext node_repeats() {
			return getRuleContext(Node_repeatsContext.class,0);
		}
		public Node_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterNode_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitNode_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitNode_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_repeatsContext node_repeats() throws RecognitionException {
		Node_repeatsContext _localctx = new Node_repeatsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_node_repeats);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				node_list();
				setState(147);
				node_repeats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_listContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(SONNXParser.INPUT, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Value_info_defContext value_info_def() {
			return getRuleContext(Value_info_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Input_repeatsContext input_repeats() {
			return getRuleContext(Input_repeatsContext.class,0);
		}
		public Input_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterInput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitInput_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitInput_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_listContext input_list() throws RecognitionException {
		Input_listContext _localctx = new Input_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(INPUT);
			setState(153);
			match(LBRACE);
			setState(154);
			value_info_def();
			setState(155);
			match(RBRACE);
			setState(156);
			input_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_repeatsContext extends ParserRuleContext {
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public Input_repeatsContext input_repeats() {
			return getRuleContext(Input_repeatsContext.class,0);
		}
		public Input_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterInput_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitInput_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitInput_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_repeatsContext input_repeats() throws RecognitionException {
		Input_repeatsContext _localctx = new Input_repeatsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input_repeats);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				input_list();
				setState(159);
				input_repeats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Output_listContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SONNXParser.OUTPUT, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Value_info_defContext value_info_def() {
			return getRuleContext(Value_info_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Output_repeatsContext output_repeats() {
			return getRuleContext(Output_repeatsContext.class,0);
		}
		public Output_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterOutput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitOutput_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitOutput_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_listContext output_list() throws RecognitionException {
		Output_listContext _localctx = new Output_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OUTPUT);
			setState(165);
			match(LBRACE);
			setState(166);
			value_info_def();
			setState(167);
			match(RBRACE);
			setState(168);
			output_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Output_repeatsContext extends ParserRuleContext {
		public Output_listContext output_list() {
			return getRuleContext(Output_listContext.class,0);
		}
		public Output_repeatsContext output_repeats() {
			return getRuleContext(Output_repeatsContext.class,0);
		}
		public Output_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterOutput_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitOutput_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitOutput_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_repeatsContext output_repeats() throws RecognitionException {
		Output_repeatsContext _localctx = new Output_repeatsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output_repeats);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				output_list();
				setState(171);
				output_repeats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_listContext extends ParserRuleContext {
		public TerminalNode INITIALIZER() { return getToken(SONNXParser.INITIALIZER, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Tensor_defContext tensor_def() {
			return getRuleContext(Tensor_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Initializer_repeatsContext initializer_repeats() {
			return getRuleContext(Initializer_repeatsContext.class,0);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitInitializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initializer_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(INITIALIZER);
			setState(177);
			match(LBRACE);
			setState(178);
			tensor_def();
			setState(179);
			match(RBRACE);
			setState(180);
			initializer_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_repeatsContext extends ParserRuleContext {
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Initializer_repeatsContext initializer_repeats() {
			return getRuleContext(Initializer_repeatsContext.class,0);
		}
		public Initializer_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterInitializer_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitInitializer_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitInitializer_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_repeatsContext initializer_repeats() throws RecognitionException {
		Initializer_repeatsContext _localctx = new Initializer_repeatsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initializer_repeats);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				initializer_list();
				setState(183);
				initializer_repeats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Node_defContext extends ParserRuleContext {
		public Op_type_defContext op_type_def() {
			return getRuleContext(Op_type_defContext.class,0);
		}
		public Name_defContext name_def() {
			return getRuleContext(Name_defContext.class,0);
		}
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public Input_arrContext input_arr() {
			return getRuleContext(Input_arrContext.class,0);
		}
		public Output_listContext output_list() {
			return getRuleContext(Output_listContext.class,0);
		}
		public Output_arrContext output_arr() {
			return getRuleContext(Output_arrContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Node_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterNode_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitNode_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitNode_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_defContext node_def() throws RecognitionException {
		Node_defContext _localctx = new Node_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_node_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			op_type_def();
			setState(189);
			name_def();
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(190);
				input_list();
				}
				break;
			case 2:
				{
				setState(191);
				input_arr();
				}
				break;
			}
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(194);
				output_list();
				}
				break;
			case 2:
				{
				setState(195);
				output_arr();
				}
				break;
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(198);
				attribute_list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_type_defContext extends ParserRuleContext {
		public TerminalNode OP_TYPE() { return getToken(SONNXParser.OP_TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Op_type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterOp_type_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitOp_type_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitOp_type_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_type_defContext op_type_def() throws RecognitionException {
		Op_type_defContext _localctx = new Op_type_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(OP_TYPE);
			setState(202);
			match(EQUAL);
			setState(203);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_arrContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(SONNXParser.INPUT, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode LBRACK() { return getToken(SONNXParser.LBRACK, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Id_repeatsContext id_repeats() {
			return getRuleContext(Id_repeatsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SONNXParser.RBRACK, 0); }
		public Input_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterInput_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitInput_arr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitInput_arr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_arrContext input_arr() throws RecognitionException {
		Input_arrContext _localctx = new Input_arrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_input_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(INPUT);
			setState(206);
			match(EQUAL);
			setState(207);
			match(LBRACK);
			setState(208);
			match(STRING);
			setState(209);
			id_repeats();
			setState(210);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Output_arrContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SONNXParser.OUTPUT, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode LBRACK() { return getToken(SONNXParser.LBRACK, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Id_repeatsContext id_repeats() {
			return getRuleContext(Id_repeatsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SONNXParser.RBRACK, 0); }
		public Output_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterOutput_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitOutput_arr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitOutput_arr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_arrContext output_arr() throws RecognitionException {
		Output_arrContext _localctx = new Output_arrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_output_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(OUTPUT);
			setState(213);
			match(EQUAL);
			setState(214);
			match(LBRACK);
			setState(215);
			match(STRING);
			setState(216);
			id_repeats();
			setState(217);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Id_repeatsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SONNXParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Id_repeatsContext id_repeats() {
			return getRuleContext(Id_repeatsContext.class,0);
		}
		public Id_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterId_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitId_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitId_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_repeatsContext id_repeats() throws RecognitionException {
		Id_repeatsContext _localctx = new Id_repeatsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_id_repeats);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(COMMA);
				setState(220);
				match(STRING);
				setState(221);
				id_repeats();
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_listContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(SONNXParser.ATTRIBUTE, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Attribute_defContext attribute_def() {
			return getRuleContext(Attribute_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Attribute_repeatsContext attribute_repeats() {
			return getRuleContext(Attribute_repeatsContext.class,0);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ATTRIBUTE);
			setState(226);
			match(LBRACE);
			setState(227);
			attribute_def();
			setState(228);
			match(RBRACE);
			setState(229);
			attribute_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_repeatsContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Attribute_repeatsContext attribute_repeats() {
			return getRuleContext(Attribute_repeatsContext.class,0);
		}
		public Attribute_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterAttribute_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitAttribute_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitAttribute_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_repeatsContext attribute_repeats() throws RecognitionException {
		Attribute_repeatsContext _localctx = new Attribute_repeatsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attribute_repeats);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				attribute_list();
				setState(232);
				attribute_repeats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_defContext extends ParserRuleContext {
		public Name_defContext name_def() {
			return getRuleContext(Name_defContext.class,0);
		}
		public Value_defContext value_def() {
			return getRuleContext(Value_defContext.class,0);
		}
		public Attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterAttribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitAttribute_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitAttribute_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_defContext attribute_def() throws RecognitionException {
		Attribute_defContext _localctx = new Attribute_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attribute_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			name_def();
			setState(238);
			value_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_defContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(SONNXParser.VALUE, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Value_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterValue_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitValue_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitValue_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_defContext value_def() throws RecognitionException {
		Value_defContext _localctx = new Value_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(VALUE);
			setState(241);
			match(EQUAL);
			setState(242);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Value_info_defContext extends ParserRuleContext {
		public Name_defContext name_def() {
			return getRuleContext(Name_defContext.class,0);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Value_info_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_info_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterValue_info_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitValue_info_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitValue_info_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_info_defContext value_info_def() throws RecognitionException {
		Value_info_defContext _localctx = new Value_info_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value_info_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			name_def();
			setState(245);
			type_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SONNXParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Tensor_type_defContext tensor_type_def() {
			return getRuleContext(Tensor_type_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(TYPE);
			setState(248);
			match(LBRACE);
			setState(249);
			tensor_type_def();
			setState(250);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tensor_type_defContext extends ParserRuleContext {
		public TerminalNode TENSOR_TYPE() { return getToken(SONNXParser.TENSOR_TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Elem_type_defContext elem_type_def() {
			return getRuleContext(Elem_type_defContext.class,0);
		}
		public Shape_defContext shape_def() {
			return getRuleContext(Shape_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Tensor_type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterTensor_type_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitTensor_type_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitTensor_type_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tensor_type_defContext tensor_type_def() throws RecognitionException {
		Tensor_type_defContext _localctx = new Tensor_type_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tensor_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(TENSOR_TYPE);
			setState(253);
			match(LBRACE);
			setState(254);
			elem_type_def();
			setState(255);
			shape_def();
			setState(256);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elem_type_defContext extends ParserRuleContext {
		public TerminalNode ELEM_TYPE() { return getToken(SONNXParser.ELEM_TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INT() { return getToken(SONNXParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SONNXParser.FLOAT, 0); }
		public TerminalNode STRING_T() { return getToken(SONNXParser.STRING_T, 0); }
		public TerminalNode BOOL() { return getToken(SONNXParser.BOOL, 0); }
		public Elem_type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterElem_type_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitElem_type_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitElem_type_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_type_defContext elem_type_def() throws RecognitionException {
		Elem_type_defContext _localctx = new Elem_type_defContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elem_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ELEM_TYPE);
			setState(259);
			match(EQUAL);
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Shape_defContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(SONNXParser.SHAPE, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Dim_listContext dim_list() {
			return getRuleContext(Dim_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Shape_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterShape_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitShape_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitShape_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_defContext shape_def() throws RecognitionException {
		Shape_defContext _localctx = new Shape_defContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_shape_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(SHAPE);
			setState(263);
			match(LBRACE);
			setState(264);
			dim_list();
			setState(265);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dim_listContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(SONNXParser.DIM, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Dim_defContext dim_def() {
			return getRuleContext(Dim_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Dim_repeatsContext dim_repeats() {
			return getRuleContext(Dim_repeatsContext.class,0);
		}
		public Dim_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDim_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDim_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDim_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_listContext dim_list() throws RecognitionException {
		Dim_listContext _localctx = new Dim_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dim_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(DIM);
			setState(268);
			match(LBRACE);
			setState(269);
			dim_def();
			setState(270);
			match(RBRACE);
			setState(271);
			dim_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dim_repeatsContext extends ParserRuleContext {
		public Dim_listContext dim_list() {
			return getRuleContext(Dim_listContext.class,0);
		}
		public Dim_repeatsContext dim_repeats() {
			return getRuleContext(Dim_repeatsContext.class,0);
		}
		public Dim_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDim_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDim_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDim_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_repeatsContext dim_repeats() throws RecognitionException {
		Dim_repeatsContext _localctx = new Dim_repeatsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dim_repeats);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				dim_list();
				setState(274);
				dim_repeats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dim_defContext extends ParserRuleContext {
		public TerminalNode DIM_VALUE() { return getToken(SONNXParser.DIM_VALUE, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(SONNXParser.INTEGER, 0); }
		public TerminalNode DIM_PARAM() { return getToken(SONNXParser.DIM_PARAM, 0); }
		public TerminalNode STRING() { return getToken(SONNXParser.STRING, 0); }
		public Dim_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDim_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDim_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDim_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_defContext dim_def() throws RecognitionException {
		Dim_defContext _localctx = new Dim_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dim_def);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIM_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(DIM_VALUE);
				setState(280);
				match(EQUAL);
				setState(281);
				match(INTEGER);
				}
				break;
			case DIM_PARAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(DIM_PARAM);
				setState(283);
				match(EQUAL);
				setState(284);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tensor_defContext extends ParserRuleContext {
		public Name_defContext name_def() {
			return getRuleContext(Name_defContext.class,0);
		}
		public Data_type_defContext data_type_def() {
			return getRuleContext(Data_type_defContext.class,0);
		}
		public Dims_defContext dims_def() {
			return getRuleContext(Dims_defContext.class,0);
		}
		public Raw_data_defContext raw_data_def() {
			return getRuleContext(Raw_data_defContext.class,0);
		}
		public Tensor_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterTensor_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitTensor_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitTensor_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tensor_defContext tensor_def() throws RecognitionException {
		Tensor_defContext _localctx = new Tensor_defContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tensor_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			name_def();
			setState(288);
			data_type_def();
			setState(289);
			dims_def();
			setState(290);
			raw_data_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_type_defContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(SONNXParser.DATA_TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INT() { return getToken(SONNXParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SONNXParser.FLOAT, 0); }
		public TerminalNode STRING_T() { return getToken(SONNXParser.STRING_T, 0); }
		public TerminalNode BOOL() { return getToken(SONNXParser.BOOL, 0); }
		public Data_type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterData_type_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitData_type_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitData_type_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_type_defContext data_type_def() throws RecognitionException {
		Data_type_defContext _localctx = new Data_type_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_data_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(DATA_TYPE);
			setState(293);
			match(EQUAL);
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dims_defContext extends ParserRuleContext {
		public TerminalNode DIMS() { return getToken(SONNXParser.DIMS, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(SONNXParser.INTEGER, 0); }
		public Dims_repeatsContext dims_repeats() {
			return getRuleContext(Dims_repeatsContext.class,0);
		}
		public Dims_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDims_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDims_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDims_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dims_defContext dims_def() throws RecognitionException {
		Dims_defContext _localctx = new Dims_defContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dims_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(DIMS);
			setState(297);
			match(EQUAL);
			setState(298);
			match(INTEGER);
			setState(299);
			dims_repeats();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dims_repeatsContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SONNXParser.INTEGER, 0); }
		public Dims_repeatsContext dims_repeats() {
			return getRuleContext(Dims_repeatsContext.class,0);
		}
		public Dims_repeatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims_repeats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterDims_repeats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitDims_repeats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitDims_repeats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dims_repeatsContext dims_repeats() throws RecognitionException {
		Dims_repeatsContext _localctx = new Dims_repeatsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dims_repeats);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(INTEGER);
				setState(302);
				dims_repeats();
				}
				break;
			case RAW_DATA:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_data_defContext extends ParserRuleContext {
		public TerminalNode RAW_DATA() { return getToken(SONNXParser.RAW_DATA, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode BYTES() { return getToken(SONNXParser.BYTES, 0); }
		public Raw_data_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_data_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterRaw_data_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitRaw_data_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitRaw_data_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_data_defContext raw_data_def() throws RecognitionException {
		Raw_data_defContext _localctx = new Raw_data_defContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_raw_data_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(RAW_DATA);
			setState(307);
			match(EQUAL);
			setState(308);
			match(BYTES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opset_import_defContext extends ParserRuleContext {
		public TerminalNode OPSET_IMPORT() { return getToken(SONNXParser.OPSET_IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(SONNXParser.LBRACE, 0); }
		public Domain_defContext domain_def() {
			return getRuleContext(Domain_defContext.class,0);
		}
		public Version_defContext version_def() {
			return getRuleContext(Version_defContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SONNXParser.RBRACE, 0); }
		public Opset_import_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opset_import_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterOpset_import_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitOpset_import_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitOpset_import_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opset_import_defContext opset_import_def() throws RecognitionException {
		Opset_import_defContext _localctx = new Opset_import_defContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opset_import_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OPSET_IMPORT);
			setState(311);
			match(LBRACE);
			setState(312);
			domain_def();
			setState(313);
			version_def();
			setState(314);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Version_defContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(SONNXParser.VERSION, 0); }
		public TerminalNode EQUAL() { return getToken(SONNXParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(SONNXParser.INTEGER, 0); }
		public Version_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).enterVersion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SONNXParserListener ) ((SONNXParserListener)listener).exitVersion_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SONNXParserVisitor ) return ((SONNXParserVisitor<? extends T>)visitor).visitVersion_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Version_defContext version_def() throws RecognitionException {
		Version_defContext _localctx = new Version_defContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_version_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(VERSION);
			setState(317);
			match(EQUAL);
			setState(318);
			match(INTEGER);
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
		"\u0004\u0001*\u0141\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0087\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0097\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a3\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00af\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bb\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c1\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00c5\b\u0013\u0001\u0013\u0003\u0013\u00c8"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00e0"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00ec"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0116\b"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u011e\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u0131\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0000\u0000+\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRT\u0000\u0001\u0001\u0000\u001d \u0122\u0000V\u0001\u0000\u0000"+
		"\u0000\u0002[\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006"+
		"h\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000"+
		"\u0000\ft\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"|\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0088"+
		"\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u0096"+
		"\u0001\u0000\u0000\u0000\u001a\u0098\u0001\u0000\u0000\u0000\u001c\u00a2"+
		"\u0001\u0000\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00ae\u0001"+
		"\u0000\u0000\u0000\"\u00b0\u0001\u0000\u0000\u0000$\u00ba\u0001\u0000"+
		"\u0000\u0000&\u00bc\u0001\u0000\u0000\u0000(\u00c9\u0001\u0000\u0000\u0000"+
		"*\u00cd\u0001\u0000\u0000\u0000,\u00d4\u0001\u0000\u0000\u0000.\u00df"+
		"\u0001\u0000\u0000\u00000\u00e1\u0001\u0000\u0000\u00002\u00eb\u0001\u0000"+
		"\u0000\u00004\u00ed\u0001\u0000\u0000\u00006\u00f0\u0001\u0000\u0000\u0000"+
		"8\u00f4\u0001\u0000\u0000\u0000:\u00f7\u0001\u0000\u0000\u0000<\u00fc"+
		"\u0001\u0000\u0000\u0000>\u0102\u0001\u0000\u0000\u0000@\u0106\u0001\u0000"+
		"\u0000\u0000B\u010b\u0001\u0000\u0000\u0000D\u0115\u0001\u0000\u0000\u0000"+
		"F\u011d\u0001\u0000\u0000\u0000H\u011f\u0001\u0000\u0000\u0000J\u0124"+
		"\u0001\u0000\u0000\u0000L\u0128\u0001\u0000\u0000\u0000N\u0130\u0001\u0000"+
		"\u0000\u0000P\u0132\u0001\u0000\u0000\u0000R\u0136\u0001\u0000\u0000\u0000"+
		"T\u013c\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0005#\u0000"+
		"\u0000XY\u0003\u0002\u0001\u0000YZ\u0005$\u0000\u0000Z\u0001\u0001\u0000"+
		"\u0000\u0000[\\\u0003\u0004\u0002\u0000\\]\u0003\u0006\u0003\u0000]^\u0003"+
		"\b\u0004\u0000^_\u0003\n\u0005\u0000_`\u0003\f\u0006\u0000`a\u0003\u000e"+
		"\u0007\u0000ab\u0003\u0010\b\u0000bc\u0003R)\u0000c\u0003\u0001\u0000"+
		"\u0000\u0000de\u0005\u0011\u0000\u0000ef\u0005&\u0000\u0000fg\u0005\'"+
		"\u0000\u0000g\u0005\u0001\u0000\u0000\u0000hi\u0005\r\u0000\u0000ij\u0005"+
		"&\u0000\u0000jk\u0005)\u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005"+
		"\u000e\u0000\u0000mn\u0005&\u0000\u0000no\u0005)\u0000\u0000o\t\u0001"+
		"\u0000\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005&\u0000\u0000rs\u0005"+
		")\u0000\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0005\f\u0000\u0000uv\u0005"+
		"&\u0000\u0000vw\u0005\'\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0005"+
		"\n\u0000\u0000yz\u0005&\u0000\u0000z{\u0005)\u0000\u0000{\u000f\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0002\u0000\u0000}~\u0005#\u0000\u0000~\u007f"+
		"\u0003\u0012\t\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u0011\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0003\u0016"+
		"\u000b\u0000\u0083\u0084\u0003\u001a\r\u0000\u0084\u0086\u0003\u001e\u000f"+
		"\u0000\u0085\u0087\u0003\"\u0011\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008a\u0005&\u0000\u0000\u008a"+
		"\u008b\u0005)\u0000\u0000\u008b\u0015\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0004\u0000\u0000\u008d\u008e\u0005#\u0000\u0000\u008e\u008f\u0003"+
		"&\u0013\u0000\u008f\u0090\u0005$\u0000\u0000\u0090\u0091\u0003\u0018\f"+
		"\u0000\u0091\u0017\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0016\u000b"+
		"\u0000\u0093\u0094\u0003\u0018\f\u0000\u0094\u0097\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0019\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u009a\u0005#\u0000\u0000\u009a"+
		"\u009b\u00038\u001c\u0000\u009b\u009c\u0005$\u0000\u0000\u009c\u009d\u0003"+
		"\u001c\u000e\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u009f\u0003"+
		"\u001a\r\u0000\u009f\u00a0\u0003\u001c\u000e\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u001d\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5\u00a6\u0005#\u0000"+
		"\u0000\u00a6\u00a7\u00038\u001c\u0000\u00a7\u00a8\u0005$\u0000\u0000\u00a8"+
		"\u00a9\u0003 \u0010\u0000\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001e\u000f\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af!\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1\u00b2\u0005#\u0000"+
		"\u0000\u00b2\u00b3\u0003H$\u0000\u00b3\u00b4\u0005$\u0000\u0000\u00b4"+
		"\u00b5\u0003$\u0012\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003"+
		"\"\u0011\u0000\u00b7\u00b8\u0003$\u0012\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb%\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd\u00c0\u0003\u0014\n\u0000"+
		"\u00be\u00c1\u0003\u001a\r\u0000\u00bf\u00c1\u0003*\u0015\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c5\u0003\u001e\u000f\u0000\u00c3"+
		"\u00c5\u0003,\u0016\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c8"+
		"\u00030\u0018\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\'\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0007"+
		"\u0000\u0000\u00ca\u00cb\u0005&\u0000\u0000\u00cb\u00cc\u0005)\u0000\u0000"+
		"\u00cc)\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000\u00ce"+
		"\u00cf\u0005&\u0000\u0000\u00cf\u00d0\u0005!\u0000\u0000\u00d0\u00d1\u0005"+
		")\u0000\u0000\u00d1\u00d2\u0003.\u0017\u0000\u00d2\u00d3\u0005\"\u0000"+
		"\u0000\u00d3+\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000"+
		"\u00d5\u00d6\u0005&\u0000\u0000\u00d6\u00d7\u0005!\u0000\u0000\u00d7\u00d8"+
		"\u0005)\u0000\u0000\u00d8\u00d9\u0003.\u0017\u0000\u00d9\u00da\u0005\""+
		"\u0000\u0000\u00da-\u0001\u0000\u0000\u0000\u00db\u00dc\u0005%\u0000\u0000"+
		"\u00dc\u00dd\u0005)\u0000\u0000\u00dd\u00e0\u0003.\u0017\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0/\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\b\u0000\u0000\u00e2\u00e3\u0005#\u0000\u0000\u00e3\u00e4\u00034\u001a"+
		"\u0000\u00e4\u00e5\u0005$\u0000\u0000\u00e5\u00e6\u00032\u0019\u0000\u00e6"+
		"1\u0001\u0000\u0000\u0000\u00e7\u00e8\u00030\u0018\u0000\u00e8\u00e9\u0003"+
		"2\u0019\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec3\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003\u0014\n"+
		"\u0000\u00ee\u00ef\u00036\u001b\u0000\u00ef5\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u001c\u0000\u0000\u00f1\u00f2\u0005&\u0000\u0000\u00f2\u00f3"+
		"\u0005)\u0000\u0000\u00f37\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\u0014"+
		"\n\u0000\u00f5\u00f6\u0003:\u001d\u0000\u00f69\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005\u000f\u0000\u0000\u00f8\u00f9\u0005#\u0000\u0000\u00f9"+
		"\u00fa\u0003<\u001e\u0000\u00fa\u00fb\u0005$\u0000\u0000\u00fb;\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\u0010\u0000\u0000\u00fd\u00fe\u0005"+
		"#\u0000\u0000\u00fe\u00ff\u0003>\u001f\u0000\u00ff\u0100\u0003@ \u0000"+
		"\u0100\u0101\u0005$\u0000\u0000\u0101=\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u0012\u0000\u0000\u0103\u0104\u0005&\u0000\u0000\u0104\u0105\u0007"+
		"\u0000\u0000\u0000\u0105?\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0013"+
		"\u0000\u0000\u0107\u0108\u0005#\u0000\u0000\u0108\u0109\u0003B!\u0000"+
		"\u0109\u010a\u0005$\u0000\u0000\u010aA\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\u0014\u0000\u0000\u010c\u010d\u0005#\u0000\u0000\u010d\u010e\u0003"+
		"F#\u0000\u010e\u010f\u0005$\u0000\u0000\u010f\u0110\u0003D\"\u0000\u0110"+
		"C\u0001\u0000\u0000\u0000\u0111\u0112\u0003B!\u0000\u0112\u0113\u0003"+
		"D\"\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000"+
		"\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0116E\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0018\u0000"+
		"\u0000\u0118\u0119\u0005&\u0000\u0000\u0119\u011e\u0005\'\u0000\u0000"+
		"\u011a\u011b\u0005\u0019\u0000\u0000\u011b\u011c\u0005&\u0000\u0000\u011c"+
		"\u011e\u0005)\u0000\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d\u011a"+
		"\u0001\u0000\u0000\u0000\u011eG\u0001\u0000\u0000\u0000\u011f\u0120\u0003"+
		"\u0014\n\u0000\u0120\u0121\u0003J%\u0000\u0121\u0122\u0003L&\u0000\u0122"+
		"\u0123\u0003P(\u0000\u0123I\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"\u001a\u0000\u0000\u0125\u0126\u0005&\u0000\u0000\u0126\u0127\u0007\u0000"+
		"\u0000\u0000\u0127K\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0015\u0000"+
		"\u0000\u0129\u012a\u0005&\u0000\u0000\u012a\u012b\u0005\'\u0000\u0000"+
		"\u012b\u012c\u0003N\'\u0000\u012cM\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\'\u0000\u0000\u012e\u0131\u0003N\'\u0000\u012f\u0131\u0001\u0000"+
		"\u0000\u0000\u0130\u012d\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131O\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0016\u0000"+
		"\u0000\u0133\u0134\u0005&\u0000\u0000\u0134\u0135\u0005(\u0000\u0000\u0135"+
		"Q\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0017\u0000\u0000\u0137\u0138"+
		"\u0005#\u0000\u0000\u0138\u0139\u0003\n\u0005\u0000\u0139\u013a\u0003"+
		"T*\u0000\u013a\u013b\u0005$\u0000\u0000\u013bS\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0005\u001b\u0000\u0000\u013d\u013e\u0005&\u0000\u0000\u013e"+
		"\u013f\u0005\'\u0000\u0000\u013fU\u0001\u0000\u0000\u0000\r\u0086\u0096"+
		"\u00a2\u00ae\u00ba\u00c0\u00c4\u00c7\u00df\u00eb\u0115\u011d\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}