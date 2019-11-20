/**
 *  实参和形参传递值时，当参数为引用类型时，是把引用地址传递给形参
 *  实参和形参共用指向同一内存地址，因此当修改了形参的值，实参的值
 *  也会发生变化
 * @author Administrator
 */


package chapter05;

public class MethodRefTransmit {

	public static void display(MyData data) {
		int temp = data.a;
		data.a = data.b;
		data.b = temp;
		System.out.println("在display方法里面a="+data.a+",b= "+data.b);
	}
	
	public static void main(String[] args) {

		MyData  md = new MyData();
		md.a = 1;
		md.b = 2;
		System.out.println("调用方法前a="+md.a+", b="+md.b);
		display(md);
		System.out.println("调用方法前a="+md.a+", b="+md.b);
	}

}
