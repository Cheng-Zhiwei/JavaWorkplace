package homework06;

public class SumOfSeries  {
	public static void main(String[] args) {
		double x = 2.0, y = 1.0, t;
		double sum = 0;
		for(int i=1; i<=30; i++) {
			sum = sum + x / y;
			t = y;
			y = x;
			x = y + t;
		}
		System.out.println("前30项相加之和是： " + sum);
	}
}
