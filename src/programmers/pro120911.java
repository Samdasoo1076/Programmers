package programmers;

import java.util.Arrays;

public class pro120911 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		my_string = my_string.toLowerCase();
		char[] ChaArr = my_string.toCharArray();
		Arrays.sort(ChaArr);
		
		String answer = new String(ChaArr);
		
		System.out.print(answer);
	}

}
