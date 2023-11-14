package programmers;

public class pro120808 {

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		int number4 = 4;
		
		int numer = number1 * number2 + number3 * number4;
		int denom = number4 * number2;
		
		int max = 1;
		
		for(int i = 1; i < numer && i <= denom; i++) {
			if(denom% i == 0 && numer % i == 0) {
				max = i;
			}
		}
		numer = numer / max;
		denom = denom / max;
		
		int[] answer = {numer, denom};
		System.out.println(answer);
	}

}
