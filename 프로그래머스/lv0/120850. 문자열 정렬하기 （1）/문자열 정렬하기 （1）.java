import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");
        String[] str_arr = str.split(""); 
        int[] answer = new int[str_arr.length];
        
        for(int i=0; i<str_arr.length; i++) {
            answer[i] = Integer.parseInt(str_arr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}