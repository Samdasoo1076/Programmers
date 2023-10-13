package programmers;

public class pro68935 {

	public static void main(String[] args) {
		int n = 45;
		String a = "";
		int answer = 0;
		while(n > 0) {
			a = (n % 3) + a;
			n /= 3;
			a = new StringBuilder(a).reverse().toString();
			answer = Integer.parseInt(a, 3);
		}
	
		System.out.println(answer);

	}

}
