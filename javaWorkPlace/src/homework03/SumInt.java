package homework03;

/**
 *  ����һ����λ��������λ�ĺ�
 * @author YourName
 */

import java.util.Scanner;
public class SumInt {
	public static void main(String[] args) {
		
		//1.��ʾ�û���������
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ��0��100000������:");
		int number=scanner.nextInt();
		
		//2.�������ֵĸ�λ��ȡ����
		int a=number%10; //����Ϊ9����λ�ϵ���
		number/=10; //number = 99

		//3.�������ֵ�ʮλ��ȡ����
		int b=number%10; //����Ϊ9��ʮλ�ϵ���
		number/=10; //number=9
		
		//4.�������ֵİ�λ��ȡ����
		int c=number%10; 
		number/=10; 
		
		//5.�������ֵ�ǧλ��ȡ����
		int d = number%10; 
		number/=10; 
		
		System.out.println(number);
		
		//5.�������ֵ���λ��ȡ����
		int e = number%10; 

		//5.�������������
		int sum = a+b+c+d+e;
		
		//6.�����
		System.out.println("���������λ�����ĺ��ǣ� "+sum);
	
		scanner.close();
	}
}
