package programmers;

public class pro518403 {

	public static void main(String[] args) {
		long n = 12345;
		int[] answer = new int[(int) n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = i;
		}
		for(int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + " ,");
		}
	}

}
