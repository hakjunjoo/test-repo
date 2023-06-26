import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = upperCase.toLowerCase();
        String answer = "";
        
        String[] sStrArr = s.split("");
        
        for(String str : sStrArr) {
            char strChar = str.charAt(0);
            if(Character.isUpperCase(strChar)) {
                for(int i=0; i<26; i++) {
                    if(upperCase.charAt(i) == strChar) {
                        str = upperCase.charAt(i+n) +"";
                    }
                }
            } else if(Character.isLowerCase(strChar)) {
                for(int i=0; i<26; i++) {
                    if(lowerCase.charAt(i) == strChar) {
                        str = lowerCase.charAt(i+n) +"";
                    }
                }
            }
            answer += str;
        }
        
        return answer;
    }
}