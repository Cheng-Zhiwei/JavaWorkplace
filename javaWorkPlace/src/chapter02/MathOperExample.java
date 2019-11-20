package chapter02;

public class MathOperExample {
    public static void main(String[] args) {
	int a = 5;
	int b = 3;
	System.out.println("a=" + a + ",b=" + b);
	System.out.println("a+b=" + (a + b));
	System.out.println("a连接b=" + a + b);	// 字符串连接
	System.out.println("a-b=" + (a - b)); // 两个数相减，结果为2
	System.out.println("a*b=" + (a * b)); // 两个数相乘，结果为15
	System.out.println("a/b=" + (a / b)); // 两个整数相除，结果为1
	System.out.println("a%b=" + (a % b)); // 两个整数取余，结果为2
	
	System.out.println("5.1/3=" + (5.1 / 3)); // 两个浮点数相除，结果为1.7
	System.out.println("5.2%3.1=" + (5.2 % 3.1)); // 两个浮点数取余，结果为2.1
	System.out.println("3.1/0=" + (3.1 / 0)); // 正浮点数除以0，结果为Infinity
	System.out.println("-8.8/0=" + (-8.8 / 0)); // 负浮点数除以0，结果为-Infinity
	System.out.println("5.1%0=" + (5.1 % 0)); // 正浮点数对0取余，结果为NaN
	System.out.println("6.6%0=" + (6.6 % 0)); // 负浮点数对0取余，结果为NaN
//	System.out.println("3/0=" + (3 / 0)); // 整数除以0,将引发异常
    }
}

