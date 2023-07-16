class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for (int i=0; i< num_list.length - n; i++) {
            answer[i] = num_list[i + n];
        }
        
        int idx = 0;
        for (int i = num_list.length - n; i< num_list.length; i++) {
            answer[i] = num_list[idx];
            idx++;
        }
        
        return answer;
    }
}