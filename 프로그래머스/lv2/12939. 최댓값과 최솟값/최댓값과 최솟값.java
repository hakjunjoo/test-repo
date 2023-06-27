import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sStrArr = s.split(" ");
        int[] sIntArr = new int[sStrArr.length];
        
        for(int i=0; i<sIntArr.length; i++) {
            sIntArr[i] = Integer.parseInt(sStrArr[i]);
        }
        Arrays.sort(sIntArr);
        // System.out.println(Arrays.toString(sIntArr));
        
        answer = (sIntArr[0]+"") + " " + (sIntArr[sIntArr.length-1]+"");
        
        return answer;
    }
}