class Solution {
    boolean solution(String s) {
        int cntP = 0, cntY = 0;
        
        String[] sArr = s.split("");
        
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i].equals("p") || sArr[i].equals("P")) {
                cntP++;
            } else if (sArr[i].equals("y") || sArr[i].equals("Y")) {
                cntY++;
            }
        }
        
        boolean answer = true;

        if(cntY != cntP) answer = false;
        
        return answer;
    }
}