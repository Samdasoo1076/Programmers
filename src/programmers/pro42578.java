package programmers;
import java.util.*;

public class pro42578 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, 
		                      {"blue_sunglasses", "eyewear"}, 
		                      {"green_turban", "headgear"}};
		int answer = 1;
		HashMap<String, Integer> clothesmap = new HashMap<String, Integer>();
		
		for(int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];
			if(!clothesmap.containsKey(key)) {
				clothesmap.put(key, 1);
			} else {
				clothesmap.put(key, clothesmap.get(key) + 1);
			}
		}
		
		Iterator<Integer> iter = clothesmap.values().iterator();
		
		while(iter.hasNext()) {
			answer *= iter.next().intValue() + 1;
		}
		
		System.out.println(answer - 1);
	}
}
