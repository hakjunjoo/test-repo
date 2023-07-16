class Solution {
    public String solution(String my_string, int[] indices) {
        char[] strArr = my_string.toCharArray();
        for (int index : indices) {
            strArr[index] = '1';
        }

        StringBuilder answer = new StringBuilder();
        for (char c : strArr) {
            if (c != '1') answer.append(c);
        }
        
        return answer.toString();
    }
}