package programmers;

public class pro43163 {
	static boolean[] visit;
	static int answer = 0;
	
	public int solution() {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		visit = new boolean[words.length];
		
		dfs(begin, target, words, 0);
		
		return answer;
		
	}

	public void dfs(String now, String target, String[] words, int cnt) {
			if(now.equals(target)) {
				answer = cnt;
				return;
			}
			
			for(int i = 0; i < words.length; i++) {
				if(visit[i]) {
					continue;
				}
				
				int k = 0;
				for(int j = 0; j < now.length(); j++) {
					if(now.charAt(j) != words[i].charAt(j)) {
						k++;
					}
				}
				
				if(k == 1) {
					visit[i] = true;
					dfs(words[i], target, words, cnt + 1);
					visit[i] = false;
				}
			}
		System.out.print(answer);
	}
	
	
	

}
