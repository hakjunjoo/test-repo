import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        Queue<Character> stringQueue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            stringQueue.add(s.charAt(i));
        }

        while(!stringQueue.isEmpty()) {
            Character c = stringQueue.poll();

            if(c == '(') {
                cnt++;
            } else {
                cnt--;
            }

            if (cnt < 0) {
                answer = false;
                break;
            }
        }

        if(cnt != 0) {
            answer = false;
        }
        
        return answer;
    }
}