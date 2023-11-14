package programmers;

public class pro181843 {

	public static void main(String[] args) {
		int answer = 0;
		String my_string = "banana";
		String target = "ana";
		
		if(my_string.contains(target)) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);
	}

}
