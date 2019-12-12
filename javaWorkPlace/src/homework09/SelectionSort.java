package homework09;
import java.util.Scanner;

public class SelectionSort {	
	public static void main(String[] args) {
//    	System.out.println("---------------选择排序---------------");
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("请输入数组的长度： ");
//    	int n = input.nextInt();
//    	System.out.print("请输入数组中随机整数的范围(最小值和最大值)： ");
//     	int minValue = input.nextInt();
//     	int maxValue = input.nextInt();
//     	
//        int[] arr = new int[n];
//      	System.out.print("创建的数组为arr={ ");
//        for (int i=0; i<arr.length;  i++) {
//        	arr[i] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
//        	System.out.print(arr[i]+" ");
//        }
//         System.out.print("}\n");
		
		int[] arr = {4, 3, 2, 1, 5};
		int n = arr.length;
		
		for(int i=0; i<n; i++) { //一共比较n-1轮
			int minIndex = i; //第i轮最小值index为i；
			for(int j=i+1; j<n; j++) { //每一轮比较n-j次
				if(arr[minIndex]>arr[j]) { //如果minIndex的值大于其他index的值，则minIndex=index；
					minIndex = j;
				}
			}
			if(i !=minIndex) { //经过n-j次比较，找到最小值index，放到arr[i]位置
				int tem = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tem;
			}
		}
		
		System.out.print("排序后的数组为arr={ ");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.print("}\n");
//		input.close();
	}	
}

