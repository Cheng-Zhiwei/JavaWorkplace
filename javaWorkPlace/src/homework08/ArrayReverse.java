package homework08;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class ArrayReverse  {
    public static void main(String[] args) {
    	System.out.println("---------------���鷴ת---------------");
    	Scanner input = new Scanner(System.in);
    	System.out.print("����������ĳ��ȣ� ");
    	int length = input.nextInt();
    	System.out.print("��������������������ķ�Χ(��Сֵ�����ֵ)�� ");
     	int minValue = input.nextInt();
     	int maxValue = input.nextInt();
     	
        int[] arr = new int[length];
      
      	System.out.print("����������Ϊarr={ ");
        for (int i=0; i<arr.length;  i++) {
        	arr[i] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
        	System.out.print(arr[i]+" ");
        }
    	System.out.print("}");
    	System.out.println();
 /* ---------------------����һ--------------------*/   	
//        int[]arrReverse = new int[length];
//        System.out.print("��ת�������={");
//        for (int i = 0; i < arrReverse.length; i++) {
//        	arrReverse[i]=arr[length-1-i];
//        	System.out.print(arrReverse[i]+" ");
//        }
//        System.out.println("}");
     
        
        
/* ---------------------������--------------------*/   	
        for (int i = 0; i < arr.length/2; i++) {
        	int tem;
        	tem = arr[i];
        	arr[i] = arr[arr.length-1-i];
        	arr[arr.length-1-i] = tem;
        }
        System.out.print("��ת������Ϊ��");
        for(int e: arr) {
        	System.out.print(e+" ");
        }

        input.close();
    }
}




