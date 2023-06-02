import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        for(int i=0; i<charArr.length; i++) {
            charArr[i] = Character.toLowerCase(charArr[i]);
        }
        Arrays.sort(charArr);
        String answer = "";
        for(int i=0; i<charArr.length; i++) {
            answer += charArr[i];
        }
        return answer;
    }
}