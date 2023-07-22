import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> indexList = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                indexList.add(i);
            }
        }

        
        if (indexList.size() == 0) {
            int[] answer = {-1};
            return answer;
        } else if (indexList.size() == 1) {
            int[] answer = {2};
            return answer;
        } else {
            int[] answer = new int[indexList.get(indexList.size()-1) - indexList.get(0)+1];
            for(int i=0; i<=indexList.get(indexList.size()-1) - indexList.get(0); i++) { 
                answer[i] = arr[i + indexList.get(0)];
            }
            return answer;
        }

    }
}