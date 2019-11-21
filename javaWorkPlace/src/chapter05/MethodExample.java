package chapter05;

public class MethodExample {

	//定义一个公共的方法
	public double area(double rouble) {
		return Math.PI*rouble*rouble;
	}
	
	//定义一个静态的方法，类可以直接调用
	private static int add(int a, int b) {
		return a+b;
	}
	
	//定义一个受保护的最终的方法
	protected final void display() {
		System.out.println("Hello, World!");
	}

	public static void main(String[] args) {
		
		//静态的方法类直接调用
		System.out.println("4+5="+MethodExample.add(4, 5));
		
	   //实例成法方法需要对象实例化后使用
		MethodExample calculate = new MethodExample();
		System.out.println("The area of the circle whose radius is 5 is " +calculate.area(0.5));
		calculate.display();

	}

}
