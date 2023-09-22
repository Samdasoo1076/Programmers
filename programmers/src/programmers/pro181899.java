package programmers;

public class pro181899 {

	public static void main(String[] args) {
		int start = 10;
		int end_num = 3;
		
		int count = start - end_num + 1;
		int[] answer = new int[count];
		
		for(int i = 0; i < count; i++) {
			answer[i] = start--;
			System.out.print(answer[i] + ",");
		}
		
		

	}

}
