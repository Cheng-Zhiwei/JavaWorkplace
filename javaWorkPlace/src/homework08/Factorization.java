package homework08;
import java.util.Scanner;


public class  Factorization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����������");
		int n = input.nextInt();
		
		System.out.print(n+"=");
		for(int k=2; k<=n; k++) {
			while(n>k) { 
				if(n%k==0) {  //n�ܱ�k����
					System.out.print(k+"*"); //��ӡ��k��ֵ
					n /= k;  //����n����k������Ϊ�µ�n,����ѭ��
				} else {
					break;  //��n���ܱ�k����break��ִ��k+1
				}
			}
		}
		System.out.print(n);//��k=n����ӡ��nֵ��Ϊ���һ��������
		input.close();
	}	
}


	

