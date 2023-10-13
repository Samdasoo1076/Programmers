package programmers;

import java.util.*;

public class pro181890 {

	public static void main(String[] args) {
		String[] str = {"u", "u", "l", "r"};
		String[] answer = {};
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("l")) {
				answer = Arrays.copyOfRange(str, 0, i);
			}
			else if(str[i].equals("r")) {
				answer = Arrays.copyOfRange(str, i + 1, str.length);
			}
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");
		}
	}

}
