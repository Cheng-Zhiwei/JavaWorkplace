package chapter03;
import java.util.Scanner;
public class SwitchInputString {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("�����뼾�ڣ�");
		String season = inputData.nextLine();
		
		switch(season) {
			case "����": 
				System.out.println("��������"); break;
			case "����": 
				System.out.println("���Ƕ���"); break;
			case "����": 
				System.out.println("���Ǵ���"); break;
			case "����": 
				System.out.println("��������"); break;	
		}
		
		inputData.close();

	}

}
