package programmers;

public class pro120813 {

	public static void main(String[] args) {
		int[] answer;
		int k = 0;
		int n = 10;
		if (n % 2 == 0) {
			answer = new int[n / 2];
		} else {
			answer = new int[n / 2 + 1];
		}
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 1) {
				answer[k] = i;
				k++;
			}	
		}
		System.out.println(answer);
	}

}
