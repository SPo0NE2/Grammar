// Generated from F:/coding/Grammar/src/main/antlr/SONNXParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SONNXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SONNXParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SONNXParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(SONNXParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#model_body_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_body_def(SONNXParser.Model_body_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#ir_version_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIr_version_def(SONNXParser.Ir_version_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#producer_name_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducer_name_def(SONNXParser.Producer_name_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#producer_version_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducer_version_def(SONNXParser.Producer_version_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#domain_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_def(SONNXParser.Domain_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#model_version_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_version_def(SONNXParser.Model_version_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#doc_string_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc_string_def(SONNXParser.Doc_string_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#graph_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_def(SONNXParser.Graph_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#graph_body_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_body_def(SONNXParser.Graph_body_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#name_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_def(SONNXParser.Name_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#node_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_list(SONNXParser.Node_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#node_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_repeats(SONNXParser.Node_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_list(SONNXParser.Input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#input_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_repeats(SONNXParser.Input_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#output_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_list(SONNXParser.Output_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#output_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_repeats(SONNXParser.Output_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(SONNXParser.Initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#initializer_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_repeats(SONNXParser.Initializer_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#node_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_def(SONNXParser.Node_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#op_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_type_def(SONNXParser.Op_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#input_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_arr(SONNXParser.Input_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#output_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_arr(SONNXParser.Output_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#id_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_repeats(SONNXParser.Id_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(SONNXParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#attribute_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_repeats(SONNXParser.Attribute_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#attribute_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_def(SONNXParser.Attribute_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#value_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_def(SONNXParser.Value_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#value_info_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_info_def(SONNXParser.Value_info_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(SONNXParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#tensor_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTensor_type_def(SONNXParser.Tensor_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#elem_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_type_def(SONNXParser.Elem_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#shape_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_def(SONNXParser.Shape_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#dim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_list(SONNXParser.Dim_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#dim_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_repeats(SONNXParser.Dim_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#dim_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_def(SONNXParser.Dim_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#tensor_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTensor_def(SONNXParser.Tensor_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#data_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_def(SONNXParser.Data_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#dims_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims_def(SONNXParser.Dims_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#dims_repeats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims_repeats(SONNXParser.Dims_repeatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#raw_data_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_data_def(SONNXParser.Raw_data_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#opset_import_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpset_import_def(SONNXParser.Opset_import_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SONNXParser#version_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion_def(SONNXParser.Version_defContext ctx);
}