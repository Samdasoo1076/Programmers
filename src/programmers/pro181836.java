package programmers;
import java.util.*;
public class pro181836 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k = 2;
		
		int size = picture.length;
		String[] answer = new String[k * size];
		
		for(int i = 0; i < k * size; i++) {
			if(i % k != 0) {
				answer[i] = answer[i - 1];
				continue;
			}
			StringBuilder sb = new StringBuilder();
			
			for(int j = 0; j < k * picture[i / k].length(); j++) {
				sb.append(picture[i / k].charAt(j / k));
			}
			answer[i] = sb.toString();
		}
		
		for(int i = 0; i < answer.length; i++) {
		System.out.println(answer[i]);
		}

	}

}
