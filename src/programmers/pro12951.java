package programmers;

public class pro12951 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String answer = "";
		String[] sArr = s.split(" ");
		
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i].length() == 0) {
				answer += " ";
			} else {
				answer += sArr[i].substring(0, 1).toUpperCase();
				answer += sArr[i].substring(1, sArr[i].length()).toLowerCase();
				answer += " ";
			}

		}
		
		if(s.subSequence(s.length() -1, s.length()).equals(" ")) {
			answer = answer;
		}
		answer = answer.substring(0, answer.length() - 1);
		System.out.println(answer);
	}

}
