package programmers;

public class pro181847 {

	public static void main(String[] args) {
		String n_str = "0010";
		String answer = "";
		int rs = 0;
		
		while(rs < n_str.length() && n_str.charAt(rs) == '0') {
			rs++;
		}
		
		while(rs < n_str.length()) {
			answer += n_str.charAt(rs);
			rs++;
		}
		System.out.print(answer);
	}

}
