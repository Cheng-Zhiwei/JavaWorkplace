package homework06;

public class BegXYZ {
	

	public static void main(String[] args) {

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
		
//		for(int x=1; x<10; x++) {
//			for(int y=1; y<10; y++) {
//				for(int z=1; z<10; z++) {
//					if(x*100+y*10+z+y*100+z*10+z==632) {
//						System.out.println(x+" "+y+" "+z);
//					}
//				}
//			}
//		}	
	}
}

