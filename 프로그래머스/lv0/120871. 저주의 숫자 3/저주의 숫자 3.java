import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i < 300; i++) {
            String a = i + "";
            if( i%3 == 0 || a.contains("3") ) {
                continue;
            } else {
                list.add(i);
            }
        }
        int answer = list.get(n-1);
        return answer;
    }
}