package programmers;

import java.util.*;

public class pro181894 {

	public static void main(String[] args) {
		List<Integer> index = new LinkedList<>();
		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		int[] answer= new int[arr.length - 1];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				index.add(i);
			}
		}
		if(index.size() == 0) {
			answer = new int[] {-1};
		}
		int startIndex = index.get(0);
		int endIndex = index.get(index.size() -1);
		answer = Arrays.copyOfRange(arr, startIndex, endIndex + 1);
		
		for(int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + ",");
		}
	}

}
