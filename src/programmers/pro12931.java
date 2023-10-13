package programmers;

public class pro12931 {

	public static void main(String[] args) {
		int n = 987;
		int answer = 0;
		String rs = Integer.toString(n);
		for(int i = 0; i < rs.length(); i++) {
			answer += Integer.parseInt(rs.substring(i, i + 1));
		}
		System.out.println(answer);
	}

}
