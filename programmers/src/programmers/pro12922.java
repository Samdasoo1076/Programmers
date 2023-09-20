package programmers;

public class pro12922 {

	public static void main(String[] args) {
		int n = 3;
		String answer = "";
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				answer += "¼ö";
			} else {
				answer += "¹Ú";
			}
		}
		System.out.println(answer);
	}

}
