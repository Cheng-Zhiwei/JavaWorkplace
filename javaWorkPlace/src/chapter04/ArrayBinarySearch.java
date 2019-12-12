package chapter04;
import java.util.Arrays;

public class ArrayBinarySearch{
        public static void main(String[] args) {
	int[] scoreArr = { 34, 56, 12, 76, 54, 98, 25, 58, 86, 19 };
	Arrays.sort(scoreArr);//排序后为：12 19 25 34 54 56 58 76 86 98
	
	//情形一：数组中有查找的元素
	int a=Arrays.binarySearch(scoreArr, 25); 
	System.out.println("检索结果为："+a);
	//情形二：没有查找的元素，
	int b=Arrays.binarySearch(scoreArr, 35);
	System.out.println("检索结果为："+b);
	
	int c=Arrays.binarySearch(scoreArr, 1);
	System.out.println("检索结果为："+c);
	
	int d=Arrays.binarySearch(scoreArr, 155);
	System.out.println("检索结果为："+d);
        }
}

