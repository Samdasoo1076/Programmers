package programmers;
import java.util.*;
public class pro181885 {

	public static void main(String[] args) {
		List<String> answerList = new ArrayList<>();
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		for(int i = 0; i < finished.length; i++) {
			if(!finished[i]) {
				answerList.add(todo_list[i]);
			}
		}
		
		String[] answer = new String[answerList.size()];
		answer = answerList.toArray(answer);
		System.out.print(answer);
		

	}

}
