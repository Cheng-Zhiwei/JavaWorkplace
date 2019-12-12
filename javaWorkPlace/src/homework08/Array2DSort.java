package homework08;
import java.util.Arrays;
import java.util.Scanner;

public class Array2DSort  {
	public static void main(String[] args) {
		
    	System.out.println("------------------��ά��������------------------");
    	Scanner input = new Scanner(System.in);
    	System.out.print("�������ά����������������� ");
    	int rows = input.nextInt();
    	int cols = input.nextInt();
    	System.out.print("��������������������ķ�Χ(��Сֵ�����ֵ)�� ");
     	int minValue = input.nextInt();
     	int maxValue = input.nextInt();
		
     	System.out.println("�����Ķ�ά����Ϊ��");
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
		�������:
		����Object src : ԭ����
		      int srcPos : ��Ԫ���ݵ���ʼλ�ÿ�ʼ
		����Object dest : Ŀ������
		����int destPos : Ŀ������Ŀ�ʼ��ʼλ��
		����int length  : Ҫcopy������ĳ���
		*/

		// �Ѷ�ά���鸴�Ƶ�һά����
		int[] arrCopy = new int[rows * cols ]; 
		
		for (int i = 0; i < rows; i++) {
			System.arraycopy(arr[i], 0, arrCopy, i * arr[i].length, arr[i].length);
		}
		
		Arrays.sort(arrCopy); 
		
		// ��һά���鸴�Ƶ���ά����
		for (int i=0; i < arr.length; i++) {
			System.arraycopy(arrCopy, arr[i].length * i, arr[i], 0, arr[i].length);
		}
		
		System.out.println("�����Ķ�ά����Ϊ��");
		for (int[] i : arr) {
			for(int c : i) {
				System.out.print(c+" ");
			}
		System.out.println();
		}

	input.close();
	}
}


//-------------------------------02-��������ʵ��-----------------------------------
//public class Array2DSort  {
//	public static void main(String[] args) { 
//
//    	System.out.println("------------------��ά��������------------------");
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("�������ά����������������� ");
//    	int rows = input.nextInt();
//    	int cols = input.nextInt();
//    	System.out.print("��������������������ķ�Χ(��Сֵ�����ֵ)�� ");
//     	int minValue = input.nextInt();
//     	int maxValue = input.nextInt();
//     	
//     	System.out.println("�����Ķ�ά����Ϊ��");
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