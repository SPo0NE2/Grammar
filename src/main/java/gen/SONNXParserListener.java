package gen;// Generated from F:/coding/Grammar/src/main/antlr/SONNXParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SONNXParser}.
 */
public interface SONNXParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SONNXParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(SONNXParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(SONNXParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#model_body_def}.
	 * @param ctx the parse tree
	 */
	void enterModel_body_def(SONNXParser.Model_body_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#model_body_def}.
	 * @param ctx the parse tree
	 */
	void exitModel_body_def(SONNXParser.Model_body_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#ir_version_def}.
	 * @param ctx the parse tree
	 */
	void enterIr_version_def(SONNXParser.Ir_version_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#ir_version_def}.
	 * @param ctx the parse tree
	 */
	void exitIr_version_def(SONNXParser.Ir_version_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#producer_name_def}.
	 * @param ctx the parse tree
	 */
	void enterProducer_name_def(SONNXParser.Producer_name_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#producer_name_def}.
	 * @param ctx the parse tree
	 */
	void exitProducer_name_def(SONNXParser.Producer_name_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#producer_version_def}.
	 * @param ctx the parse tree
	 */
	void enterProducer_version_def(SONNXParser.Producer_version_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#producer_version_def}.
	 * @param ctx the parse tree
	 */
	void exitProducer_version_def(SONNXParser.Producer_version_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#domain_def}.
	 * @param ctx the parse tree
	 */
	void enterDomain_def(SONNXParser.Domain_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#domain_def}.
	 * @param ctx the parse tree
	 */
	void exitDomain_def(SONNXParser.Domain_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#model_version_def}.
	 * @param ctx the parse tree
	 */
	void enterModel_version_def(SONNXParser.Model_version_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#model_version_def}.
	 * @param ctx the parse tree
	 */
	void exitModel_version_def(SONNXParser.Model_version_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#doc_string_def}.
	 * @param ctx the parse tree
	 */
	void enterDoc_string_def(SONNXParser.Doc_string_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#doc_string_def}.
	 * @param ctx the parse tree
	 */
	void exitDoc_string_def(SONNXParser.Doc_string_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#graph_def}.
	 * @param ctx the parse tree
	 */
	void enterGraph_def(SONNXParser.Graph_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#graph_def}.
	 * @param ctx the parse tree
	 */
	void exitGraph_def(SONNXParser.Graph_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#graph_body_def}.
	 * @param ctx the parse tree
	 */
	void enterGraph_body_def(SONNXParser.Graph_body_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#graph_body_def}.
	 * @param ctx the parse tree
	 */
	void exitGraph_body_def(SONNXParser.Graph_body_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#name_def}.
	 * @param ctx the parse tree
	 */
	void enterName_def(SONNXParser.Name_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#name_def}.
	 * @param ctx the parse tree
	 */
	void exitName_def(SONNXParser.Name_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#node_list}.
	 * @param ctx the parse tree
	 */
	void enterNode_list(SONNXParser.Node_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#node_list}.
	 * @param ctx the parse tree
	 */
	void exitNode_list(SONNXParser.Node_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#node_repeats}.
	 * @param ctx the parse tree
	 */
	void enterNode_repeats(SONNXParser.Node_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#node_repeats}.
	 * @param ctx the parse tree
	 */
	void exitNode_repeats(SONNXParser.Node_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#input_list}.
	 * @param ctx the parse tree
	 */
	void enterInput_list(SONNXParser.Input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#input_list}.
	 * @param ctx the parse tree
	 */
	void exitInput_list(SONNXParser.Input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#input_repeats}.
	 * @param ctx the parse tree
	 */
	void enterInput_repeats(SONNXParser.Input_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#input_repeats}.
	 * @param ctx the parse tree
	 */
	void exitInput_repeats(SONNXParser.Input_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#output_list}.
	 * @param ctx the parse tree
	 */
	void enterOutput_list(SONNXParser.Output_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#output_list}.
	 * @param ctx the parse tree
	 */
	void exitOutput_list(SONNXParser.Output_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#output_repeats}.
	 * @param ctx the parse tree
	 */
	void enterOutput_repeats(SONNXParser.Output_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#output_repeats}.
	 * @param ctx the parse tree
	 */
	void exitOutput_repeats(SONNXParser.Output_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(SONNXParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(SONNXParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#initializer_repeats}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_repeats(SONNXParser.Initializer_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#initializer_repeats}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_repeats(SONNXParser.Initializer_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#node_def}.
	 * @param ctx the parse tree
	 */
	void enterNode_def(SONNXParser.Node_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#node_def}.
	 * @param ctx the parse tree
	 */
	void exitNode_def(SONNXParser.Node_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#op_type_def}.
	 * @param ctx the parse tree
	 */
	void enterOp_type_def(SONNXParser.Op_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#op_type_def}.
	 * @param ctx the parse tree
	 */
	void exitOp_type_def(SONNXParser.Op_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#input_arr}.
	 * @param ctx the parse tree
	 */
	void enterInput_arr(SONNXParser.Input_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#input_arr}.
	 * @param ctx the parse tree
	 */
	void exitInput_arr(SONNXParser.Input_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#output_arr}.
	 * @param ctx the parse tree
	 */
	void enterOutput_arr(SONNXParser.Output_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#output_arr}.
	 * @param ctx the parse tree
	 */
	void exitOutput_arr(SONNXParser.Output_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#id_repeats}.
	 * @param ctx the parse tree
	 */
	void enterId_repeats(SONNXParser.Id_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#id_repeats}.
	 * @param ctx the parse tree
	 */
	void exitId_repeats(SONNXParser.Id_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(SONNXParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(SONNXParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#attribute_repeats}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_repeats(SONNXParser.Attribute_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#attribute_repeats}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_repeats(SONNXParser.Attribute_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#attribute_def}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_def(SONNXParser.Attribute_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#attribute_def}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_def(SONNXParser.Attribute_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#value_def}.
	 * @param ctx the parse tree
	 */
	void enterValue_def(SONNXParser.Value_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#value_def}.
	 * @param ctx the parse tree
	 */
	void exitValue_def(SONNXParser.Value_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#value_info_def}.
	 * @param ctx the parse tree
	 */
	void enterValue_info_def(SONNXParser.Value_info_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#value_info_def}.
	 * @param ctx the parse tree
	 */
	void exitValue_info_def(SONNXParser.Value_info_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(SONNXParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(SONNXParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#tensor_type_def}.
	 * @param ctx the parse tree
	 */
	void enterTensor_type_def(SONNXParser.Tensor_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#tensor_type_def}.
	 * @param ctx the parse tree
	 */
	void exitTensor_type_def(SONNXParser.Tensor_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#elem_type_def}.
	 * @param ctx the parse tree
	 */
	void enterElem_type_def(SONNXParser.Elem_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#elem_type_def}.
	 * @param ctx the parse tree
	 */
	void exitElem_type_def(SONNXParser.Elem_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#shape_def}.
	 * @param ctx the parse tree
	 */
	void enterShape_def(SONNXParser.Shape_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#shape_def}.
	 * @param ctx the parse tree
	 */
	void exitShape_def(SONNXParser.Shape_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#dim_list}.
	 * @param ctx the parse tree
	 */
	void enterDim_list(SONNXParser.Dim_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#dim_list}.
	 * @param ctx the parse tree
	 */
	void exitDim_list(SONNXParser.Dim_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#dim_repeats}.
	 * @param ctx the parse tree
	 */
	void enterDim_repeats(SONNXParser.Dim_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#dim_repeats}.
	 * @param ctx the parse tree
	 */
	void exitDim_repeats(SONNXParser.Dim_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#dim_def}.
	 * @param ctx the parse tree
	 */
	void enterDim_def(SONNXParser.Dim_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#dim_def}.
	 * @param ctx the parse tree
	 */
	void exitDim_def(SONNXParser.Dim_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#tensor_def}.
	 * @param ctx the parse tree
	 */
	void enterTensor_def(SONNXParser.Tensor_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#tensor_def}.
	 * @param ctx the parse tree
	 */
	void exitTensor_def(SONNXParser.Tensor_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#data_type_def}.
	 * @param ctx the parse tree
	 */
	void enterData_type_def(SONNXParser.Data_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#data_type_def}.
	 * @param ctx the parse tree
	 */
	void exitData_type_def(SONNXParser.Data_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#dims_def}.
	 * @param ctx the parse tree
	 */
	void enterDims_def(SONNXParser.Dims_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#dims_def}.
	 * @param ctx the parse tree
	 */
	void exitDims_def(SONNXParser.Dims_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#dims_repeats}.
	 * @param ctx the parse tree
	 */
	void enterDims_repeats(SONNXParser.Dims_repeatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#dims_repeats}.
	 * @param ctx the parse tree
	 */
	void exitDims_repeats(SONNXParser.Dims_repeatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#raw_data_def}.
	 * @param ctx the parse tree
	 */
	void enterRaw_data_def(SONNXParser.Raw_data_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#raw_data_def}.
	 * @param ctx the parse tree
	 */
	void exitRaw_data_def(SONNXParser.Raw_data_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#opset_import_def}.
	 * @param ctx the parse tree
	 */
	void enterOpset_import_def(SONNXParser.Opset_import_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#opset_import_def}.
	 * @param ctx the parse tree
	 */
	void exitOpset_import_def(SONNXParser.Opset_import_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SONNXParser#version_def}.
	 * @param ctx the parse tree
	 */
	void enterVersion_def(SONNXParser.Version_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SONNXParser#version_def}.
	 * @param ctx the parse tree
	 */
	void exitVersion_def(SONNXParser.Version_defContext ctx);
}