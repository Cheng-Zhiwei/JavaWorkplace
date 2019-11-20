package chapter05;

public class MethodValueTrainsmit {

	/*
	 * 形参创建一份新内存来存储实参传递的值， 
	 * 因此两者互不影响
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

		// ，打印出来值还是原来的值
		System.out.println("a=" + a + ", b=" + b);

	}

}
