package chapter05;

public class ValueTransmit {

	//����һ����ʾa��b����ֵ��ķ���
	public void display(int a, int b) {
		int tem;
		tem = a;
		a = b;
		b = tem;
		System.out.println("a="+a+", b="+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
