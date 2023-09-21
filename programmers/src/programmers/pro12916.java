package programmers;

public class pro12916 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		boolean answer = true;
		s = s.toUpperCase();

        answer =  s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	}

}
