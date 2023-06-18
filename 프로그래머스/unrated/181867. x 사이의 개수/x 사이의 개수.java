class Solution {
    public int[] solution(String myString) {
        myString = myString + "a";
        String[] myStrArr = myString.split("x");
        int[] answer = new int[myStrArr.length];
        
        for(int i=0; i<answer.length-1; i++) {
            answer[i] = myStrArr[i].length();
        }
        
        answer[answer.length-1] = myStrArr[myStrArr.length-1].length()-1;
        
        return answer;
    }
}