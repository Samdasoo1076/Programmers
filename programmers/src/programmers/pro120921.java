package programmers;

public class pro120921 {

	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		int answer = 0;
		String copy = A;
		
		for(int i = 0; i < A.length(); i++) {
			if(copy.equals(B)) {
				answer = 0;
			}
			
			String a = copy.substring(copy.length() - 1);
			String b = copy.substring(0, copy.length() - 1);
			answer++;
		}
		answer = -1;
		
		System.out.print(answer);
	}

}
