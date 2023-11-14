package programmers;

public class pro120892 {

	public static void main(String[] args) {
		String answer = "";
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		for(int i = code - 1; i < cipher.length(); i += code) {
			answer += cipher.charAt(i);
		}
		System.out.println(answer);
	}

}
