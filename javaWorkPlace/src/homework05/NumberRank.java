package homework05;
import java.util.Scanner;

public class NumberRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputData = new Scanner(System.in);
		System.out.print("Please input three number£º");
		int x = inputData.nextInt();
		int y = inputData.nextInt();
		int z = inputData.nextInt();
		
		int tem = 0;
		
		if(x<y) {
			tem = x;
			x = y;
			y = tem;
		}
		
		if(x<z) {
			tem = x;
			x = z;
			z = tem;
		}
		
		if(y<z) {
			tem = y;
			y = z;
			z = tem;
		}
		
		System.out.println(x+" "+y+" "+z);
		inputData.close();
	}

}
