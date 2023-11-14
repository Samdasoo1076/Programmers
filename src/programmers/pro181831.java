package programmers;

public class pro181831 {

	public static void main(String[] args) {
		int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
		int answer = 1;
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] != arr[j][i]) {
					answer = 0;
				}
			}
		}
		System.out.print(answer);
	}

}
