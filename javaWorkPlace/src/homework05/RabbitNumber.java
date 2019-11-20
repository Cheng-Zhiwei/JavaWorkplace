package homework05;

public class RabbitNumber {
	public static void main(String[] args) {
		int f1 = 1, f2 =1, f;
		System.out.println("第1个月兔子的对数为"+f1);
		System.out.println("第 2个月兔子的对数为"+f2);
		
		for (int i=3;i<=36; i++) {
			f = f2 + f1; //从第3个月开始有规律
			f1 = f2;
			f2 = f;
			System.out.println("第"+i+"个月兔子的对数为"+f);
		}
	}
}