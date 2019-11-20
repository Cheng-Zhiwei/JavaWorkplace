package chapter03;
import java.util.Scanner;

public class CharSwitch {
    public static void main(String[] args) {
	
//    Scanner inputData = new Scanner(System.in);
//    System.out.print("请输入成绩：");
//    int score  = inputData.nextInt();
   
    char  cc = 'a';
   
	switch (cc) {// 使用switch 判断g的等级
		case 'a':
			System.out.println("满分"); 
		    break;
		case 9:
			System.out.println("优秀"); 
			break;
		case 8:
			System.out.println("良好"); 
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格"); 
			break;
		default:
			System.out.println("不及格");
		}
//	inputData.close();
	}
}

