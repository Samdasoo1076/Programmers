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
		
//		 numbers : 알고리즘을 실행할 대상 배열
//		 depth : 노드의 깊이
//		 target : 타겟 넘버
//		 sum : 이전 노드 까지의 결과 값
		
		if(depth == numbers.length) {
			if(target == sum) {  //마지막 노드까지 탐색한 경우 실행
				answer++;
			} else {
				dfs(numbers, depth + 1, target, sum + numbers[depth]);// 해당 노드의 값을 더하고 다음 깊이 탐색
				dfs(numbers, depth + 1, target, sum - numbers[depth]);// 해당 노드의 값을 빼고 다음 깊이 탐색
			}
		}
	}
}
