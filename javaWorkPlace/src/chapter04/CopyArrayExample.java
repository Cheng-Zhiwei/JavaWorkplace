package chapter04;

import java.util.Arrays;
public class CopyArrayExample {
        public static void main(String[] args) {
	int[] scoreArr = { 34, 56, 12, 76, 54, 98, 25 };
	int[] arrCopy1 = new int[5];
	int[] arrCopy2 = new int[10];
	arrCopy1 = Arrays.copyOf(scoreArr, arrCopy1.length);
	arrCopy2 = Arrays.copyOf(scoreArr, arrCopy2.length);
	
	System.out.print("arrCopy1数组的元素为：");
	for (int e : arrCopy1)
		System.out.print(e +"  ");
	System.out.println();

	System.out.print("arrCopy2数组的元素为：");
	for (int e : arrCopy2)
		System.out.print(e +"  ");
	}
}

