import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase(); //모두 소문자로 바꾸기
        // System.out.println(myString);
        answer = myString.replace("a", "A");
        
        return answer;
    }
}