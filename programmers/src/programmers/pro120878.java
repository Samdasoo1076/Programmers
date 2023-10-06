package programmers;

import java.util.*;

public class pro120878 {

	public static void main(String[] args) {
		int a = 7;
		int b = 20;
		int num = 0;
		int answer = 0;
		
		for(int i = 2; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				num = i;
			}
		}
		if(num != 0) {
			b /= num;
		}
		
		List<Integer> numArr = new ArrayList<Integer>();
		
		for(int i = 2; i < 1000; i++) {
			if(b % i == 0) {
				numArr.add(i);
				b /= i;
				i--;
				if(b < 2 ) 
				break;
			}
		}
		
		numArr.removeIf(value -> value == 2 || value == 5);
		if(numArr.size() == 0) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.print(answer);
	}

}
