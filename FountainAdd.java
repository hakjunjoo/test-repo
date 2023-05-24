class FountainAdd {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = 1, gcd2 = 1;
        //최대공약수 구하기
        for (int i=1; i<=denom1 && i<=denom2; i++) {
            if (denom1%i==0 && denom2%i==0) {
                gcd = i;
            }
        }
        int lcm = denom1*denom2/gcd;
        int a = numer1*(lcm/denom1);
        int b = numer2*(lcm/denom2);

        //분모, 분자의 최대공약수 구하기
        for (int i=1; i<=a+b && i<=lcm; i++) {
            if ((a+b)%i==0 && lcm%i==0) {
                gcd2 = i;
            }
        }
        int molecule = (a+b)/gcd2;
        int denominator = lcm/gcd2;
        int[] answer = {molecule, denominator}; //배열 생성
        return answer;
    }
}