package chapter03;
import java.util.Scanner;

public class CharSwitch {
    public static void main(String[] args) {
	
//    Scanner inputData = new Scanner(System.in);
//    System.out.print("������ɼ���");
//    int score  = inputData.nextInt();
   
    char  cc = 'a';
   
	switch (cc) {// ʹ��switch �ж�g�ĵȼ�
		case 'a':
			System.out.println("����"); 
		    break;
		case 9:
			System.out.println("����"); 
			break;
		case 8:
			System.out.println("����"); 
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 6:
			System.out.println("����"); 
			break;
		default:
			System.out.println("������");
		}
//	inputData.close();
	}
}

