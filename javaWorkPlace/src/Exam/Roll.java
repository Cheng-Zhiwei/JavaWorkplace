package Exam;

public class Roll {
	
	public static void main(String args[]){
	    for (int i=1;i<100 ;i++ )
		    if (  i%3==2&&i%7==6&&i%5==1) {
			   System.out.println("这个班共有"+i+"人");
			   break;
		    }
	}

}
