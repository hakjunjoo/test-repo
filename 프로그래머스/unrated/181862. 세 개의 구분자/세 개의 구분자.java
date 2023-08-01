import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] strArr = myStr.split("[abc]");

        List<String> list = new ArrayList<>();
        for(String str : strArr) {
            if(!str.equals("")) {
                list.add(str);
            }
        }
        
        if (list.size() == 0) {
            String[] answer = {"EMPTY"};
            return answer;
        }
        
        String[] answer = new String[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}