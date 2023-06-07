import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++) {
            for(int j=i+1; j<4; j++) {
                double xIncrease = dots[i][0] - dots[j][0];
                double yIncrease = dots[i][1] - dots[j][1];
                double inclination = yIncrease/xIncrease;
                inclination = inclination*100.0;
                int a = (int)(inclination);         // 부동소수점 처리
                list.add(a);
            }
        }
        // System.out.println(list.toString());
        int[] arr = new int[6];
        for(int i=0; i<6; i++) {
            arr[i] = list.get(i);
        }
        
        if( arr[0] == arr[5] ) { // AB, CD 비교
            answer = 1;
        } else if( arr[1] == arr[4] ) { // AC, BD 비교
            answer = 1;
        } else if ( arr[2] == arr[3] ) { // AD, BC 비교
            answer = 1;
        }
        
        return answer;
    }
}