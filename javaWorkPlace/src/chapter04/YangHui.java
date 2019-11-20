package chapter04;

//public class YangHui {
//	 
//	public static void main(String[] args) {
//		//1.����һ����ά���飬����Ϊ6
//		int length = 6;
//		int[][] arr = new int[length][];	
//	
//		//2.Ϊ��ά�����ÿһ��Ԫ�ط����ڴ�ռ�:��һ��Ԫ�صĳ���Ϊ1���ڶ���Ԫ�صĳ���Ϊ2
//		for(int i=0; i<arr.length; i++){
//			arr[i] = new int[i+1];	
//		}
// 
//		//3.Ϊ��ά����ĵ�һ��Ԫ�غ����һ��Ԫ�ظ�ֵΪ1
//		for(int i=0; i<arr.length; i++){
//			arr[i][0] = 1;
//			arr[i][arr[i].length-1] = 1 ;
//		}
//		
//		//4.Ϊ��ά���������Ԫ�ظ�ֵ
//		for(int i=2;i<arr.length;i++){
//			for(int j=1; j<i; j++){
//				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
//			}
//		}
//
// 
//		//5.��ӡ
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
			mat[i] = new int[i+1]; //����mat[i]Ϊһ���Ѿ������˵�û�п��ٿռ��һά����
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



