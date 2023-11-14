package programmers;

public class pro120876 {

	public static void main(String[] args) {
		int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
		int answer = 0;
		int[] rail = new int[200];
		
		for(int[] line : lines) {
		for(int i = (line[0] + 100); i < (line[1] + 100); i++) {
			rail[i]++;
			}
		}
		
		for(int value : rail) {
			if(value > 1) {
				answer++;
			}
		}
		System.out.print(answer);
	}

}
