package programmers;

import java.util.Scanner;

public class pro181904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		String my_string = sc.next();
		int m = sc.nextInt();
		int c = sc.nextInt();
		String rs = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            result.append(my_string.charAt(i));
        }

        rs = result.toString();
        System.out.println(rs);
	}

}
