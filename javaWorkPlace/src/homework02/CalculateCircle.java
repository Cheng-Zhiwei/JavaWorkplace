/**
 *  ����Բ���ܳ������
 * @author Cheng
 */


package homework02;
import java.util.Scanner;

public class CalculateCircle {
	
	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("������Բ�İ뾶��");
		double radius = inputData.nextDouble();
		
		double perimeter = 2*PI*radius;
		double area = PI*radius*radius;
		
		System.out.println("Բ���ܳ�Ϊ"+perimeter);
		System.out.println("Բ�����Ϊ"+area);
		
		inputData.close();
		
	}
}
