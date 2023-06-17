package study;

class Solution3 {
    public long solution(int balls, int share) {
    	// 구슬을 나누는 경우의 수
    	
        long answer = 1;
		int num = balls - share;
		
		for (int i = 0; i < num; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
		
        return answer;
    }
}

public class Q3 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int balls = 5;
		int share = 3;
		System.out.println(sol.solution(balls, share));
	}
}
