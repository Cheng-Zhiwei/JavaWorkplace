package homework;

import homework.HomeWork02.Point; //使用内部类时先导入,无论是不是public 用之前要先import
import homework03.SumInt;; //

class HomeWork02 {
	static void calculateCircle(double  radius) {
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("圆的周长为"+perimeter+"\n圆的面积为"+area);
	}
	
	static void calculateDistance(double[] x1, double[] x2) {
		x1 = new double[3];
		x2 = new double[3]; 
		double distance = Math.pow(Math.pow((x1[0]-x2[0]), 2)+
				Math.pow((x1[1]-x2[1]), 2)+Math.pow((x1[2]-x2[2]), 2),0.5);
		System.out.println("两点间的距离为"+distance);
	}
	
	public class Point {
		double x;
		double y;
		double z;
		
		Point(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public double pointDistance(Point p) {
			double distance = Math.pow(Math.pow((this.x-p.x), 2) +
					Math.pow((this.y-p.y), 2)+Math.pow((this.z-p.z), 2), 0.5);
			System.out.println("两点之间的距离为："+distance);
			return distance;
		}
	}
		
	static void calculateDistance2(Point p1, Point p2) {
		System.out.println("两点间的距离为"+p1.pointDistance(p2));
	}
}


class HomeWork03{
	static void exchageValue(int a, int b) {
		int tem = a;
		a = b;
		b = tem;
		System.out.println("a和b的值交换后，a="+a+", b="+b);
	}
	
	static int[] sumInt(int number) {
		String s = ""+number;
		int n = s.toCharArray().length;
		int[] digitsArr = new int[n];
		for(int i=0; i<n; i++) {
			int digits = number%10;
			number/=10;
			digitsArr[i] = digits;
		}
		return digitsArr;
	}
	
	static void yearDay(int mintues ) {
		int days=mintues/60/24;
		int years=days/365;
		days=days%365;
		System.out.println(years+" years and "+days+" days");
	}
}


class HomeWork04{
	
	static void daffodilNumber(int number) {
		int[] digitsArray = HomeWork03.sumInt(number);
		boolean flag = true;
		if(digitsArray.length==1) {
			System.out.println("该数不是回文数！");
		} else {
			for(int i=0; i<digitsArray.length/2; i++) {
				if(digitsArray[i]!=digitsArray[digitsArray.length-i-1]) {
					flag = false;
				}
			}
			if(flag)
				System.out.println("该数是回文数！");
			else 
				System.out.println("该数不是回文数！");
		}
	}
	
	static void  equationSolution(int a, int b, int c) {
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta>0) {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.println("该方程有两个根: x1="+x1+", x2="+x2);
		} else if(delta==0) {
			double x = -b/2*a; 
			System.out.println("该方程有一个根: x="+x);
		} else if(delta<0) {
			System.out.println("该方程没有根");
		}
	}
}

class HomeWork05 {
	
	static void numberRank(int x, int y, int z) {
		int tem;
		if(x<y) {
			tem = x;
			x = y;
			y = tem;
		}
		if(x<z) {
			tem = x;
			x = z;
			z = tem;
		}
		if(y<z) {
			tem = y;
			y = z;
			z = tem;
		}
	}
	
	static void rabbitNumber(int n) {
		int f1 = 1, f2 =1, fn=1;;
		for (int i=3;i<=n; i++) {
			fn = f2 + f1; //从第3个月开始有规律
			f1 = f2;
			f2 = fn;
		}
		System.out.println("第"+n+"个月兔子的对数为"+fn);
	}
	
}


class HomeWork06 {
	static void calculateXYZ() {
		while(true) {
			int X =  (int) (Math.random()*9+1);
			int Y =  (int) (Math.random()*9+1);
			int Z =  (int) (Math.random()*9+1);
			int num01 =X*100+Y*10+Z;
			int num02 = Y*100+Z*10+Z;
			if(num01+num02==678) {
				System.out.println(num01+"+"+num02+"="+678);
				System.out.println("X="+X+", Y="+Y+", Z="+Z);
				break;
			}
		}
	}
	
	
	
}
	


class HomeWork07 {
	
}

class HomeWork08 {
	
}

public class HomeWork {
	
	public static void main(String[] args) {
//		double[] x1 = {1,1,1};
//		double[] x2 = {1,1,1};
//		HomeWork02.calculateDistance(x1, x2);	
//		HomeWork02 h = new HomeWork02();
//		Point p1 = h.new Point(1,1,1);
//		Point p2 = h.new Point(2,2,2);//内部类的初始化方式，先初始化外部类
//		p1.pointDistance(p2);
		
//		HomeWork03.exchageValue(1, 2);
//		HomeWork03.sumInt(123);
//		HomeWork03.yearDay(12345);
	
//		HomeWork04.daffodilNumber(10);
//		HomeWork04.equationSolution(1,2,1);
		
		HomeWork05.rabbitNumber(5);
		
		
		
		
		
	}
}



