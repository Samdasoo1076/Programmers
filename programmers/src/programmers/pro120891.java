package programmers;

public class pro120891 {

	public static void main(String[] args) {
		int order = 29423;
		int answer = 0;
		String rs = "" + order;
		
		for(int i = 0; i < rs.length(); i++) {
			char tempChar = rs.charAt(i);
			
			if(tempChar == '3' || tempChar == '6' || tempChar == '9') {
				answer++;
			}
		}
		System.out.print(answer);

	}

}
