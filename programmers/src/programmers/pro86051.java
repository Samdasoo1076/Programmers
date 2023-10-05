package programmers;

public class pro86051 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 45;
		
		for(int i : numbers) {
			answer -= i;
		}

		
		System.out.println(answer);
	}

}
