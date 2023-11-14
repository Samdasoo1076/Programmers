package programmers;

import java.util.*;

public class pro181909 {

	public static void main(String[] args) {
		String my_string = "banana";
		int length = my_string.length();
		String[] suffixes = new String[length];
		
		for(int i = 0; i < length; i++) {
			suffixes[i] = my_string.substring(i);
		}
		
		Arrays.sort(suffixes);
		
		for(int i = 0; i < suffixes.length; i++) {
			System.out.print(suffixes[i] + ",");
		}
		
	}

}
 