package programmers;

import java.util.*;

public class pro12917 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		String[] arr = s.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(String a : arr) {
			answer += a;
		}
		
		System.out.println(answer);

	}

}
