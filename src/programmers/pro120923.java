package programmers;

public class pro120923 {

	public static void main(String[] args) {
		int num = 5;
		int total = 5;
		int[] answer = new int[num];
		int start = (total / num) - ((num - 1) / 2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
		System.out.println(answer);

	}

}
