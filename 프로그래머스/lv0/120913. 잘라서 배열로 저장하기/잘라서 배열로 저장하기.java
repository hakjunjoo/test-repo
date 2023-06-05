import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        //배열 크기 구하기
        int leng = 0;
        if(my_str.length()%n == 0) {
            leng = my_str.length()/n;
        } else {
            leng = my_str.length()/n+1;
        }
        
        //배열에 넣기
        String[] answer = new String[leng];
        for(int i=0; i < leng-1; i++) {
            answer[i] = my_str.substring(i*n,i*n+n);
        }
        
        //마지막 인덱스 값 처리
        if(my_str.length()%n == 0) {
            answer[leng-1] = my_str.substring(my_str.length()-n);
        } else {
            answer[leng-1] = my_str.substring(my_str.length()-my_str.length()%n);
        }
        
        return answer;
    }
}