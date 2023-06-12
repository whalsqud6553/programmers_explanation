package level0;

import java.util.ArrayList;

class Solution4 {
	// 콜라츠 수열 만들기
	
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n != 1) {
        	arr.add(n);
        	if(n % 2 == 0) {
        		n = n / 2;
        	}
        	else if(n % 2 != 0) {
    			n = 3 * n + 1;
    		}
        }
        arr.add(n);
        return arr;
    }
}

public class Q4 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int n = 10;
		System.out.println(sol.solution(n));
	}
}
