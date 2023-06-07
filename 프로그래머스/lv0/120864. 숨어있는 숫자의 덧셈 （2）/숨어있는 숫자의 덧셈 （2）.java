class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 알파벳 문자 => 공백으로 바꾸기
        my_string = my_string.replaceAll("[^0-9]", " ");
        
        // 공백 기준으로 문자열 나누기
        String[] strArr = my_string.split(" ");
        // "aAb1B2cC34oOp" 기준 => [, , , 1, 2, , 34]
        
        // 빈 문자열이 아닌 배열 원소 정수형으로 바꾼 뒤 더해주기
        for(int i=0; i<strArr.length; i++) {
            if(!(strArr[i].equals(""))) {
                int a = Integer.parseInt(strArr[i]);
                answer += a;
            }
        }
        
        return answer;
    }
}