class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        String A2 = A+A;
        int aLeng = A.length();
        int a2Leng = A2.length();
        //hellohello
        //atatatat
        //appleapple
        
        for(int i=0; i<aLeng; i++) {
            String subA = A2.substring(a2Leng-aLeng-i,a2Leng-i);
            if(subA.equals(B)) {
                answer = A2.substring(a2Leng-i).length();
                break;
            }
        }
        
        
        return answer;
    }
}