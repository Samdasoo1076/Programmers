package programmers;

public class pro12943 {

	public static void main(String[] args) {
		long n = 6;
		int answer = 0;
		while(n  != 1) {
			if(answer == 500) {
				answer = -1;
				break;
			}
			if(n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
				
			}
			answer++;
		}
		System.out.println(answer);
	}

}
