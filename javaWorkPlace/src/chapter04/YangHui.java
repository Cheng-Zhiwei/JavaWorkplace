package chapter04;

//public class YangHui {
//	 
//	public static void main(String[] args) {
//		//1.声明一个二维数组，长度为6
//		int length = 6;
//		int[][] arr = new int[length][];	
//	
//		//2.为二维数组的每一个元素分配内存空间:第一个元素的长度为1，第二个元素的长度为2
//		for(int i=0; i<arr.length; i++){
//			arr[i] = new int[i+1];	
//		}
// 
//		//3.为二维数组的第一个元素和最后一个元素赋值为1
//		for(int i=0; i<arr.length; i++){
//			arr[i][0] = 1;
//			arr[i][arr[i].length-1] = 1 ;
//		}
//		
//		//4.为二维数组的其他元素赋值
//		for(int i=2;i<arr.length;i++){
//			for(int j=1; j<i; j++){
//				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
//			}
//		}
//
// 
//		//5.打印
//		for (int i = 0; i < arr.length; i++) { 
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println("");
//		}
//		
//	}
// 
//}
import java.util.Scanner;
public class YangHui {
	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print("Please input the rows of YangHuiMat:");
		int n = inputData.nextInt();
	
		int[][] mat = new int[n][];
		
		for(int i=0; i<n; i++) {
			mat[i] = new int[i+1]; //这里mat[i]为一个已经声明了但没有开辟空间的一维数组
		}
		
		for(int i=0; i<n; i++) {
			mat[i][0] =1;
			mat[i][mat[i].length-1] =1;
		}
		
		for(int i=2; i<n; i++) {
			for(int j=1; j<i; j++) {
				mat[i][j] = mat[i-1][j] + mat[i-1][j-1];
			}
		}
		
		for(int[] e: mat) {
			for(int c : e) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	inputData.close();
	}
}



