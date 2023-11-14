package programmers;

import java.util.*;

public class pro42840 {

	public static void main(String[] args) {
			int[] answers = {1, 2, 3, 4, 5};
	        int[] first = {1,2,3,4,5}; // 5���� �ݺ�
	        int[] second = {2,1,2,3,2,4,2,5}; // 8���� �ݺ�
	        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10���� �ݺ�
	        int[] score = {0,0,0}; //  �����ڵ��� ����
	        
	        for(int i = 0; i < answers.length; i++) {
	            if(answers[i] == first[i % 5]) score[0]++;
	            if(answers[i] == second[i % 8]) score[1]++;
	            if(answers[i] == third[i % 10]) score[2]++;
	        }
	        
	        int max = Math.max(score[0], Math.max(score[1], score[2]));
	        
	        List<Integer> answ = new ArrayList<Integer>();
	        for(int i = 0; i < score.length; i++) if(max == score[i]) answ.add(i+1);
	        
	        int[] answer = new int[answ.size()];
	        for(int i = 0; i < answ.size(); i++){
	            answer[i] = answ.get(i);
	        }
	        System.out.println(answer[0]);
	}

}
