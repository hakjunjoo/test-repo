import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        //2차원 배열 알면 쉽게 풀 수 있을 것 같음..
        Arrays.sort(numlist);
        int[] answer = new int[numlist.length];
        
        int[] absArr1 = new int[numlist.length]; //절댓값 배열
        for (int i=0; i<numlist.length; i++) {
            absArr1[i] = Math.abs(numlist[i]-n);
        }
        
        int[] absArr2 = absArr1.clone();
        Arrays.sort(absArr2);
        
        for (int i=0; i<absArr2.length; i++) {
            for(int j=absArr1.length-1; j>=0; j--) {
                if(absArr2[i] == absArr1[j]) {
                    answer[i] = numlist[j];
                    absArr1[j] = -1;
                    break;
                }
            }
        }
       
        return answer;
    }
}