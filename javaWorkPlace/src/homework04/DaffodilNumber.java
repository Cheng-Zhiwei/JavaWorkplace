package homework04;

public class DaffodilNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =101; i<1000; i++) {
			
			int num = i;
			int a = num%10;
			num/=10; 
			int b =num%10; 
			num/=10; 
			int c = num%10; 
	
			if (i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) {
				System.out.println(i+"是水仙花数！");
				
			}
		}
	}
}
