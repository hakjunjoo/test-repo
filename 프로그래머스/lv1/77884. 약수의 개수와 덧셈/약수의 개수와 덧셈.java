class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            if(divisorCnt(i)%2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    private int divisorCnt(int i) {
        int cnt = 0;
        for (int j=1; j<=i; j++) {
            if(i%j == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}