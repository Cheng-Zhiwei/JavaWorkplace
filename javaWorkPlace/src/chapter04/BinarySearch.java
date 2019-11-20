package chapter04;
import java.util.Arrays;

public class BinarySearch {
        public static void main(String[] args) {
	// 创建两个数组
	int[] scoreArr = { 34, 56, 12, 12, 76, 54, 98, 25, 58, 86,98, 19 };
	// 对数组进行排序
	Arrays.sort(scoreArr);
	
	for(int c : scoreArr) {
		System.out.print(c+" ");
	}
	
	int a=Arrays.binarySearch(scoreArr, 0);
	int b=Arrays.binarySearch(scoreArr, 155);
	System.out.println("检索结果为："+a+" 和 "+b);
        }
}

