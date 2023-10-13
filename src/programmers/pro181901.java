package programmers;

public class pro181901 {

	public static void main(String[] args) {
		int n = 10;
		int k =  3;
		int rs = n / k;
		int[] answer = new int[rs];
		
		for(int i = 0; i < rs; i++) {
			answer[i] = k * (i + 1);
			System.out.print(answer[i] + ",");
		}
	}

}
