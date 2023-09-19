package programmers;

import java.util.Scanner;

public class pro181933 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = sc.nextBoolean();
		int answer = 0;
		
		if(flag == true) {
			answer = a + b;
		} else {
			answer = a - b;
		}
			System.out.println(answer);
	}

}
