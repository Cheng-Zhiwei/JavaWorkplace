package chapter05;

public class MethodExample {

	//����һ�������ķ���
	public double area(double rouble) {
		return Math.PI*rouble*rouble;
	}
	
	//����һ����̬�ķ����������ֱ�ӵ���
	private static int add(int a, int b) {
		return a+b;
	}
	
	//����һ���ܱ��������յķ���
	protected final void display() {
		System.out.println("Hello, World!");
	}

	public static void main(String[] args) {
		
		//��̬�ķ�����ֱ�ӵ���
		System.out.println("4+5="+MethodExample.add(4, 5));
		
	   //ʵ���ɷ�������Ҫ����ʵ������ʹ��
		MethodExample calculate = new MethodExample();
		System.out.println("The area of the circle whose radius is 5 is " +calculate.area(0.5));
		calculate.display();

	}

}
