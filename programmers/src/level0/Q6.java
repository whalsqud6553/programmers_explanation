package level0;

import java.util.Arrays;

class Solution6 {
    public int[] solution(int[] arr) {
    	// 배열의 길이를 2의 거듭제곱으로 만들기
    	
        int[] answer = {};
        int num = 1;
		int index = 0;
		for(int i = 0; i < num; i++) {
            answer = new int[num];
            num *= 2;
			if(arr.length < answer.length) {
				for(int j = 0; j < arr.length; j++) {
					answer[j] = arr[index++];
				}
				break;
			}
			if(arr.length == answer.length) {
				answer = arr;
				break;
			}
		}
        return answer;
    }
}

public class Q6 {
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(sol.solution(arr)));
	}
}
