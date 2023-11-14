package programmers;

public class pro120864 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		String[] str = my_string.split("[a-zA-Z]");
		
		for(int i= 0; i < str.length; i++) {
			answer += !str[i].isEmpty() ? Integer.parseInt(str[i]) : 0;
		}
			System.out.print(answer);
	}

}
 