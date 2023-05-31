import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        int min = Math.abs(array[0] - n);
        
        //절댓값 작은 것 찾기
        for(int i=0; i<array.length; i++) {
            if(min > Math.abs(array[i]-n)) {
                min = Math.abs(array[i]-n);
            }
        }
        
        //정렬된 배열에서 가장 가까운 수 찾기
        for(int i=0; i<array.length; i++) {
            if(array[i] == min+n || array[i] == n-min) {
                answer = array[i];
                break;
            }
        }

        return answer;
    }
}