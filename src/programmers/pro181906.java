package programmers;

public class pro181906 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";
		int answer = 0;
		
		if(my_string.startsWith(is_prefix)) {
			answer = 1;
		} else {
			answer = 0;
		}
			System.out.println(answer);
	}

}
