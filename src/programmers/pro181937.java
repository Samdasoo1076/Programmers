package programmers;

import java.util.Scanner;

public class pro181937 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n = sc.nextInt();
		int rs = 0;
		
		if(num % n == 0) {
			rs = 1;
		} else {
			rs = 0;
		}
		System.out.println(rs);

	}

}
