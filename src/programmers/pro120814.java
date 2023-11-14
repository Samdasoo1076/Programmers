package programmers;

public class pro120814 {

	public static void main(String[] args) {
			int n = 7;
			int answer = 0;
			
			for(int i = 0; i < n; i++) {
				if(i % 7 == 0) {
					answer += 1;
				}
			}
			System.out.println(answer);
	 
	}

}
