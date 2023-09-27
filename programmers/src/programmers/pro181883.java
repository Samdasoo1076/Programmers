package programmers;

public class pro181883 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
		
		for(int[] query : queries) {
			int s = query[0];
			int e = query[1];
			
			for(int i = s; i <= e; i++) {
				arr[i] += 1;
			}
		}
	}

}
