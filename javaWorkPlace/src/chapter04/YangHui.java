package chapter04;

public class YangHui {
	 
	public static void main(String[] args) {
		//1.声明一个二维数组，长度为6
		int length = 6;
		int[][] arr = new int[length][];	
	
		//2.为二维数组的每一个元素分配内存空间:第一个元素的长度为1，第二个元素的长度为2
		for(int i=0; i<arr.length; i++){
			arr[i] = new int[i+1];	
		}
 
		//3.为二维数组的第一个元素和最后一个元素赋值为1
		for(int i=0; i<arr.length; i++){
			arr[i][0] = 1;
			arr[i][arr[i].length-1] = 1 ;
		}
		
		//4.为二维数组的其他元素赋值
		for(int i=2;i<arr.length;i++){
			for(int j=1; j<i; j++){
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}

 
		//5.打印
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
 
}
