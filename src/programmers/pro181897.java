package programmers;
import java.util.*;
public class pro181897 {
	public static void main(String[] args) {
		
		  List<Integer> list = new ArrayList<>();
		  int n = 3;
		  int[] slicer = {1, 5, 2};
		  int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int a = slicer[0];
	        int b = slicer[1];
	        int c = slicer[2];
	        if(n == 1) {
	            for(int i =0; i<b+1; i++) {
	                list.add(num_list[i]);
	            }
	        }else if(n == 2) {
	            for(int i = a; i<num_list.length; i++) {
	                list.add(num_list[i]);
	            }
	        }else if(n ==3) {
	            for(int i = a; i<b+1; i++) {
	                list.add(num_list[i]);
	            }
	        }else if(n == 4) {
	            for(int i = a; i<b+1; i+=c) {
	                list.add(num_list[i]);

	            }
	        }
	        int[] answer = list.stream().mapToInt(x -> x).toArray();
	        for(int i = 0; i < answer.length; i++) {
	        System.out.print(answer[i] +  ",");
	        }
	}
}
