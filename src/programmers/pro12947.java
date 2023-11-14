package programmers;

public class pro12947 {

	public static void main(String[] args) {
		int x = 10;
		boolean answer = true;
		int rs = x;
		int ps = 0;
		
		while(rs >= 10) {
			ps += rs % 10;
			rs /= 10;
		}
		ps += rs;
		answer = x % ps == 0;
		System.out.println(answer);
	}

}
