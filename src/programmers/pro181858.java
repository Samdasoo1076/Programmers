package programmers;
import java.util.*;
public class pro181858 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = {0, 1, 1, 2, 2, 3};
		int k = 3;
		int[] answer = {};
		for(int i = 0; i < arr.length; i++) {
			if(list.size() == k) {
				break;
			}
			else if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		while(list.size() < k) {
			list.add(-1);
		}
		answer = list.stream().mapToInt(x -> x).toArray();
		for(int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + ", ");
		}
	}

}
