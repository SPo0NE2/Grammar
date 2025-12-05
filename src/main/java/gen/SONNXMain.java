package gen;

import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.*;

/**
 * S-ONNX 主程序 - GUI 版本
 * 完整实现词法分析、语法分析和 AST 构建
 */
public class SONNXMain {
    private File selectedFile;

    public SONNXMain() {
        selectFile();
        if (selectedFile != null) {
            performAnalysis();
        }
    }

    private void selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        File initialDirectory = new File(System.getProperty("user.dir"));
        fileChooser.setCurrentDirectory(initialDirectory);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("S-ONNX Files", "sonnx");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
        } else {
            System.out.println("未选择文件。");
            selectedFile = null;
        }
    }

    private void performAnalysis() {
        StringBuilder output = new StringBuilder();
        output.append("=== 开始分析文件: " + selectedFile.getName() + " ===\n\n");

        try {
            // 第一步：词法分析
            output.append("1. 词法分析中...\n");
            performLexicalAnalysis(selectedFile.getAbsolutePath(), output);

            // 第二步：语法分析并构建 AST
            output.append("\n2. 语法分析和 AST 构建中...\n");
            ModelNode ast = performSyntaxAnalysisAndBuildAST(selectedFile.getAbsolutePath(), output);

            // 第三步：输出 AST 结构
            output.append("\n3. AST 结构输出:\n");
            output.append("=".repeat(60) + "\n");
            printAST(ast, 0, output);

            // 第四步：AST 遍历演示
            output.append("\n4. AST 遍历演示:\n");
            output.append("=".repeat(60) + "\n");
            ASTAnalyzer analyzer = new ASTAnalyzer(output);
            ast.accept(analyzer);
            analyzer.printStatistics();

            // 第五步：语义分析
            output.append("\n5. 语义分析中...\n");
            performSemanticAnalysis(ast, output);

            // 第六步：中间代码生成
            output.append("\n6. 中间代码生成中...\n");
            performCodeGeneration(ast, output);

            output.append("\n=== 编译完成 ===\n\n");
        } catch (Exception e) {
            output.append("编译失败: " + e.getMessage() + "\n");
            e.printStackTrace(new PrintWriter(new StringWriter()));
        }

        saveOutputToFile(output.toString());
    }

    private void performLexicalAnalysis(String inputFile, StringBuilder output) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
        SONNXLexer lexer = new SONNXLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        output.append("   词法单元总数: " + (tokens.size() - 1) + "\n"); // 减去 EOF

        // 统计不同类型的 token
        Map<String, Integer> tokenCounts = new HashMap<>();
        for (Token token : tokens.getTokens()) {
            if (token.getType() != Token.EOF) {
                String tokenType = getTokenTypeName(token.getType());
                tokenCounts.put(tokenType, tokenCounts.getOrDefault(tokenType, 0) + 1);
            }
        }

        output.append("   Token 统计:\n");
        tokenCounts.forEach((type, count) ->
                output.append("     " + type + ": " + count + "\n"));
    }

    private ModelNode performSyntaxAnalysisAndBuildAST(String inputFile, StringBuilder output) throws Exception {
        // 创建输入流和词法分析器
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
        SONNXLexer lexer = new SONNXLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 创建语法分析器
        SONNXParser parser = new SONNXParser(tokens);

        // 添加错误处理
        parser.removeErrorListeners();
        parser.addErrorListener(new DetailedErrorListener(output));

        // 解析语法树
        ParseTree tree = parser.model();
        output.append("   语法分析成功!\n");

        // 构建 AST
        EnhancedASTBuilder builder = new EnhancedASTBuilder();
        ModelNode ast = (ModelNode) builder.visit(tree);
        output.append("   AST 构建成功!\n");

        return ast;
    }

    private void printAST(ASTNode node, int depth, StringBuilder output) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        output.append(indent.toString() + node.toString() + "\n");

        if (node instanceof ModelNode) {
            ModelNode model = (ModelNode) node;
            printAST(model.getGraph(), depth + 1, output);
            if (model.getOpsetImport() != null) {
                printAST(model.getOpsetImport(), depth + 1, output);
            }

        } else if (node instanceof GraphNode) {
            GraphNode graph = (GraphNode) node;

            if (!graph.getInputs().isEmpty()) {
                output.append(indent + "  ├─ Inputs (" + graph.getInputs().size() + "):\n");
                for (int i = 0; i < graph.getInputs().size(); i++) {
                    ValueInfoNode input = graph.getInputs().get(i);
                    String prefix = (i == graph.getInputs().size() - 1) ? "  └─ " : "  ├─ ";
                    output.append(indent + "    " + prefix);
                    printAST(input, depth + 3, output);
                }
            }

            if (!graph.getOutputs().isEmpty()) {
                output.append(indent + "  ├─ Outputs (" + graph.getOutputs().size() + "):\n");
                for (int i = 0; i < graph.getOutputs().size(); i++) {
                    ValueInfoNode outputNode = graph.getOutputs().get(i);
                    String prefix = (i == graph.getOutputs().size() - 1) ? "  └─ " : "  ├─ ";
                    output.append(indent + "    " + prefix);
                    printAST(outputNode, depth + 3, output);
                }
            }

            if (!graph.getNodes().isEmpty()) {
                output.append(indent + "  ├─ Nodes (" + graph.getNodes().size() + "):\n");
                for (int i = 0; i < graph.getNodes().size(); i++) {
                    NodeDefNode nodedef = graph.getNodes().get(i);
                    String prefix = (i == graph.getNodes().size() - 1) ? "  └─ " : "  ├─ ";
                    output.append(indent + "    " + prefix);
                    printAST(nodedef, depth + 3, output);
                }
            }

            if (!graph.getInitializers().isEmpty()) {
                output.append(indent + "  └─ Initializers (" + graph.getInitializers().size() + "):\n");
                for (int i = 0; i < graph.getInitializers().size(); i++) {
                    TensorNode tensor = graph.getInitializers().get(i);
                    String prefix = (i == graph.getInitializers().size() - 1) ? "  └─ " : "  ├─ ";
                    output.append(indent + "    " + prefix);
                    printAST(tensor, depth + 3, output);
                }
            }

        } else if (node instanceof NodeDefNode) {
            NodeDefNode nodedef = (NodeDefNode) node;
            if (!nodedef.getAttributes().isEmpty()) {
                output.append(indent + "  └─ Attributes (" + nodedef.getAttributes().size() + "):\n");
                for (int i = 0; i < nodedef.getAttributes().size(); i++) {
                    AttributeNode attr = nodedef.getAttributes().get(i);
                    String prefix = (i == nodedef.getAttributes().size() - 1) ? "  └─ " : "  ├─ ";
                    output.append(indent + "    " + prefix);
                    printAST(attr, depth + 3, output);
                }
            }
        }
    }

    private String getTokenTypeName(int tokenType) {
        switch (tokenType) {
            case SONNXLexer.MODELPROTO:
            case SONNXLexer.GRAPH:
            case SONNXLexer.NAME:
            case SONNXLexer.NODE:
            case SONNXLexer.INPUT:
            case SONNXLexer.OUTPUT:
            case SONNXLexer.OP_TYPE:
            case SONNXLexer.ATTRIBUTE:
            case SONNXLexer.INITIALIZER:
                return "KEYWORD";
            case SONNXLexer.INTEGER:
                return "INTEGER";
            case SONNXLexer.STRING:
                return "STRING";
            case SONNXLexer.BYTES:
                return "BYTES";
            case SONNXLexer.LBRACE:
            case SONNXLexer.RBRACE:
            case SONNXLexer.LBRACK:
            case SONNXLexer.RBRACK:
            case SONNXLexer.COMMA:
            case SONNXLexer.EQUAL:
                return "SYMBOL";
            default:
                return "OTHER";
        }
    }

    private void saveOutputToFile(String output) {
        try {
            String outputFileName = selectedFile.getName().replace(".sonnx", "_analysis.txt");
            File outputFile = new File(outputFileName);
            FileWriter writer = new FileWriter(outputFile);
            writer.write(output);
            writer.close();
            System.out.println("分析结果已保存到: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("保存分析结果到文件时出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void performSemanticAnalysis(ModelNode ast, StringBuilder output) {
        try {
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(selectedFile.getAbsolutePath());
            ast.accept(semanticAnalyzer);
            output.append("   语义分析成功！\n");
        } catch (SemanticException e) {
            output.append("   " + e.getMessage() + "\n");
        }
    }

    private void performCodeGeneration(ModelNode ast, StringBuilder output) {
        CodeGenerator codeGenerator = new CodeGenerator();
        ast.accept(codeGenerator);
        List<String> tacCode = codeGenerator.getTACCode();
        output.append("   中间代码生成成功！\n");
        output.append("   中间代码如下:\n");
        for (String code : tacCode) {
            output.append("     " + code + "\n");
        }
    }

    /**
     * 详细的错误监听器 - 命令行版本
     */
    static class DetailedErrorListener extends BaseErrorListener {
        private StringBuilder output;

        public DetailedErrorListener(StringBuilder output) {
            this.output = output;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg, RecognitionException e) {
            String errorMsg = String.format(
                    "警告！******语法错误 [第%d行第%d列]: %s\n",
                    line, charPositionInLine, msg);

            output.append(errorMsg);

            if (offendingSymbol instanceof Token) {
                Token token = (Token) offendingSymbol;
                output.append("警告！******错误标记: '" + token.getText() + "'\n");
            }
        }
    }

    /**
     * AST 分析器 - 使用访问者模式遍历 AST (命令行版本)
     */
    static class ASTAnalyzer implements ASTVisitor {
        private int nodeCount = 0;
        private int inputCount = 0;
        private int outputCount = 0;
        private int tensorCount = 0;
        private int attributeCount = 0;
        private Set<String> opTypes = new HashSet<>();
        private StringBuilder output;

        public ASTAnalyzer(StringBuilder output) {
            this.output = output;
        }

        @Override
        public void visit(ModelNode node) {
            output.append("分析模型: " + node.getProducerName() + " v" + node.getProducerVersion() + "\n");
            output.append("IR 版本: " + node.getIrVersion() + "\n");
            output.append("域: " + node.getDomain() + "\n");
            if (node.getGraph() != null) {
                node.getGraph().accept(this);
            }
            if (node.getOpsetImport() != null) {
                node.getOpsetImport().accept(this);
            }
        }

        @Override
        public void visit(GraphNode node) {
            output.append("分析计算图: " + node.getName() + "\n");

            output.append("  输入信息:\n");
            for (ValueInfoNode input : node.getInputs()) {
                inputCount++;
                input.accept(this);
                output.append("    输入名称: " + input.getName() + ", 类型: " + input.getType().getElemType() + "\n");
            }

            output.append("  输出信息:\n");
            for (ValueInfoNode outputNode : node.getOutputs()) {
                outputCount++;
                outputNode.accept(this);
                output.append("    输出名称: " + outputNode.getName() + ", 类型: " + outputNode.getType().getElemType() + "\n");
            }

            output.append("  节点信息:\n");
            for (NodeDefNode nodedef : node.getNodes()) {
                nodeCount++;
                nodedef.accept(this);
                output.append("    节点名称: " + nodedef.getName() + ", 操作类型: " + nodedef.getOpType() + "\n");
            }

            output.append("  初始化器信息:\n");
            for (TensorNode tensor : node.getInitializers()) {
                tensorCount++;
                tensor.accept(this);
                output.append("    张量名称: " + tensor.getName() + ", 数据类型: " + tensor.getDataType() + "\n");
            }
        }

        @Override
        public void visit(NodeDefNode node) {
            opTypes.add(node.getOpType());
            output.append("    节点 " + node.getName() + " 属性信息:\n");
            for (AttributeNode attr : node.getAttributes()) {
                attributeCount++;
                attr.accept(this);
                output.append("      属性名称: " + attr.getName() + ", 属性值: " + attr.getValue() + "\n");
            }
        }

        @Override
        public void visit(ValueInfoNode node) {
            output.append("    值信息: 名称=" + node.getName() + ", 类型=" + node.getType().getElemType() + "\n");
        }

        @Override
        public void visit(TensorNode node) {
            output.append("    张量信息: 名称=" + node.getName() + ", 数据类型=" + node.getDataType() + ", 维度=" + node.getDims() + "\n");
        }

        @Override
        public void visit(AttributeNode node) {
            output.append("    属性信息: 名称=" + node.getName() + ", 值=" + node.getValue() + "\n");
        }

        @Override
        public void visit(OpsetImportNode node) {
            output.append("分析算子集导入节点: 域=" + node.getDomain() + ", 版本=" + node.getVersion() + "\n");
        }

        @Override
        public void visit(TypeNode node) {
            output.append("    类型信息: 元素类型=" + node.getElemType() + ", 形状=" + node.getShape().getDimensions() + "\n");
        }

        @Override
        public void visit(ShapeNode node) {
            output.append("    形状信息: 维度=" + node.getDimensions() + "\n");
        }

        @Override
        public void visit(DimensionNode node) {
            if (node.isParametric()) {
                output.append("    维度信息: 值=" + node.getDimValue() + "\n");
            } else {
                output.append("    维度信息: 参数=" + node.getDimParam() + "\n");
            }
        }

        public void printStatistics() {
            output.append("AST 统计信息:\n");
            output.append("  计算节点数: " + nodeCount + "\n");
            output.append("  输入数: " + inputCount + "\n");
            output.append("  输出数: " + outputCount + "\n");
            output.append("  初始化器数: " + tensorCount + "\n");
            output.append("  属性数: " + attributeCount + "\n");
            output.append("  操作类型数: " + opTypes.size() + "\n");
            if (!opTypes.isEmpty()) {
                output.append("  操作类型: " + String.join(", ", opTypes) + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new SONNXMain();
    }
}
class EnhancedASTBuilder extends SONNXParserBaseVisitor<ASTNode> {

    // 访问模型节点
    @Override
    public ModelNode visitModel(SONNXParser.ModelContext ctx) {
        SONNXParser.Model_body_defContext body = ctx.model_body_def();
        int irVersion = Integer.parseInt(body.ir_version_def().INTEGER().getText());
        String producerName = extractString(body.producer_name_def().STRING().getText());
        String producerVersion = extractString(body.producer_version_def().STRING().getText());
        String domain = extractString(body.domain_def().STRING().getText());
        int modelVersion = Integer.parseInt(body.model_version_def().INTEGER().getText());
        String docString = extractString(body.doc_string_def().STRING().getText());

        GraphNode graph = (GraphNode) visit(body.graph_def());
        OpsetImportNode opset = (OpsetImportNode) visit(body.opset_import_def());

        return new ModelNode(irVersion, producerName, producerVersion, domain,
                modelVersion, docString, graph, opset);
    }

    // 访问图节点
    @Override
    public GraphNode visitGraph_def(SONNXParser.Graph_defContext ctx) {
        SONNXParser.Graph_body_defContext body = ctx.graph_body_def();
        String name = extractString(body.name_def().STRING().getText());
        GraphNode graph = new GraphNode(name);

        // 处理输入列表
        SONNXParser.Input_listContext inputList = body.input_list();
        while (inputList != null) {
            ValueInfoNode input = (ValueInfoNode) visit(inputList.value_info_def());
            graph.addInput(input);
            inputList = inputList.input_repeats() != null ?
                    inputList.input_repeats().input_list() : null;
        }

        // 处理输出列表
        SONNXParser.Output_listContext outputList = body.output_list();
        while (outputList != null) {
            ValueInfoNode output = (ValueInfoNode) visit(outputList.value_info_def());
            graph.addOutput(output);
            outputList = outputList.output_repeats() != null ?
                    outputList.output_repeats().output_list() : null;
        }

        // 处理节点列表
        SONNXParser.Node_listContext nodeList = body.node_list();
        while (nodeList != null) {
            NodeDefNode node = (NodeDefNode) visit(nodeList.node_def());
            graph.addNode(node);
            nodeList = nodeList.node_repeats() != null ?
                    nodeList.node_repeats().node_list() : null;
        }

        // 处理初始化器列表（可选）
        SONNXParser.Initializer_listContext initList = body.initializer_list();
        while (initList != null) {
            TensorNode tensor = (TensorNode) visit(initList.tensor_def());
            graph.addInitializer(tensor);
            initList = initList.initializer_repeats() != null ?
                    initList.initializer_repeats().initializer_list() : null;
        }

        return graph;
    }

    // 访问节点定义节点
    @Override
    public NodeDefNode visitNode_def(SONNXParser.Node_defContext ctx) {
        String opType = extractString(ctx.op_type_def().STRING().getText());
        String name = extractString(ctx.name_def().STRING().getText());
        NodeDefNode node = new NodeDefNode(opType, name);

        // 处理输入（可能是列表或数组）
        if (ctx.input_list() != null) {
            SONNXParser.Input_listContext inputList = ctx.input_list();
            while (inputList != null) {
                ValueInfoNode input = (ValueInfoNode) visit(inputList.value_info_def());
                node.addInput(input);
                inputList = inputList.input_repeats() != null ?
                        inputList.input_repeats().input_list() : null;
            }
        } else if (ctx.input_arr() != null) {
            for (String inputName : extractStringArray(ctx.input_arr())) {
                node.addInput(new ValueInfoNode(inputName));
            }
        }

        // 处理输出（可能是列表或数组）
        if (ctx.output_list() != null) {
            SONNXParser.Output_listContext outputList = ctx.output_list();
            while (outputList != null) {
                ValueInfoNode output = (ValueInfoNode) visit(outputList.value_info_def());
                node.addOutput(output);
                outputList = outputList.output_repeats() != null ?
                        outputList.output_repeats().output_list() : null;
            }
        } else if (ctx.output_arr() != null) {
            for (String outputName : extractStringArray(ctx.output_arr())) {
                node.addOutput(new ValueInfoNode(outputName));
            }
        }

        // 处理属性列表（可选）
        if (ctx.attribute_list() != null) {
            SONNXParser.Attribute_listContext attrList = ctx.attribute_list();
            while (attrList != null) {
                AttributeNode attr = (AttributeNode) visit(attrList.attribute_def());
                node.addAttribute(attr);
                attrList = attrList.attribute_repeats() != null ?
                        attrList.attribute_repeats().attribute_list() : null;
            }
        }

        return node;
    }

    // 访问值信息节点
    @Override
    public ValueInfoNode visitValue_info_def(SONNXParser.Value_info_defContext ctx) {
        String name = extractString(ctx.name_def().STRING().getText());
        TypeNode type = (TypeNode) visit(ctx.type_def());
        return new ValueInfoNode(name, type);
    }

    // 访问类型定义节点
    @Override
    public TypeNode visitType_def(SONNXParser.Type_defContext ctx) {
        return (TypeNode) visit(ctx.tensor_type_def());
    }

    // 访问张量类型定义节点
    @Override
    public TypeNode visitTensor_type_def(SONNXParser.Tensor_type_defContext ctx) {
        String elemType = ctx.elem_type_def().getText().toLowerCase();
        ShapeNode shape = (ShapeNode) visit(ctx.shape_def());
        return new TypeNode(elemType, shape);
    }

    // 访问形状定义节点
    @Override
    public ShapeNode visitShape_def(SONNXParser.Shape_defContext ctx) {
        ShapeNode shape = new ShapeNode();
        SONNXParser.Dim_listContext dimList = ctx.dim_list();
        while (dimList != null) {
            DimensionNode dim = (DimensionNode) visit(dimList.dim_def());
            shape.addDimension(dim);
            dimList = dimList.dim_repeats() != null ?
                    dimList.dim_repeats().dim_list() : null;
        }
        return shape;
    }

    // 访问维度定义节点
    @Override
    public DimensionNode visitDim_def(SONNXParser.Dim_defContext ctx) {
        if (ctx.DIM_VALUE() != null) {
            int value = Integer.parseInt(ctx.INTEGER().getText());
            return new DimensionNode(value);
        } else {
            String param = extractString(ctx.STRING().getText());
            return new DimensionNode(param);
        }
    }

    // 访问张量定义节点
    @Override
    public TensorNode visitTensor_def(SONNXParser.Tensor_defContext ctx) {
        String name = extractString(ctx.name_def().STRING().getText());
        String dataType = ctx.data_type_def().getText().toLowerCase();
        String rawData = extractString(ctx.raw_data_def().BYTES().getText());
        TensorNode tensor = new TensorNode(name, dataType, rawData);

        // 正确获取维度列表：需要手动遍历递归结构
        List<Integer> dimensions = new ArrayList<>();
        SONNXParser.Dims_repeatsContext dimsCtx = ctx.dims_def().dims_repeats();

        // 递归收集所有维度值
        while (dimsCtx != null) {
            TerminalNode intNode = dimsCtx.INTEGER();
            if (intNode != null) {
                dimensions.add(Integer.parseInt(intNode.getText()));
            }
            dimsCtx = dimsCtx.dims_repeats(); // 移动到下一个递归节点
        }

        // 将维度添加到 tensor
        for (Integer dim : dimensions) {
            tensor.addDimension(dim);
        }

        return tensor;
    }

    // 访问属性定义节点
    @Override
    public AttributeNode visitAttribute_def(SONNXParser.Attribute_defContext ctx) {
        String name = extractString(ctx.name_def().STRING().getText());
        String value = extractString(ctx.value_def().STRING().getText());
        return new AttributeNode(name, value);
    }

    // 访问算子集导入定义节点
    @Override
    public OpsetImportNode visitOpset_import_def(SONNXParser.Opset_import_defContext ctx) {
        String domain = extractString(ctx.domain_def().STRING().getText());
        int version = Integer.parseInt(ctx.version_def().INTEGER().getText());
        return new OpsetImportNode(domain, version);
    }

    // 辅助方法：处理字符串数组（如输入/输出数组）
    private List<String> extractStringArray(SONNXParser.Input_arrContext ctx) {
        List<String> names = new ArrayList<>();
        names.add(extractString(ctx.STRING().getText()));

        SONNXParser.Id_repeatsContext repeats = ctx.id_repeats();
        while (repeats != null && repeats.STRING() != null) {
            names.add(extractString(repeats.STRING().getText()));
            repeats = repeats.id_repeats();
        }
        return names;
    }

    // 辅助方法：处理字符串数组（输出）
    private List<String> extractStringArray(SONNXParser.Output_arrContext ctx) {
        List<String> names = new ArrayList<>();
        names.add(extractString(ctx.STRING().getText()));

        SONNXParser.Id_repeatsContext repeats = ctx.id_repeats();
        while (repeats != null && repeats.STRING() != null) {
            names.add(extractString(repeats.STRING().getText()));
            repeats = repeats.id_repeats();
        }
        return names;
    }

    /**
     * 提取字符串内容（去除引号）
     */
    private String extractString(String quotedString) {
        return quotedString.substring(1, quotedString.length() - 1);
    }
}