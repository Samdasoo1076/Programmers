package programmers;

public class pro12901 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
		String answer = "";
		int select = 0;
		
		for(int i = 0; i < a - 1; i++) {
			select += date[i];
		}
		select += b - 1;
		
		answer = day[select % 7];
		System.out.print(answer);

	}

}
