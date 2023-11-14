package programmers;
import java.util.Scanner;

public class pro181950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String rs = "";

        for(int i = 0; i <= n; i++) {
        	rs = rs + str;
        }
        System.out.println(rs);
        
	}

}
