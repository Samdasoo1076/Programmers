package programmers;

import java.util.Arrays;

public class pro120862 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, -3, 4, -5};
		int answer = 0;
		Arrays.sort(numbers);
		
		int num1 = numbers[0] * numbers[1];
		int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		
		if(num1 < num2) {
			answer = num2;
		} else {
			answer = num1;
		}
		
		System.out.println(answer);

	}

}
