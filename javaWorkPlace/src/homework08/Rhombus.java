package homework08;


public class Rhombus   {
	public static void main(String[] args) {
		
		int starLine = 5 ;   //�ı�starLine��ֵ������ͬ��Ч��
		
		// 1 ����ϰ벿��
		for (int i = 1; i <= starLine; i++) {
			// 1.1 ����հײ���
			for (int j = 1; j <= starLine - i; j++) {
				System.out.print(" ");
			}
			// 1.2 ���*
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2 ����°벿��
		for (int i = 1; i <= starLine - 1; i++) {
			// 2.1 ����ո�
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// 2.2 ���*
			for (int k = 1; k <= (-2 * i + 2 * starLine - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
