package chapter03;
import java.util.Scanner;
public class IfAndSwitch {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int score = inputData.nextInt();
		
		if(score==100) {
			System.out.print("成绩为满分");
		} else if(score>=90) {
			System.out.print("成绩为优秀");
		} else if(score>=80) {
			System.out.print("成绩为良好");
		} else if(score>=70) {
			System.out.print("成绩为一般");
		} else if(score>=60) {
			System.out.print("成绩为合格");
		} else {
			System.out.print("成绩为不合格");
		}
		inputData.close();
	}

}
