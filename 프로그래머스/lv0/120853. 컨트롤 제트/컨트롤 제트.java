class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split(" ");
        for (int i=1; i<sArr.length; i++) {
            if((sArr[i]).equals("Z")) {
                sArr[i] = "0";
                sArr[i-1] = "0";
            }
        }
        
        for (int i=0; i<sArr.length; i++) {
            answer += Integer.parseInt(sArr[i]);
        }
        return answer;
    }
}