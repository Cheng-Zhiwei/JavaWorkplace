package chapter02;

public class SelfAddMinusDemo {

	public static void main(String[] args) {
//		int a = 2;
//		int b = a++; //�Ƚ��б��ʽ���㣬�ٽ������������Լ�����
//		a  = 2;
//		int c = ++a; //�Ƚ������������Լ����㣬�ٽ��б��ʽ����
//		System.out.println("a="+a+"\nb="+b+"\nc="+c);
//		
//		int a1 = 2;
//		int b1 = a1--; //�Ƚ��б��ʽ���㣬�ٽ������������Լ�����
//		a1  = 2;
//		int c1 = --a1; //�Ƚ������������Լ����㣬�ٽ��б��ʽ����
//		System.out.println("a1="+a1+"\nb1="+b1+"\nc1="+c1);
		int i = 0;   
		int j = i++ + ++i;   
		int k = --i + i--;
		System.out.println(i+" \n"+j+"\n"+k);
//		int x = 5, y = 6, z;
//		z = ++x + x++;
//	
//		System.out.println(z+"\n"+x);
		
		
//		int a=1;
//		System.out.println(a+++a++);
//		//1+2  
//		int b = 1;
//		System.out.println((b++)+(++b));
//		//1+3
		
//		int x = 5, y = 6, z;
//		z = ++x + x++;
//		System.out.println(z+"\n"+x);
	}

}
