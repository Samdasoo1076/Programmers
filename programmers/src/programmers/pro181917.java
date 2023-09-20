package programmers;

public class pro181917 {

	public static void main(String[] args) {
		boolean answer = true;
		
		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		
		if((x1 == true || x2 == true) && (x3 == true || x4 == true)) {
			answer = true;
		} else {
			answer = false;
		}
		
			System.out.println(answer);
	}

}
