package programmers;

public class pro120839 {

	public static void main(String[] args) {
		String rsp = "2";
		String answer = "";
		String[] StrArr = rsp.split("");
		
		for(int i = 0; i < StrArr.length; i++) {
			if(StrArr[i].equals("2")) {
				answer += "0";
			} else if(StrArr[i].equals("0")) {
				answer += "5";
			} else if(StrArr[i].contentEquals("5")) {
				answer += "2";
			}
		}
		
		System.out.println(answer);
	}

}
