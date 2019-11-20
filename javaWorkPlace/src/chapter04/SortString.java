package chapter04;
import java.util.Arrays;

public class  SortString {
        public static void main(String[] args) {

	String[] strArr = { "#java", "2Applet", "PhP", "Basic", "Math", "ÄãºÃ" };

	Arrays.sort(strArr);

	for (String e : strArr)
		System.out.print(e + "  ");
	}
}

