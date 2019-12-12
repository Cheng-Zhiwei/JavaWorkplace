package homework08;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class ArrayReverse  {
    public static void main(String[] args) {
    	System.out.println("---------------数组反转---------------");
    	Scanner input = new Scanner(System.in);
    	System.out.print("请输入数组的长度： ");
    	int length = input.nextInt();
    	System.out.print("请输入数组中随机整数的范围(最小值和最大值)： ");
     	int minValue = input.nextInt();
     	int maxValue = input.nextInt();
     	
        int[] arr = new int[length];
      
      	System.out.print("创建的数组为arr={ ");
        for (int i=0; i<arr.length;  i++) {
        	arr[i] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
        	System.out.print(arr[i]+" ");
        }
    	System.out.print("}");
    	System.out.println();
 /* ---------------------方法一--------------------*/   	
//        int[]arrReverse = new int[length];
//        System.out.print("反转后的数组={");
//        for (int i = 0; i < arrReverse.length; i++) {
//        	arrReverse[i]=arr[length-1-i];
//        	System.out.print(arrReverse[i]+" ");
//        }
//        System.out.println("}");
     
        
        
/* ---------------------方法二--------------------*/   	
        for (int i = 0; i < arr.length/2; i++) {
        	int tem;
        	tem = arr[i];
        	arr[i] = arr[arr.length-1-i];
        	arr[arr.length-1-i] = tem;
        }
        System.out.print("反转后数组为：");
        for(int e: arr) {
        	System.out.print(e+" ");
        }

        input.close();
    }
}




