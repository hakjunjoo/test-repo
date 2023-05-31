import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        int[] idxArr = new int[1000];
        for(int i=0; i < array.length; i++) {
            idxArr[array[i]]++;
        }
        
        int[] idxArr2 = new int[idxArr.length];
        for (int i=0; i<idxArr.length; i++) {
            idxArr2[i] = idxArr[i];
        }
        Arrays.sort(idxArr2);
        
        if(idxArr2[(idxArr2.length)-1] == idxArr2[(idxArr2.length)-2]) {
            answer = -1;
        } else {
            for (int i=0; i<idxArr.length; i++) {
                if(max<idxArr[i]) {
                    max = idxArr[i];
                    answer = i;
                }
            }
        }
        
        return answer;
    }
}