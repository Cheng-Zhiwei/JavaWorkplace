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
			
			degree = "����";
		} else if  (score>=80) {
			degree = "����";
		} else if  (score>=70) {
			degree = "�е�";
		}  else if (score>=60) {
			degree = "�ϸ�";
		} else {
			degree = "���ϸ�";
		}
		System.out.println(name+"ͬѧ�ĳɼ�Ϊ"+degree+"��");
		
		for(int i=0; i<5; i++) {
	
			for(int j=0; j<7; j++) {
				int a = 2;
			}
		}
		
		
		
		inputData.close();
	}
}
