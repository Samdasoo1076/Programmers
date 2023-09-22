package programmers;

public class pro77884 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;
		
		for(int i = left; i <= right; i++){
            if(Math.sqrt(i) - (int)Math.sqrt(i) > 0.0001) answer += i;
            else answer -= i;
        }
		System.out.println(answer);
	}

}
