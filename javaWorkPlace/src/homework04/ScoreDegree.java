package homework04;

import java.util.Scanner;
public class ScoreDegree {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("Please input the name and score:");
		String name = inputData.next();
		int score = inputData.nextInt();
		String  degree;

		if(score>=90) {
			
			degree = "优秀";
		} else if  (score>=80) {
			degree = "良好";
		} else if  (score>=70) {
			degree = "中等";
		}  else if (score>=60) {
			degree = "合格";
		} else {
			degree = "不合格";
		}
		System.out.println(name+"同学的成绩为"+degree+"！");
		
		for(int i=0; i<5; i++) {
	
			for(int j=0; j<7; j++) {
				int a = 2;
			}
		}
		
		
		
		inputData.close();
	}
}
