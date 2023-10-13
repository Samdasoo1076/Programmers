package programmers;

public class pro76501 {

	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int answer = 123456789;
		
		int rs = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == true) {
				rs += absolutes[i];
			} else if (signs[i] == false) {
				rs -= absolutes[i];
			}
		}
		
		System.out.println(rs);

	}

}
