package programmers;

public class pro12912 {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		long answer = 0;
		  if(a < b) {
	            for(int i=a; i<=b; i++) {
	                answer += i;
	            }
	        } else if (a > b){
	              for(int i=a; i>=b; i--) {
	                answer += i;

	              }
	        } else if(a == b){
	           answer = (long) a;
	        }
			System.out.println(answer);
	}

}
