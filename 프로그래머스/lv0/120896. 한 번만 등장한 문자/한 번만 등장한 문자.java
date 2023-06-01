import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        // 중복된 문자열 제거
        for(int i=0; i<sArr.length; i++) {
            for(int j=i+1; j<sArr.length; j++) {
                if(sArr[i].equals(sArr[j])) {
                    s = s.replaceAll(sArr[i], "");
                }
            }
        }
        
        String[] sArr2 = s.split("");
        Arrays.sort(sArr2); //사전순 정렬
        
        for(int i=0; i<sArr2.length; i++) {
            answer += sArr2[i];
        }
        
        return answer;
    }
}