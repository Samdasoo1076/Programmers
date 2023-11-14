package programmers;
import java.util.*;
public class pro12935 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] answer = {};
		
		if (arr.length == 1) { 
            answer = new int[] {-1};
        } else {
            List<Integer> list = new ArrayList<>();
            for (int a : arr) { 
                list.add(a);
            }
            
            list.remove(Collections.min(list)); 
            answer = new int[arr.length - 1];
        
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i); 
                System.out.print(answer[i] + ",");
            }
        }
		

	}

}
