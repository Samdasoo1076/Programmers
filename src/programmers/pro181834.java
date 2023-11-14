package programmers;

public class pro181834 {

	public static void main(String[] args) {
		String myString = "abcdevwxyz";
		String answer = "";
		
		answer = myString.replaceAll("[a-k]", "l");
		System.out.println(answer);
	}

}
