package programmers;

import java.util.Scanner;

public class pro181929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] B = new int[A];
		
		int sum = 0;
		int mul = 0;
		
		int rs = 0;
		
		for(int i = 0; i < B.length; i++) {
			sum += B[i];
			mul *= B[i];
		}
		if(sum * sum > mul) {
			rs = 1;
		}
		if(sum * sum < mul) {
			rs = 0;
		}
		
		System.out.println(rs);
		

	}

}
