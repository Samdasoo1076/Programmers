package programmers;

public class pro181857 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int leng = arr.length;
		double x = 0;
		int[] answer = new int[(int)x];
		
		while(leng % 2 == 0) {
			leng = leng / 2;
		}
		if(leng == 1) {
			answer = arr;
		}
		
		int y = 0;
		int len = arr.length;
		
		while(len > x) {
			x = Math.pow(2, y++);
		}
		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ",");
		}
	}

}
