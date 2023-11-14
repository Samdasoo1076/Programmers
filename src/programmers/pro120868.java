package programmers;

public class pro120868 {

	public static void main(String[] args) {
		int[] sides = {1, 2};
		int answer = 0;
		
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);
		
		int MaxL = max - min;
		int MinL = max + min;
		answer = MinL - MaxL - 1;
		System.out.println(answer);
	}

}
