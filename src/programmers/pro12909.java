package programmers;
import java.util.*;
public class pro12909 {

	public static void main(String[] args) {
		String s = "()()";
		boolean answer = false;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push('(');
			} else if (s.charAt(i) == ')') {
				if(stack.isEmpty()) {
					answer = false;
				}
				stack.pop();
			}
		}
		answer = stack.isEmpty();
		System.out.println(answer);
	}

}


