package programmers;

public class pro181849 {

	public static void main(String[] args) {
		String num_str = "123456789";
		int answer = 0;
		
		for(int i = 0; i < num_str.length(); i++) {
			answer += Integer.parseInt(num_str.substring(i, i+1));
		}
		
		System.out.println(answer);
	}

}
