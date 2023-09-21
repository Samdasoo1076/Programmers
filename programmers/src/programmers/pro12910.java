package programmers;

import java.util.*;

public class pro12910 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			} else {
				continue;
			}
		}
		Collections.sort(list);
		int[] answer = new int[list.size()];
		
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			for(int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
				System.out.print(answer[i]+ ",");
			}	
		}
	
	}

}
