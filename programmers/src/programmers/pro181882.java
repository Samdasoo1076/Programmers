package programmers;

public class pro181882 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= 50 && arr[i] % 2 == 1) {
				answer[i] = arr[i] * 2;
			}  else if(arr[i] >= 50 && arr[i] % 2 == 0) {
				answer[i] = arr[i] / 2;
			} else {
				answer[i] = arr[i];
			}
		}
		System.out.println(answer);

	}

}

