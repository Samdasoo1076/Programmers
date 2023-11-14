package programmers;

public class pro12954 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int num = x;
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i]=x*((long)i+1);
		}
		System.out.println(answer[4]);
	}

}
