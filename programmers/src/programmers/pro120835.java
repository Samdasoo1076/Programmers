package programmers;

public class pro120835 {

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		int[] answer = new int[emergency.length];
		
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i] < emergency[j]) {
					answer[i]++;
				}
			}
			answer[i]++;
		}
		for(int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + ",");
		}
	}

}
