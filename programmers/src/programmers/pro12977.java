package programmers;

public class pro12977 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int answer = 1;
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					
					if(isPrime(sum)) {
						answer++;
					}
				}
			}
		}
			System.out.print(answer);
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) 
				return true;
		}
		return false;
	}

}
