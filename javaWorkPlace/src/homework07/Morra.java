 /**
  * @author jacksons
  * 人和电脑分别出剪刀、石头、布，直到人战胜电脑，游戏结束
  */
package homework07;
 import java.util.Scanner;
 
// public class Morra  {
//     public static void main(String[] args) {
//    	 int count = 1;
//         while (true) {
//             System.out.println("--------开始第"+count+"局猜拳游戏--------");
//             System.out.print("请出拳:（1-剪刀，2-石头，3-布）:");
//             Scanner inputData=new Scanner(System.in);
//             int person=inputData.nextInt(); //获取用户输入
//             int computer=(int) (Math.random()*3)+1; //电脑随机出拳
//             String per="用户";
//             String com = "电脑";
//             //用户出拳
//             switch(person){
//                 case 1:
//                     per="剪刀";
//                     break;
//                 case 2:
//                     per="石头";
//                     break;
//                 case 3:
//                     per="布";
//                     break;
//             }
//             
//             //电脑出拳
//             switch(computer){
//                 case 1:
//                     com="剪刀";
//                     break;
//                 case 2:
//                     com="石头";
//                     break;
//                 case 3:
//                     com="布";
//                     break;
//             }
//
//             //根据出拳判断输赢
//             if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1) {
//                 System.out.println("你出的是（"+per+"） 电脑出的是（"+com+"）");
//                 System.out.println("       【你输了！再来一次！】");
//             
//             } else if (person==computer) {
//                 System.out.println("你出的是（"+per+"） 电脑出的是（"+com+"）");
//                 System.out.println("       【平局！再来一次吧】");
//               
//             } else {
//                 System.out.println("你出的是（"+per+"） 电脑出的是（"+com+"）");
//                 System.out.println("       【恭喜你赢了！游戏结束！】");
//                 break;
//             }
//             count+=1;
//         }
//     }
// }

 
 public class Morra  {
     public static void main(String[] args) {
    	 int count = 1;
         while (true) {
             System.out.println("--------开始第"+count+"局猜拳游戏--------");
             System.out.print("请出拳:（剪刀，石头，布）: ");
             Scanner inputData=new Scanner(System.in);
             String person=inputData.next(); 
             String computer = "";
             String[] cpuArray = {"剪刀", "石头", "布"};
             int cpu=(int) (Math.random()*3);
         
             for(int i=0; i<cpuArray.length; i++) {
            	 if(i==cpu) {
            		 computer = cpuArray[i];
            		 break;
            	 }
             }

             System.out.println("游戏详情：你出的是（"+person+"）， 电脑出的是（"+computer+"）！");
             if(person.equals("剪刀")&&computer.equals("石头") || person.equals("石头")&&computer.equals("布") || person.equals("布")&&computer.equals("剪刀")) {
                 System.out.println("游戏结果：你输了！再来一次！");
             } else if (person.equals(computer)) {
                 System.out.println("游戏结果：平局！再来一次吧");
             } else {
                 System.out.println("游戏结果：恭喜你赢了！游戏结束！");
                 break;
             }
             count+=1;
         }
     }
 }

