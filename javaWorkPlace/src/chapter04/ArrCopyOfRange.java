package chapter04;

 import java.util.Arrays;
 public class  ArrCopyOfRange  {
         public static void main(String[] args) {
 	int[] scoreArr = { 34, 56, 12, 76, 54, 98, 25 };
 	int[] arrCopy1 = new int[scoreArr.length];
 	int[] arrCopy2 = new int[3];
 	int[] arrCopy3 = new int[8];

 	arrCopy1 = Arrays.copyOfRange(scoreArr, 0, scoreArr.length);
 	arrCopy2 = Arrays.copyOfRange(scoreArr, 2, 5);
 	arrCopy3 = Arrays.copyOfRange(scoreArr, 1, 9);
 		
 	System.out.print("arrCopy1数组的元素为：");
 	for (int e : arrCopy1)
 		System.out.print(e +"  ");
 	System.out.println();

 	System.out.print("arrCopy2数组的元素为：");
 	for (int e : arrCopy2)
 		System.out.print(e +"  ");
 	System.out.println();
 	
	System.out.print("arrCopy3数组的元素为：");
	for (int e : arrCopy3)
		System.out.print(e +"  ");
	}
}

