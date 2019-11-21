package homework06;

public class BasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-----------将字符串转为基本类型--------
		
		//01-直接用XXX（String s）构造方法
		int num = new Integer("1");
		
		//02-利用parseXXX（String s）的方法
		int num2 = Integer.parseInt("123");
		
		float f1 = new Float("11");//字符串转为float；
		float f2 = Float.parseFloat("111");
		
		double f3 = new Double("111");
		double f4 = Double.parseDouble("111");
		
		//---------将其他类型转为字符串-----
		
		String s1 = ""+1+2;
		String s2 = Integer.toString(123);
		String s3 = String.valueOf(123);
		
		String s4 = Double.toString(123.0);
		
		System.out.println(s4.hashCode());
	
		

	}

}
