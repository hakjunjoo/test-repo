import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] idxArr = new int[201];
               
        // 1번, 2번 선분 비교
        for(int j=0; j<2; j++) {
            for(int i=lines[j][0]; i<=lines[j][1]; i++) {
                idxArr[i+100]++;
            }
        }
        // 1번 2번 겹치는 길이
        for(int i=0; i<idxArr.length-1; i++) {
            if(idxArr[i] == 2 && idxArr[i+1] == 2) {
                answer++;
            }
        }
        
        //idxArr 초기화
        for(int i=1; i<201; i++) {
            idxArr[i] = 0;
        }
        
        // 2번, 3번 선분 비교
        for(int j=1; j<3; j++) {
            for(int i=lines[j][0]; i<=lines[j][1]; i++) {
                idxArr[i+100]++;
            }
        }
        // 2번, 3번 겹치는 길이
        for(int i=0; i<idxArr.length-1; i++) {
            if(idxArr[i] == 2 && idxArr[i+1] == 2) {
                answer++;
            }
        }
        
        //idxArr 초기화
        for(int i=1; i<201; i++) {
            idxArr[i] = 0;
        }
        
        // 1번, 3번 선분 비교
        for(int i=lines[0][0]; i<=lines[0][1]; i++) {
            idxArr[i+100]++;
        }
        for(int i=lines[2][0]; i<=lines[2][1]; i++) {
            idxArr[i+100]++;
        }
        // 1번, 3번 겹치는 길이
        for(int i=0; i<idxArr.length-1; i++) {
            if(idxArr[i] == 2 && idxArr[i+1] == 2) {
                answer++;
            }
        }

        //idxArr 초기화
        for(int i=1; i<201; i++) {
            idxArr[i] = 0;
        }
        
        for(int j=0; j<3; j++) {
            for(int i=lines[j][0]; i<=lines[j][1]; i++) {
                idxArr[i+100]++;
            }
        }
        
        for(int i=0; i<idxArr.length-1; i++) {
            if(idxArr[i] == 3 && idxArr[i+1] == 3) {
                answer -= 2;
            }
        }
        return answer;
    }
}