import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int[] intArr = new int[2];
        
        //" + "기준으로 배열 만들기
        String[] polyArr = polynomial.split(" \\+ ");
        
        // x가 포함된 문자열 더하기
        for(int i=0; i<polyArr.length; i++) {
            if(polyArr[i].contains("x")) {
                if(polyArr[i].equals("x")) {
                    polyArr[i] = polyArr[i].replace("x", "1");
                    int a = Integer.parseInt(polyArr[i]);
                    intArr[0] += a; // x계수 더하기
                } else {
                    polyArr[i] = polyArr[i].replace("x", "");
                    int a = Integer.parseInt(polyArr[i]);
                    intArr[0] += a; // x계수 더하기
                }
            } else {
                int a = Integer.parseInt(polyArr[i]);
                intArr[1] += a; // 상수항 더하기
            }
        }
        
        if(intArr[0] == 0 && intArr[1] != 0) { //x의 계수가 0인 경우
            answer = intArr[1]+"";
        } else if (intArr[1] == 0 && intArr[0] != 0) { //상수항이 0인 경우
            if(intArr[0] == 1) {
                answer = "x";
            } else {
                answer = (intArr[0]+"") + "x";
            }
        } else if (intArr[0] == 0 && intArr[1] == 0) { // 둘 다 0인 경우
            answer = "0";
        } else { // 둘 다 0이 아닌 경우
            if(intArr[0] == 1) {
                answer = "x" + " + " + (intArr[1]+"");
            } else {
                answer = (intArr[0]+"") + "x" + " + " + (intArr[1]+"");
            }
        }
        
        return answer;
    }
}