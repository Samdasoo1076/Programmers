package programmers;

public class pro12919 {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "�輭���� "+ i + "�� �ִ�"; 
				break;
			}
		}
		System.out.println(answer);
	}

}
