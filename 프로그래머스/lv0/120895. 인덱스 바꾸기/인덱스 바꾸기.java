class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] strArr = my_string.split("");
        
        String str = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = str;
        
        // for(int i=0; i<strArr.length; i++){
        //     answer += strArr[i];
        // }
        String answer = String.join("",strArr);
        
        return answer;
    }
}