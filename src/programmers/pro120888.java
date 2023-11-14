package programmers;

public class pro120888 {

	public static void main(String[] args) {
		String my_string = "people";
		String answer = "";

		for(int i = 0; i < my_string.length(); i++) {
			if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
				answer += my_string.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
