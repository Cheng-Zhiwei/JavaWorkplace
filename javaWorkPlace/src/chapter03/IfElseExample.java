package chapter03;

import java.util.Scanner;
public class IfElseExample {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("请输入年份：");
		
		int years = inputData.nextInt();
		
		if ((years%4 == 0 && years%100 != 0) || (years%400 == 0)) {
			System.out.println(years+"年是闰年！");
		} else {
			System.out.println(years+"年是平年！");
		}
		
		inputData.close();
	}

}
