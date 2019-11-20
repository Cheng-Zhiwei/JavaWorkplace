package homework06;

public class PalindromicNumber {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i=10000; i<=99999; i++) {
			
			int number = i;
			//将该数字的个位提取出来
			int a=number%10; //余数为9，个位上的数
			number/=10; //number = 99
	
			//将该数字的十位提取出来
			int b=number%10; //余数为9，十位上的数
			number/=10; //number=9
			
			//4.将该数字的百位提取出来
			int c=number%10; 
			number/=10; 
			
			//将该数字的千位提取出来
			int d = number%10; 
			number/=10; 
	
			//6.将该数字的万位提取出来
			int e = number%10; 
		
			if(e==a && d==b) {
				System.out.println(" "+e+d+c+b+a+"是回文数！");
				count+=1;
			}
		}	
		System.out.println("共有"+count+"个回文数！");
	}
}