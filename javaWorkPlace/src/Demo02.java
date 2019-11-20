/**
 * 计算圆柱体的底面积和体积
 * @author YourName
 */

import java.util.Scanner;
public class Demo02 {
	
	public static void main(String[] args) {
		
		//定义常量PI
		final double PI=3.1415926;
		
		//1.提示用户输入半径和高
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入圆柱体的半径和高（两个值请用空格隔开）:");
		double radius=scanner.nextDouble();
		double length=scanner.nextDouble();
		
		//2.计算圆柱体的底面积
		double area=radius*radius*PI;
		
		//3.计算圆柱体的体积
		double volume=area*length;
		
		//4.输出圆柱体的底面积和体积
		System.out.println("圆柱体的底面积是： "+area);
		System.out.println("圆柱体的体积是： "+volume);
		
		scanner.close();
	}
}
