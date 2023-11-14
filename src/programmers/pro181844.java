package programmers;
import java.util.*;
public class pro181844 {

	public static void main(String[] args) {
		List<Integer> answer = new ArrayList<>();
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		
		for(int i = 0; i < arr.length; i++) {
			answer.add(arr[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[i]) {
					answer.remove(Integer.valueOf(arr[i]));
				}
			}

		}
		System.out.print(answer);
	}

}
