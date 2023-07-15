class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        int[] diceArr = {a, b, c, d};
        int p = a;
        int q = 0;

        int count = 0;
        for (int i = 0; i < diceArr.length; i++) {
            for (int j = i + 1; j < diceArr.length; j++) {
                if (diceArr[i] != diceArr[j]) count++;
            }
        }
        
        if (count == 0) { // 네 주사위에서 나온 숫자가 모두 p로 같은 경우
            answer = 1111 * a;
        } else if (count == 3) { // 세 주사위에서 나온 숫자가 같은 경우
            if (a != b && a != c) { // a 만 다른 경우
                p = b;
                q = a;
            } else {
                for (int i = 0; i < diceArr.length - 1; i++) {
                    if (diceArr[i] != diceArr[i + 1]) {
                        q = diceArr[i + 1];
                        break;
                    }
                }
            }
            answer = (10 * p + q) * (10 * p + q);
        } else if (count == 4) { // 두 주사위씩 숫자가 각각 같은 경우
            for (int i = 0; i < diceArr.length - 1; i++) {
                if (diceArr[i] != diceArr[i + 1]) {
                    q = diceArr[i + 1];
                    break;
                }
            }
            answer = (p + q) * Math.abs(p - q);
        } else if (count == 5) { //두 주사위에서 나온 숫자가 같고 나머지 두 주사위의 숫자가 다른 경우
            Loop : for (int i = 0; i < diceArr.length; i++) {
                for (int j = i + 1; j < diceArr.length; j++) {
                    if (diceArr[i] == diceArr[j]) {
                        diceArr[i] = 0;
                        diceArr[j] = 0;
                        break Loop;
                    }
                }
            }

            for (int i = 0; i < diceArr.length; i++) {
                if (diceArr[i] != 0) {
                    answer *= diceArr[i];
                }
            }
        } else { // 모두 다른 숫자인 경우
            int min = a;
            for (int dice : diceArr) {
                if (min > dice) min = dice;
            }
            answer = min;
        }
        
        return answer;
    }
}