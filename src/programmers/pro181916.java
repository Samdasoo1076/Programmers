package programmers;

public class pro181916 {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		int d = 2;
		int answer = 0;
		
		 if (a == b && b == c && c == d) { // abcd ��� ���ٸ�
			 answer = 1111 * a; 
	        } else if (a == b && b == c) { // abc�� ���ٸ�
	        	answer = ((10 * a + d) * (10 * a + d)); 
	        } else if (a == c && c == d) { // acd�� ���ٸ�
	        	answer = ((10 * a + b) * (10 * a + b));
	        } else if (a == b && b == d) { // abd�� ���ٸ�
	        	answer = ((10 * a + c) * (10 * a + c));
	        } else if (b == c && c == d) { // bcd�� ���ٸ�
	        	answer = ((10 * b + a) * (10 * b + a));
	        } else if (a == b && c == d) { // ab�� ���� cd�� ���ٸ�
	        	answer = ((a + c) * (Math.abs(a - c)));
	        } else if (a == c && b == d) { // ac�� ���� bd�� ���ٸ�
	        	answer = ((a + b) * (Math.abs(a - b)));
	        } else if (a == d && b == c) { // ad�� ���� bc�� ���ٸ�
	        	answer = ((a + b) * (Math.abs(a - b)));
	        } else if (a == b && c != d) { // ab�� ���� cd�� �ٸ��ٸ�
	        	answer = (c * d);
	        } else if (a == c && b != d) { // ac�� ���� bd�� �ٸ��ٸ�
	        	answer = (b * d);
	        } else if (a == d && b != c) { // ad�� ���� bc�� �ٸ��ٸ�
	            answer = (b * c);
	        } else if (b == c && a != d) { // bc�� ���� ad�� �ٸ��ٸ�
	            answer = (a * d);
	        } else if (b == d && a != c) { // bd�� ���� ac�� �ٸ��ٸ�
	            answer = (a * c);
	        } else if (c == d && a != b) { // cd�� ���� ab�� �ٸ��ٸ�
	            answer = (a * b);
	        } else {
	            answer = Math.min(Math.min(a, b), Math.min(c, d));
	        }
		 	System.out.println(answer);
	}

}
