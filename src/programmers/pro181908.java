package programmers;

public class pro181908 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_suffix = "ana";
		int answer = 0;
		
		if(my_string.endsWith(is_suffix)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		System.out.println(answer);
	}

}
