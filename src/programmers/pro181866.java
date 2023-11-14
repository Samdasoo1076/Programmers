package programmers;

import java.util.*;

public class pro181866 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String myString = "axbxcxdx";
		String rs = "";
		
		for(int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i) != 120) {
			rs += myString.charAt(i);
		} else {
			list.add(rs);
			rs = "";
		}
		}
		if(!rs.equals("")) {
			list.add(rs);
		} 
		String[] answer = list.stream().filter(x -> !x.equals("")).sorted().toArray(String[]::new);
		System.out.print(answer);
	}

}
