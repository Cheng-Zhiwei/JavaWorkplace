package homework04;

import java.util.Scanner;
public class ScoreDegree {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("Please input the name and score:");
		String name = inputData.next();
		int score = inputData.nextInt();

		
		if(score>=90) {
	
			System.out.println(name+"同学的成绩为优秀！");
		} else if  (score>=80) {
			System.out.println(name+"同学的成绩为良好！");
		} else if  (score>=70) {
			System.out.println(name+"同学的成绩为中等！");
		}  else if (score>=60) {
			System.out.println(name+"同学的成绩为合格！");
		} else {
			System.out.println(name+"同学的成绩为不合格！");
		}
				
		inputData.close();
	}
}
