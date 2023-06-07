class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] safeBoard = new int[board.length+2][board.length+2];
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 1) {
                    safeBoard[i+1][j+1] = 1; // 지뢰
                    safeBoard[i+2][j+1] = 1; // 오른쪽
                    safeBoard[i+1][j+2] = 1; // 위
                    safeBoard[i][j+1] = 1;   // 왼쪽
                    safeBoard[i+1][j] = 1;   // 아래
                    safeBoard[i+2][j+2] = 1; // 대각선 오른쪽 위
                    safeBoard[i][j+2] = 1;   // 대각선 왼쪽 위
                    safeBoard[i][j] = 1;     // 대각선 왼쪽 아래
                    safeBoard[i+2][j] = 1; // 대각선 오른쪽 아래                 
                }
            }
        }
        
        for(int i=1; i<safeBoard.length-1; i++) {
            for(int j=1; j<safeBoard.length-1; j++) {
                if(safeBoard[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}