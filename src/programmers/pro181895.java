package programmers;

import java.util.Arrays;

public class pro181895 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1, 3}, {0, 4}};
		int[] intervals1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
		int[] intervals2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
		
		int[] answer = new int[intervals1.length + intervals2.length];
		
		System.arraycopy(intervals1, 0, answer, 0, intervals1.length);
		System.arraycopy(intervals2, 0, answer, intervals1.length, intervals2.length);

		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ",");
		}
	}

}