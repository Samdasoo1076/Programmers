package programmers;
import java.util.*;
public class pro181852 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int r = 5;
		List<Integer> answer = new ArrayList<>();
		Arrays.sort(num_list);
		for(int i = r; i < num_list.length; i++) {
			answer.add(num_list[i]);
			System.out.print(answer + ",");
		}
	}

}
