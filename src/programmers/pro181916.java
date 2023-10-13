package programmers;

public class pro181916 {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		int d = 2;
		int answer = 0;
		
		 if (a == b && b == c && c == d) { // abcd 모두 같다면
			 answer = 1111 * a; 
	        } else if (a == b && b == c) { // abc만 같다면
	        	answer = ((10 * a + d) * (10 * a + d)); 
	        } else if (a == c && c == d) { // acd만 같다면
	        	answer = ((10 * a + b) * (10 * a + b));
	        } else if (a == b && b == d) { // abd만 같다면
	        	answer = ((10 * a + c) * (10 * a + c));
	        } else if (b == c && c == d) { // bcd만 같다면
	        	answer = ((10 * b + a) * (10 * b + a));
	        } else if (a == b && c == d) { // ab가 같고 cd가 같다면
	        	answer = ((a + c) * (Math.abs(a - c)));
	        } else if (a == c && b == d) { // ac가 같고 bd가 같다면
	        	answer = ((a + b) * (Math.abs(a - b)));
	        } else if (a == d && b == c) { // ad가 같고 bc가 같다면
	        	answer = ((a + b) * (Math.abs(a - b)));
	        } else if (a == b && c != d) { // ab가 같고 cd가 다르다면
	        	answer = (c * d);
	        } else if (a == c && b != d) { // ac가 같고 bd가 다르다면
	        	answer = (b * d);
	        } else if (a == d && b != c) { // ad가 같고 bc가 다르다면
	            answer = (b * c);
	        } else if (b == c && a != d) { // bc가 같고 ad가 다르다면
	            answer = (a * d);
	        } else if (b == d && a != c) { // bd가 같고 ac가 다르다면
	            answer = (a * c);
	        } else if (c == d && a != b) { // cd가 같고 ab가 다르다면
	            answer = (a * b);
	        } else {
	            answer = Math.min(Math.min(a, b), Math.min(c, d));
	        }
		 	System.out.println(answer);
	}

}
