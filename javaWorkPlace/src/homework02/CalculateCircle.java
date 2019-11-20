/**
 *  计算圆的周长和面积
 * @author Cheng
 */


package homework02;
import java.util.Scanner;

public class CalculateCircle {
	
	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		double radius = inputData.nextDouble();
		
		double perimeter = 2*PI*radius;
		double area = PI*radius*radius;
		
		System.out.println("圆的周长为"+perimeter);
		System.out.println("圆的面积为"+area);
		
		inputData.close();
		
	}
}
