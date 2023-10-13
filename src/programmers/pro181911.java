package programmers;

public class pro181911 {

	public static void main(String[] args) {
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		String answer = "";
		
		for(int i = 0; i < my_strings.length; i++) {
			String str = my_strings[i];
			answer += str.substring(parts[i][0], parts[i][1] + 1);
		}
		System.out.print(answer);
	}

}
