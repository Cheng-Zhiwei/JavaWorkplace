package chapter03;

import java.util.Scanner;
public class IfElseExample {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("��������ݣ�");
		
		int years = inputData.nextInt();
		
		if ((years%4 == 0 && years%100 != 0) || (years%400 == 0)) {
			System.out.println(years+"�������꣡");
		} else {
			System.out.println(years+"����ƽ�꣡");
		}
		
		inputData.close();
	}

}
