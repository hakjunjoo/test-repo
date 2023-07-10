class Solution {
    public String solution(String phone_number) {
        String star = "********************";
        int number = phone_number.length() - 4;
        
        String answer = star.substring(0, number) + phone_number.substring(number);
        
        return answer;
    }
}