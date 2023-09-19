package programmers;

import java.util.Arrays;

public class pro120897 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 8, 12, 24};
		int answer = 0;
		int rs = 0;
		Arrays.sort(arr);
		for(int i : arr) {
			rs = i;
		}
		System.out.println(rs);

	}

}
