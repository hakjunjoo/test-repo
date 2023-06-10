class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0; //홀수 번째 원소들 합
        int even = 0; //짝수 번쨰 원소들 합
        
        for(int i=0; i<num_list.length; i++) {
            if(i%2 == 0) { // 문제에서 홀수 번째 원소들
                odd += num_list[i];
            } else { //문제에서 짝수 번쨰 원소들
                even += num_list[i];
            }
        }
        
        if(odd >= even) {
            answer = odd;
        } else {
            answer = even;
        }
        
        return answer;
    }
}