class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] numArr = (num+"").split("");
        for(int i=0; i<numArr.length; i++) {
            if(numArr[i].equals(k+"")) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}