/**
 *  计算两点的距离
 * @author Cheng
 */

package homework02;
import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("请输入第一个点坐标(坐标值之间用空格隔开): ");
		double x1 = inputData.nextDouble();
		double y1 = inputData.nextDouble();
		double z1 = inputData.nextDouble();
		
		System.out.print("请输入第二个点坐标(坐标值之间用空格隔开): ");
		double x2 = inputData.nextDouble();
		double y2 = inputData.nextDouble();
		double z2 = inputData.nextDouble();
		
		double distance = Math.pow(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)+Math.pow((z2-z1), 2),0.5);
		
		System.out.println("两点间的距离为"+distance);
		
		inputData.close();
	}

}
