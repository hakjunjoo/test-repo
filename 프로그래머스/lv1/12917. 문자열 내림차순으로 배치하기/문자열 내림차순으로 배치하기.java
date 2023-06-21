import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        
        for(int i=s.length()-1; i>=0; i--) {
            answer += strArr[i];
        }
        
        return answer;
    }
}