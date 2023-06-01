import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        // 배열 생성
        String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] numEnglishArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 각각의 값을 바꿀 수 있는맵 생성
        Map<String, String> numMap = new HashMap<>();
        for(int i=0; i<10; i++) {
            numMap.put(numEnglishArr[i], numArr[i]);
        }
        
        // numbers의 영어 => 숫자
        for(String key : numMap.keySet()) {
            numbers = numbers.replaceAll(key, numMap.get(key));
        }
        
        //numbers 형변환 문자열 => 정수형
        answer = Long.parseLong(numbers);
        return answer;
    }
}