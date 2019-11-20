/**
 * 测试浮点数的定义
 * @author Administrator
 *
 */
public class FloatDemo {

	public static void main(String[] args) {
		
		//01 定义
		//float a =0.11 //不加f会报错 
		float a = 0.11f; //浮点数字面常量的默认类型是doule
		float height = 0.11111f;
		float weight = 0.22111f;
		
		double b1 = 9.111d; //定义时加d或者不加d都可以
		double b2 = 9.2222;
		
		System.out.println(a);
		System.out.println(height*weight);//保留8位有效数字
		System.out.println(b1*b2);//保留16位有效数字
			
	}

}
