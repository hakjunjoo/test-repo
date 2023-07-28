class Solution {
    public int solution(int n) {
        int num = 1;
        int result = 0;
        while (num <= n) {
            int a = 2*n - num*(num-1);
            int b = 2*num;

            if(a > 0 && a % b == 0) result++;
            num++;
        }
        
        
        return result;
    }
}