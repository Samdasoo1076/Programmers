package programmers;

public class pro120907 {

	public static void main(String[] args) {
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {
			String[] StringArr = quiz[i].split(" ");
			
			int num1 = Integer.parseInt(StringArr[0]);
			int num2 = Integer.parseInt(StringArr[2]);
			int num3 = Integer.parseInt(StringArr[4]);
			
			if(StringArr[1].equals("+")) {
				if((num1 + num2) == num3) {
					answer[i] = "O";
			} else {
					answer[i] = "X";
			}	
		}
		if(StringArr[1].equals("-")) {
			if((num1 - num2) == num3) {
				answer[i] = "O";
		} else {
				answer[i] = "X";
			}
		  }
		System.out.print(answer[i] + ",");
		}
		
	}
}