class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int ms_length = myString.length();
        int pat_length = pat.length();
        
        for (int i=0; i< ms_length - pat_length + 1; i++) {
            String cut_ms = myString.substring(i, pat_length + i);
            
            if (cut_ms.equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}