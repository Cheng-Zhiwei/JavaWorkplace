package homework03;

import java.util.Scanner;
public class YearDay {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int mintues=scanner.nextInt();

		int days=mintues/60/24;
		int years=days/365;
	
		days=days%365;
		
		System.out.println(mintues+" mintues is approximately "+years+" years and "+days+" days");
		
		scanner.close();
	}
}