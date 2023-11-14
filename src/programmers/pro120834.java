package programmers;

public class pro120834 {

	public static void main(String[] args) {
		int age = 23;
		String answer = "";
		String str = String.valueOf(age);
		String[] arr = str.split("");
		
		for(int i = 0; i < arr.length; i++) {
			answer += ((char)((Integer.parseInt(arr[i]) + 97)));
		}
			System.out.println(answer);
	}

}
