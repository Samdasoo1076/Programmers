package programmers;

public class pro181872 {

	public static void main(String[] args) {
		String myString = "AbCdEFG";
		String pat = "dE";
		String answer = "";
		
		int pl = pat.length();
		int ml = myString.length();
		
		for(int i = ml - 1; i >= 0; i--) {
			String substr = myString.substring(0, i + 1);
			if(substr.endsWith(pat)) {
				answer = substr;
				break;
			}
		}
			System.out.print(answer);
	}

}
