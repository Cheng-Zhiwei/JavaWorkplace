/**
 * ����Բ����ĵ���������
 * @author YourName
 */

import java.util.Scanner;
public class Demo02 {
	
	public static void main(String[] args) {
		
		//���峣��PI
		final double PI=3.1415926;
		
		//1.��ʾ�û�����뾶�͸�
		Scanner scanner=new Scanner(System.in);
		System.out.print("������Բ����İ뾶�͸ߣ�����ֵ���ÿո������:");
		double radius=scanner.nextDouble();
		double length=scanner.nextDouble();
		
		//2.����Բ����ĵ����
		double area=radius*radius*PI;
		
		//3.����Բ��������
		double volume=area*length;
		
		//4.���Բ����ĵ���������
		System.out.println("Բ����ĵ�����ǣ� "+area);
		System.out.println("Բ���������ǣ� "+volume);
		
		scanner.close();
	}
}
