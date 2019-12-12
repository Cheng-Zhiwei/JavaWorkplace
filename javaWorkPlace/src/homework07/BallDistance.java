package homework07;
import java.util.Scanner;

public class BallDistance { 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入球反弹的次数: ");
		int n = sc.nextInt();
	
		double h= 100;
		double s = 100;
		int i=0;
		while(i<n) {
			s+=h; // 表示距离
			h/=2; // 表示高度
			i++;
		}
		
		System.out.println("高度为" + s);
		System.out.println("距离为" + h);
		
		sc.close();

	}
}