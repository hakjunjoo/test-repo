import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] blaArr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int j=0; j<babbling.length; j++) {
            for(int i=0; i<4; i++) {
                babbling[j] = babbling[j].replace(blaArr[i], "1");
            }
        }
        
        // System.out.println(Arrays.toString(babbling));
        
        for(int i=0; i<babbling.length; i++) {
            if("1111".contains(babbling[i])) {
                answer++;
            }
        }
        
        return answer;
    }
}