package homework06;

public class PalindromicNumber {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i=10000; i<=99999; i++) {
			
			int number = i;
			//�������ֵĸ�λ��ȡ����
			int a=number%10; //����Ϊ9����λ�ϵ���
			number/=10; //number = 99
	
			//�������ֵ�ʮλ��ȡ����
			int b=number%10; //����Ϊ9��ʮλ�ϵ���
			number/=10; //number=9
			
			//4.�������ֵİ�λ��ȡ����
			int c=number%10; 
			number/=10; 
			
			//�������ֵ�ǧλ��ȡ����
			int d = number%10; 
			number/=10; 
	
			//6.�������ֵ���λ��ȡ����
			int e = number%10; 
		
			if(e==a && d==b) {
				System.out.println(" "+e+d+c+b+a+"�ǻ�������");
				count+=1;
			}
		}	
		System.out.println("����"+count+"����������");
	}
}