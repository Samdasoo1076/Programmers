package programmers;

public class pro43165 {
	public static int answer = 0;
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		dfs(numbers, 0, target, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int[] numbers, int depth, int target, int sum) {
		
//		 numbers : �˰����� ������ ��� �迭
//		 depth : ����� ����
//		 target : Ÿ�� �ѹ�
//		 sum : ���� ��� ������ ��� ��
		
		if(depth == numbers.length) {
			if(target == sum) {  //������ ������ Ž���� ��� ����
				answer++;
			} else {
				dfs(numbers, depth + 1, target, sum + numbers[depth]);// �ش� ����� ���� ���ϰ� ���� ���� Ž��
				dfs(numbers, depth + 1, target, sum - numbers[depth]);// �ش� ����� ���� ���� ���� ���� Ž��
			}
		}
	}
}
