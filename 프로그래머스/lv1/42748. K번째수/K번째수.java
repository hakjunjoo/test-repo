import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int l = 0;
        
        for (int[] command : commands) {
            int i = command[0], j = command[1], k = command[2];
            
            List<Integer> list = new ArrayList<>();
            
            for (int s=i-1; s<j; s++) {
                list.add(array[s]);  
            }

            Collections.sort(list);
            
            answer[l] = list.get(k-1);
            l++;
        }
        
        return answer;
    }
}