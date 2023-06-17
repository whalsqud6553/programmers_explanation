package level0;

import java.util.Arrays;

class Solution5 {
	// 배열 만들기 5
	
    public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] str = new int[intStrs.length];	// 정수값을 넣을 배열
		int[] answer = {};	// 값을 반환 할 배열
		
		int count = 0;		// k 이상인 값의 길이
		for(int i = 0; i < intStrs.length; i++) {
			str[i] = Integer.parseInt(intStrs[i].substring(s, s+l));	// intStrs의 배열을 substring으로 짤른뒤 정수형으로 변환해서 값을 대입
			if(str[i] > k) {	// str[i]번째의 값이 k보다 크면										
				count += 1;		// count + 1
			}
		}
		
		answer = new int[count];	// k보다 큰 값의 개수를 answer배열 길이로 새로 생성
		int index = 0;	// answer배열 index
		for(int j = 0; j < intStrs.length; j++) {
			if(str[j] > k) {
				answer[index++] = str[j];	// answer[0],[1]번째에  str[0], str[2] 값을 대입
			}
		}
        return answer;
    }
}

public class Q5 {
	public static void main(String[] args) {
		String[] intStrs = {"0123456789","9876543210","9999999999999"};
		int k = 50000;
		int s = 5;
		int l = 5;
		Solution5 sol = new Solution5();
		System.out.println(Arrays.toString(sol.solution(intStrs, k, s, l)));
	}
}
