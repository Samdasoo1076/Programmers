package programmers;

public class pro12932 {

	public static void main(String[] args) {
		long n = 12345;
		String rs = String.valueOf(n);
		char[] s = rs.toCharArray();
		int[] answer = new int[rs.length()];
		for(int i = rs.length() - 1; i >= 0; i--) {
			answer[rs.length() - 1 - i] = rs.charAt(i) - '0';
		}
		System.out.println(answer[1]);
	}

}
