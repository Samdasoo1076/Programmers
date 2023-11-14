package programmers;

public class pro120841 {

	public static void main(String[] args) {
		int[] dot = {-7, 9};
		int answer = 0;
			for(int i = 0; i < 2; i++) {
				if(dot[i] >= -500 && dot[i] <= 500) {
					if(dot[0] > 0 && dot[1] > 0) {
						answer = 1;
					}
					else if(dot[0] < 0 && dot[1] > 0) {
						answer = 2;
					}
					else if(dot[0] < 0 && dot[1] < 0){
						answer = 3;
					}
					else {
						answer = 4;
					}
				}
			}
		
		System.out.println(answer);
	}

}
