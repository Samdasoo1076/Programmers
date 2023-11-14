package programmers;

public class pro120904 {

	public static void main(String[] args) {
		int num = 232443;
		int k = 4;
		int answer = 0;
		String num1 = Integer.toString(num);
		String k1 = Integer.toString(k);
		if(num1.indexOf(k1) == -1) {
			num = -1;
		} else {
				answer = num1.indexOf(k1) +1;
		}
		
		System.out.println(answer);

	}

}
