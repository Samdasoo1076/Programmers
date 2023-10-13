package programmers;

import java.util.*;

public class pro12941 {

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0; i < A.length; i++) {
			answer = answer + (A[i] * B[A.length - i - 1]);
		}
		System.out.print(answer);
	}

}
