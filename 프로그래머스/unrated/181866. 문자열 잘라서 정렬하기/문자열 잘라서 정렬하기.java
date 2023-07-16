import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        Arrays.sort(strArr);
        
        int cnt = 0;
        for (String str : strArr) {
            if(str.equals("")) cnt++;
        }
        
        String[] answer = new String[strArr.length-cnt];
        for(int i=0; i<answer.length; i++) {
            answer[i] = strArr[i+cnt];
        }
        
        return answer;
    }
}