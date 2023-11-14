package programmers;

public class pro181868 {

	public static void main(String[] args) {
		String my_string = " i    love  you";
		String[] w = my_string.trim().split("\\s+");
		String[] answer = new String[w.length];
		
		for(int i = 0; i < w.length; i++) {
			answer[i] = w[i];
			System.out.print(answer[i] + ",");
		}

	}

}
