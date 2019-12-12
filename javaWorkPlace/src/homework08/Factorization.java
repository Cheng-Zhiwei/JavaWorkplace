package homework08;
import java.util.Scanner;


public class  Factorization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int n = input.nextInt();
		
		System.out.print(n+"=");
		for(int k=2; k<=n; k++) {
			while(n>k) { 
				if(n%k==0) {  //n能被k整除
					System.out.print(k+"*"); //打印出k的值
					n /= k;  //并用n除以k的商作为新的n,继续循环
				} else {
					break;  //当n不能被k整除break，执行k+1
				}
			}
		}
		System.out.print(n);//当k=n，打印出n值作为最后一个质因数
		input.close();
	}	
}


	

