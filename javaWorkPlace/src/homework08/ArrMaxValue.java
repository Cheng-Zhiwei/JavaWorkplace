package homework08;

import java.util.Scanner;



public class ArrMaxValue {

	static int getMax1(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static void getMax2(int[] arr) {
		for (int i = 0; i <arr. length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				int tem;
				tem = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tem;
			}
			if (i == arr.length - 2) {
				System.out.println("������������arr�����ֵΪ: "+ arr[arr.length - 1]);
			}
		}
	}
	
	public static void printMax(int[] arr) {
		System.out.println("��������ֵΪ��"+getMax1(arr));
	}
	
	
	
	
	public static void main(String[] args) {

		
//		System.out.println("---------------Ѱ����������ֵ---------------");
		Scanner input = new Scanner(System.in);
		System.out.print("����������ĳ��ȣ� ");
		int length = input.nextInt();
		System.out.print("��������������������ķ�Χ(��Сֵ�����ֵ)�� ");
		int minValue = input.nextInt();
		int maxValue = input.nextInt();
		
		int[] arr = new int[length];
		System.out.print("����������Ϊarr={ ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (maxValue + 1 - minValue) + minValue);
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");

		int max = minValue - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\n����һ������arr�����ֵΪ: " + max); 
		input.close();
		
		for (int i = 0; i < length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				int tem;
				tem = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tem;
			}
			if (i == length - 2) {
				System.out.println("������������arr�����ֵΪ: "+ arr[length - 1]);
			}
		}
	}
}
