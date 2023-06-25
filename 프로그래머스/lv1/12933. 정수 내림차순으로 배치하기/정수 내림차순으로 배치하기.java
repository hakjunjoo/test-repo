import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String answerStr = "";
        
        String nStr = n + "";
        String[] nStrArr = nStr.split("");
        Arrays.sort(nStrArr);
        System.out.println(Arrays.toString(nStrArr));
        
        for(int i=nStrArr.length-1; i>=0; i--) {
            answerStr += nStrArr[i];
        }
        
        answer = Long.parseLong(answerStr);
        return answer;
    }
}