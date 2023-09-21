package programmers;

public class pro12934 {

	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		Double x = Math.sqrt(n);
		if(x == x.intValue()) {
			answer = (long) Math.pow(x + 1, 2);
		} else {
			answer = -1;
		}
		System.out.println(answer);

	}

}
