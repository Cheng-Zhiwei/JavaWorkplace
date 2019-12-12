package homework06;

public class SumOfThree {

	public static void main(String[] args) {
		
//		int i = 1;
//		int sum = 0;
//		while(i<500) {
//			if(i%3==0) {
//				sum +=i;
//			}
//			i++;
//		}
//		System.out.println(sum);


		int sum = 0;
		int tem ;
		for (int i = 1;i <= 200;i++){
			tem = i*3;
			if(tem>500) {
				break;
			}		
			sum+=tem;
		}
		System.out.println(sum);
		
	}

}
