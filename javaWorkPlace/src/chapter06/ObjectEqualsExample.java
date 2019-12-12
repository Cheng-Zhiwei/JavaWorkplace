package chapter06;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(8);
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(8);
		Integer num4 = num1; //指向同一空间地址
		
		System.out.println(num1==num2); //是否指向同一空间地址
		System.out.println(num1.equals(num2));//空间内容是否相同
		
		System.out.println(num1==num3); //是否指向同一空间地址
		System.out.println(num1.equals(num3));//空间内容是否相同
		
		System.out.println(num1==num4); //是否指向同一空间地址
		System.out.println(num1.equals(num4));//空间内容是否相同
	}

}
