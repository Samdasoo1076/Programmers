package programmers;
import java.util.*;
public class pro181888 {

	public static void main(String[] args) {
		List<Integer> answer = new ArrayList<>();
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;	
		for(int i = 0; i < num_list.length; i+=n) {
			answer.add(num_list[i]);
		}
		System.out.print(answer);
	}

}
