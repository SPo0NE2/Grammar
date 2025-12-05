parser grammar SONNXParser;

options { tokenVocab=SONNXLexer; }

model : MODELPROTO LBRACE model_body_def RBRACE ;

model_body_def
    : ir_version_def producer_name_def producer_version_def domain_def
      model_version_def doc_string_def graph_def opset_import_def ;

ir_version_def       : IR_VERSION EQUAL INTEGER ;
producer_name_def    : PRODUCER_NAME EQUAL STRING ;
producer_version_def : PRODUCER_VERSION EQUAL STRING ;
domain_def           : DOMAIN EQUAL STRING ;
model_version_def    : MODEL_VERSION EQUAL INTEGER ;
doc_string_def       : DOC_STRING EQUAL STRING ;

graph_def            : GRAPH LBRACE graph_body_def RBRACE ;

graph_body_def
    : name_def node_list input_list output_list initializer_list? ;

name_def             : NAME EQUAL STRING ;

node_list            : NODE LBRACE node_def RBRACE node_repeats ;
node_repeats         : node_list node_repeats | ;

input_list           : INPUT LBRACE value_info_def RBRACE input_repeats ;
input_repeats        : input_list input_repeats | ;

output_list          : OUTPUT LBRACE value_info_def RBRACE output_repeats ;
output_repeats       : output_list output_repeats | ;

initializer_list     : INITIALIZER LBRACE tensor_def RBRACE initializer_repeats ;
initializer_repeats  : initializer_list initializer_repeats | ;

node_def
    : op_type_def name_def
      ( input_list | input_arr )
      ( output_list | output_arr )
      attribute_list? ;

op_type_def          : OP_TYPE EQUAL STRING ;

input_arr            : INPUT EQUAL LBRACK STRING id_repeats RBRACK ;
output_arr           : OUTPUT EQUAL LBRACK STRING id_repeats RBRACK ;

id_repeats           : COMMA STRING id_repeats | ;

attribute_list       : ATTRIBUTE LBRACE attribute_def RBRACE attribute_repeats ;
attribute_repeats    : attribute_list attribute_repeats | ;

attribute_def        : name_def value_def ;
value_def            : VALUE EQUAL STRING ;

value_info_def       : name_def type_def ;

type_def             : TYPE LBRACE tensor_type_def RBRACE ;

tensor_type_def      : TENSOR_TYPE LBRACE elem_type_def shape_def RBRACE ;

elem_type_def        : ELEM_TYPE EQUAL ( INT | FLOAT | STRING_T | BOOL ) ;

shape_def            : SHAPE LBRACE dim_list RBRACE ;

dim_list             : DIM LBRACE dim_def RBRACE dim_repeats ;
dim_repeats          : dim_list dim_repeats | ;

dim_def              : DIM_VALUE EQUAL INTEGER | DIM_PARAM EQUAL STRING ;

tensor_def
    : name_def data_type_def dims_def raw_data_def ;

data_type_def        : DATA_TYPE EQUAL ( INT | FLOAT | STRING_T | BOOL ) ;

dims_def             : DIMS EQUAL INTEGER dims_repeats ;
dims_repeats         : INTEGER dims_repeats | ;

raw_data_def         : RAW_DATA EQUAL BYTES ;

opset_import_def     : OPSET_IMPORT LBRACE domain_def version_def RBRACE ;
version_def          : VERSION EQUAL INTEGER ;
