/**
 *  ʵ�κ��βδ���ֵʱ��������Ϊ��������ʱ���ǰ����õ�ַ���ݸ��β�
 *  ʵ�κ��βι���ָ��ͬһ�ڴ��ַ����˵��޸����βε�ֵ��ʵ�ε�ֵ
 *  Ҳ�ᷢ���仯
 * @author Administrator
 */


package chapter05;

public class MethodRefTransmit {

	public static void display(MyData data) {
		int temp = data.a;
		data.a = data.b;
		data.b = temp;
		System.out.println("��display��������a="+data.a+",b= "+data.b);
	}
	
	public static void main(String[] args) {

		MyData  md = new MyData();
		md.a = 1;
		md.b = 2;
		System.out.println("���÷���ǰa="+md.a+", b="+md.b);
		display(md);
		System.out.println("���÷���ǰa="+md.a+", b="+md.b);
	}

}
