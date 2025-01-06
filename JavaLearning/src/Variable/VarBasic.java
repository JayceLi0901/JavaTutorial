package Variable;

// 基本数据类型, 方括号中代表字节数
// byte[1], short[2], int[4], long[8], float[4], double[8], char[2], boolean[1]
// 浮点数是由 符号位+指数位+尾数位构成的
// long在数值后面加l或者L，float则是加f或者F，如果小数不明确f或者F的话，则默认为double，通常使用double
// 可以转换的数据类型
// byte -> short -> int -> long -> float -> double
// char -> int -> long -> float -> double
// 三元运算的格式：判断条件？正确结果：错误结果

public class VarBasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max_1 = a > b ? a : b;
        int max_2 =max_1 > c ? max_1 : c;
        System.out.println(max_2);
    }
}
