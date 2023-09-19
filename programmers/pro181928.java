package programmers;

import java.util.Scanner;

public class pro181928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int[] num_list = new int[c];
		
		int answer = 0;
		
		String a = "";
		String b = "";
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				a += String.valueOf(num_list[i]);
			} else {
				b += String.valueOf(num_list[i]);
			}
		}
			answer = Integer.parseInt(a) + Integer.parseInt(b);
				System.out.println(answer);
	}

}
