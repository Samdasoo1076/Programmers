package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class pro120847 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int answer = 0;
		int max = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] * numbers[j] > max) {
					max = numbers[i] * numbers[j];
				}
			}
		}
		answer = max;
		System.out.println(answer);
	}

}
