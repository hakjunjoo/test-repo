class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for(int i=0; i<keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left" : {
                    if(-(board[0]-1)/2 < answer[0]) {
                        answer[0]--;
                    }
                    break;
                }
                case "right" : {
                    if((board[0]-1)/2 > answer[0]) {
                        answer[0]++;
                    }
                    break;
                }
                case "up" : {
                    if((board[1]-1)/2 > answer[1]) {
                        answer[1]++;
                    }
                    break;
                }
                case "down" : {
                    if(-(board[1]-1)/2 < answer[1]) {
                        answer[1]--;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}