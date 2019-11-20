package chapter03;

public class DoWhileUNumberSum {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum+=i;
			i++;
			System.out.println("我被执行了一次，此时i="+i);
		} while(i<=100); //更改条件演示do首先被执行了一次
		System.out.println(sum);

	}

}
