package programmers;

public class pro181903 {

	public static void main(String[] args) {
		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";
		
		StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i < code.length(); i++) {
			if(i % q == r) {
				answer.append(code.charAt(i));
			}
		}

		System.out.print(answer.toString());

	}

}
