package homework09;

import java.util.Scanner;

public class  MatSum {
     public static void main(String[] args) {
    	   	System.out.println("------------------����Խ�Ԫ�����------------------");
        	Scanner input = new Scanner(System.in);
        	System.out.print("�������ά���������������(���е���)�� ");
        	int n = input.nextInt();
        	System.out.print("��������������������ķ�Χ(��Сֵ�����ֵ)�� ");
         	int minValue = input.nextInt();
         	int maxValue = input.nextInt();
    		
         	int sum = 0;
         	System.out.println("�����Ķ�ά����Ϊ��");
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
                 if(i==j){   //���Ϊ�Խ���Ԫ��
                     sum += arr[i][j];  
                 }
             }
         }
         System.out.println("�˾���Խ��ߵĺ�Ϊ:"+sum);
         
         input.close();
     }
 }
