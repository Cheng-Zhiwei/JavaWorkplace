/**
 * �������������Ƶı�ʾ��ʽ
 * @author Cheng
 *
 */

public class IntValueExample {
	
    public static void main(String[] args) {
    	
    	/*�������Ʊ�ʾΪʮ����*/
		 int a = 0b1001; // ��������
		 System.out.println("��������0b1001��ֵ�ǣ�" + a);	
		 
		 int b = 071; // �˽�����
		 System.out.println("�˽�����071��ֵ�ǣ�" + b);	
		
		 int c = 19; // ʮ������
		 System.out.println("ʮ������19��ֵ�ǣ�" + c);
		 
		 int d = 0xFE; // ʮ��������
		 System.out.println("ʮ��������0xFE��ֵ�ǣ�" + d);
		 
		 
		 /*ʮ���Ʊ�ʾΪ��������*/
		 // Integer.toBinaryString()������һ�������Զ�����
		 System.out.println(c+"��ʾΪ�������ǣ�" + Integer.toBinaryString(c));	
		 
		 //Integer.toHexString()������һ������ת��Ϊʮ������
		 System.out.println(c+"��ʾΪʮ��������"+Integer.toHexString(c));
		
		//Integer.toHexString()������һ������ת��Ϊ�˽���
		 System.out.println(a+"��ʾΪ�˽�����"+Integer.toOctalString(a)); 
			 	 
    }
}














