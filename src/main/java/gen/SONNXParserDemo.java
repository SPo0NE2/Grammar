package gen;

import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * S-ONNX语法分析器演示程序
 * 功能：解析S-ONNX文件，构建抽象语法树，格式化输出
 */
public class SONNXParserDemo {

    // 定义固定的文件路径
    private static final String INPUT_FILE_PATH = "as.sonnx";

    public static void main(String[] args) throws Exception {

        // 使用固定的文件路径
        String inputFile = INPUT_FILE_PATH;

        // 创建输入流
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));

        // 创建词法分析器
        SONNXLexer lexer = new SONNXLexer(input);

        // 创建token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 输出Token信息
        System.out.println("=== Token 信息 ===");
        tokens.fill();
        for (Token token : tokens.getTokens()) {
            System.out.println("Token 类型: " + lexer.getVocabulary().getSymbolicName(token.getType()) +
                    ", 文本: " + token.getText() +
                    ", 行: " + token.getLine() +
                    ", 列: " + token.getCharPositionInLine());
        }

        // 创建语法分析器
        SONNXParser parser = new SONNXParser(tokens);

        // 添加语法错误监听器
        parser.removeErrorListeners();
        parser.addErrorListener(new SyntaxErrorListener(inputFile));

        System.out.println("\n=== S-ONNX 语法分析开始 ===");

        try {
            // 从起始规则开始解析
            ParseTree tree = parser.model();

            System.out.println("语法分析成功！");
            System.out.println("\n=== 解析树结构 ===");

            // 输出格式化的解析树
            printFormattedTree(tree, parser, 0);

            System.out.println("\n=== 抽象语法树 ===");

            // 构建抽象语法树
            ModelNode ast = buildAST(tree, parser);

            // 输出格式化的AST
            printFormattedAST(ast, 0);

        } catch (SyntaxError e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("语法分析失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 输出格式化的解析树（使用缩进表示层次关系）
     */
    private static void printFormattedTree(ParseTree tree, Parser parser, int depth) {
        // 输出缩进
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        // 输出节点信息
        if (tree instanceof TerminalNode) {
            // 终结符节点
            System.out.println("'" + tree.getText() + "'");
        } else {
            // 非终结符节点
            String ruleName = parser.getRuleNames()[((RuleContext) tree).getRuleIndex()];
            System.out.println(ruleName);

            // 递归输出子节点
            for (int i = 0; i < tree.getChildCount(); i++) {
                printFormattedTree(tree.getChild(i), parser, depth + 1);
            }
        }
    }

    /**
     * 构建抽象语法树
     */
    private static ModelNode buildAST(ParseTree tree, Parser parser) {
        ASTBuilder builder = new ASTBuilder();
        return (ModelNode) builder.visit(tree);
    }

    /**
     * 输出格式化的抽象语法树
     */
    private static void printFormattedAST(ASTNode node, int depth) {
        // 输出缩进
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        System.out.println(node.toString());

        // 根据节点类型递归输出子节点
        if (node instanceof ModelNode) {
            ModelNode model = (ModelNode) node;
            printFormattedAST(model.getGraph(), depth + 1);

        } else if (node instanceof GraphNode) {
            GraphNode graph = (GraphNode) node;

            if (!graph.getInputs().isEmpty()) {
                printIndent(depth + 1);
                System.out.println("Inputs:");
                for (ValueInfoNode input : graph.getInputs()) {
                    printFormattedAST(input, depth + 2);
                }
            }

            if (!graph.getOutputs().isEmpty()) {
                printIndent(depth + 1);
                System.out.println("Outputs:");
                for (ValueInfoNode output : graph.getOutputs()) {
                    printFormattedAST(output, depth + 2);
                }
            }

            if (!graph.getNodes().isEmpty()) {
                printIndent(depth + 1);
                System.out.println("Nodes:");
                for (NodeDefNode nodedef : graph.getNodes()) {
                    printFormattedAST(nodedef, depth + 2);
                }
            }

            if (!graph.getInitializers().isEmpty()) {
                printIndent(depth + 1);
                System.out.println("Initializers:");
                for (TensorNode tensor : graph.getInitializers()) {
                    printFormattedAST(tensor, depth + 2);
                }
            }

        } else if (node instanceof NodeDefNode) {
            NodeDefNode nodedef = (NodeDefNode) node;
            if (!nodedef.getAttributes().isEmpty()) {
                printIndent(depth + 1);
                System.out.println("Attributes:");
                for (AttributeNode attr : nodedef.getAttributes()) {
                    printFormattedAST(attr, depth + 2);
                }
            }
        }
    }

    private static void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }
}

/**
 * AST构建器
 * 将解析树转换为抽象语法树
 */
class ASTBuilder extends SONNXParserBaseVisitor<ASTNode> {

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

    @Override
    public ValueInfoNode visitValue_info_def(SONNXParser.Value_info_defContext ctx) {
        String name = extractString(ctx.name_def().STRING().getText());
        TypeNode type = (TypeNode) visit(ctx.type_def());
        return new ValueInfoNode(name, type);
    }

    @Override
    public TypeNode visitType_def(SONNXParser.Type_defContext ctx) {
        return (TypeNode) visit(ctx.tensor_type_def());
    }

    @Override
    public TypeNode visitTensor_type_def(SONNXParser.Tensor_type_defContext ctx) {
        String elemType = ctx.elem_type_def().getText().toLowerCase();
        ShapeNode shape = (ShapeNode) visit(ctx.shape_def());
        return new TypeNode(elemType, shape);
    }

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

    @Override
    public AttributeNode visitAttribute_def(SONNXParser.Attribute_defContext ctx) {
        String name = extractString(ctx.name_def().STRING().getText());
        String value = extractString(ctx.value_def().STRING().getText());
        return new AttributeNode(name, value);
    }

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

/**
 * 自定义错误监听器
 */
class CustomErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        System.err.println("语法错误 第" + line + "行第" + charPositionInLine + "列: " + msg);
    }
}

class SyntaxErrorListener extends BaseErrorListener {
    private String filePath;

    public SyntaxErrorListener(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String codeSnippet = offendingSymbol != null ? offendingSymbol.toString() : "";
        throw new SyntaxError(filePath, line, charPositionInLine, codeSnippet, msg);
    }
}