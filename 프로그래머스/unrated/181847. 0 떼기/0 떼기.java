class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        String[] strArr = n_str.split("");
        
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].equals("0")) {
                strArr[i] = "";
            } else {
                break;
            }
        }
        
        answer = String.join("", strArr);
        return answer;
    }
}