package homework08;

public class SelectionSort {
	
	 public  static void  main (String[] args) {
		 int[] array = new int[10];
		 for(int i=0; i<array.length; i++) {
			 array[i] = (int) (Math.random()*100+1);
		 }
		 
		int t = 0;
		for (int i = 0; i < array.length - 1; i++){
			int index=i;
			for (int j = i + 1; j < array.length; j++)
				if (array[index] > array[j])
					index=j;
			if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
				t = array[i];
				array[i] = array[index];
				array[index] = t;
			}
		}
		for(int e: array) {
			System.out.print(e+" ");
		}
	}
}







