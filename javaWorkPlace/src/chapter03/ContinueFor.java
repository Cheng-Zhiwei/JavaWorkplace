package chapter03;

public class ContinueFor {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0 ;j<3; j++) {
				if(j==1) {  //��i=6ʱ������ִ�д�ӡ������ǻ���뵽��һ��ѭ��
					continue;
			}
				System.out.println(j);	
			}
		
		}

	}

}
