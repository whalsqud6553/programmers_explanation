package study;

import java.util.Arrays;

class Solution2 {
    public int[] solution(int[] arr) {
    	// 배열의 길이를 2의 거듭제곱으로 만들기
    	
        int[] answer = {};
        int num = 1;
		int index = 0;
		for(int i = 0; i < num; i++) {
            answer = new int[num];	// 배열 answer의 길이를 num 2의 제곱으로 만든다
            num *= 2;				// num에 2를 반복문으로 곱해서 2의 거듭제곱으로 만든다
			if(arr.length < answer.length) {
				for(int j = 0; j < arr.length; j++) {
					answer[j] = arr[index++];	// arr의 길이가 answer의 길이보다 작으면
				}								// answer에 arr을 넣고 Arrayindex 예외가
				break;							// 발생하기전에 break
			}
			if(arr.length == answer.length) {
				answer = arr;					// 배열의 길이가 같으면 그대로 대입
				break;							// break로 반복문 중지
			}
		}
        return answer;
    }
}

public class Q2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {58, 172, 746, 89};
		System.out.println(Arrays.toString(sol.solution(arr)));
		System.out.println(Arrays.toString(sol.solution(arr2)));
	}
}
