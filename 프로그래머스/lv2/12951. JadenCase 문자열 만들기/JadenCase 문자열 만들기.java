import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split(" ");
        
        for(int i=0; i<sArr.length; i++) {
            if(!sArr[i].equals("")) sArr[i] = sArr[i].toLowerCase();
        }
        
        for(int i=0; i<sArr.length; i++) {
            
            if(sArr[i].equals("")) continue;
            
            if(sArr[i].charAt(0)>='0' && sArr[i].charAt(0)<='9') {
                continue;
            }
            
            char first = Character.toUpperCase(sArr[i].charAt(0));
            if (sArr[i].length() == 1) {
               sArr[i] = first + ""; 
            } else {
                sArr[i] = (first + "") + sArr[i].substring(1);
            }
        }
        
        // System.out.println(Arrays.toString(sArr));

        answer = String.join(" ", sArr);
        if(answer.length() == s.length()) {
            return answer;
        } else {
            return answer + " ";
        }
    }
}