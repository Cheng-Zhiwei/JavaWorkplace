package homework07;

public class MonkeyEatPeach  {
	public static void main(String[] args) {
	int x = 1;  //猴子第15天桃子的数量

	for(int i=2; i<=10; i++) {
		x = (x+1)*2;
	}
	System.out.println("猴子第一天摘了 " + x + " 个桃子");
	}
}
