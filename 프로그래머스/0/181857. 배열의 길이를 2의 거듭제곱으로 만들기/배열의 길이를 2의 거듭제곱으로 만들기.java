import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int arr_length = arr.length;
        int two_square = 1; // 거듭제곱
        int gap = 0; // 길이 차이
        
        for (int i=0; i<=10; i++) {
            
            for(int j=0; j<i; j++) {
                two_square *= 2;
            }
            
            if (arr_length <= two_square) {
                gap = two_square - arr_length;
                break;
            }
            
            two_square = 1;
        }
        
        List<Integer> result = new ArrayList<>();
        // 기존 arr의 원소들 list에 복사
        for (int i=0; i<arr_length; i++) {
            result.add(arr[i]);
        }
        // 차이만큼 0 추가
        for (int i=0; i<gap; i++) {
            result.add(0);
        }
        
        int[] answer = new int[result.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}