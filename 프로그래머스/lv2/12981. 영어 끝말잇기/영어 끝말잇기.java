import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        Set<String> wordSet = new LinkedHashSet<>();
        wordSet.add(words[0]);

        int cnt = 1;
        for (int i = 1; i < words.length; i++) {
            char lastWord = words[i-1].charAt(words[i-1].length()-1);
            char firstWord = words[i].charAt(0);

            // 이전 문자의 마지막 문자와 첫 문자가 일치하는지 확인
            if (lastWord != firstWord) break;

            int beforeSize = wordSet.size();
            wordSet.add(words[i]);

            // 겹치는 문자가 있는지 확인
            if (beforeSize == wordSet.size()) break;

            cnt++;
        }
        
        int[] answer = new int[2];
        
        if (cnt != words.length) {
            int num = (cnt + 1) % n == 0 ? n : (cnt + 1) % n;
            int order = (cnt + 1) % n == 0 ? (cnt + 1) / n : (cnt + 1) / n + 1;

            answer[0] = num;
            answer[1] = order;
        }
        
        return answer;
    }
}