package study;

import java.util.Arrays;

class Solution4 {
    public int solution(String[] strArr) {
    	// 문자열 묶기
        
        int[] counter = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++){
            counter[strArr[i].length()] += 1;
            
        }
        
        Arrays.sort(counter);
        int answer = counter[counter.length - 1];

        
        return answer;
    }
}

public class Q4 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String[] strArr = {"a", "bc", "d", "efg", "hi"};
		System.out.println(sol.solution(strArr));
	}
}
