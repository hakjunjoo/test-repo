import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        int idx = 0;
        while(idx != n) {
            int num = list.get(idx) + list.get(idx+1);
            list.add(num % 1234567);
            
            idx++;
        }
        
        int answer = list.get(n);
        return answer;
    }
}