package programmers;

public class pro120896 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		String answer = "";
		char[] alphabet = new char[26];
		
		for(int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i) - 97]++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == 1) {
				sb.append((char) (i + 97));
			}
		}
		answer = sb.toString();
		System.out.println(answer);
	}

}
 