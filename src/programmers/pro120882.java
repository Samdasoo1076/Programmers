package programmers;
import java.util.*;

public class pro120882 {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		
		for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        for(int i = 0; i < answer.length; i++) {
        System.out.print(answer[i] + ",");
        }
	}

}
