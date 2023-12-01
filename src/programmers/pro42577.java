import java.util.HashMap;
import java.util.Map;

public class pro42577 {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = true;
		Map<String, Integer> map = new HashMap<>();
		
		for(String phone_number : phone_book) {
			map.put(phone_number, 1);
		}
		
		for(String phone_number : phone_book) {
			for(int j = 1; j < phone_number.length(); j++) {
				String fix = phone_number.substring(0, j);
				if(map.containsKey(fix)) {
					answer = false;
				}
					
			}
		}
		
		System.out.println(answer);
	}

}
