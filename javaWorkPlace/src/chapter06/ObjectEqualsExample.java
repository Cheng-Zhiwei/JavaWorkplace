package chapter06;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(8);
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(8);
		Integer num4 = num1; //ָ��ͬһ�ռ��ַ
		
		System.out.println(num1==num2); //�Ƿ�ָ��ͬһ�ռ��ַ
		System.out.println(num1.equals(num2));//�ռ������Ƿ���ͬ
		
		System.out.println(num1==num3); //�Ƿ�ָ��ͬһ�ռ��ַ
		System.out.println(num1.equals(num3));//�ռ������Ƿ���ͬ
		
		System.out.println(num1==num4); //�Ƿ�ָ��ͬһ�ռ��ַ
		System.out.println(num1.equals(num4));//�ռ������Ƿ���ͬ
	}

}
