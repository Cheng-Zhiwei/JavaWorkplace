package chapter05;

public class MethodValueTrainsmit {

	/*
	 * �βδ���һ�����ڴ����洢ʵ�δ��ݵ�ֵ�� 
	 * ������߻���Ӱ��
	 */
	public void swap(int a, int b) {
		int tem = a;
		a = b;
		b = tem;
		System.out.println("a=" + a + "; b=" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodValueTrainsmit mit = new MethodValueTrainsmit();
		int a = 1, b = 2;
		mit.swap(a, b);

		// ����ӡ����ֵ����ԭ����ֵ
		System.out.println("a=" + a + ", b=" + b);

	}

}
