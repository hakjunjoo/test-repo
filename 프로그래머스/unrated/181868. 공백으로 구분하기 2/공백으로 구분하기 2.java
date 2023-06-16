import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] my_stringArr = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(String str : my_stringArr) {
            if(!(str.equals(""))) {
                list.add(str);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}