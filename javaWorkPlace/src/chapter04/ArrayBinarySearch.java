package chapter04;
import java.util.Arrays;

public class ArrayBinarySearch{
        public static void main(String[] args) {
	int[] scoreArr = { 34, 56, 12, 76, 54, 98, 25, 58, 86, 19 };
	Arrays.sort(scoreArr);//�����Ϊ��12 19 25 34 54 56 58 76 86 98
	
	//����һ���������в��ҵ�Ԫ��
	int a=Arrays.binarySearch(scoreArr, 25); 
	System.out.println("�������Ϊ��"+a);
	//���ζ���û�в��ҵ�Ԫ�أ�
	int b=Arrays.binarySearch(scoreArr, 35);
	System.out.println("�������Ϊ��"+b);
	
	int c=Arrays.binarySearch(scoreArr, 1);
	System.out.println("�������Ϊ��"+c);
	
	int d=Arrays.binarySearch(scoreArr, 155);
	System.out.println("�������Ϊ��"+d);
        }
}

