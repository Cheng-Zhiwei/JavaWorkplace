package chapter03;

public class MutiplyTable {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) { //i循环9次，每次换行
			for(int j=1; j<=i; j++) { //i等于几，j就循环几次
				System.out.print(j+"*"+i+" ");
			}
			System.out.println(); //换行
		}

	}
}
