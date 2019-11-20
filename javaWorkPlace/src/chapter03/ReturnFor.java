package chapter03;

public class ReturnFor {
	
//	public static int sum(int a) {
//		return a*a;
//	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		for(int i=0; i<6; i++) {
			System.out.println(i);
			if(i==3) {
				return;
//				System.out.println(ReturnFor.sum(i));
			}
		}
	}

}
