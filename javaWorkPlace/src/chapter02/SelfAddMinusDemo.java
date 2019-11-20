package chapter02;

public class SelfAddMinusDemo {

	public static void main(String[] args) {
//		int a = 2;
//		int b = a++; //先进行表达式运算，再进行自增或者自减运算
//		a  = 2;
//		int c = ++a; //先进行自增或者自减运算，再进行表达式运算
//		System.out.println("a="+a+"\nb="+b+"\nc="+c);
//		
//		int a1 = 2;
//		int b1 = a1--; //先进行表达式运算，再进行自增或者自减运算
//		a1  = 2;
//		int c1 = --a1; //先进行自增或者自减运算，再进行表达式运算
//		System.out.println("a1="+a1+"\nb1="+b1+"\nc1="+c1);
		int i = 0;   
		int j = i++ + ++i;   
		int k = --i + i--;
		System.out.println(i+" \n"+j+"\n"+k);
//		int x = 5, y = 6, z;
//		z = ++x + x++;
//	
//		System.out.println(z+"\n"+x);
		
		
//		int a=1;
//		System.out.println(a+++a++);
//		//1+2  
//		int b = 1;
//		System.out.println((b++)+(++b));
//		//1+3
		
//		int x = 5, y = 6, z;
//		z = ++x + x++;
//		System.out.println(z+"\n"+x);
	}

}
