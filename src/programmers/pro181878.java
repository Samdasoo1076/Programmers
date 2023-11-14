package programmers;

public class pro181878 {

	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		myString = myString.toLowerCase();
        pat = pat.toLowerCase();
		int answer = 0;
		
		if(myString.contains(pat)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		System.out.println(answer);

	}

}
