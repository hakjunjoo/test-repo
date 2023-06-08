import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String numStr = "";

        for(int l=i; l<=j; l++) {
            numStr += l+"";
        }
        
        String a = k+"";
        String[] numArr = numStr.split(a);
        String sumArr = String.join("", numArr);
        // System.out.println(sumArr);
        // System.out.println(Arrays.toString(numArr));
        answer = numStr.length() - sumArr.length();
        
        // String a = k+"";
        // String[] numArr = numStr.split("");
        // for(int l=0; l<numArr.length; l++) {
        //     if(numArr[l].equals(a)) {
        //         answer++;
        //     }
        // }
        
        return answer;
    }
}