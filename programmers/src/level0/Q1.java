package level0;

import java.util.*;

class Solution {
	// 수열과 구간쿼리2
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
		Arrays.fill(answer, Integer.MAX_VALUE);
		for(int i = 0; i < queries.length; i++) {
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(arr[j] > queries[i][2]) {
					if(answer[i] > arr[j]) {
						answer[i] = arr[j];
					}
				}
			}
			if(answer[i] == Integer.MAX_VALUE) {
				answer[i] = -1;
			}
		}
        return answer;
    }
}

public class Q1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}
}
