package homework09;
import java.util.Scanner;

public class SelectionSort {	
	public static void main(String[] args) {
//    	System.out.println("---------------ѡ������---------------");
//    	Scanner input = new Scanner(System.in);
//    	System.out.print("����������ĳ��ȣ� ");
//    	int n = input.nextInt();
//    	System.out.print("��������������������ķ�Χ(��Сֵ�����ֵ)�� ");
//     	int minValue = input.nextInt();
//     	int maxValue = input.nextInt();
//     	
//        int[] arr = new int[n];
//      	System.out.print("����������Ϊarr={ ");
//        for (int i=0; i<arr.length;  i++) {
//        	arr[i] = (int) (Math.random()*(maxValue+1-minValue)+minValue) ;
//        	System.out.print(arr[i]+" ");
//        }
//         System.out.print("}\n");
		
		int[] arr = {4, 3, 2, 1, 5};
		int n = arr.length;
		
		for(int i=0; i<n; i++) { //һ���Ƚ�n-1��
			int minIndex = i; //��i����СֵindexΪi��
			for(int j=i+1; j<n; j++) { //ÿһ�ֱȽ�n-j��
				if(arr[minIndex]>arr[j]) { //���minIndex��ֵ��������index��ֵ����minIndex=index��
					minIndex = j;
				}
			}
			if(i !=minIndex) { //����n-j�αȽϣ��ҵ���Сֵindex���ŵ�arr[i]λ��
				int tem = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tem;
			}
		}
		
		System.out.print("����������Ϊarr={ ");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.print("}\n");
//		input.close();
	}	
}

