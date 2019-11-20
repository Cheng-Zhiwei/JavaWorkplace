package chapter04;

public class Create2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayA = {{1}, {2,3}, {2,3,4}};
		for(int[] c: arrayA) {
			for(int e: c) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		int[][] arrayB = new int[5][5];
		for(int i=0; i<arrayB.length; i++) {
			for(int j=0; j<arrayB[i].length; j++) {
				arrayB[i][j] = (int) (Math.random()*50);
				System.out.print(arrayB[i][j]+" ");
			}
			System.out.println();
		}
	}

}
