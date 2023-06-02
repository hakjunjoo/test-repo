class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        // 배열의 각 인덱스별로 확인하기
        for(int i=0; i<quiz.length; i++) {
            String[] idxArr = quiz[i].split(" ");
            
            int a = Integer.parseInt(idxArr[0]);
            int b = Integer.parseInt(idxArr[2]);
            int c = Integer.parseInt(idxArr[4]);
            
            if(idxArr[1].equals("-")) {
                if(a-b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(a+b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}