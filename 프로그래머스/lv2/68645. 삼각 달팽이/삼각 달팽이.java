import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int cnt = 0;
        int i = 0;
        int j = 0;
        int[][] nArr = new int[n][n];
        nArr[0][0] = 1;
        while (cnt < n) {
            while (i < n - 1) {
                if (nArr[i + 1][j] == 0) {
                    nArr[i + 1][j] = nArr[i][j] + 1;
                    i++;
                } else {
                    break;
                }
            }
            cnt++;
            while(j < n - 1) {
                if(nArr[i][j+1] == 0) {
                    nArr[i][j+1] = nArr[i][j] + 1;
                    j++;
                } else {
                    break;
                }
            }
            cnt++;

            while(true) {
                if(i!=0&&j!=0 && nArr[i-1][j-1] == 0) {
                    nArr[i-1][j-1] = nArr[i][j] + 1;
                    i--;
                    j--;
                } else {
                    break;
                }
            }
            cnt++;
        }
        // System.out.println(Arrays.deepToString(nArr));

        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if(nArr[k][l] != 0) {
                    list.add(nArr[k][l]);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < answer.length; k++) {
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}