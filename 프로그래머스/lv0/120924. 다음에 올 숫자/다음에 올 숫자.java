class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if(common[1]-common[0] == common[2] - common[1]) { // 등차수열인 경우
            answer = common[0] + common.length*(common[1]-common[0]);
        } else { // 등비 수열인 경우
            answer = common[0] * (int)(Math.pow(common[1]/common[0], common.length));
        }
        return answer;
    }
}