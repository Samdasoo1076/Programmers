package programmers;

public class pro142086 {

	public static void main(String[] args) {
		String s = "banana";
		int[] answer = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j >= 0; j--) {
				 if(s.charAt(i) == s.charAt(j) && answer[i] == 0) {
					 answer[i] = i - j;
				 }
			}
			if(answer[i] == 0) {
				answer[i] = -1;
			}
		}
		for(int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + ", ");
		}
	}

}
