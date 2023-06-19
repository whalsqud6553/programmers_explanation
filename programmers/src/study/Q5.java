package study;

import java.util.ArrayList;

class Solution5 {
    public ArrayList<String> solution(String myStr) {
    	// 세 개의 구분자
    	
        String[] arr = myStr.split("a|b|c");
		ArrayList<String> answer = new ArrayList<String>();
		String empty = "EMPTY";
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].isEmpty()) {
				answer.add(arr[i]);
			}
		}
		if(answer.isEmpty()) {
			answer.add(empty);
		}
        return answer;
    }
}

public class Q5 {
	public static void main(String[] args) {
		String myStr = "baconlettucetomato";
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(myStr));
	}
}
