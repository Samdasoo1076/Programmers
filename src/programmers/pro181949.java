package programmers;

import java.util.Random;
import java.util.Scanner;

public class pro181949 {

	public static void main(String[] args) {
		Random random = new Random();
	    int answer = random.nextInt(101);
	    int attempts = 10;
	    
		Scanner sc = new Scanner(System.in);
       
        System.out.println("1�������� 100 ������ ���� �Է��ϼ�");
        
        while(attempts > 0) {
        	System.out.println("���� �Է� �ϼ�");
        	int n = sc.nextInt();
        	attempts--;
       
        	if(n < answer) {
        		System.out.println("�ʹ� ���� ���� �õ� : " + attempts);
        	} else if (n > answer) {
        		System.out.println("�ʹ� ŭ ���� �õ� : " + attempts);
        	} else {
        		System.out.println("�����Ѵ� ���̾� "+ attempts + " �� ����� �¾Ҵ� ����");
        		break;
        	}
        	
        	if(attempts == 0) {
        		System.out.println("�װ� �� ���߳� ����" + answer + " �̿��� ����");
        	}
        	 
	}
        sc.close(); 
}
}