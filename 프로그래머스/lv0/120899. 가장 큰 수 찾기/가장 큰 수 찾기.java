import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        // 배열 복사
        int[] array2 = array.clone();
        
        // 배열의 최댓값 찾기
        Arrays.sort(array2);
        int max = array2[array2.length-1];
        answer[0] = max;
        
        // 배열의 최댓값의 인덱스 찾기
        for(int i=0; i<array.length; i++) {
            if(array[i] == max) {
                answer[1] = i;
            }
        }
        return answer;
    }
}