package chapter05;



public class Method01 {
	 private int a = 0;
	
	public double  area(double r) {
		return Math.PI*Math.pow(r,2);
	}
	
	//˽�еľ�̬�ķ���
	private static int add(int a, int b) {
		return a+b;
	}

	//���������յķ���
	protected final void display() {
		System.out.println("HelloWorld!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4+5="+add(4,5));//��̬����ֱ��ͨ����������
		
		Method01 obj = new Method01();
		System.out.println(obj.area(5.0));
		obj.display();
	}

}
