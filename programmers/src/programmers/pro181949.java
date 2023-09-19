package programmers;

import java.util.Random;
import java.util.Scanner;

public class pro181949 {

	public static void main(String[] args) {
		Random random = new Random();
	    int answer = random.nextInt(101);
	    int attempts = 10;
	    
		Scanner sc = new Scanner(System.in);
       
        System.out.println("1에서부터 100 사이의 숫자 입력하셈");
        
        while(attempts > 0) {
        	System.out.println("숫자 입력 하셈");
        	int n = sc.nextInt();
        	attempts--;
       
        	if(n < answer) {
        		System.out.println("너무 작음 남은 시도 : " + attempts);
        	} else if (n > answer) {
        		System.out.println("너무 큼 남은 시도 : " + attempts);
        	} else {
        		System.out.println("축하한다 게이야 "+ attempts + " 번 남기고 맞았다 ㅋㅋ");
        		break;
        	}
        	
        	if(attempts == 0) {
        		System.out.println("그걸 못 맞추냐 답은" + answer + " 이였다 ㅋㅋ");
        	}
        	 
	}
        sc.close(); 
}
}