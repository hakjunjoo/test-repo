class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = order + "";
        for(int i=1; i<=a.length(); i++) {
            int n = order%10;
            if(n%3 == 0 && n != 0) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}