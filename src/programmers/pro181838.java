package programmers;

public class pro181838 {

	public static void main(String[] args) {
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		int answer = 0;
		
		if(date1[0] < date2[0]) {
			answer = 1;
		} else if(date1[0] > date2[0]) {
			answer = 0;
		} else if(date1[1] < date2[1]) {
			answer = 1;
		} else if(date1[1] > date2[1]) {
			answer = 0;
		} else if(date1[2] < date2[2]) {
			answer = 1;
		} else {
			answer = 0;
		}
			System.out.print(answer);
	}

}
