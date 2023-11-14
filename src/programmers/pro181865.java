package programmers;

public class pro181865 {

	public static void main(String[] args) {
		String binomial = "43 + 12";
		int answer = 0;
		String[] rsArr = binomial.split(" ");
		
		if(rsArr[1].equals("+")) {
			answer = Integer.valueOf(rsArr[0]) + Integer.valueOf(rsArr[2]);
		} else if (rsArr[1].equals("-")) {
			answer = Integer.valueOf(rsArr[0]) - Integer.valueOf(rsArr[2]);
		} else if (rsArr[1].equals("*")) {
			answer = Integer.valueOf(rsArr[0]) * Integer.valueOf(rsArr[2]);
		}
		System.out.print(answer);
	}

}
