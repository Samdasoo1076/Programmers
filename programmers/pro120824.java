package programmers;

public class pro120824 {

	public static void main(String[] args) {
		int[] num_list = {1, 3, 5, 7};
		int[] answer = new int[2]; 
		
		int left = 0;
	    int right = 0;

	        for(int i = 0; i < num_list.length; i++) {
	            if (num_list[i] % 2 == 0) {
	                left++;
	            }
	            else {
	                right++;
	            }
	        }

	        answer[0] = left;
	        answer[1] = right;

	}

}

