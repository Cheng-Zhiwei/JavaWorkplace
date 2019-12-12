package Exam;

import java.util.Scanner;

public class FibonacciArr {
	public static void main(String[] args) {
	 	Scanner sc =new Scanner(System.in); 
	 	int n = sc.nextInt();
	 	int fn[] = new int[n]; 
	 	fn[0] = fn[1] = 1;
	 	for(int i = 2; i < fn.length; i++){
	 		fn[i] = fn[i-1] + fn[i-2];
	 		}
	 	System.out.println(fn[ n-1 ]);
		sc.close();
	}
}
