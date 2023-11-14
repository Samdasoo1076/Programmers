package programmers;

public class pro181887 {

	public static void main(String[] args) {
		int[] num_List = {4, 2, 6, 1, 7, 6};
		int answer = 0;
		int hole = 0;
		int jjack = 0;
		
		for(int i = 0; i < num_List.length; i++) {
			if(i % 2 == 0) {
				jjack += num_List[i];
			} else {
				hole += num_List[i];
			}
		}
		answer = Math.max(hole, jjack);
		
		System.out.println(answer);
	}

}
