import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String numStr = "";

        for(int l=i; l<=j; l++) {
            numStr += l+"";
        }
        
        String a = k+"";
        String[] numArr = numStr.split(a);
        String sumArr = String.join("", numArr);

        answer = numStr.length() - sumArr.length();
            
        return answer;
    }
}