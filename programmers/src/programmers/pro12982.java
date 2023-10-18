package programmers;

import java.util.*;
public class pro12982 {

	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		int answer = 0;
		
		int total = 0;
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			if(total + d[i] <= budget) {
				total += d[i];
				answer++;
			}
		}
		System.out.print(answer);
	}

}
