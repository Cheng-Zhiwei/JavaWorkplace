package chapter03;

public class BreakIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for(;i<=10;i++) {
			if(i==5) {
				System.out.println("find the goat!stop!"); //��i=5ʱ���������ѭ������ִ��ʣ�µ����
				break;
			}
			System.out.println(i);
		}
		System.out.println(" wheb i="+i+", the loop is stop!");
	}

}
