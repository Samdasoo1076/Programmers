package programmers;
import java.util.*;
public class pro120913 {

	public static void main(String[] args) {
		List<String> answer = new ArrayList();
		String my_str = "abc1Addfggg4556b";
		int n = 0;
		
		for(int i = 0; i < (my_str.length() / n); i++) {
			answer.add(my_str.substring((n * i), (n * (i * 1))));
		}
		if(my_str.length() % n != 0) {
			answer.add(my_str.substring((my_str.length() / n) * n));
		}
		answer.toArray(new String[0]);
		
		System.out.print(answer + " , ");

	}

}
