package chapter02;

public class CompareOperaExample {
    public static void main(String[] args) {
	int a = 5;
	int b = 3;
	System.out.println(a + ">" + b + "���Ϊ" + (a > b));
	System.out.println(a + ">=" + b + "���Ϊ" + (a >= b));
	System.out.println(a + "<" + b + "���Ϊ" + (a < b));
	System.out.println(a + "<=" + b + "���Ϊ" + (a <= b));
	System.out.println(a + "==" + b + "���Ϊ" + (a == b));
	System.out.println(a + "!=" + b + "���Ϊ" + (a != b));
	//'a'��ASCIIֵΪ97�������ȣ����Ϊtrue
//	System.out.println("'a'==97���Ϊ"+('a'==97));
//	System.out.println("5==5.0�Ľ��Ϊ"+(5==5.0));
	
	boolean a1 = true, b1 = true;
	System.out.println("a1==b1�Ľ��Ϊ"+(a1==b1));
    }
}

