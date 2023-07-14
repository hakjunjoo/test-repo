import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] mathGiveUp1 = {1, 2, 3, 4, 5};
        int[] mathGiveUp2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] mathGiveUp3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] countArr = {checkMathGiveUpAnswer(mathGiveUp1, answers), checkMathGiveUpAnswer(mathGiveUp2, answers), checkMathGiveUpAnswer(mathGiveUp3,answers)};

        int maxCount = countArr[0];
        for (int count : countArr) {
            if (count > maxCount) maxCount = count;
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i < countArr.length; i++) {
            if ( countArr[i] == maxCount ) list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i) + 1;
        }
        
        return answer;

        
    }

    private static int checkMathGiveUpAnswer(int[] mathGiveUp, int[] answers) {
        int answerCount = 0;
        int k = 0;

        for (int answer : answers) {
            if (answer == mathGiveUp[k]) {
                answerCount++;
            }
            k++;
            if (k == mathGiveUp.length) k = 0;
        }
        
        return answerCount;
    }
}