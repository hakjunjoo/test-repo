import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = arr.clone();
        arrCal(arr2); //arr2 연산 한 번 수행
        
        
        while(!(Arrays.equals(arr, arr2))) {
            arrCal(arr2);
            arrCal(arr);
            answer++;
        }
        return answer;
    }
    
    private int[] arrCal(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0 && arr[i] >= 50) {
                arr[i] = arr[i]/2;
            } else if(arr[i]%2 == 1 && arr[i] < 50) {
                arr[i] = arr[i]*2+1;
            }
        }
        
        return arr;
    } //arrCal
}