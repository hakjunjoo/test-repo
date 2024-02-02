class Solution {
    public String solution(String myString, String pat) {
        int pat_length = pat.length();
        int ms_length = myString.length();
        String answer = "";
        
        for (int i = 0; i < 10; i++) {
            String subStr = myString.substring(ms_length - pat_length -i, ms_length - i);
            // System.out.println(subStr);
            
            if (subStr.equals(pat)) {
                answer = myString.substring(0, ms_length-i);
                break;
            }
        }
        
        
        return answer;
    }
}