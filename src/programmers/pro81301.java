package programmers;

public class pro81301 {

	public static void main(String[] args) {
		String s = "one4seveneight";
		String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < 10; i ++) {
			s = s.replace(num[i], Integer.toString(i));
		}
		
		int answer = Integer.parseInt(s);
		System.out.println(answer);
	}

}
