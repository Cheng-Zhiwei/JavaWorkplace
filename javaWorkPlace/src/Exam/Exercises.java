package Exam;



public class Exercises {
	
	public static void main(String[] args) {
		//08--i++问题
		int a = 8; 
		int c = (a++)+(++a); 
		System.out.println(c);
		
		//09
		int x=6, y=8;  
		boolean b;
		System.out.println((b =x<y || ++x==y--)+", "+x+", "+y);//短路运算
		
//		//10
//		String s = 1+"2"+3;//加号在这里是连接符的意思
//		System.out.println(s);
//		
//		//13
//		int i1 = 6, j=8,k=10,n=5,m=7;
//		if(!(i1<j) )   
//			k= m +n;
//		else     
//			k = m- n;
//		System.out.println("k="+k);
//		
//		//16
//		for(int i=0; i<100; i+=2) {
//			System.out.println(i);
//		}
//		
//		int s1=0;
//		for(int i =1;i<8;i++){
//			if(i % 2 == 0) 
//				continue;
//			s1+=i;
//		}
//		System.out.println("s1="+s1);
//		
//		double c1 = 1.0;
//		c1 = 5/2;
//		System.out.println(c1);
		


		
	}

}
