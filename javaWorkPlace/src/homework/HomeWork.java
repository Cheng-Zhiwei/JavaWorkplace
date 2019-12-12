package homework;

import homework.HomeWork02.Point; //ʹ���ڲ���ʱ�ȵ���,�����ǲ���public ��֮ǰҪ��import
import homework03.SumInt;; //

class HomeWork02 {
	static void calculateCircle(double  radius) {
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("Բ���ܳ�Ϊ"+perimeter+"\nԲ�����Ϊ"+area);
	}
	
	static void calculateDistance(double[] x1, double[] x2) {
		x1 = new double[3];
		x2 = new double[3]; 
		double distance = Math.pow(Math.pow((x1[0]-x2[0]), 2)+
				Math.pow((x1[1]-x2[1]), 2)+Math.pow((x1[2]-x2[2]), 2),0.5);
		System.out.println("�����ľ���Ϊ"+distance);
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
			System.out.println("����֮��ľ���Ϊ��"+distance);
			return distance;
		}
	}
		
	static void calculateDistance2(Point p1, Point p2) {
		System.out.println("�����ľ���Ϊ"+p1.pointDistance(p2));
	}
}


class HomeWork03{
	static void exchageValue(int a, int b) {
		int tem = a;
		a = b;
		b = tem;
		System.out.println("a��b��ֵ������a="+a+", b="+b);
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
			System.out.println("�������ǻ�������");
		} else {
			for(int i=0; i<digitsArray.length/2; i++) {
				if(digitsArray[i]!=digitsArray[digitsArray.length-i-1]) {
					flag = false;
				}
			}
			if(flag)
				System.out.println("�����ǻ�������");
			else 
				System.out.println("�������ǻ�������");
		}
	}
	
	static void  equationSolution(int a, int b, int c) {
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta>0) {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.println("�÷�����������: x1="+x1+", x2="+x2);
		} else if(delta==0) {
			double x = -b/2*a; 
			System.out.println("�÷�����һ����: x="+x);
		} else if(delta<0) {
			System.out.println("�÷���û�и�");
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
			fn = f2 + f1; //�ӵ�3���¿�ʼ�й���
			f1 = f2;
			f2 = fn;
		}
		System.out.println("��"+n+"�������ӵĶ���Ϊ"+fn);
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
//		Point p2 = h.new Point(2,2,2);//�ڲ���ĳ�ʼ����ʽ���ȳ�ʼ���ⲿ��
//		p1.pointDistance(p2);
		
//		HomeWork03.exchageValue(1, 2);
//		HomeWork03.sumInt(123);
//		HomeWork03.yearDay(12345);
	
//		HomeWork04.daffodilNumber(10);
//		HomeWork04.equationSolution(1,2,1);
		
		HomeWork05.rabbitNumber(5);
		
		
		
		
		
	}
}



