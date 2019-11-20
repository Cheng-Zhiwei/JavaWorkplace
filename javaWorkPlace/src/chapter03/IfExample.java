package chapter03;
import java.util.Scanner; 

public class IfExample {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		System.out.print("Please input three number:");
		
		int a = inputData.nextInt();
		int b = inputData.nextInt();
		int c = inputData.nextInt();
		int t;
		
//		if(a>b) {
//			t = b;
//			b = a;
//			a = t;
//		}
//		System.out.println(a+" "+b+" "+c);
//		
//		if(a>c) {
//			t = a;
//			a = c;
//			c = t;
//		}
//		System.out.println(a+" "+b+" "+c);
//		
//		if(b>c) {
//			t = b;
//			b = c;
//			c = t;
//		}
//
//		System.out.println(a+" "+b+" "+c);
		
		
		/*从大到小*/
		if (a<b) {
			t = a;
			a = b;
			b = t;
		}
		
		if (a<c) {
			t = a;
			a = c;
			c = t;
		}
		
		if (b<c) {
			t = b;
			b = c;
			c = t;
		}
		
		System.out.println(a+" "+b+" "+c);
		inputData.close();
	}

}
