package programmers;
import java.util.*;
public class pro181886 {

	public static void main(String[] args) {
		List<String> answerList = new ArrayList<>();
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		 while (names.length > 0) {
	            String[] group = Arrays.copyOfRange(names, 0, Math.min(5, names.length));
	            answerList.add(group[0]);
	            names = Arrays.copyOfRange(names, Math.min(5, names.length), names.length);
	        }
	        
	        String[] answer = new String[answerList.size()];
	        answer = answerList.toArray(answer);
		System.out.print(answer);
	}

}
