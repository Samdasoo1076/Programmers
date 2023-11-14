package programmers;

import java.util.Arrays;

public class pro1220886 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;
		
		 char[] before1 = before.toCharArray();
		 char[] after1 = after.toCharArray();
		 
		 Arrays.sort(before1);
		 Arrays.sort(after1);
		 
		 String beforeF = new String(before1);
		 String afterF = new String(after1);
		 
		 if(beforeF.equals(afterF)) {
			 answer = 1;
		 } else {
			 answer = 0;
		 }
		
		System.out.print(answer);
	}

}
