class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        // 배열의 원소 문자열로 바꾸기
        for(int i=0; i<array.length; i++) {
            str += array[i] + "";
        }
        
        // 문자열 나누고 7 비교하기
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '7') {
                answer ++;
            }
        }
        return answer;
    }
}