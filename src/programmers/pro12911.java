package programmers;

import java.util.BitSet;

public class pro12911 {

	public static void main(String[] args) {
		int n = 78;
		int answer = n;
		int Cnt = Integer.bitCount(n);
		
		while(true) {
			int Cnt2 = Integer.bitCount(++answer);
			
			if(Cnt2 == Cnt) {
				break;
			}
		}
		
		System.out.println(answer);

	}

}
