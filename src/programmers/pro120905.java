package programmers;

public class pro120905 {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		 int[] array = new int[numlist.length];
		 
	        int count = 0;
	        for(int i = 0; i < numlist.length; i++){
	            if( numlist[i] % n == 0){
	                array[count] = numlist[i];
	                count++;
	            }
	        }
	        
	        int[] answer = new int[count];
	        for(int i = 0; i < count; i++){
	            answer[i] = array[i];
	        }
	        System.out.println();
	}

}
