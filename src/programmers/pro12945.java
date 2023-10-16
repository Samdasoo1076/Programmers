package programmers;

public class pro12945 {

	public static void main(String[] args) {
		int n = 3;
		int answer = 0;
		
		int[] arr = new int[n + 1];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				arr[i] = 0;
			} else if (i == 1) {
				arr[i] = 1;
			} else {
			arr[i] = (arr[i - 1] % 1234567) + (arr[i - 2] % 1234567) % 1234567;
		} 
		}
		
		answer = arr[arr.length - 1] % 1234567;
		System.out.print(answer);
	}

}
