package programmers;

public class pro12930 {

	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		String[] StrArr = s.split("");
		int cnt = 0;
		
		for(int i = 0; i < StrArr.length; i++) {
			if(StrArr[i].equals(" ")) {
			cnt = 1;
		}
		
		answer += cnt % 2 == 0 ? StrArr[i].toUpperCase() : StrArr[i].toLowerCase();
		cnt++;
	}
		System.out.print(answer);
	}
}

