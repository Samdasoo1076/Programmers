package programmers;

public class pro12940 {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int a = Math.max(n, m);
		int b = Math.min(n, m);

		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		int[] answer = {a, n * m/ a};
		System.out.print(answer[0] + ",");
		System.out.print(answer[1]);
	}

}
