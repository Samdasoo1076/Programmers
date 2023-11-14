package programmers;
import java.util.*;
public class pro181860 {

	public static void main(String[] args) {
		List<Integer> X = new ArrayList<>();
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		
		for(int i = 0; i < arr.length; i++) {
			if(flag[i]) {
				int num = arr[i];
				for(int j = 0; j < num * 2; j++) {
					X.add(num);
				}
			} else {
				int num = arr[i];
				int size = X.size();
				if(size >= num) {
					for(int j = 0; j < num; j++) {
						X.remove(size - 1 - j);
					}
				}
			}
		}
		int[] answer = new int[X.size()];
		for(int i = 0; i < X.size(); i++) {
			answer[i] = X.get(i);
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ",");
		}
	}

}
