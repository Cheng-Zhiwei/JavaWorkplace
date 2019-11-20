package chapter02;

public class CompareOperaExample {
    public static void main(String[] args) {
	int a = 5;
	int b = 3;
	System.out.println(a + ">" + b + "结果为" + (a > b));
	System.out.println(a + ">=" + b + "结果为" + (a >= b));
	System.out.println(a + "<" + b + "结果为" + (a < b));
	System.out.println(a + "<=" + b + "结果为" + (a <= b));
	System.out.println(a + "==" + b + "结果为" + (a == b));
	System.out.println(a + "!=" + b + "结果为" + (a != b));
	//'a'的ASCII值为97，因此相等，结果为true
//	System.out.println("'a'==97结果为"+('a'==97));
//	System.out.println("5==5.0的结果为"+(5==5.0));
	
	boolean a1 = true, b1 = true;
	System.out.println("a1==b1的结果为"+(a1==b1));
    }
}

