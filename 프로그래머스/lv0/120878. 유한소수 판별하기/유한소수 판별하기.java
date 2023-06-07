class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        // 약분 (최대공약수 구하기)
        int gcd = 0;
        for(int i=1; i<=Math.max(a,b); i++) {
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        b = b/gcd; // 분모 약분

        // 분모 소인수분해하기
        for(int i=2; i<=b; i++) {
            if(b%i == 0) {
                if(i != 2 && i != 5) {
                    answer = 2;
                    break;
                } else {
                    b /= i;
                    i = 1; 
                }
            }
        }

        return answer;
    }
}