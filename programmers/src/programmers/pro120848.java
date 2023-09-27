package programmers;

public class pro120848 {

	public static void main(String[] args) {
		int n = 3628800;
		int answer = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(n >= factorial(i)) {
				answer = i;
			} else {
				break;
			}
		}
		
	System.out.print(answer);

	}

	private static int factorial(int number) {
		if(number > 1) return number * factorial(number - 1);
		return 0;
	}

}
