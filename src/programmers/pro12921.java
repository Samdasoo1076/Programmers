package programmers;

public class pro12921 {

	public static boolean[] pro1(int limit) {
		boolean[] sieve = new boolean[limit + 1];
		
		for(int i = 0; i <= limit; i++) {
			sieve[i] = true;
		}
		
		sieve[0] = sieve[1] = false;
		
		for(int current = 2; current <= Math.sqrt(limit); current++) {
			if(sieve[current]) {
				for (int multiple = current * current; multiple <= limit; multiple += current) {
                    sieve[multiple] = false;
                }
			}
		}
		return sieve;
	}
	
	
	public static int solution(int n) {
		boolean[] primes = pro1(n);
		int count = 0;
		
		for(int i = 2; i <= n; i++) {
			if(primes[i]) {
				count++;
			}
		}
			return count;
	}
	
	
	public static void main(String[] args) {
		int n = 5;
	    System.out.print(solution(n));
	}

}
