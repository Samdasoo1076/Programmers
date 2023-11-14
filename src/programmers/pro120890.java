package programmers;

import java.util.Arrays;

public class pro120890 {

	public static void main(String[] args) {
		int[] array = {3, 10, 28};
		int n = 20;
		int answer = 0;
		
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= n) {
				int leftValue = n - array[(i - 1)];
				int rightValue = array[i] - n;
				answer = leftValue <= rightValue ? array[(i - 1)] : array[i];
			}
		}
			answer = array[array.length - 1];
			
			System.out.println(answer);
	}

}
