package level0;

import java.util.Arrays;

class Solution2 {
	// 수열과 구간쿼리 3
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < queries.length; i++) {
			int first = queries[i][0];
			int second = queries[i][1];
			
			int tmp = arr[first];
			arr[first] = arr[second];
			arr[second] = tmp;
		}
        answer = arr;
        return answer;
    }
}

public class Q2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}
}
