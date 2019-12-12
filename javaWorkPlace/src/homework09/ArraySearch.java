package homework09;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
    	
    	System.out.println("---------------数据查找---------------");
    	Scanner input = new Scanner(System.in);
    	System.out.print("请输入数组的长度： ");
    	int n = input.nextInt();
    	System.out.print("请输入要创建数组中随机整数的范围(最小值和最大值)： ");
     	int minValue = input.nextInt();
     	int maxValue = input.nextInt();
     	System.out.print("请输入要查找的整数： ");
     	int num = input.nextInt();
     	
        int[] arr = new int[n];
      	System.out.print("创建的数组为arr={ ");
        for (int i=0; i<arr.length;  i++) {
        	arr[i] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
        	System.out.print(arr[i]+" ");
        }
         System.out.print("}\n");
    	

        int index=-1;
        System.out.print("查找的结果为：");
        for(int i=0; i<n; i++) {
            if(arr[i]==num){
            	index = i;
            	System.out.print(index+" ");
            } 
            if(i==n-1 && index==-1) {
            	System.out.println("数组里面找不到该整数！");
            }
        }
   
        input.close();
    }
}
