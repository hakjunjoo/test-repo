import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        List<Double> list = new ArrayList<>();
        for(int i=0; i<3; i++) {
            for(int j=i+1; j<4; j++) {
                double xIncrease = Math.abs(dots[i][0] - dots[j][0]);
                double yIncrease = Math.abs(dots[i][1] - dots[j][1]);
                double inclination = yIncrease/xIncrease;
                list.add(inclination);
            }
        }
        System.out.println(list.toString());

        if(list.get(0).equals(list.get(list.size()-1)) ) {
            answer = 1;
        }
        
        return answer;
    }
}