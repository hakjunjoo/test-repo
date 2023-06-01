import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        // 약수를 리스트에 담기
        for(int i=1; i<=n; i++) {
            if (n%i == 0) {
                list.add(i);
            }
        }
        // 리스트를 배열로 바꾸기
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}