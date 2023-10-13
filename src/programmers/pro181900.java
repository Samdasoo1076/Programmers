package programmers;
import java.util.*;
public class pro181900 {

	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		String answer = "";

		String[] tmp = my_string.split("");
		
		for(int i = 0; i < indices.length; i++) {
			tmp[indices[i]] = "";
		}
		for(String x : tmp) {
			answer += x;
		}
		System.out.print(answer);
	}

}
