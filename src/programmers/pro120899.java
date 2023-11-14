package programmers;

public class pro120899 {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[array.length - 1];
		
		int max = 0;
		int rs = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				rs = i;
			}
		}
		answer[0] = max;
		answer[1] = rs;
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ",");
		}

	}

}
