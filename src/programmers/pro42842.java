package programmers;

public class pro42842 {

	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		int[] answer = new int[2];
		
		int map[][];
		int total = brown + yellow;
		
		for(int i = 1; i <= total; i++) {
			if(total % i == 0) {
				int row = i;
				int col = total / row;
				
				if(row > col) {
					continue;
				}
				
				int inside_block = (row - 2) * (col - 2);
				
				if(inside_block == yellow) {
					answer[0] = col;
					answer[1] = row;
					
				}
			}
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");			
		}

	}

}
