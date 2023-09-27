package programmers;

public class pro81898 {

	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 1};
		int idx = 1;
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i >= idx && arr[i] == 1) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
		}
		System.out.print(answer);

	}

}
