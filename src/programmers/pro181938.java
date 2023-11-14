package programmers;

import java.util.Scanner;

public class pro181938 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		int rs = 0;
		
	    String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        int ab2 = Integer.parseInt(ab);
        int ba2 = Integer.parseInt(ba);
        if(ab2 >= ba2) {
        	 rs = ab2;
        } else if(ab2 <= ba2){
        	rs = ba2;
        }
        System.out.println(rs);

	}

}
