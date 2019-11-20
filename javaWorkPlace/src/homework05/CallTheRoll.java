package homework05;
import org.apache.commons.lang3.ArrayUtils;


public class CallTheRoll {

	public static void main(String[] args) {
		String[] studentName = {"小明", "小李","小张", "小马", "小王", "小二","小琴", "小东", "小龟", "小蜗"};
		int studentNum = 5;
		int[] studentIndex = new int[studentNum];
	
		for(int i=0; i<studentNum;i++) {
			
			int student = (int) (Math.random()*studentName.length); //注意运算的优先级int为高优先级
			
			if( ArrayUtils.contains(studentIndex, student)){
				i-=1;
			} else {
				studentIndex[i] = student;
				System.out.println(studentName[student]);
			}
		}	
	}	
}

