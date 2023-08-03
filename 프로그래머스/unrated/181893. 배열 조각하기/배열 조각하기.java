import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< arr.length; i++) {
            list.add(arr[i]);
        }
        
        for(int i=0; i<query.length; i++) {
            int q = query[i];
            if(i % 2 == 0) {
                int length = list.size() - q - 1;
                int cnt = 0;
                while (cnt < length) {
                    list.remove(q+1);
                    cnt++;
                }
            } else {
                int cnt = 0;
                while (cnt < q) {
                    list.remove(0);
                    cnt++;
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}