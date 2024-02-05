import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer_list = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer_list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer_list.remove(answer_list.size()-1);
                }
            }
        }
        
        int[] answer = new int[answer_list.size()];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = answer_list.get(i);
        }
        
        return answer;
    }
}