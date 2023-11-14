package programmers;

import java.util.Scanner;

public class pro181936 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int answer = 0;
		
		if(number % n == 0 && number % m == 0) {
			answer = 1;
			}
			else {
			answer = 0;
			}
		System.out.println(answer);
	}

}
