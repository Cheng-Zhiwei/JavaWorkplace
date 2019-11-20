package chapter03;

public class BreakOuterLoop {

	public static void main(String[] args) {
		
		outer: for(int i=1; i<5;i++) { //定义外部循环标识符
			for(int j=1; j<3; j++) {
				System.out.println(i+" "+j);
				if(j==2) {
					break outer; //跳出外部循环
				}	
			}
		}
	}
}
