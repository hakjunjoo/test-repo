class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 첫번째 항 구하기 (등차수열의 합 공식 이용)
        int a1 = total/num - (num-1)/2;
        // System.out.println(a1);
        
        for(int i=0; i<num; i++) {
            answer[i] = a1+i;
        }
        
        return answer;
    }
}