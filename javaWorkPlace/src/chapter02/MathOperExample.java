package chapter02;

public class MathOperExample {
    public static void main(String[] args) {
	int a = 5;
	int b = 3;
	System.out.println("a=" + a + ",b=" + b);
	System.out.println("a+b=" + (a + b));
	System.out.println("a����b=" + a + b);	// �ַ�������
	System.out.println("a-b=" + (a - b)); // ��������������Ϊ2
	System.out.println("a*b=" + (a * b)); // ��������ˣ����Ϊ15
	System.out.println("a/b=" + (a / b)); // ����������������Ϊ1
	System.out.println("a%b=" + (a % b)); // ��������ȡ�࣬���Ϊ2
	
	System.out.println("5.1/3=" + (5.1 / 3)); // ������������������Ϊ1.7
	System.out.println("5.2%3.1=" + (5.2 % 3.1)); // ����������ȡ�࣬���Ϊ2.1
	System.out.println("3.1/0=" + (3.1 / 0)); // ������������0�����ΪInfinity
	System.out.println("-8.8/0=" + (-8.8 / 0)); // ������������0�����Ϊ-Infinity
	System.out.println("5.1%0=" + (5.1 % 0)); // ����������0ȡ�࣬���ΪNaN
	System.out.println("6.6%0=" + (6.6 % 0)); // ����������0ȡ�࣬���ΪNaN
//	System.out.println("3/0=" + (3 / 0)); // ��������0,�������쳣
    }
}

