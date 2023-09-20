package programmers;

public class pro120838 {

	public static void main(String[] args) {
		String letter = ".--. -.-- - .... --- -.";
		String answer = "";
		String[] morseList = { 
				".-","-..." ,"-.-.","-..",".","..-.",
			    "--.","....","..",".---","-.-",".-..",
			    "--","-.","---",".--.","--.-",".-.",
			    "...", "-" ,"..-", "...-" , ".--","-..-",
			    "-.--","--.."};
	
		String[] morse;
		
		morse = letter.split(" ");
		for(String s : morse) {
			for(int i = 0; i < morseList.length; i++) {
				if(s.equals(morseList[i])) {
					answer += Character.toString((char) (i + 'a'));
				}
			}
		}
		System.out.println(answer);
	}

}
