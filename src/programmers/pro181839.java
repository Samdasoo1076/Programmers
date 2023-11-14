package programmers;

public class pro181839 {

	public static void main(String[] args) {
		int answer = 0;
		int a = 6;
		int b = 1;
		
		 if (a % 2 != 0 && b % 2 != 0) {
	            answer = (a * a) + (b * b);
	        } else if (a % 2 == 0 && b % 2 == 0) {
	            answer = Math.abs(a - b);
	        } else {
	            answer = 2 * (a + b);
	        }
		System.out.println(answer);
	}

}
