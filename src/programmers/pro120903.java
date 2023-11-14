package programmers;

public class pro120903 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = 0;
		
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i].equals(s2[j])) {
					answer += 1;
					
				}
			}
		}
			System.out.println(answer);
	}

}
