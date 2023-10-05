package programmers;
import java.util.*;
public class pro120852 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		int n = 12;
		
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
				if(!list.contains(i)) {
					list.add(i);
					
				}
				n /= i;
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");
		}

	}

}
