class Solution {
    public String solution(int n) {
        String answer = "";
        
        if(n%2 == 1) {
            for(int i=1; i<=n/2; i++) {
                answer += "수박";
            }
            answer = answer + "수";
        } else {
            for(int i=1; i<=n/2; i++) {
                answer += "수박";
            }
        }
        
        return answer;
    }
}