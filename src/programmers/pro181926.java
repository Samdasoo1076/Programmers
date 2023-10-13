package programmers;

import java.util.Scanner;

public class pro181926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String control = sc.next();
		char[] controlChars = control.toCharArray(); 
		int answer = 0;
	
		for(char k : controlChars) {
			if(k == 'w') {
				answer += 1;
			} else if (k == 's') {
				answer -= 1;
			} else if (k == 'd') {
				answer += 10;
			} else if (k == 'a') {
				answer -= 10;
			}
		}
		System.out.println(answer);

	}

}
