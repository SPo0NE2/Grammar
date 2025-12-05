lexer grammar SONNXLexer;

// ---------- 保留关键字 ----------
MODELPROTO       : 'ModelProto';
GRAPH            : 'graph';
NAME             : 'name';
NODE             : 'node';
INPUT            : 'input';
OUTPUT           : 'output';
OP_TYPE          : 'op_type';
ATTRIBUTE        : 'attribute';
INITIALIZER      : 'initializer';
DOC_STRING       : 'doc_string';
DOMAIN           : 'domain';
MODEL_VERSION    : 'model_version';
PRODUCER_NAME    : 'producer_name';
PRODUCER_VERSION : 'producer_version';
TYPE             : 'type';
TENSOR_TYPE      : 'tensor_type';
IR_VERSION       : 'ir_version';
ELEM_TYPE        : 'elem_type';
SHAPE            : 'shape';
DIM              : 'dim';
DIMS             : 'dims';
RAW_DATA         : 'raw_data';
OPSET_IMPORT     : 'opset_import';
DIM_VALUE        : 'dim_value';
DIM_PARAM        : 'dim_param';
DATA_TYPE        : 'data_type';
VERSION          : 'version';
VALUE            : 'value';
INT              : 'int';
FLOAT            : 'float';
STRING_T         : 'string';
BOOL             : 'bool';

// ---------- 专用符号 ----------
LBRACK : '[';
RBRACK : ']';
LBRACE : '{';
RBRACE : '}';
COMMA  : ',';
EQUAL  : '=';

// ---------- 字面量 ----------
INTEGER : ( '0' | [1-9][0-9]* ) [lL]? ;
BYTES   : [0-9A-Fa-f]+ 'b' ;
STRING  : '"' ( '\\' [btnfr"\\] | ~["\\] )* '"' ;

// ---------- 空格和换行 ----------
WS : [ \t\r\n]+ -> skip ;
