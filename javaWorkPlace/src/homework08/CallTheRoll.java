package homework08;
import java.util.Scanner;
import java.util.Arrays;

public class CallTheRoll {
	public static void main(String[] args) {
		System.out.println("=========开始随机抽取=========-");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入抽取学生姓名的数量： ");
		int studentNum = input.nextInt();
		System.out.println("抽取的结果如下：");
		String [] studentName= {"毛远名","彭颜","胡勋杰","刘金龙","胡杨","袁粒桓","周于然","王宏江",
				"秦松松","邓彪","李满春","程建军","何智文","卢姚","张函涔","李松","习洋硕","叶鑫宇","周芮欣",
				"张韩丹","何全方","李梅","施艺","蔺思钰","罗洁","周红","刘楹寅","易思思","王禧莲","伍亚兰",
				"熊明雪","朱京花","谭小梅","彭丹","文静怡","刘柳亭","周昱杉","廖佳星","蒋诗佳","涂渝"};
		
		int[] indexArray = new int[studentNum];
		Arrays.fill(indexArray, studentName.length+1);
		
		for(int i=0; i<studentNum;i++) {
			int student = (int) (Math.random()*studentName.length);

			for(int j=0; j<indexArray.length; j++) {
				if(indexArray[j]==student) {
					i -=1;
					break;
				}
				if(j==indexArray.length-1) {
					indexArray[i] = student;
					System.out.print(studentName[student]+" ");
				}	
			}
		}	
		input.close();
	}
}