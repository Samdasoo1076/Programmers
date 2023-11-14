package programmers;

public class pro82612 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		int answer = 0;
		int rs = 0;
		
		for(int i = 0; i <= count; i++) {
			rs += price * i;
		}
		if(money < rs) {
			answer = rs - money;
		} else {
			answer = 0;
		}
		System.out.println(answer);
	}

}
