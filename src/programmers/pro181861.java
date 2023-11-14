package programmers;
import java.util.*;
public class pro181861 {

	public static void main(String[] args) {
		List<Integer> answer = new ArrayList<>();
		int[] arr = {5, 1, 4};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				answer.add(arr[i]);
			}
		}
		System.out.print(answer);
	}

}
