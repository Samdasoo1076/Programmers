package programmers;

public class pro120853 {

	public static void main(String[] args) {
		String s = "1 2 Z 3";
		int answer = 0;
		
		String[] Arr = s.split(" ");
		int rs = 0;
		
		for(int i = 0; i < Arr.length; i++) {
			if(Arr[i].equals("Z")) {
				rs -= Integer.parseInt(Arr[i - 1]);
				continue;
			}
			rs += Integer.parseInt(Arr[i]);
		}
		answer = rs;
		
		System.out.print(answer);
	}

}
