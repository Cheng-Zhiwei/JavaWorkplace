package chapter03;

public class DoWhileUNumberSum {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum+=i;
			i++;
			System.out.println("�ұ�ִ����һ�Σ���ʱi="+i);
		} while(i<=100); //����������ʾdo���ȱ�ִ����һ��
		System.out.println(sum);

	}

}
