package programmers;

public class pro181841 {

	public static void main(String[] args) {
		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		String answer = "";
		
		for(int i = 0; i < str_list.length; i++) {
			if(!str_list[i].contains(ex)) {
				answer += str_list[i];
			}
		}
		
		System.out.println(answer);

	}

}
