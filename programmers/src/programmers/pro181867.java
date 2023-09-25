package programmers;

public class pro181867 {

	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		String[] arr = myString.split("x", -1);
		
		int[] answer = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			answer[i] = arr[i].length();
			System.out.print(answer[i] + ",");
		}
			
	}

}
