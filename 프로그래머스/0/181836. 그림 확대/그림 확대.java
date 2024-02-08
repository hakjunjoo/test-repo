import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result_list = new ArrayList<>();
        
        for (String pic : picture) {
            String[] pic_arr = pic.split("");
            String temp = "";
            
            for (int i=0; i<pic_arr.length; i++) {
                for (int j =0 ; j < k; j++) {
                    temp += pic_arr[i];
                }
            }
            
            // System.out.println(temp);

            for (int i=0; i < k; i++) {
                result_list.add(temp);
            }
            
        }
        
        String[] answer = new String[result_list.size()];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = result_list.get(i);
        }
        
        return answer;
    }
}