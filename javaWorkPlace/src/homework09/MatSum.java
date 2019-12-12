package homework09;

import java.util.Scanner;

public class  MatSum {
     public static void main(String[] args) {
    	   	System.out.println("------------------数组对角元素求和------------------");
        	Scanner input = new Scanner(System.in);
        	System.out.print("请输入二维数组的行数和列数(等行等列)： ");
        	int n = input.nextInt();
        	System.out.print("请输入数组中随机整数的范围(最小值和最大值)： ");
         	int minValue = input.nextInt();
         	int maxValue = input.nextInt();
    		
         	int sum = 0;
         	System.out.println("创建的二维数组为：");
         	int arr[][] = new int[n][n];
    		for (int i = 0; i < arr.length; i++) {
    			for (int j = 0; j < arr[i].length; j++) {
    				arr[i][j] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
    				System.out.print(arr[i][j]+" ");
    			}
    			System.out.println();
    		}
    	 
    		 
         for(int i=0; i<n; i++) {      
             for(int j=0; j<n; j++) {
                 if(i==j){   //如果为对角线元素
                     sum += arr[i][j];  
                 }
             }
         }
         System.out.println("此矩阵对角线的和为:"+sum);
         
         input.close();
     }
 }
