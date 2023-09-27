package programmers;

public class pro181871 {

	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		int answer = 0;
		int Idx = pat.length();
		
		for(int i = 0; i <= myString.length() - pat.length(); i++) {
			if(myString.substring(i, Idx).contains(pat)) {
				answer++;
				Idx++;
			}
		}
		System.out.print(answer);
	}

}
