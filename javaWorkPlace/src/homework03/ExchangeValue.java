package homework03;

import java.util.Scanner;
public class ExchangeValue {
	
	public static void main(String[] args) {
			
		//1.��ʾ�û�����뾶�͸�
		Scanner scanner=new Scanner(System.in);
		System.out.print("������a��ֵ:");
		int a = scanner.nextInt();
		System.out.print("������b��ֵ:");
		int b = scanner.nextInt();
		
		int tem = a;
		a = b;
		b = tem;
	
		System.out.println("a��b��ֵ������a="+a+", b="+b);
		scanner.close();
	}
}