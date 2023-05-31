class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] strArr = my_string.toCharArray();
        for(char s : strArr) {
            if(Character.isUpperCase(s)) {
                answer += Character.toLowerCase(s);
            } else {
                answer += Character.toUpperCase(s);
            }
        }
        return answer;
    }
}