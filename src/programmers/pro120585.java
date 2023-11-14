package programmers;

public class pro120585 {

	public static void main(String[] args) {
		int[] answer = {180, 120, 140};
		int height = 190;
		int rs = 0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] > height) {
				rs += 1;
			}
		}
		System.out.println(rs);
	}

}
