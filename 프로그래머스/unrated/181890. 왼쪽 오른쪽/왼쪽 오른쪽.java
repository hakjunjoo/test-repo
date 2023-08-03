import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int idx = 0;
        int division = 0;
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                idx = i;
                break;
            } else if (str_list[i].equals("r")) {
                idx = i;
                division = 1;
                break;
            }
        }
        
        if (division == 0) {
            for(int i=0; i<idx; i++) {
                list.add(str_list[i]);
            }
        } else {
            for (int i=idx+1; i<str_list.length; i++) {
                list.add(str_list[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}