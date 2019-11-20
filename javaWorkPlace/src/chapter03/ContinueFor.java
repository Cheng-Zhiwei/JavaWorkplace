package chapter03;

public class ContinueFor {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0 ;j<3; j++) {
				if(j==1) {  //当i=6时，不会执行打印命令，但是会进入到下一次循环
					continue;
			}
				System.out.println(j);	
			}
		
		}

	}

}
