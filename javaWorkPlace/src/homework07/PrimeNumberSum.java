package homework07;

/*---------------------------����һ-------------------*/
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
		System.out.println(n+"���������ĺ�Ϊ"+sum+",�����ĸ���Ϊ"+count);
	}
}

/*----------------������--------------------*/
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
//				if(i%j==0)       //���i��������2---��i-1֮����һ��������ô˵��i��������
//					break;
//				if(j==i-1) {
////					System.out.println(i);
//					sum+=i;
//					count+=1;
//				}//�����������ȡ��i-1,��ʾΪ����
//			}
//		}
//		System.out.println(n+"���������ĺ�Ϊ"+sum+",�����ĸ���Ϊ"+count);
//	}
//}


/*----------------������-------------------*/
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
//	System.out.println("200��������������"+count+"�������Ǻ�Ϊ"+sum);
//}
//}




