class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr2를 열을 기준으로 새롭게 배열 만들기
        int[][] arr3 = new int[arr2[0].length][arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr3[j][i] = arr2[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(arr3));
        int[][] answer = new int[arr1.length][arr3.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k]*arr3[j][k];
                }
            }
        }
        return answer;
    }
}