import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int i=0; i<arr.length; i++) {
            for(int delete_i : delete_list) {
                if (arr[i] == delete_i) {
                    arr[i] = 0;
                }
            }
        }
        
        // System.out.println(Arrays.toString(arr));
        
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i != 0) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}