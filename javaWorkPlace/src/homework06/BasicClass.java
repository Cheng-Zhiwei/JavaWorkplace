package homework06;

public class BasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-----------���ַ���תΪ��������--------
		
		//01-ֱ����XXX��String s�����췽��
		int num = new Integer("1");
		
		//02-����parseXXX��String s���ķ���
		int num2 = Integer.parseInt("123");
		
		float f1 = new Float("11");//�ַ���תΪfloat��
		float f2 = Float.parseFloat("111");
		
		double f3 = new Double("111");
		double f4 = Double.parseDouble("111");
		
		//---------����������תΪ�ַ���-----
		
		String s1 = ""+1+2;
		String s2 = Integer.toString(123);
		String s3 = String.valueOf(123);
		
		String s4 = Double.toString(123.0);
		
		System.out.println(s4.hashCode());
	
		

	}

}
