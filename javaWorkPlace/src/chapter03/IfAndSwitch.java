package chapter03;
import java.util.Scanner;
public class IfAndSwitch {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = inputData.nextInt();
		
		if(score==100) {
			System.out.print("�ɼ�Ϊ����");
		} else if(score>=90) {
			System.out.print("�ɼ�Ϊ����");
		} else if(score>=80) {
			System.out.print("�ɼ�Ϊ����");
		} else if(score>=70) {
			System.out.print("�ɼ�Ϊһ��");
		} else if(score>=60) {
			System.out.print("�ɼ�Ϊ�ϸ�");
		} else {
			System.out.print("�ɼ�Ϊ���ϸ�");
		}
		inputData.close();
	}

}
