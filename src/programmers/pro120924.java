package programmers;

public class pro120924 {

	public static void main(String[] args) {
		int[] common = {1, 2, 3, 4};
		int answer = 0;
		
		if((common[1] - common[0]) == (common[2] - common[1])) {
			answer = common[common.length - 1] + (common[1] - common[0]);
		} else {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}
		System.out.print(answer);
	}

}
