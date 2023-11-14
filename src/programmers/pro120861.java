package programmers;

public class pro120861 {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		 int[] now = {0, 0};
	        int maxWidth=board[0] / 2;               
	        int maxLength=board[1] / 2;   
	        for (int i = 0; i < keyinput.length; i++) {
	            if(keyinput[i].equals("left")) {
	                now[0] -= (now[0]>-(maxWidth) ? 1 : 0); 
	            } else if(keyinput[i].equals("right")) {
	                now[0] += (now[0]<(maxWidth) ? 1 : 0);
	            } else if(keyinput[i].equals("down")) {
	                now[1] -= (now[1]>-(maxLength) ? 1 : 0);
	            } else if(keyinput[i].equals("up")) {
	                now[1] += (now[1]<(maxLength) ? 1 : 0);
	            }
	         }
	        for(int i = 0; i < now.length; i++) {
	        	System.out.print(now[i] + ",");
	        }
	}

}
