import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger intA = new BigInteger(a);
        BigInteger intB = new BigInteger(b);
        
        BigInteger intC = intA.add(intB);
        String answer = intC + "";
        
        return answer;
    }
}