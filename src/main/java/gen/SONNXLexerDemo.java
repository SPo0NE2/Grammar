package gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SONNXLexerDemo {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("用法: java gen.SONNXLexerDemo <输入文件>");
            System.exit(1);
        }

        String inputFile = args[0];
        File file = new File(inputFile);
        if (!file.exists() || !file.canRead()) {
            System.err.println("输入文件不存在或不可读: " + inputFile);
            System.exit(1);
        }

        try {
            // 读取输入文件
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));

            // 创建词法分析器
            SONNXLexer lexer = new SONNXLexer(input);

            // 添加词法错误监听器
            lexer.removeErrorListeners();
            lexer.addErrorListener(new LexicalErrorListener(inputFile));

            // 获取所有token
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            try {
                tokens.fill();
            } catch (LexicalError e) {
                System.err.println(e.getMessage());
                System.exit(1);
            }

            System.out.println("=== S-ONNX 词法分析结果 ===");
            System.out.printf("%-15s %-20s %-10s %s%n", "Token类型", "Token名称", "位置", "词值");
            System.out.println("-".repeat(80));

            // 遍历并输出每个token
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF) {
                    String tokenType = getTokenTypeName(token.getType());
                    String tokenName = lexer.getVocabulary().getSymbolicName(token.getType());
                    String position = "(" + token.getLine() + "," + token.getCharPositionInLine() + ")";
                    String value = token.getText();

                    System.out.printf("%-15s %-20s %-10s %s%n",
                            tokenType, tokenName, position, value);
                }
            }

            System.out.println("-".repeat(80));
            System.out.println("词法分析完成！");
        } catch (FileNotFoundException e) {
            System.err.println("文件未找到: " + inputFile);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("读取文件时发生错误: " + e.getMessage());
            System.exit(1);
        }
    }

    public static class TokenInfo {
        private String type;
        private String value;
        private int line;
        private int column;

        public TokenInfo(String type, String value, int line, int column) {
            this.type = type;
            this.value = value;
            this.line = line;
            this.column = column;
        }

        public String getType() { return type; }
        public String getValue() { return value; }
        public int getLine() { return line; }
        public int getColumn() { return column; }

        @Override
        public String toString() {
            return String.format("TokenInfo{type='%s', value='%s', pos=(%d,%d)}",
                    type, value, line, column);
        }
    }

    public static TokenInfo getToken(SONNXLexer lexer) {
        Token token = lexer.nextToken();
        if (token.getType() == Token.EOF) {
            return null;
        }

        String tokenType = getTokenTypeName(token.getType());
        String value = token.getText();
        int line = token.getLine();
        int column = token.getCharPositionInLine();

        return new TokenInfo(tokenType, value, line, column);
    }

    private static String getTokenTypeName(int tokenType) {
        switch(tokenType) {
            // 模型结构关键字
            case SONNXLexer.MODELPROTO: return "KEYWORD";
            case SONNXLexer.GRAPH: return "KEYWORD";
            case SONNXLexer.NAME: return "KEYWORD";
            case SONNXLexer.NODE: return "KEYWORD";
            case SONNXLexer.INPUT: return "KEYWORD";
            case SONNXLexer.OUTPUT: return "KEYWORD";
            case SONNXLexer.OP_TYPE: return "KEYWORD";
            case SONNXLexer.ATTRIBUTE: return "KEYWORD";
            case SONNXLexer.INITIALIZER: return "KEYWORD";
            case SONNXLexer.DOC_STRING: return "KEYWORD";
            case SONNXLexer.DOMAIN: return "KEYWORD";
            case SONNXLexer.MODEL_VERSION: return "KEYWORD";
            case SONNXLexer.PRODUCER_NAME: return "KEYWORD";
            case SONNXLexer.PRODUCER_VERSION: return "KEYWORD";
            case SONNXLexer.IR_VERSION: return "KEYWORD";
            case SONNXLexer.OPSET_IMPORT: return "KEYWORD";

            // 类型相关关键字
            case SONNXLexer.TYPE: return "KEYWORD";
            case SONNXLexer.TENSOR_TYPE: return "KEYWORD";
            case SONNXLexer.ELEM_TYPE: return "KEYWORD";
            case SONNXLexer.SHAPE: return "KEYWORD";
            case SONNXLexer.DIM: return "KEYWORD";
            case SONNXLexer.DIMS: return "KEYWORD";
            case SONNXLexer.RAW_DATA: return "KEYWORD";
            case SONNXLexer.DIM_VALUE: return "KEYWORD";
            case SONNXLexer.DATA_TYPE: return "KEYWORD";
            case SONNXLexer.VERSION: return "KEYWORD";
            case SONNXLexer.VALUE: return "KEYWORD";

            // 数据类型关键字
            case SONNXLexer.INT: return "TYPE";
            case SONNXLexer.FLOAT: return "TYPE";
            case SONNXLexer.STRING_T: return "TYPE";
            case SONNXLexer.BOOL: return "TYPE";

            // 符号
            case SONNXLexer.LBRACE: return "SYMBOL";
            case SONNXLexer.RBRACE: return "SYMBOL";
            case SONNXLexer.LBRACK: return "SYMBOL";
            case SONNXLexer.RBRACK: return "SYMBOL";
            case SONNXLexer.COMMA: return "SYMBOL";
            case SONNXLexer.EQUAL: return "SYMBOL";

            // 字面量
            case SONNXLexer.INTEGER: return "INTEGER";
            case SONNXLexer.STRING: return "STRING";
            case SONNXLexer.BYTES: return "BYTES";

            default: return "OTHER";
        }
    }

    static class LexicalErrorListener extends BaseErrorListener {
        private String filePath;

        public LexicalErrorListener(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            String codeSnippet = offendingSymbol != null ? offendingSymbol.toString() : "";
            throw new LexicalError(filePath, line, charPositionInLine, codeSnippet, msg);
        }
    }

    static class LexicalError extends RuntimeException {
        public LexicalError(String filePath, int line, int charPositionInLine,
                            String codeSnippet, String msg) {
            super(String.format("文件 %s 第 %d 行第 %d 列出现词法错误: %s，错误代码片段: %s",
                    filePath, line, charPositionInLine, msg, codeSnippet));
        }
    }
}