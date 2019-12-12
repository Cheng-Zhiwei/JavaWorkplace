package homework07;


import java.text.ParseException;

/*--------------方法一--------------------*/
// import java.util.Scanner;
// public class Days  {
// public static void main(String[]args){
//     Scanner sc =new Scanner(System.in);
//     System.out.print("请输入年月日（例如2019 1 1）： ");
//     int year=sc.nextInt();
//     int month=sc.nextInt();
//     int day=sc.nextInt();
//     String bissextile = "非闰年";
//     
//     int days=0;
//     switch(month){
//         case 12: days+=30;  //11月
//         case 11: days+=31; //10月
//         case 10: days+=30;
//         case 9: days+=31;
//         case 8: days+=31;
//         case 7: days+=30;
//         case 6: days+=31;
//         case 5: days+=30;
//         case 4: days+=31;
//         case 3:
//             if((year%4==0&&year%100!=0)||(year%400==0)) {
//                 days+=29;
//                 bissextile = "闰年";
//                 }
//             else {
//                 days+=28;
//                 }
//         case 2: days+=31;
//
//         case 1: days+=day;
//     }
//         System.out.print("这是"+year+"年("+bissextile+")的第" + days + "天！");
//         sc.close();
// }
// }
 
/*--------------方法二--------------------*/
 import java.util.Scanner;
 public class Days  {
	 public static void main(String[]args){
	     Scanner sc =new Scanner(System.in);
	     System.out.print("请输入年月日（例如2019 12 19）： ");//分隔符为空格，因此每次接收以空格为分隔
	     int year=sc.nextInt();
	     int month=sc.nextInt();
	     int day=sc.nextInt();
	     String yearType = "非闰年";
	     int days  = 0; 
	     int[] yearArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}; 
	     for(int i=0; i<month-1; i++) {
	    	 days +=yearArr[i];
	     }
	     
         if((year%4==0&&year%100!=0)||(year%400==0)) {
        	days =  month>2 ?  (days + day + 1) : (days + day);

    	     yearType = "闰年";
             } else {
             days = days + day  ;
             }
	     
	         System.out.print("这是"+year+"年("+yearType+")的第" + days + "天！");
	         sc.close();
	 }
 }
 
 /*--------------方法三--------------------*/
 
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Scanner;
// 
// public class Days {
//	 public static void main(String[] args) throws ParseException {
//		 Scanner inputData = new Scanner(System.in);
//		 System.out.print("请输入日期(yyyy-MM-dd): ");
//		 String inputDate = inputData.nextLine();
//		 
//		 Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inputDate); 
////		 String now = new SimpleDateFormat("yyyy年MM月dd日").format(date);
//		 SimpleDateFormat dayFormat = new SimpleDateFormat("现在是yyyy年MM月dd日，是今年的第D天！");
//		 System.out.println(dayFormat.format(date));
//		 
//		 inputData.close();
//		 
//	 }
// }
// 
 
