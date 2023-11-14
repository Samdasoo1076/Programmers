package programmers;

public class pro120843 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int k = 2;
		int answer = 0;
		
		answer = numbers[2 * (k - 1) % numbers.length];
		System.out.print(answer);

	}

}
