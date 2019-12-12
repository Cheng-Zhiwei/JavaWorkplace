package homework08;
import java.util.Arrays;
import java.util.Scanner;

public class Array2DSort  {
	public static void main(String[] args) {
		
    	System.out.println("------------------二维数组排序------------------");
    	Scanner input = new Scanner(System.in);
    	System.out.print("请输入二维数组的行数和列数： ");
    	int rows = input.nextInt();
    	int cols = input.nextInt();
    	System.out.print("请输入数组中随机整数的范围(最小值和最大值)： ");
     	int minValue = input.nextInt();
     	int maxValue = input.nextInt();
		
     	System.out.println("创建的二维数组为：");
     	int arr[][] = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
		/*
		public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		代码解释:
		　　Object src : 原数组
		      int srcPos : 从元数据的起始位置开始
		　　Object dest : 目标数组
		　　int destPos : 目标数组的开始起始位置
		　　int length  : 要copy的数组的长度
		*/

		// 把二维数组复制到一维数组
		int[] arrCopy = new int[rows * cols ]; 
		
		for (int i = 0; i < rows; i++) {
			System.arraycopy(arr[i], 0, arrCopy, i * arr[i].length, arr[i].length);
		}
		
		Arrays.sort(arrCopy); 
		
		// 把一维数组复制到二维数组
		for (int i=0; i < arr.length; i++) {
			System.arraycopy(arrCopy, arr[i].length * i, arr[i], 0, arr[i].length);
		}
		
		System.out.println("排序后的二维数组为：");
		for (int[] i : arr) {
			for(int c : i) {
				System.out.print(c+" ");
			}
		System.out.println();
		}

	input.close();
	}
}


//-------------------------------02-基本方法实现-----------------------------------
//public class Array2DSort  {
//	public static void main(String[] args) { 
//
//    	System.out.println("------------------二维数组排序------------------");
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("请输入二维数组的行数和列数： ");
//    	int rows = input.nextInt();
//    	int cols = input.nextInt();
//    	System.out.print("请输入数组中随机整数的范围(最小值和最大值)： ");
//     	int minValue = input.nextInt();
//     	int maxValue = input.nextInt();
//     	
//     	System.out.println("创建的二维数组为：");
//     	int arr[][] = new int[rows][cols];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		int[] arrCopy = new int[arr.length*arr[0].length];
//		
//		int index=0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arrCopy[index] = arr[i][j]; 
//				index++;
//			}
//		}
//		
//		for(int e: arrCopy) {
//			System.out.print(e+" ");
//		}
//		Arrays.sort(arrCopy);
//		
//		System.out.println();
//		int index1 = 0;
//		for(int i=0; i<arr.length; i++ ) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = arrCopy[index1] ;
//				index1++;
//			}
//		}
//		
//		for(int[] e: arr) { 
//			System.out.println(Arrays.toString(e));		
//		}
//	}
//}