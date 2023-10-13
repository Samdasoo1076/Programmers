package programmers;

public class pro120846 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			int rs = 0;
			for(int j = 1; j <= i; j++) {
				rs += (i % j == 0) ? 1 : 0;
			}
			answer += (rs >= 3) ? 1 : 0;
		}
		System.out.print(answer);
	}

}
