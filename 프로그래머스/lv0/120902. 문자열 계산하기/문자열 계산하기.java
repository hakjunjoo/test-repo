class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //공백 기준 배열 생성
        String[] strArr = my_string.split(" ");
        
        //연산 실행
        for(int i=1; i<strArr.length-1; i++) {
            if (strArr[i].equals("+")) {
                int a = Integer.parseInt(strArr[i-1]);
                int b = Integer.parseInt(strArr[i+1]);
                
                strArr[i+1] = (a + b)+"";
            } else if (strArr[i].equals("-")) {
                int a = Integer.parseInt(strArr[i-1]);
                int b = Integer.parseInt(strArr[i+1]);
                
                strArr[i+1] = (a - b)+"";
            }
        }
        //형변환
        answer = Integer.parseInt(strArr[strArr.length-1]);
        return answer;
    }
}