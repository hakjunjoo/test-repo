class Solution {
    public int solution(int n) {
        int cnt = oneCount(n);
        int num = n + 1;
        int answer = 0;

        while(answer == 0) {
            int m = oneCount(num);
            
            if (m == cnt) {
                answer = num;
                break;
            }
            
            num++;
        }
        
        return answer;
    }
    
    private int oneCount(int n) {
        String num = Integer.toString(n, 2);
        
        return num.replace("0", "").length();
    }
}