package gen;
import org.antlr.v4.runtime.Token;
import java.util.*;
/**
 * S-ONNX 抽象语法树结构定义
 * 设计原则：简洁易懂、层次清晰、易于遍历
 */
// 基础AST节点接口
interface ASTNode {
    void accept(ASTVisitor visitor);
    String toString();
}
// 访问者模式接口
interface ASTVisitor {
    void visit(ModelNode node);
    void visit(GraphNode node);
    void visit(NodeDefNode node);
    void visit(ValueInfoNode node);
    void visit(TensorNode node);
    void visit(AttributeNode node);
    void visit(OpsetImportNode node);
    void visit(TypeNode node);       // 新增TypeNode访问方法
    void visit(ShapeNode node);     // 新增ShapeNode访问方法
    void visit(DimensionNode node); // 新增DimensionNode访问方法
}
// 1. 模型根节点
class ModelNode implements ASTNode {
    private int irVersion;
    private String producerName;
    private String producerVersion;
    private String domain;
    private int modelVersion;
    private String docString;
    private GraphNode graph;
    private OpsetImportNode opsetImport;
    // 构造函数
    public ModelNode(int irVersion, String producerName, String producerVersion,
                     String domain, int modelVersion, String docString,
                     GraphNode graph, OpsetImportNode opsetImport) {
        this.irVersion = irVersion;
        this.producerName = producerName;
        this.producerVersion = producerVersion;
        this.domain = domain;
        this.modelVersion = modelVersion;
        this.docString = docString;
        this.graph = graph;
        this.opsetImport = opsetImport;
    }
    // Getters
    public int getIrVersion() {
        return irVersion;
    }
    public String getProducerName() {
        return producerName;
    }
    public String getProducerVersion() {
        return producerVersion;
    }
    public String getDomain() {
        return domain;
    }
    public int getModelVersion() {
        return modelVersion;
    }
    public String getDocString() {
        return docString;
    }
    public GraphNode getGraph() {
        return graph;
    }
    public OpsetImportNode getOpsetImport() {
        return opsetImport;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "ModelNode{version=" + irVersion + ", producer=" + producerName + "}";
    }
}
// 2. 计算图节点
class GraphNode implements ASTNode {
    private String name;
    private List<NodeDefNode> nodes;
    private List<ValueInfoNode> inputs;
    private List<ValueInfoNode> outputs;
    private List<TensorNode> initializers;
    public GraphNode(String name) {
        this.name = name;
        this.nodes = new ArrayList<>();
        this.inputs = new ArrayList<>();
        this.outputs = new ArrayList<>();
        this.initializers = new ArrayList<>();
    }
    // 添加节点的方法
    public void addNode(NodeDefNode node) {
        nodes.add(node);
    }
    public void addInput(ValueInfoNode input) {
        inputs.add(input);
    }
    public void addOutput(ValueInfoNode output) {
        outputs.add(output);
    }
    public void addInitializer(TensorNode initializer) {
        initializers.add(initializer);
    }
    // Getters
    public String getName() {
        return name;
    }
    public List<NodeDefNode> getNodes() {
        return nodes;
    }
    public List<ValueInfoNode> getInputs() {
        return inputs;
    }
    public List<ValueInfoNode> getOutputs() {
        return outputs;
    }
    public List<TensorNode> getInitializers() {
        return initializers;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "GraphNode{name='" + name + "', nodes=" + nodes.size() +
                ", inputs=" + inputs.size() + ", outputs=" + outputs.size() + "}";
    }
}
// 3. 节点定义
class NodeDefNode implements ASTNode {
    private String opType;
    private String name;
    private List<ValueInfoNode> inputs;
    private List<ValueInfoNode> outputs;
    private List<AttributeNode> attributes;
    public NodeDefNode(String opType, String name) {
        this.opType = opType;
        this.name = name;
        this.inputs = new ArrayList<>();
        this.outputs = new ArrayList<>();
        this.attributes = new ArrayList<>();
    }
    // 添加方法
    public void addInput(ValueInfoNode input) {
        inputs.add(input);
    }
    public void addOutput(ValueInfoNode output) {
        outputs.add(output);
    }
    public void addAttribute(AttributeNode attribute) {
        attributes.add(attribute);
    }
    // Getters
    public String getOpType() {
        return opType;
    }
    public String getName() {
        return name;
    }
    public List<ValueInfoNode> getInputs() {
        return inputs;
    }
    public List<ValueInfoNode> getOutputs() {
        return outputs;
    }
    public List<AttributeNode> getAttributes() {
        return attributes;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "NodeDefNode{opType='" + opType + "', name='" + name + "'}";
    }
}
// 4. 值信息节点（用于输入输出定义）
class ValueInfoNode implements ASTNode {
    private String name;
    private TypeNode type;
    public ValueInfoNode(String name, TypeNode type) {
        this.name = name;
        this.type = type;
    }

    // 新增单参数构造函数解决参数不匹配问题
    public ValueInfoNode(String name) {
        this.name = name;
        this.type = null;
    }

    // Getters
    public String getName() {
        return name;
    }
    public TypeNode getType() {
        return type;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "ValueInfoNode{name='" + name + "', type=" + type + "}";
    }
}
// 5. 类型节点
class TypeNode implements ASTNode {
    private String elemType;  // int, float, string, bool
    private ShapeNode shape;
    public TypeNode(String elemType, ShapeNode shape) {
        this.elemType = elemType;
        this.shape = shape;
    }
    // Getters
    public String getElemType() {
        return elemType;
    }
    public ShapeNode getShape() {
        return shape;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "TypeNode{elemType='" + elemType + "', shape=" + shape + "}";
    }
}
// 形状节点
class ShapeNode implements ASTNode {
    private List<DimensionNode> dimensions;
    public ShapeNode() {
        this.dimensions = new ArrayList<>();
    }
    public void addDimension(DimensionNode dimension) {
        dimensions.add(dimension);
    }
    public List<DimensionNode> getDimensions() {
        return dimensions;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "ShapeNode{dimensions=" + dimensions + "}";
    }
}
// 6. 维度节点
class DimensionNode implements ASTNode {
    private Integer dimValue;  // 具体值
    private String dimParam;   // 参数名
    public DimensionNode(Integer dimValue) {
        this.dimValue = dimValue;
    }
    public DimensionNode(String dimParam) {
        this.dimParam = dimParam;
    }
    // Getters
    public Integer getDimValue() {
        return dimValue;
    }
    public String getDimParam() {
        return dimParam;
    }
    public boolean isParametric() {
        return dimParam != null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return dimValue != null ? dimValue.toString() : dimParam;
    }
}
// 7. 张量节点（用于初始化器）
class TensorNode implements ASTNode {
    private String name;
    private String dataType;
    private List<Integer> dims;
    private String rawData;
    public TensorNode(String name, String dataType, String rawData) {
        this.name = name;
        this.dataType = dataType;
        this.dims = new ArrayList<>();
        this.rawData = rawData;
    }
    // 添加维度方法
    public void addDimension(Integer dimension) {
        dims.add(dimension);
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getDataType() {
        return dataType;
    }
    public List<Integer> getDims() {
        return dims;
    }
    public String getRawData() {
        return rawData;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "TensorNode{name='" + name + "', dataType='" + dataType + "'}";
    }
}
// 8. 属性节点
class AttributeNode implements ASTNode {
    private String name;
    private String value;
    public AttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getValue() {
        return value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "AttributeNode{name='" + name + "', value='" + value + "'}";
    }
}
// 9. 算子集导入节点
class OpsetImportNode implements ASTNode {
    private String domain;
    private int version;
    public OpsetImportNode(String domain, int version) {
        this.domain = domain;
        this.version = version;
    }
    // Getters
    public String getDomain() {
        return domain;
    }
    public int getVersion() {
        return version;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "OpsetImportNode{domain='" + domain + "', version=" + version + "}";
    }
}
class SemanticAnalyzer implements ASTVisitor {
    private Map<String, NodeDefNode> nodeNames = new HashMap<>();
    private Map<String, TensorNode> tensorNames = new HashMap<>();
    private Set<String> outputNames = new HashSet<>();
    private Map<String, TypeNode> tensorTypes = new HashMap<>();
    private String filePath;
    public SemanticAnalyzer(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public void visit(ModelNode node) {
        if (node.getGraph() != null) {
            node.getGraph().accept(this);
        }
        node.getOpsetImport().accept(this);
    }
    @Override
    public void visit(GraphNode node) {
        for (ValueInfoNode input : node.getInputs()) {
            input.accept(this);
        }
        for (ValueInfoNode output : node.getOutputs()) {
            output.accept(this);
        }
        for (NodeDefNode nodedef : node.getNodes()) {
            nodedef.accept(this);
        }
        for (TensorNode tensor : node.getInitializers()) {
            tensor.accept(this);
        }
    }
    @Override
    public void visit(NodeDefNode node) {
        // 检查节点名称冲突
        if (nodeNames.containsKey(node.getName())) {
            throw new SemanticError(filePath, -1, -1, node.getName(), "节点名称重复: " + node.getName());
        }
        nodeNames.put(node.getName(), node);
        // 检查输入张量是否定义
        for (ValueInfoNode input : node.getInputs()) {
            if (!tensorNames.containsKey(input.getName())) {
                throw new SemanticException("未定义的输入张量: " + input.getName());
            }
        }
        // 检查输出命名冲突
        for (ValueInfoNode output : node.getOutputs()) {
            if (outputNames.contains(output.getName())) {
                throw new SemanticException("输出命名冲突: " + output.getName());
            }
            outputNames.add(output.getName());
        }
        // 检查输入张量类型一致性
        if (node.getInputs().size() > 1) {
            String firstInput = node.getInputs().get(0).getName();
            TypeNode firstType = tensorTypes.get(firstInput);
            for (int i = 1; i < node.getInputs().size(); i++) {
                String input = node.getInputs().get(i).getName();
                TypeNode type = tensorTypes.get(input);
                if (!type.getElemType().equals(firstType.getElemType())) {
                    throw new SemanticException("同一操作符的输入张量类型不一致: " + node.getName());
                }
            }
        }
        for (AttributeNode attr : node.getAttributes()) {
            attr.accept(this);
        }
    }
    @Override
    public void visit(ValueInfoNode node) {
        tensorTypes.put(node.getName(), node.getType());
    }
    @Override
    public void visit(TensorNode node) {
        // 检查张量名称冲突
        if (tensorNames.containsKey(node.getName())) {
            throw new SemanticException("张量名称重复: " + node.getName());
        }
        tensorNames.put(node.getName(), node);
        tensorTypes.put(node.getName(), new TypeNode(node.getDataType(), null));
    }
    @Override
    public void visit(AttributeNode node) {
        // 目前暂不处理属性节点的语义分析
    }
    @Override
    public void visit(OpsetImportNode node) {
        // 目前暂不处理算子集导入节点的语义分析
    }
    @Override
    public void visit(TypeNode node) {
        // 类型节点语义分析
    }
    @Override
    public void visit(ShapeNode node) {
        // 形状节点语义分析
    }
    @Override
    public void visit(DimensionNode node) {
        // 维度节点语义分析
    }
}
// 语义异常类
class SemanticException extends RuntimeException {
    public SemanticException(String message) {
        super(message);
    }
}
// 中间代码生成器
// 中间代码生成器
class CodeGenerator implements ASTVisitor {
    private List<String> tacCode = new ArrayList<>();
    private int tempCounter = 0;

    // 获取临时变量名
    private String getTempVariable() {
        return "T" + (++tempCounter);
    }

    @Override
    public void visit(ModelNode node) {
        if (node.getGraph() != null) {
            node.getGraph().accept(this);
        }
        node.getOpsetImport().accept(this);
    }

    @Override
    public void visit(GraphNode node) {
        // 生成输入的中间代码
        for (ValueInfoNode input : node.getInputs()) {
            String result = getTempVariable();
            String name = input.getName();
            TypeNode type = input.getType();
            String dataType = type.getElemType();
            String shape = type.getShape().getDimensions().toString();
            String inputCode = result + " = Input(\"" + name + "\", " + dataType + ", " + shape + ")";
            tacCode.add(inputCode);
        }

        // 生成节点操作的中间代码
        for (NodeDefNode nodedef : node.getNodes()) {
            nodedef.accept(this);
        }

        // 生成初始化器的中间代码
        for (TensorNode tensor : node.getInitializers()) {
            tensor.accept(this);
        }

        // 生成输出的中间代码
        for (ValueInfoNode output : node.getOutputs()) {
            String name = output.getName();
            // 假设输出张量的来源是最后一个节点的输出
            String operand = getTempVariable();
            String outputCode = "Output(\"" + name + "\", " + operand + ")";
            tacCode.add(outputCode);
        }
    }

    @Override
    public void visit(NodeDefNode node) {
        String result = getTempVariable();
        String operation = node.getOpType();
        StringBuilder operands = new StringBuilder();
        for (ValueInfoNode input : node.getInputs()) {
            if (operands.length() > 0) {
                operands.append(", ");
            }
            operands.append(input.getName());
        }
        StringBuilder attributes = new StringBuilder();
        for (AttributeNode attr : node.getAttributes()) {
            if (attributes.length() > 0) {
                attributes.append(", ");
            }
            attributes.append(attr.getName() + "=" + attr.getValue());
        }
        String code = result + " = " + operation + "(" + operands.toString();
        if (attributes.length() > 0) {
            code += ", " + attributes.toString();
        }
        code += ")";
        tacCode.add(code);
    }

    @Override
    public void visit(ValueInfoNode node) {
        // 在 GraphNode 中处理输入输出，此处不做处理
    }

    @Override
    public void visit(TensorNode node) {
        String result = getTempVariable();
        String name = node.getName();
        String dataType = node.getDataType();
        String shape = node.getDims().toString();
        String rawData = node.getRawData();
        String tensorCode = result + " = Initializer(\"" + name + "\", " + dataType + ", " + shape + ", raw_data=" + rawData + ")";
        tacCode.add(tensorCode);
    }

    @Override
    public void visit(AttributeNode node) {
        // 在 NodeDefNode 中处理属性，此处不做处理
    }

    @Override
    public void visit(OpsetImportNode node) {
        String result = getTempVariable();
        String domain = node.getDomain();
        int version = node.getVersion();
        String importCode = result + " = OpsetImport(\"" + domain + "\", " + version + ")";
        tacCode.add(importCode);
    }

    @Override
    public void visit(TypeNode node) {
        String result = getTempVariable();
        String elemType = node.getElemType();
        String shape = node.getShape().getDimensions().toString();
        String typeCode = result + " = Type(\"" + elemType + "\", " + shape + ")";
        tacCode.add(typeCode);
    }

    @Override
    public void visit(ShapeNode node) {
        String result = getTempVariable();
        String dimensions = node.getDimensions().toString();
        String shapeCode = result + " = Shape(" + dimensions + ")";
        tacCode.add(shapeCode);
    }

    @Override
    public void visit(DimensionNode node) {
        String result = getTempVariable();
        if (node.isParametric()) {
            String param = node.getDimParam();
            String dimCode = result + " = DimensionParam(\"" + param + "\")";
            tacCode.add(dimCode);
        } else {
            int value = node.getDimValue();
            String dimCode = result + " = DimensionValue(" + value + ")";
            tacCode.add(dimCode);
        }
    }

    // 新增 Constant 操作的代码生成方法
    public void generateConstantCode(List<Integer> value, String dataType, List<Integer> shape) {
        String result = getTempVariable();
        String code = result + " = Constant(" + value.toString() + ", " + dataType + ", " + shape.toString() + ")";
        tacCode.add(code);
    }

    // 获取生成的中间代码列表
    public List<String> getTACCode() {
        return tacCode;
    }
}
// 错误基类
class CompilerError extends RuntimeException {
    private String filePath;
    private int line;
    private int column;
    private String codeSnippet;
    public CompilerError(String filePath, int line, int column, String codeSnippet, String message) {
        super(message);
        this.filePath = filePath;
        this.line = line;
        this.column = column;
        this.codeSnippet = codeSnippet;
    }
    @Override
    public String getMessage() {
        return String.format("文件: %s, 行号: %d, 列号: %d, 代码片段: '%s', 错误信息: %s",
                filePath, line, column, codeSnippet, super.getMessage());
    }
}
// 词法错误类
class LexicalError extends CompilerError {
    public LexicalError(String filePath, int line, int column, String codeSnippet, String message) {
        super(filePath, line, column, codeSnippet, "词法错误: " + message);
    }
}
// 语法错误类
class SyntaxError extends CompilerError {
    public SyntaxError(String filePath, int line, int column, String codeSnippet, String message) {
        super(filePath, line, column, codeSnippet, "语法错误: " + message);
    }
}
// 语义错误类
class SemanticError extends CompilerError {
    public SemanticError(String filePath, int line, int column, String codeSnippet, String message) {
        super(filePath, line, column, codeSnippet, "语义错误: " + message);
    }
}