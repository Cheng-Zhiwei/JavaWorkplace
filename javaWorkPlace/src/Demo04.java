/**
 *  ����һ����λ��������λ�ĺ�
 * @author YourName
 */

import java.util.Scanner;
public class Demo04 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ��0��10000������:");
		int number=scanner.nextInt();
			
		int a = number%10;
		number/=10;
		
		int b = number%10;
		number/=10;
		
		int c = number%10;
		number/=10;
		
		int d = number%10;
		
		int sum = a+b+c+d;
		System.out.println(sum);
		
		scanner.close();
	}
}
