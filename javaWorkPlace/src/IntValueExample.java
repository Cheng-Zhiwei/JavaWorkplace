/**
 * 整数的其他进制的表示方式
 * @author Cheng
 *
 */

public class IntValueExample {
	
    public static void main(String[] args) {
    	
    	/*其他进制表示为十进制*/
		 int a = 0b1001; // 二进制数
		 System.out.println("二进制数0b1001的值是：" + a);	
		 
		 int b = 071; // 八进制数
		 System.out.println("八进制数071的值是：" + b);	
		
		 int c = 19; // 十进制数
		 System.out.println("十进制数19的值是：" + c);
		 
		 int d = 0xFE; // 十六进制数
		 System.out.println("十六进制数0xFE的值是：" + d);
		 
		 
		 /*十进制表示为其他进制*/
		 // Integer.toBinaryString()方法将一个整数以二进制
		 System.out.println(c+"表示为二进制是：" + Integer.toBinaryString(c));	
		 
		 //Integer.toHexString()方法将一个整数转换为十六进制
		 System.out.println(c+"表示为十六进制是"+Integer.toHexString(c));
		
		//Integer.toHexString()方法将一个整数转换为八进制
		 System.out.println(a+"表示为八进制是"+Integer.toOctalString(a)); 
			 	 
    }
}














