package programmers;

public class pro181874 {

	public static void main(String[] args) {
		String myString = "abstract algebra";
		String answer = "";
		myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
		answer = myString;
		System.out.println(answer);
	}

}
