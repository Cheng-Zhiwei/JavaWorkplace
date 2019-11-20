package homework04;

import java.util.Scanner;
public class EquationSolution {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);//扫描控制台的输入信息赋给对象
		System.out.print("请输入二次项系数：");
		double a = inputData.nextDouble(); //取出控制台的一行信息
		System.out.print("请输入一次项系数：");
		double b = inputData.nextDouble();
		System.out.print("请输入一次项系数：");
		double c = inputData.nextDouble();
		
		//判断delta的值
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta>0) {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.println("该方程有两个根: x1="+x1+", x2="+x2);
			
		} else if(delta==0) {
			double x = -b/2*a; 
			System.out.println("该方程有一个根: x="+x);
			
		} else if(delta<0) {
			System.out.println("该方程没有根");
		}
		
		inputData.close();
	}

}
