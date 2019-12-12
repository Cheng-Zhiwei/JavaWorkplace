package Exam;
import java.util.Scanner;

public class Excise {
	static void factorial(int n) {
		int f1=1, f2=1, fn=1;
		for(int i=3; i<=n; i++) {
			fn = f1 + f2;
			f1=f2;
			f2 = fn;
		}
		System.out.println("��"+n+"���ֵΪ"+fn);
	}
	
	static void factorial2(int n) {
		int[] arr = new int[n+1];
		arr[0]=1; 
		arr[1]= 1;
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println("��"+n+"���ֵΪ"+arr[n-1]);
	}
	
	static void eatPeach() {
		int n=1;
		for(int i = 9; i>0; i--) {
			n = 2*(n+1);
		}
		System.out.println("���ӵ�����Ϊ:" +n);
	}
	
	static void rank() {
		for(int i=1; i<50; i++) {
			if(i%3==1 && i%7==5 && i%5==0) {
				System.out.println("����Ϊ��" +i);
			}
		}
	}
	
	static long factor(int n) {
		int m=1;
		for(int i=1; i<=n; i++) {
			m*=i;
		}
		return m;
	} 
	
	static void palindrome() {
		Scanner sc =new Scanner(System.in);
		System.out.print("������һ�ַ�����");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		String t = "";
		for(int i = c.length - 1; i >= 0 ; i--) { 
			t += c[i] ;
			}
		if( s.equals(t) ) 
			System.out.println(s + "�ǻ����ַ���");
		sc.close();
	}
	
	static Boolean prime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			} 
		}
		return true;
	}
	
	static void primeSum(int n) {
		int sum =0;
		for(int i=2; i<=n; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) { 
					break;
				}
			}
		sum+=i;
		}
		System.out.println("sum="+sum);	
	}
	
	static void scoreDegree(int score) {
		if(score > 100 || score < 0){					
			System.out.println("�Ƿ�����");
		}
		else if(score >= 90){							
			System.out.println("����");					
		}else if(score >= 80){							
			System.out.println("����");					
		}else if(score >= 70){							
			System.out.println("����");					
		}else {											
			System.out.println("������");				
		}
	}
	
	
	static void getMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������������");
     	int a = sc.nextInt();
     	int b = sc.nextInt();
     	sc.close();
     	if(a>b)
         	System.out.println(a);
     	else
         	System.out.println(b);
	}
	
	static void printPrime() {
        int count = 0;
        for(int i = 2; i <= 1000; i++ ){
            if(Excise.prime(i)){
                count++;
                System.out.print(i + "\t");
                if( count% 5 == 0)
                    System.out.println();
            }
        }
        System.out.println();
	}
	
	static void sumN(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1��"+n+"�ĺ�Ϊ"+sum);
	}
	
	static void printWeek(int n) {
		switch(n) {
		case 1: System.out.println("Monday�� "); break;
		case 2: System.out.println("Tuesday ��"); break;
		case 3: System.out.println("Wednesday�� "); break;
		case 4: System.out.println("Thursday��"); break;
		case 5: System.out.println("Friday��"); break;
		case 6: System.out.println("Saturday ��"); break;
		case 7: System.out.println("Sunday��"); break;
		default: System.out.println("Unvalidated Input�� "); break;
		}
	}
     

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������n��ֵ�� ");
//		int n = sc.nextInt();
//		Excise.factorial(n);
//		Excise.factorial2(n);
//		Excise.eatPeach();
//		Excise.rank();
//		System.out.println(n+"�׳˵Ľ��Ϊ��"+Excise.factor(n));
//		Excise.palindrome();
//		Excise.primeSum(1);
//		Excise.scoreDegree(90);
//		Excise.getMax();
//		Excise.printPrime();
//		Excise.sumN(100);
//		Excise.printWeek(1);	

	}
}
