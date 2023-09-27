package programmers;
import java.util.*;
public class pro181855 {

	public static void main(String[] args) {
		Map<Integer, Integer> group = new HashMap<>();
		String[] strArr = {"a","bc","d","efg","hi"};
		int answer = 0;
		
		for(String str : strArr) {
			int length = str.length();
			group.put(length, group.getOrDefault(length, 0) + 1);
		}
		
		int max = 0;
		
		for(int count : group.values()) {
			if(count > max) {
				max = count;
			}
		}
		answer = max;
		System.out.print(answer);

	}

}
