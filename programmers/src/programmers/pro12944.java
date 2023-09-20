package programmers;

public class pro12944 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		double answer = 0;
		
		for(double rs : arr) {
			answer += rs;
		}
		
		answer = answer / arr.length;
		
		System.out.println(answer);
	}

}
