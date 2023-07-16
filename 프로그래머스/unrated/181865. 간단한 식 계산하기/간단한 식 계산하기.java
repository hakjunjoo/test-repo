class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] binomialArr = binomial.split(" ");
        int a = Integer.parseInt(binomialArr[0]);
        int b = Integer.parseInt(binomialArr[2]);
        
        if(binomialArr[1].equals("+")) {
            answer = a + b;
        } else if (binomialArr[1].equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        
        return answer;
    }
}