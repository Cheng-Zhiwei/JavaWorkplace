

public class ExampleBigOrSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 2, c = 1;
		
		int tem;
		
		if(a>b) {
			 tem = a;
			a = b;
			b = tem;
		}
		
		if(a>c) {
			 tem = a;
			a = c;
			c = tem;
		}
		
		if(b>c) {
			 tem = b;
			b = c;
			c = tem;
		}
		
		System.out.println(a+" "+b+" "+c);
		
		
		int white =90;
		int faceValue = 90;
		boolean rich = true;

		
		System.out.println(white>80 && faceValue >80 && rich==true ? "the girl is good" : "the girl not the one");

	}

}
