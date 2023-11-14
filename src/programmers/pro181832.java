package programmers;

public class pro181832 {

	public static void main(String[] args) {
		int n = 4;
		int[][] answer = new int[n][n];
		int number = 1;
		int x = 0;
		int y = -1;
		int direction = 1;
		
		while(n > 0) {
			for(int i = 0; i < n; i++) {
				y += direction;
				answer[x][y] = number++;
			}
			n--;
			
			for(int i = 0; i < n; i++) {
				x += direction;
				answer[x][y] = number++;
			}
			direction *= -1;
			
		}
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer.length; j++) {
					System.out.print(answer[i][j] + ", ");
			}
		}
	}

}
