package programmers;

import java.util.Scanner;

public class pro181907 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String my_string = sc.next();
		int n = sc.nextInt();
		my_string.substring(0, n);
		
		String answer = my_string;
		
		System.out.println(answer);
	}

}
