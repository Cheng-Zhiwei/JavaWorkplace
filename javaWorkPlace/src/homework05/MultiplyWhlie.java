package homework05;

public class MultiplyWhlie {

	public static void main(String[] args) {
		
		int i =1;
		while(i<=9) {
			
			int j = 1;
			while(j<=i) {
				System.out.print(j+"*"+i+"="+(i*j)+" " );
				j++;
			}
			
			i++;
			System.out.println();
		}

	}

}
