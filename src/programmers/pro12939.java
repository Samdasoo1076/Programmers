package programmers;

import java.util.*;

public class pro12939 {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String answer = "";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] str = s.split(" ");
		
		for(int i = 0; i < str.length; i++) {
			arr.add(Integer.parseInt(str[i]));
		}
		answer = "" + Collections.min(arr) + " " + Collections.max(arr);
		
		System.out.print(answer);
	}

}
