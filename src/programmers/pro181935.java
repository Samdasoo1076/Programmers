package programmers;

import java.util.Scanner;

public class pro181935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int rs = 0;
		int i = 0;
		for(i = 1; i <= A; i++) {
			if(A % 2 == 1 && i % 2 == 1) {
				rs += i;
			}
			else if(A % 2 == 0 && i % 2 == 0) {
				rs += i * i;
			}
		}
			System.out.println(rs);
	}

}
