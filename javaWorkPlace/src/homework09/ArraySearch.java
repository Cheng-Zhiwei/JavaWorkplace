package homework09;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
    	
    	System.out.println("---------------���ݲ���---------------");
    	Scanner input = new Scanner(System.in);
    	System.out.print("����������ĳ��ȣ� ");
    	int n = input.nextInt();
    	System.out.print("������Ҫ������������������ķ�Χ(��Сֵ�����ֵ)�� ");
     	int minValue = input.nextInt();
     	int maxValue = input.nextInt();
     	System.out.print("������Ҫ���ҵ������� ");
     	int num = input.nextInt();
     	
        int[] arr = new int[n];
      	System.out.print("����������Ϊarr={ ");
        for (int i=0; i<arr.length;  i++) {
        	arr[i] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
        	System.out.print(arr[i]+" ");
        }
         System.out.print("}\n");
    	

        int index=-1;
        System.out.print("���ҵĽ��Ϊ��");
        for(int i=0; i<n; i++) {
            if(arr[i]==num){
            	index = i;
            	System.out.print(index+" ");
            } 
            if(i==n-1 && index==-1) {
            	System.out.println("���������Ҳ�����������");
            }
        }
   
        input.close();
    }
}
