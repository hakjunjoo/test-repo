class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i=0; i < num_list.length; i++) {
            int number = num_list[i];
            
            while (number != 1) {
                if (number % 2 == 0) {
                    number = number/2;
                    answer++;
                } else {
                    number = (number-1)/2;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}