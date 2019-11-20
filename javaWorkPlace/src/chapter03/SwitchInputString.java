package chapter03;
import java.util.Scanner;
public class SwitchInputString {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("请输入季节：");
		String season = inputData.nextLine();
		
		switch(season) {
			case "夏天": 
				System.out.println("这是夏天"); break;
			case "冬天": 
				System.out.println("这是冬天"); break;
			case "春天": 
				System.out.println("这是春天"); break;
			case "秋天": 
				System.out.println("这是秋天"); break;	
		}
		
		inputData.close();

	}

}
