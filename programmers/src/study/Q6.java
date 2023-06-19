package study;

import java.util.Arrays;

class Solution6 {
    public int[] solution(int[] lottos, int[] win_nums) {
    	// 로또의 최고 순위와 최저 순위
    	
        int[] answer = new int[2];
        int count = 0;
        int num = 0;
        for(int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		num++;
        	}
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			count++;
        		}
        	}
        }
        int maxRank = 7 - (num + count);
        int minRank = 7 - count;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;
        
        answer[0] = maxRank;
        answer[1] = minRank;
        return answer;
    }
}

public class Q6 {
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int[] lottos = {44, 2, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 2, 6, 19};
		System.out.println(Arrays.toString(sol.solution(lottos, win_nums)));
	}
}
