package programmers;

public class pro181905 {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		String answer = "";
		
		StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
		sb.reverse();
		
		answer = my_string.substring(0, s) + sb + my_string.substring(e + 1, my_string.length());
		
		System.out.print(answer);

	}

}
