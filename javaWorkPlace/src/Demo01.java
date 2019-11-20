/**
 *  用于把华氏温度转换为摄氏温度
 * @author Cheng
 */

import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args) {
		
		//1.提示用户并获取用户输入的摄氏温度
		Scanner inputData=new Scanner(System.in);
		System.out.print("请输入摄氏温度:");
		double celsius=inputData.nextDouble();
		
		//2.利用给出的公式将摄氏温度转换为华氏温度
		double fahrenheit=(9.0/5)*celsius+32;
		
		//3.将华氏温度输出
		System.out.println(celsius+" 摄氏温度是 "+fahrenheit+"华氏温度");
		
		inputData.close();
		
	}
}
