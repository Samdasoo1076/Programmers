package programmers;

public class pro120906 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 930211;
		 while(n > 0){
	            answer += n%10;
	            n/=10;
	        }
		 
		 	System.out.println(answer);
	}

}
