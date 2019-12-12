package homework07;

/*---------------------------方法一-------------------*/
public class PrimeNumberSum {
	public static void main(String[] args) {
		int sum = 0, n=200, count=0, i, j;
		for(i=2; i<=n; i++){
			for(j=2; j<=i; j++){       
				if(i%j==0 &&j !=i)       
					break;
				if(i%j==0 &&j==i) {
					sum+=i;
					count+=1;
				}
			}
		}
		System.out.println(n+"以内素数的和为"+sum+",素数的个数为"+count);
	}
}

/*----------------方法二--------------------*/
//public class PrimeNumberSum {
//	public static void main(String[] args) {
//		int sum = 0, n=200, count=0, i, j;
//		for(i=2;i<=n; i++){
//			if( i==2){
//				sum+=i;
//				count+=1;
//				continue;
//			}
//			for(j=2; j<i; j++){       
//				if(i%j==0)       //如果i可以整除2---到i-1之间任一个数，那么说明i不是素数
//					break;
//				if(j==i-1) {
////					System.out.println(i);
//					sum+=i;
//					count+=1;
//				}//如果除数可以取到i-1,表示为素数
//			}
//		}
//		System.out.println(n+"以内素数的和为"+sum+",素数的个数为"+count);
//	}
//}


/*----------------方法三-------------------*/
//public class PrimeNumberSum{
//	public static void main(String[] args) {
//	int sum = 0, n=200, count=0;
//	
//	for (int i = 2; i <= n; i++) {
//		boolean x = true;
////		for (int j = 2; j <=Math.sqrt(i); j++) {
//		for (int j = 2; j <i; j++) {
//			if (i % j == 0) {
//				x = false;
//			}
//		}
//		if (x == true) {
//			sum += i;
//			count+=1;
//		}
//	}
//	System.out.println("200以内素数个数有"+count+"个，它们和为"+sum);
//}
//}




