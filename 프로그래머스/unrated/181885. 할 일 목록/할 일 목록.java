class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        //result의 길이를 구하기 위해서 false의 길이 구하기
        for(int i=0; i<finished.length; i++) {
            if(finished[i] == false) {
                cnt++;
            }
        }
        
        String[] answer = new String[cnt];
        for(int j=0; j<cnt; j++) {
            for(int i=0; i<finished.length; i++) {
                if(finished[i] == false) {
                    answer[j] = todo_list[i];
                    finished[i] = true;
                    break;
                }
            }   
        }
        
        return answer;
    }
}