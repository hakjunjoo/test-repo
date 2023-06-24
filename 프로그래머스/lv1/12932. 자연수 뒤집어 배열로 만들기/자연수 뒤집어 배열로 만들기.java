class Solution {
    public int[] solution(long n) {
        String nStr = n+"";
        String[] nStrArr = nStr.split("");
        
        int[] answer = new int[nStrArr.length];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(nStrArr[nStrArr.length-i-1]);
        }
        
        return answer;
        
    }
}