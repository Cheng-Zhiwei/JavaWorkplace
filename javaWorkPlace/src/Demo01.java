/**
 *  ���ڰѻ����¶�ת��Ϊ�����¶�
 * @author Cheng
 */

import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args) {
		
		//1.��ʾ�û�����ȡ�û�����������¶�
		Scanner inputData=new Scanner(System.in);
		System.out.print("�����������¶�:");
		double celsius=inputData.nextDouble();
		
		//2.���ø����Ĺ�ʽ�������¶�ת��Ϊ�����¶�
		double fahrenheit=(9.0/5)*celsius+32;
		
		//3.�������¶����
		System.out.println(celsius+" �����¶��� "+fahrenheit+"�����¶�");
		
		inputData.close();
		
	}
}
