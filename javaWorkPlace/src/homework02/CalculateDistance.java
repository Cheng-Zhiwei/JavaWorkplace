/**
 *  ��������ľ���
 * @author Cheng
 */

package homework02;
import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("�������һ��������(����ֵ֮���ÿո����): ");
		double x1 = inputData.nextDouble();
		double y1 = inputData.nextDouble();
		double z1 = inputData.nextDouble();
		
		System.out.print("������ڶ���������(����ֵ֮���ÿո����): ");
		double x2 = inputData.nextDouble();
		double y2 = inputData.nextDouble();
		double z2 = inputData.nextDouble();
		
		double distance = Math.pow(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)+Math.pow((z2-z1), 2),0.5);
		
		System.out.println("�����ľ���Ϊ"+distance);
		
		inputData.close();
	}

}
