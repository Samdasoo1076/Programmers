package programmers;

import java.util.Scanner;

public class pro181930 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int rs = 0;
		
		if(a != b && a != c && b != c) {
			rs = a + b + c;
		}
		else if (a == b && a == c) {
			rs = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
		} 
		else {
			rs = (a + b + c) * (a * a + b * b + c * c);
		}
			System.out.println(rs);
	}

}
