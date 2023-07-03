class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i<strArr.length; i++) {
            s = s.replace(strArr[i],numArr[i]);
        }
        
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}