package programmers;

public class pro120837 {

	public static void main(String[] args) {
		int hp = 23;
		int answer = 0;
		
		answer = hp / 5 + hp % 5 / 3 + hp % 5 % 3;
		
		System.out.print(answer);
	}

}
