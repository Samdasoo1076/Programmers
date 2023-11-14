package programmers;

import java.util.Arrays;

public class pro42576 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0 ; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
			}
		}
			System.out.print(answer);
	}

}
