package homework04;

import java.util.Scanner;
public class ScoreDegree {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("Please input the name and score:");
		String name = inputData.next();
		int score = inputData.nextInt();

		
		if(score>=90) {
	
			System.out.println(name+"ͬѧ�ĳɼ�Ϊ���㣡");
		} else if  (score>=80) {
			System.out.println(name+"ͬѧ�ĳɼ�Ϊ���ã�");
		} else if  (score>=70) {
			System.out.println(name+"ͬѧ�ĳɼ�Ϊ�еȣ�");
		}  else if (score>=60) {
			System.out.println(name+"ͬѧ�ĳɼ�Ϊ�ϸ�");
		} else {
			System.out.println(name+"ͬѧ�ĳɼ�Ϊ���ϸ�");
		}
				
		inputData.close();
	}
}
