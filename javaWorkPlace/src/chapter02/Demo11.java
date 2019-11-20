package chapter02;

public class Demo11 {

	public static void main(String[] args) {
//		//1-加法练习
//		int a = 1, b = 2;
//		System.out.println(a+b);
		
		//加法使用
		//1、 字符与字符
		char c1 = 'a', c2 = 'b';
//		char e1 = '1', e2 = '2';
		String s1 = "diplay ";
		System.out.println(c1+c2);
		System.out.println(s1+c1+c2);
		
		//2、字符与整数
		char c3 = 'a';
		int n1 = 1;
		System.out.println(c3+n1); 
		System.out.println(s1+n1+c3);
		
		//3、整数与整数、字符串
		int n2 = 2;
		System.out.println(s1+n1+n2);
		
		//4、字符串
		String s2 = "char";
		System.out.println(s1+s2+n1+n2);
		
		//5、括号改变优先级
		System.out.println("a="+(n1+n2));
		
		int b = 0B11111000;
		System.out.println(Integer.toBinaryString(b>>>1));
		
		
		
		
	}

}
