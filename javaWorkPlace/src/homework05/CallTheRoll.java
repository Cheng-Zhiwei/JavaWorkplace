package homework05;
import org.apache.commons.lang3.ArrayUtils;


public class CallTheRoll {

	public static void main(String[] args) {
		String[] studentName = {"С��", "С��","С��", "С��", "С��", "С��","С��", "С��", "С��", "С��"};
		int studentNum = 5;
		int[] studentIndex = new int[studentNum];
	
		for(int i=0; i<studentNum;i++) {
			
			int student = (int) (Math.random()*studentName.length); //ע����������ȼ�intΪ�����ȼ�
			
			if( ArrayUtils.contains(studentIndex, student)){
				i-=1;
			} else {
				studentIndex[i] = student;
				System.out.println(studentName[student]);
			}
		}	
	}	
}

