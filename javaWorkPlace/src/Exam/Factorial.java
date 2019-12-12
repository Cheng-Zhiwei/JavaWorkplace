package Exam;

public class Factorial {

	public static long factorial(long n) {
		long x = 1;
		for (int i = 1; i <= n; i++)
			x *= i;
		return x;
	}

	public static void main(String[] args) {

		long x = Factorial.factorial(4);
		System.out.println(x);

	}
}
