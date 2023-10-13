package programmers;
import java.util.*;
public class pro12906 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int value = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != value) {
				list.add(arr[i]);
				value = arr[i];
			}
		}
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		for(int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + ", ");
		}
	}

}
