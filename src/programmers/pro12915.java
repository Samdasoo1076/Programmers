package programmers;

import java.util.*;

public class pro12915 {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		Arrays.sort(strings);
		String[] answer = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(n, n + 1);
		}
		Arrays.sort(answer);

		List<String> list = new ArrayList<>(Arrays.asList(strings));
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).substring(n, n + 1).equals(answer[i])) {
					answer[i] = list.get(j);
					list.remove(list.get(j));
					break;
				}
			}
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");	
		}
	}

}
