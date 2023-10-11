package programmers;

public class pro12953 {
	
	public static int gcd(int a, int b) {
		 int x = Math.max(a,b);
	     int y = Math.min(a,b);
	        
	        while(x % y != 0){
	            int r = x % y;
	            x = y;
	            y = r;
	        }
	        
	        return y;
	    }
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		int answer = arr[0];
		
		 for(int i = 1;i<arr.length;i++){
	            int gcd = gcd(answer,arr[i]);
	            answer = answer * arr[i] / gcd;
	        }
		System.out.println(answer);
	}

}
