package programmers;

public class pro250129 {

	public static void main(String[] args) {
		String route = "NSSNEWWN";
		int east = 0;
		int north = 0;
		int[] answer = new int[2];
		
		for(int i = 0; i < route.length(); i++) {
			switch(route.charAt(i)) {
			case 'N' : 
				north++;
				break;
			case 'S' :
				north--;
				break;
			case 'E' :
				east++;
				break;
			case 'W' :
				east--;
				break;
			}
		}
		answer[0] = east;
		answer[1] = north;
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ,");
		}
	}

}
