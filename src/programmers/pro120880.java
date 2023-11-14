package programmers;

import java.util.*;

public class pro120880 {

	public static void main(String[] args) {
		
		int[] numlist = {1, 2, 3, 4, 5, 6};
		int[] answer = new int[numlist.length];
		double[] order = new double[numlist.length];
		int n = 4;
		
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] - n < 0) {
				order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
			} else {
				order[i] = numlist[i] - n -1;
			}
		}
		Arrays.sort(order);
		
		for(int i = 0; i < numlist.length; i++) {
			if(order[i] % 1 != 0)  {
				answer[i] = n - (int)order[i];
			} else {
				answer[i] = (int)order[i] + n;
			}
		}
		System.out.println(answer);
	}

}
