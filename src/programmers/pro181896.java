package programmers;

public class pro181896 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		int answer = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] < 0) {
				answer = i;
				break;
			}
			answer = -1;
		}
		
		System.out.println(answer);

	}

}
