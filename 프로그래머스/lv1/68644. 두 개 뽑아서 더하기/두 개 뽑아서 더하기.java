import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> answerList = list.stream().distinct().sorted().collect(Collectors.toList());
         
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}