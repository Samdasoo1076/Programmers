package programmers;

import java.util.Scanner;

public class pro120818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int answer = 0;
		if(price >= 500000) {
			answer = (int) (price * 0.8);
		} else if (price >= 300000) {
			answer = (int) (price * 0.9);
		} else if (price >= 100000) {
			answer = (int)(price * 0.95);
		}
		else {
			answer = price;
		}
		System.out.println(answer);

	}

}
