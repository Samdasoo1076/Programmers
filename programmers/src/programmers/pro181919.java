package programmers;

import java.util.ArrayList;

public class pro181919 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		int n = 10;
		array.add(n);
		do {
			if(n % 2 == 0) {
				n /= 2;
				array.add(n);
			} else {
				n = 3 * n + 1;
				array.add(n);
			}
			
		} while (n != 1);
			int[] answer = new int[array.size()];
			for(int i = 0; i < answer.length; i++) {
				answer[i] = (int)array.get(i);
				System.out.println(answer[i]);
			}
		
		
		
	}

}
