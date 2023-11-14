package programmers;

import java.util.*;
public class pro120897 {

	public static void main(String[] args) {
		List<Integer> divisors = new ArrayList<>();
		int n = 24;
		int[] answer = {};
		
		for(int i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				divisors.add(i);
				divisors.add(n / i);
			}
		}
		Collections.sort(divisors);
		answer = divisors.stream().mapToInt(Integer::intValue).distinct().toArray();
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ",");
		}
	}

}
