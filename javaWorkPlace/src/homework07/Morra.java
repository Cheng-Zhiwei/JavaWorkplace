 /**
  * @author jacksons
  * �˺͵��Էֱ��������ʯͷ������ֱ����սʤ���ԣ���Ϸ����
  */
package homework07;
 import java.util.Scanner;
 
// public class Morra  {
//     public static void main(String[] args) {
//    	 int count = 1;
//         while (true) {
//             System.out.println("--------��ʼ��"+count+"�ֲ�ȭ��Ϸ--------");
//             System.out.print("���ȭ:��1-������2-ʯͷ��3-����:");
//             Scanner inputData=new Scanner(System.in);
//             int person=inputData.nextInt(); //��ȡ�û�����
//             int computer=(int) (Math.random()*3)+1; //���������ȭ
//             String per="�û�";
//             String com = "����";
//             //�û���ȭ
//             switch(person){
//                 case 1:
//                     per="����";
//                     break;
//                 case 2:
//                     per="ʯͷ";
//                     break;
//                 case 3:
//                     per="��";
//                     break;
//             }
//             
//             //���Գ�ȭ
//             switch(computer){
//                 case 1:
//                     com="����";
//                     break;
//                 case 2:
//                     com="ʯͷ";
//                     break;
//                 case 3:
//                     com="��";
//                     break;
//             }
//
//             //���ݳ�ȭ�ж���Ӯ
//             if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1) {
//                 System.out.println("������ǣ�"+per+"�� ���Գ����ǣ�"+com+"��");
//                 System.out.println("       �������ˣ�����һ�Σ���");
//             
//             } else if (person==computer) {
//                 System.out.println("������ǣ�"+per+"�� ���Գ����ǣ�"+com+"��");
//                 System.out.println("       ��ƽ�֣�����һ�ΰɡ�");
//               
//             } else {
//                 System.out.println("������ǣ�"+per+"�� ���Գ����ǣ�"+com+"��");
//                 System.out.println("       ����ϲ��Ӯ�ˣ���Ϸ��������");
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
             System.out.println("--------��ʼ��"+count+"�ֲ�ȭ��Ϸ--------");
             System.out.print("���ȭ:��������ʯͷ������: ");
             Scanner inputData=new Scanner(System.in);
             String person=inputData.next(); 
             String computer = "";
             String[] cpuArray = {"����", "ʯͷ", "��"};
             int cpu=(int) (Math.random()*3);
         
             for(int i=0; i<cpuArray.length; i++) {
            	 if(i==cpu) {
            		 computer = cpuArray[i];
            		 break;
            	 }
             }

             System.out.println("��Ϸ���飺������ǣ�"+person+"���� ���Գ����ǣ�"+computer+"����");
             if(person.equals("����")&&computer.equals("ʯͷ") || person.equals("ʯͷ")&&computer.equals("��") || person.equals("��")&&computer.equals("����")) {
                 System.out.println("��Ϸ����������ˣ�����һ�Σ�");
             } else if (person.equals(computer)) {
                 System.out.println("��Ϸ�����ƽ�֣�����һ�ΰ�");
             } else {
                 System.out.println("��Ϸ�������ϲ��Ӯ�ˣ���Ϸ������");
                 break;
             }
             count+=1;
         }
     }
 }

