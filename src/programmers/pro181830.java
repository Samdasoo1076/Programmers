package programmers;

public class pro181830 {

	public static void main(String[] args) {
		int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
		int max = Math.max(arr.length, arr[0].length);
		int[][] answer = new int[max][max];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				answer[i][j] = arr[i][j];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(answer[i][j] + ", ");
			}
		}
	}

}
