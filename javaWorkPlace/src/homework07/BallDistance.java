package homework07;
import java.util.Scanner;

public class BallDistance { 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�������򷴵��Ĵ���: ");
		int n = sc.nextInt();
	
		double h= 100;
		double s = 100;
		int i=0;
		while(i<n) {
			s+=h; // ��ʾ����
			h/=2; // ��ʾ�߶�
			i++;
		}
		
		System.out.println("�߶�Ϊ" + s);
		System.out.println("����Ϊ" + h);
		
		sc.close();

	}
}