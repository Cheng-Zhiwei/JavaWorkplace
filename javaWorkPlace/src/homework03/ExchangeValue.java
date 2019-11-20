package homework03;

import java.util.Scanner;
public class ExchangeValue {
	
	public static void main(String[] args) {
			
		//1.提示用户输入半径和高
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入a的值:");
		int a = scanner.nextInt();
		System.out.print("请输入b的值:");
		int b = scanner.nextInt();
		
		int tem = a;
		a = b;
		b = tem;
	
		System.out.println("a和b的值交换后，a="+a+", b="+b);
		scanner.close();
	}
}