package homework05;

import java.util.Scanner;

public class BonusCalculation {
	public static void main(String[] args) {
		
		double profit = 0, bonus = 0;
		System.out.print("输入当月利润（万）：");
		Scanner s = new Scanner(System.in);
		profit = s.nextInt();
		
		if(profit > 0 && profit <= 10) {
			bonus = profit * 0.1;
		} else if(profit > 10 && profit <= 20) {
			bonus = 10 * 0.1 + (profit - 10) * 0.075;
		} else if(profit > 20 && profit <= 40) {
			bonus = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
		} else if(profit > 40 && profit <= 60) {
			bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
		} else if(profit > 60 && profit <= 100) {
			bonus = 20 * 0.175 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015; 
		} else if(profit > 100) {
			bonus = 20 * 0.175 + 40 * 0.08 + 40 * 0.015 + (profit - 100) * 0.01;
		}
		System.out.println("应该提取的奖金是 " + bonus + "万");
		s.close();
	}
}
