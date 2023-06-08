import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        // 평균 구하기
        for(int i=0; i<score.length; i++) {
            answer[i] = score[i][0]+score[i][1];
        }
        
        // 등수 매기기
        int[] average = answer.clone();   
        Arrays.sort(average); //정렬
        // for(int i=0; i<average.length-1; i++) {
        //     for(int j=i+1; j<average.length; j++) {
        //         if(average[i] == average[j]) {
        //             average[j] = average[j];
        //         }
        //     }
        // }
        System.out.println(Arrays.toString(average));
        int result[] = new int[answer.length];
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<average.length; j++) {
                if(answer[i] == average[j]) {
                    result[i] = average.length-j;
                }
            }
        }
        
        return result;
    }
}