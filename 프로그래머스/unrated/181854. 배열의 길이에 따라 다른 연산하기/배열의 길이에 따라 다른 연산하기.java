class Solution {
    public int[] solution(int[] arr, int n) {
        
        if(arr.length%2 == 0) { // arr의 길이가 짝수
            for(int i=1; i<arr.length; i+=2) {
                arr[i] = arr[i]+n;
            }
        } else { //arr의 길이가 홀수
            for(int i=0; i<arr.length; i+=2) {
                arr[i] = arr[i]+n;
            }
        }
        
        return arr;
    }
}