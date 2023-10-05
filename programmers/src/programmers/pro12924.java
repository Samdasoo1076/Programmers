package programmers;

public class pro12924 {

	public static void main(String[] args) {
		int n = 15;
		int answer = 1;
		
		for(int i = 1; i <= n / 2; i++) {
			int sum = i;
			for(int j = i + 1; sum < n; j++) {
				sum += j;
			}
			if(sum == n) {
				answer++;
			}
		}
		System.out.print(answer);
	}

}
