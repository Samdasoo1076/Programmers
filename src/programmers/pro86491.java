package programmers;

public class pro86491 {

	public static void main(String[] args) {
		int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int answer = 0;
		int row = 0;
		int col = 0;
		
		for(int i = 0; i <size.length; i++) {
			if(size[i][0] < size[i][1]) {
				int tmp = size[i][0];
				size[i][0] = size[i][1];
				size[i][1] = tmp;
			}
			
			if(row < size[i][0]) {
				row = size[i][0];
			}
			if(col < size[i][1]) {
				col = size[i][1];
			}
		}
		
		answer = col * row;
		
		System.out.print(answer);

	}

}
