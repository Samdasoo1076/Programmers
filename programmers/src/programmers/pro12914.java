package programmers;

public class pro12914 {

	public static void main(String[] args) {
		int n = 4;
		long answer = 0;
		int[] arr = new int[n + 2];
		
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
		}
		
		System.out.println(arr[n]);
	}

}
