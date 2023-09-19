package programmers;

public class pro12016 {

	public static void main(String[] args) {
		int answer = 0;
		int slice = 4;
		int n = 12;
		
		
		if(n % slice > -0) {
			answer = n / slice + 1;
		} else {
			answer = n / slice;
		}
		System.out.println(answer);
	}

}
