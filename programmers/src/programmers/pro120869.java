package programmers;
import java.util.*;
import java.util.stream.Collectors;
public class pro120869 {

	public static void main(String[] args) {
		String[] spell = {"p", "o", "s"};
		List<Character> words = Arrays.stream(spell).map(s -> s.charAt(0)).collect(Collectors.toList());
		String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
		int answer = 0;
		
		 for (String str : dic) {
	            if(str.length() < spell.length) continue;

	            Set<Character> spellSet = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

	            if (spellSet.containsAll(words)) {
	                answer = 1;
	            } else {
	    	        	answer = 2;
	    	        }
	        } 
		 System.out.print(answer);
	}

}
