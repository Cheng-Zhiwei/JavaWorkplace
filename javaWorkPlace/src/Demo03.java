/**
 *  ����һ����λ��������λ�ĺ�
 * @author YourName
 */

import java.util.Scanner;
public class Demo03 {
	public static void main(String[] args) {
		
		//1.��ʾ�û���������
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ��0��1000������:");
		int number=scanner.nextInt();
		
		//2.�������ֵĸ�λ��ȡ����
		int a=number%10; //����Ϊ9����λ�ϵ���
		number/=10; //number = 99

		//3.�������ֵ�ʮλ��ȡ����
		int b=number%10; //����Ϊ9��ʮλ�ϵ���
		number/=10; //number=9
		
		//4.�������ֵİ�λ��ȡ����
		int c=number%10; //9%10=9
	
		//5.�������������
		int sum = a+b+c;
		
		//6.�����
		System.out.println("���������λ�����ĺ��ǣ� "+sum);

		
		scanner.close();
	}
}
