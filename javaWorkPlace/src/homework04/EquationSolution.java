package homework04;

import java.util.Scanner;
public class EquationSolution {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);//ɨ�����̨��������Ϣ��������
		System.out.print("�����������ϵ����");
		double a = inputData.nextDouble(); //ȡ������̨��һ����Ϣ
		System.out.print("������һ����ϵ����");
		double b = inputData.nextDouble();
		System.out.print("������һ����ϵ����");
		double c = inputData.nextDouble();
		
		//�ж�delta��ֵ
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta>0) {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.println("�÷�����������: x1="+x1+", x2="+x2);
			
		} else if(delta==0) {
			double x = -b/2*a; 
			System.out.println("�÷�����һ����: x="+x);
			
		} else if(delta<0) {
			System.out.println("�÷���û�и�");
		}
		
		inputData.close();
	}

}
