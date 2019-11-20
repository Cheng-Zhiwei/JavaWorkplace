package chapter04;

import java.util.Scanner;
public class Bubbling {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("请输入数组的长度：");
		int arrayLength = inputData.nextInt();
		
		int[] arrayA = new int[arrayLength];
		for(int i=0; i<arrayA.length; i++) {
			arrayA[i] = (int) (Math.random()*100);
			System.out.print(arrayA[i]+" ");
		}
		
		int tem;
		for(int j=1; j<arrayA.length-1; j++) {
			for(int k=0; k<arrayA.length-j; k++) {
				if(arrayA[k+1]<arrayA[k]) {
					tem = arrayA[k+1];
					arrayA[k+1] = arrayA[k];
					arrayA[k] = tem;
				}
			}
		}
		System.out.println();
		for(int c: arrayA) {
			System.out.print(c+" ");
		}
		
		inputData.close();

	}

}
