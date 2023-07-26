import java.util.*;

class Solution {
    public long solution(String expression) {
        long answer = 0;
        List<Long> answerList = new ArrayList<>();

        // expression 배열로 만들기 (연산 포함)
        expression = expression.replaceAll("-", " - ");
        expression = expression.replaceAll("\\+", " + ");
        expression = expression.replaceAll("\\*", " * ");
        String[] expArr = expression.split(" ");

        // 우선순위를 나타내는 연산 배열
        String[] operation = {"*+-", "+-*", "+*-", "-*+", "-+*", "*-+"};

        for(String oper : operation) {
            // 리스트로 바꾸기
            List<String> expList = new ArrayList<>();
            for (int i = 0; i < expArr.length; i++) {
                expList.add(expArr[i]);
            }

            String[] operArr = oper.split("");

            for(String o : operArr) {
                for (int i = 0; i < expList.size(); i++) {
                    if(expList.get(i).equals(o)) {
                        String num = operation(o, Long.parseLong(expList.get(i-1)), Long.parseLong(expList.get(i+1)))+"";
                        expList.remove(i-1);
                        expList.remove(i-1);
                        expList.remove(i-1);
                        expList.add(i-1, num);
                        i=0;
                    }
                }
            }

            answerList.add(Math.abs(Long.parseLong(expList.get(0))));
        }
        Collections.sort(answerList);
        answer = answerList.get(5);
        return answer;
    }
    
    private static long operation(String o, long i, long j) {
        if(o.equals("+")) {
            return i+j;
        } else if (o.equals("-")) {
            return i-j;
        } else if (o.equals("*")) {
            return i*j;
        }
        return 0;
    }
}