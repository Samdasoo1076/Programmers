package programmers;

public class PRO120815 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		for(int i = 1; i <= 6 * n; i++) {
			if(6 * i % n == 0) {
					answer = i;
					break;
			}
		}
		System.out.println(answer);

	}

}
