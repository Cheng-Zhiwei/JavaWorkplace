package chapter03;

public class MutiplyTable {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) { //iѭ��9�Σ�ÿ�λ���
			for(int j=1; j<=i; j++) { //i���ڼ���j��ѭ������
				System.out.print(j+"*"+i+" ");
			}
			System.out.println(); //����
		}

	}
}
