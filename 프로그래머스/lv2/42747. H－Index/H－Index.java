import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        List<Integer> list = new ArrayList<>();

        int over = 0;
        int under = 0;
        for (int i = 1; i <= citations.length; i++) {
            for (int j = 0; j < citations.length; j++) {
                if (i < citations[j]) {
                    over++;
                } else if (citations[j] == i){
                    over++;
                    under++;
                } else {
                    under++;
                }
            }

            if (i <= over && i >= under) {
                list.add(i);
            }

            over = 0;
            under = 0;
        }
        
        int answer = 0;
        if(list.size() != 0) answer = list.get(list.size()-1);
        return answer;
    }
}