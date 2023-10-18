package programmers;

public class pro12926 {

	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		String answer = "";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				answer += ch;
				continue;
			}
			if(Character.isLowerCase(ch)) {
				answer += (char) ((ch - 'a' + n) % 26 + 'a');
			} else if(Character.isUpperCase(ch)) {
				answer += (char) ((ch - 'A' + n) % 26 + 'A');
			}
		}
		System.out.print(answer);
	}

}
