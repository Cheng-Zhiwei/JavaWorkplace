package homework07;


import java.text.ParseException;

/*--------------����һ--------------------*/
// import java.util.Scanner;
// public class Days  {
// public static void main(String[]args){
//     Scanner sc =new Scanner(System.in);
//     System.out.print("�����������գ�����2019 1 1���� ");
//     int year=sc.nextInt();
//     int month=sc.nextInt();
//     int day=sc.nextInt();
//     String bissextile = "������";
//     
//     int days=0;
//     switch(month){
//         case 12: days+=30;  //11��
//         case 11: days+=31; //10��
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
//                 bissextile = "����";
//                 }
//             else {
//                 days+=28;
//                 }
//         case 2: days+=31;
//
//         case 1: days+=day;
//     }
//         System.out.print("����"+year+"��("+bissextile+")�ĵ�" + days + "�죡");
//         sc.close();
// }
// }
 
/*--------------������--------------------*/
 import java.util.Scanner;
 public class Days  {
	 public static void main(String[]args){
	     Scanner sc =new Scanner(System.in);
	     System.out.print("�����������գ�����2019 12 19���� ");//�ָ���Ϊ�ո����ÿ�ν����Կո�Ϊ�ָ�
	     int year=sc.nextInt();
	     int month=sc.nextInt();
	     int day=sc.nextInt();
	     String yearType = "������";
	     int days  = 0; 
	     int[] yearArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}; 
	     for(int i=0; i<month-1; i++) {
	    	 days +=yearArr[i];
	     }
	     
         if((year%4==0&&year%100!=0)||(year%400==0)) {
        	days =  month>2 ?  (days + day + 1) : (days + day);

    	     yearType = "����";
             } else {
             days = days + day  ;
             }
	     
	         System.out.print("����"+year+"��("+yearType+")�ĵ�" + days + "�죡");
	         sc.close();
	 }
 }
 
 /*--------------������--------------------*/
 
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Scanner;
// 
// public class Days {
//	 public static void main(String[] args) throws ParseException {
//		 Scanner inputData = new Scanner(System.in);
//		 System.out.print("����������(yyyy-MM-dd): ");
//		 String inputDate = inputData.nextLine();
//		 
//		 Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inputDate); 
////		 String now = new SimpleDateFormat("yyyy��MM��dd��").format(date);
//		 SimpleDateFormat dayFormat = new SimpleDateFormat("������yyyy��MM��dd�գ��ǽ���ĵ�D�죡");
//		 System.out.println(dayFormat.format(date));
//		 
//		 inputData.close();
//		 
//	 }
// }
// 
 
