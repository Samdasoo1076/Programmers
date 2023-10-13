package programmers;

public class pro181835 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] answer = new int[arr.length];
		int k = 3;
		
		for(int i = 0; i < arr.length; i++) {
			if(k % 2 == 0) {
				answer[i] = arr[i] + k;
			} else {
				answer[i] = arr[i] * k;
			}
			
			System.out.print(answer[i] + ",");
		}

	}

}
