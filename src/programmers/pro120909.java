package programmers;

public class pro120909 {

	public static void main(String[] args) {
		int n = 144;
		int answer = 0;
		if(Math.sqrt(n) % 1 == 0) {
			answer = 1;
		} else {
			answer = 2;
		}
			System.out.println(answer);
	}

}
