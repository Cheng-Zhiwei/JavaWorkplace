package chapter03;

public class BreakOuterLoop {

	public static void main(String[] args) {
		
		outer: for(int i=1; i<5;i++) { //�����ⲿѭ����ʶ��
			for(int j=1; j<3; j++) {
				System.out.println(i+" "+j);
				if(j==2) {
					break outer; //�����ⲿѭ��
				}	
			}
		}
	}
}
