package ClassAndObject;


class Drawing {
	public void Drawing() {}
	void draw() {;
	}
}

class Cycle extends Drawing{
	void draw() {
		System.out.println("我在画圆！");
	}
}

class mat extends Drawing{
	void draw() {
		System.out.println("我在画矩形！");
	}
}

class SanJiao extends Drawing{
	void draw() {
		System.out.println("我在画三角！");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
