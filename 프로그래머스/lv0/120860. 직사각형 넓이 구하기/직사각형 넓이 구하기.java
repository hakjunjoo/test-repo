class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int length = 0;
        //가로 길이
        for(int i=1; i<3; i++) {
            if(dots[0][0] != dots[i][0]){
                width = Math.abs(dots[0][0] - dots[i][0]);
                break;
            }
        }
        
        //세로 길이
        for(int i=1; i<3; i++) {
            if(dots[0][1] != dots[i][1]){
                length = Math.abs(dots[0][1] - dots[i][1]);
                break;
            }
        }
        int answer = width * length;
        return answer;
    }
}